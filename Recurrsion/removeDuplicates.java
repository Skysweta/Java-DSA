public class removeDuplicates {
    
    public static void removDup(String str,int idx , StringBuilder newStr, boolean map[] ){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //Kaam

        char currChar = str.charAt(idx);
        if(map[currChar -'a']== true){
            //duplicate
            removDup(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removDup(str, idx+1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str="appnnacollege";
        removDup(str, 0,new StringBuilder(""),new boolean[26] );
    }
}
