public class squaresAndCubes
{
    public static void main(String[] args)
    {
        int square, cube;
        System.out.println("Number  " + "Square " + "Cube");
        for(int i = 0; i <= 10; i++)
        {
            square = i*i;
            cube = i*i*i;
            System.out.println(i + "        " + square + "      " + cube);

        }
    }
}