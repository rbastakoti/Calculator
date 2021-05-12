package com.rbastakoti.myapplication;

public class Calculator {


    private static final String INITIAL_VALUE = "0";

    private String input;
    private String previousInput;
    private Operator operator;
    private Boolean clearInput;


    public Calculator() {
        this.input = INITIAL_VALUE;
        this.previousInput = INITIAL_VALUE;
        this.clearInput = false;

    }

    public void inputNumber(Integer number) {
        if (clearInput) {
            previousInput = input;
            input = number.toString();
            clearInput = false;
        } else if (input.equals(INITIAL_VALUE)) {
            input = number.toString();
        } else {
            input += number.toString();
        }

    }

    public void inputOperator(Operator operator) {

            if (this.operator != null) {
                this.calculateTotal();
            }

            this.operator = operator;
            this.clearInput = true;
        }



        public void equals(){
        if (previousInput.equals(INITIAL_VALUE)){
            previousInput = input;
            }

        calculateTotal();
        this.clearInput = true;
        this.operator = null;

            }

        private void calculateTotal() {
            Double valueOne = Double.parseDouble(previousInput);
            Double valueTwo = Double.parseDouble(input);
            Double total = 0.0;
            //Do the math based on the operator



            switch (this.operator){
                case ADD:
                    total = valueOne + valueTwo;
                    break;
                case SUBTRACT:
                    total= valueOne - valueTwo;
                    break;
                case MULTIPLY:
                    total = valueOne * valueTwo;
                    break;
                case DIVIDE:
                    total = valueOne/valueTwo;
                break;


            }

            input = total.toString();
        }

        public String getInput() {
            return this.input;
        }

        public void clearInput(){
            this.input = INITIAL_VALUE;
            this.previousInput = INITIAL_VALUE;
            this.operator = null;
        }

        public void dot(){
            if (!input.contains(".") && !input.equals(INITIAL_VALUE) ){
                input = input + ".";
            }
        }

        public void percent(){
            if (this.input != INITIAL_VALUE){

             Double temp = (Double.parseDouble(input)/100);
             this.input = temp.toString();
            }
        }

        public void plusMinus(){
            if (this.input != INITIAL_VALUE){

                Double temp = -1.0 * (Double.parseDouble(input));
                this.input = temp.toString();
            }
        }


}
