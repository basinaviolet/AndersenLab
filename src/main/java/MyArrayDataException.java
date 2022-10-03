public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException (){
        super();
    }

    public void getMessage(int i, int j){
        System.out.format("item [%d][%d] isn`t number. %n", i, j);
    }
}
