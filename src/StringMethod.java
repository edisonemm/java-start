public class StringMethod {
    static void methods(){

        String name = "Edison Active";

        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf(" ");
        int lastIndex = name .lastIndexOf("i");

        name = name.toLowerCase();
        name = name.toUpperCase();
        name = name.trim();
        name = name.replace(" ", "-");

        if(name.isEmpty()){
            IO.print("Your name is empty");
        }
        else {
            IO.print("Hello " + name);
        }

        if(name.contains(" ")){
            IO.print("Your name contains a space");
        }
        else {
            IO.print("Your name not contains a space");
        }

        if(name.equals("password")){
//        if(name.equalsIgnoreCase("password")){
            IO.println("Your name can't be password");
        }
        else{
            IO.println("Hello " + name);
        }

    }
}
