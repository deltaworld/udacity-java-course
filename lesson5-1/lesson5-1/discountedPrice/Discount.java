public class Discount
{
    public static void main(String[] args)
    {
        System.out.println(discount(95.0));
        System.out.println(discount(100.0));
        System.out.println(discount(105.0));
    }
    
    public static double discount(double originalPrice)
    {
        double discountedPrice = 0.0;
        if (originalPrice < 100)
        {
            discountedPrice = originalPrice - 10;
        }
        else
        {
            discountedPrice = originalPrice - 20;
        }
        return discountedPrice;
    }
}
