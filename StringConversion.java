/******************************************************************************
["break3ing news8:", "2A 1circle is round!"]
*         Output: "Breaking News: A Circle Is Round!"
*         Input: ["","Fresh fried fish - fish fresh fried"]
*         Output:"Fresh Fried Fish - Fish Fresh Fried"
*         Input: ["2here2", "is", " our STRING"]
*         Output: "Here Is Our STRING"
*         Input: ["123", "eat;sleep;repeat", "321"]
*         Output: "Eat;Sleep;Repeat"

*******************************************************************************/

public class Main
{
    public static String convertText(String[] text){
        StringBuilder result = new StringBuilder();
        int i=0;
        if(text[i].length() == 0)
            i++;
    
        for(i=i; i<text.length; i++){
            String wordFromText = text[i];
            wordFromText = wordFromText.replaceAll("[0-9]","");
            String output = capitalizeWord(wordFromText);
            
            result.append(output);
            result.append(" ");
        }
        
        return result.toString();
    }
    
    public static String capitalizeWord(String str){ 
        if(str.charAt(0) == ' '){
            int i=0;
            while(str.charAt(i) == ' '){
                str = str.trim();
            }
        }
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
}  
	public static void main(String[] args) {
	    String[] firstArray = new String[] {"break3ing news8:", "2A 1circle is round!"};
	    String[] secondArray = new String[] {"","Fresh fried fish - fish fresh fried"};
	    String[] thirdArray = new String[] {"2here2", "is", " our STRING"};
		System.out.println("Breaking News: A Circle Is Round!  -> DESIRED OUTPUT");
		System.out.println(convertText(firstArray));
		
		System.out.println("Fresh Fried Fish - Fish Fresh Fried");
		System.out.println(convertText(secondArray));
		
		System.out.println("Here Is Our STRING");
		System.out.println(convertText(thirdArray));
	}
}
