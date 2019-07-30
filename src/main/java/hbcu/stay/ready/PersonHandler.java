package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {

        String result = "";
        int count = 0;
        // create a `counter`

        while (count < personArray.length) {
           Person identify = personArray[count];
            count++;
           String x = String.valueOf(identify);
           result +=x;
        }

        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for ( int count = 0; count < personArray.length; count ++){
            Person identify = personArray[count];
            String y = String.valueOf(identify);
            result += y;
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for ( Person count : personArray) {
            String x = String.valueOf(count);
            result += x;
        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
