import tm.*;
import tm.MachinesLibrary;
import tm.TuringMachine;

public class Main
{

    public static void main(String[] args)
    {
        TuringMachine TM1 = MachinesLibrary.EqualBinaryWords();

        boolean done = TM1.Run("00100010111#00100010111", false);
        if (done==true)
    {
        System.out.println("The input was accepted.");
    }
    else
    {
        System.out.println("The input was rejected.");
    }
    }

}
