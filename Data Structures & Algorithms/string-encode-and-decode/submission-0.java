class Solution {

    public String encode(List<String> strs) {
    String finalStr = null;
    for(String str : strs){
      if(finalStr != null)
        finalStr = finalStr +"_"+str;
      else
        finalStr=str;
    }

    return finalStr;
  }

    public List<String> decode(String str) {
      return  Arrays.asList(str.split("_")) ;
    }
}
