class Solution {

    public String encode(List<String> strs) {
    StringBuilder sizeStr = new StringBuilder();
    StringBuilder wordStr = new StringBuilder();

    for(int k=0; k < strs.size(); k++){
    if(k>0){
      sizeStr.append(",");
    }
     sizeStr.append(strs.get(k).length());
     wordStr.append(strs.get(k));
    }
     sizeStr.append("&");
     System.out.println("sizeStr########  "+sizeStr);
      String finalStr =sizeStr.append(wordStr.toString()).toString();
     System.out.println("FinalStr  "+ finalStr);
     return finalStr;

  }

    public List<String> decode(String str) {
      String[] splitString =  str.split("&");
      List<String> decodedStrList = new ArrayList<>();
//2,3,4
      int j=0;
      String[] size = splitString[0].split(",");
      System.out.println("size#####  "+Arrays.toString(splitString[0].split(",")));
      for(int i=0; i < size.length; i++){
        int currentSize = (int) Integer.parseInt(size[i]);
         System.out.println("i=  "+i+", j= "+j+ ", size[i] "+ currentSize);
        if(currentSize==0)
          decodedStrList.add("");
        else
          decodedStrList.add(splitString[1].substring(j,j+currentSize));
        j=j+currentSize;
      }
      return decodedStrList;
    }
}
