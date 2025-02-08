class OddEvenMath{
    public static void main(String[]args){

        int[] numbers = {1,4,6,9,13,16};

        int oddSum = 0 ;
        int evenSum = 0 ;

        for(int total : numbers){

            if(total % 2 == 0){
                oddSum += total ;
            }else{
                evenSum += total ;
            }

        }

        System.out.println("奇数の和は" + evenSum + "です");
        System.out.println("偶数の和は" + oddSum + "です");
    }
}