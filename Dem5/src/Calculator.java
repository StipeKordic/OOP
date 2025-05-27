public class Calculator implements Addable, Substractable{

    @Override
    public int add(int a, int b){
        return a + b;
    }

    @Override
    public int substract(int a, int b){
        return a - b;
    }
}
