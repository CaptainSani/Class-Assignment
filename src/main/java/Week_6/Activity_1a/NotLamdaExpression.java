package Week_6.Activity_1a;

public class NotLamdaExpression {


    public static void main(String[] args) {
        int width = 38;

        //Without Lambda, drawable implementation without lambda class

        //WITHOUT LAMBDA EXPRESSION
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("drawing:" + width);

            }
        };
        drawable.draw();


        //USING LAMBDA EXPRESSION
        Drawable d2 = () -> {
            System.out.println("drawing: "+ width);
        };
        d2.draw();
    }
}
