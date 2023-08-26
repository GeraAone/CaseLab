public class Task2
{
    static void swap(int a, int b)
    {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    static void swap2(int a, int b) // can cause an Overflow Exception
    {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
