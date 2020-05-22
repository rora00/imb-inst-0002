public class Exam{
    private final static int k = 5;
    private String mark;
    public static void main(String[] args){
        Exam[] myExam = new Exam[k];
        for(int index = 0; index < myExam.length; index++){
            myExam[index] = new Exam();
            myExam[index].mark = "FIve";
        }
        System.out.println(myExam[0].toString());
    }
}