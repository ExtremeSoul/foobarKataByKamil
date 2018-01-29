class FooBar {
    String convert(int input) {
        String output = "";

        if (input != 0) {

            if (input % 3 == 0) {
                output += "Foo";
            }

            if (input % 5 == 0) {
                output += "Bar";
            }

            if (input % 3 != 0 && input % 5 != 0) {
                output = String.valueOf(input);
            }

            return output;
        } else {
            return String.valueOf(input);
        }
    }
}