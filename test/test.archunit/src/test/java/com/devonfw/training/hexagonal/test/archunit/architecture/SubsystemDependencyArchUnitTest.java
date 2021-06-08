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
public class SubsystemDependencyArchUnitTest {

  public static final String ORCHESTRATION = "..orchestration..";
  public static final String BUSINESS = "..business..";
  public static final String CONNECTOR = "..connector..";
  public static final String UTIL = "..util..";

  @ArchTest
  public static final ArchRule dependencies_for_business_are_respected = noClasses()
      .that().resideInAPackage(BUSINESS)
      .should().dependOnClassesThat().resideInAnyPackage(ORCHESTRATION);

  @ArchTest
  public static final ArchRule dependencies_for_connector_are_respected = noClasses()
      .that().resideInAPackage(CONNECTOR)
      .should().dependOnClassesThat().resideInAnyPackage(ORCHESTRATION);

  @ArchTest
  public static final ArchRule dependencies_for_util_are_respected = noClasses()
      .that().resideInAPackage(UTIL)
      .should().dependOnClassesThat().resideInAnyPackage(ORCHESTRATION, BUSINESS, CONNECTOR);

}
