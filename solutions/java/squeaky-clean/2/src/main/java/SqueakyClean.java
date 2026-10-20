class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder arr = new StringBuilder(identifier);
        for (int i = 0; i < arr.length(); i++){
            if (Character.isWhitespace(arr.charAt(i))){
                arr.setCharAt(i,'_');
            }
            else if (arr.charAt(i) == '-' && i != arr.length()-1){
                arr.setCharAt(i+1, Character.toUpperCase(arr.charAt(i+1)));
                arr.deleteCharAt(i);
                i--;
            }
            else if (Character.isDigit(arr.charAt(i))){
                switch (arr.charAt(i)) {
                    case '4': arr.setCharAt(i, 'a');
                        break;
                    case '3': arr.setCharAt(i, 'e');
                        break;
                    case '0': arr.setCharAt(i, 'o');
                        break;
                    case '1': arr.setCharAt(i, 'l');;
                        break;
                    case '7': arr.setCharAt(i, 't');;
                        break;
                    default:
                        break;
                }
            }
            else if (!Character.isLetter(arr.charAt(i))){
                arr.deleteCharAt(i);
                i--;
            }
        }
        return arr.toString();
    }
}