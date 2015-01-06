package fizzbuzz;
/**
 * Created by cadet on 1/6/15 AD.
 */
public class FizzBuzz {

    public String count(int number){
        String result="";
       if(isFizz(number)){
            result= "Fizz";
        }
        if(isBuzz(number)) {
         result += "Buzz";
        }
        if (result.isEmpty()){
            result= String.valueOf(number);
        }
        return result;
    }

    private boolean isFizz(int number) {
        return number %3 ==0;
    }
    private boolean isBuzz(int number) {
        return number %5 ==0;
    }
}
