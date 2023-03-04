public class Main {
        public static void main(String[] args)
        {
            int[] dizi1 = {112, 233, 34, 4, 14, 4, 4, 5213, 64}; //9 elemanlı dizi
            System.out.println("dizi1 ardışık mı ?:"+isConsecutiveFour(dizi1));
        }

    public static boolean isConsecutiveFour(int[] values)
    {
        if (values.length < 4)
        {
            return false;
        }
        for (int i = 0; i < values.length-3; i++)
        {
            if ((values[i] == values[i+1]) && (values[i+1] == values[i+2]) && (values[i+2] == values[i+3]))
            {
                return true;
            }
        }
        return false;
    }
}
