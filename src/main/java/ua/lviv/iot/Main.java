package ua.lviv.iot;


public class Main
{
    public static void main( String[] args )
    {
        String order = args[0];
        String string_array = args[1];

        Transformer quick_sort = new Transformer(order, string_array);

        quick_sort.sort_result();
    }
}
