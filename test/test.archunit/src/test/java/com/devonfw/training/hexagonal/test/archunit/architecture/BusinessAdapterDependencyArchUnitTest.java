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
public class BusinessAdapterDependencyArchUnitTest {

  public static final String CONTROLLER = "..adapter.controller..";
  public static final String SERVICE = "..adapter.service..";
  public static final String PERSISTENCE = "..adapter.persistence..";

  @ArchTest
  public static final ArchRule dependencies_for_controller_are_respected = noClasses()
      .that().resideInAPackage(CONTROLLER)
      .should().dependOnClassesThat().resideInAnyPackage(SERVICE, PERSISTENCE);

  @ArchTest
  public static final ArchRule dependencies_for_service_are_respected = noClasses()
      .that().resideInAPackage(SERVICE)
      .should().dependOnClassesThat().resideInAnyPackage(CONTROLLER, PERSISTENCE);

  @ArchTest
  public static final ArchRule dependencies_for_persistence_are_respected = noClasses()
      .that().resideInAPackage(PERSISTENCE)
      .should().dependOnClassesThat().resideInAnyPackage(SERVICE, CONTROLLER);
}
