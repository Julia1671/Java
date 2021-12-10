//HW1
import java.util.Arrays;

class Class {
    public String args[];

    public Class(String[] _args) {
        this.args = _args;
    }

    public int Sum() {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);
        return sum;
    }
}