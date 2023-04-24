//QUESTION - 1
//To print the following pattern:
*****
*****
*****
*****

//SOLUTION
public class Pattern {
    public static void main(String[] args){
        for(int i= 0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
