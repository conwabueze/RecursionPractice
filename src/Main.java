public class Main {
    public static void main(String[] args) {
        System.out.println("Totalnumber count:" + singleNumCount(1999999999));
        System.out.println("5's in number:" + fiveCounter(+ 515155555));
        char[] list ={'2','6','1','5'};
        System.out.println(arrToInt(list,0));
        System.out.println(5/2);
        System.out.println(raise(2,8));
        System.out.println(Math.pow(2,4));
    }

    public static int singleNumCount(int num){
        int rightMostDigit = num%10;
        int theRest = num/10;
        if(num<=9){
            return 0;
        }
        else {

            return rightMostDigit + singleNumCount(theRest);
        }

    }

    public static int fiveCounter(int num){
        int rightMostDigit = num%10;
        int theRest = num/10;
        int count =0;

        if(num<=9&&num==5){
            count++;
            return count;
        }
        else if(num<=9){
                return 0;
        }
        else{

            if(rightMostDigit == 5){
                count++;
            }
            return count + fiveCounter(theRest);
        }

    }

    public static int count8(int n) {
        int rightMost = n%10;
        int theRest = n/10;
        int twoEights=0;

        //last digit check
        if(n<=9){
            if(n==8){
                twoEights++;
                if(twoEights==2){
                    return 2;
                }
                else{
                    twoEights=0;
                    return 1;
                }
            }
            return 0;
        }

        //the rest
        else{
            if(rightMost==8){
                twoEights++;
                if(twoEights==2){
                    return 2 + count8(theRest);
                }else{
                    twoEights=0;
                    return 1 + count8(theRest);
                }
            }
            return 0;
        }


    }

    public static int arrToInt(char[] list, int index){
        if(index==list.length-1){return (int)list[list.length-1]-'0';}
        else return (int)list[index]-'0'+arrToInt(list,index+1);

    }

    public static int raise(int base, int exp){
        if(exp<2){
        return 1;
        }

        else{
            if(exp%2==1){
                return base;
            }
            return (int)Math.pow(base,exp/2);
        }

    }




}
