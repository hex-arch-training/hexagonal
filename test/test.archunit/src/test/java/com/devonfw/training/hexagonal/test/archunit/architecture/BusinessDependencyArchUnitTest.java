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
public class BusinessDependencyArchUnitTest {

  public static final String CORE = "..core..";
  public static final String ADAPTER = "..adapter..";
  public static final String CORE_LOGIC = "..core.logic.";

  @ArchTest
  public static final ArchRule dependencies_for_core_are_respected = noClasses()
      .that().resideInAPackage(CORE)
      .should().dependOnClassesThat().resideInAnyPackage(ADAPTER);

  @ArchTest
  public static final ArchRule dependencies_for_adapter_are_respected = noClasses()
      .that().resideInAPackage(ADAPTER)
      .should().dependOnClassesThat().resideInAnyPackage(CORE_LOGIC);

}
