package com.devonfw.training.hexagonal.test.archunit.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(
    packages = "com.devonfw.training.hexagonal",
    importOptions = ImportOption.DoNotIncludeTests.class
)
public class BusinessCoreDependencyArchUnitTest {

  public static final String DOMAIN = "..core.domain..";
  public static final String LOGIC = "..core.logic..";
  public static final String PORT = "..core.port..";

  @ArchTest
  public static final ArchRule dependencies_for_domain_are_respected = noClasses()
      .that().resideInAPackage(DOMAIN)
      .should().dependOnClassesThat().resideInAnyPackage(LOGIC, PORT);

  @ArchTest
  public static final ArchRule dependencies_for_port_are_respected = noClasses()
      .that().resideInAPackage(PORT)
      .should().dependOnClassesThat().resideInAnyPackage(LOGIC);

}
