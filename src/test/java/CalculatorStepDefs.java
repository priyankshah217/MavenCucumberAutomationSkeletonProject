import io.cucumber.java8.En;

import static com.google.common.truth.Truth.assertThat;

public class CalculatorStepDefs implements En {
  private int result;

  public CalculatorStepDefs() {
    When("I {string} {int} and {int}", (String string, Integer int1, Integer int2) -> result = int1 + int2);

    Then("Result should be {int}", (Integer int1) -> assertThat(result).isEqualTo(int1));
  }
}
