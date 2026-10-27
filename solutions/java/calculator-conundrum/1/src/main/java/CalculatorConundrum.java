class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        CalculatorConundrum calculator = new CalculatorConundrum();

        try {
            if (operation == "*"){
                return operand1 + " " +operation + " " + operand2 + " = " + (operand1 * operand2);
            } else if (operation == "/") {
                return operand1 + " " +operation + " " + operand2 + " = " + (operand1 / operand2);
            } else if (operation == "+") {
                return operand1 + " " +operation + " " + operand2 + " = " + (operand1+operand2);
            }        if (operation == null)
            {
                throw new IllegalArgumentException("Operation cannot be null");
            }if (operation == ""){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        catch (ArithmeticException exception){
            throw new IllegalOperationException("Division by zero is not allowed" , exception);
            // must throw variable after the exception text
    }
    }
}
