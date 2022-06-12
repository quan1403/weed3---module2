public class IllegalTriangleCheck {
    public void checkIllegalTriangle(int a, int b, int c) throws Main.IllegalTriangleException{
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new Main.IllegalTriangleException("tam giác k hợp lệ");
        }
        else {
            System.out.println("tam giác hợp lệ");
        }
    }

}
