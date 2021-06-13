package com.devonfw.training.hexagonal.test.archunit.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@AnalyzeClasses(
    packages = "com.devonfw.training.hexagonal",
    importOptions = ImportOption.DoNotIncludeTests.class
)
public class NoCycleDependencyArchUnitTest {

  @ArchTest
  public static final ArchRule no_cycle_dependencies_are_respected = slices()
      .matching("com.devonfw.training.hexagonal.(**)").should().beFreeOfCycles();

}
