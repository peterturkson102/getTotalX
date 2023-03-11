class Result {
 /*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 * 1. INTEGER_ARRAY a
 * 2. INTEGER_ARRAY b
 */
 public static int getTotalX(List<Integer> a, List<Integer> b) {
 // Write your code here
 int count = 0;
 int alength = a.get(a.size()-1);
 int bstart = b.get(0);

 for(int i = alength;i<bstart+1;i++){
 boolean aa =true;
 for(Integer asd : a){
 if(i%asd!=0){
 aa =false;
 break;
 }
 }
 if(aa==true){
 for(Integer ase : b){
 if(ase%i!=0){
 aa =false;
 break;
 }
 }
 }
 if(aa==true){
 count++;
 }
 }





 return count;
 }
 }
