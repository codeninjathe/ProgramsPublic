public class Methods{
  public static void main(String[] args){
    String s = ""; //Put any value there
    while(!onlyNumsDouble(s)){
      s = ""; //get a new value for s
    }
  }
  public static boolean onlyNumsDouble(String s){
    s = s.trim();
    for(int w = 0; w < 10; w++){
      s = s.replaceAll(w + "", "");
    }
    s = s.replace(".", "");
    if(s.length() >= 1)
      return false;
    return true;
  }
}
