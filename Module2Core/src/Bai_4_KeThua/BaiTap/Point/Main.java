package Bai_4_KeThua.BaiTap.Point;

public class Main {
    public static void main(String[] args) {

        MoveablePoint moveablePoint = new MoveablePoint(3, 3, 3, 3);
        moveablePoint.move(moveablePoint);
        moveablePoint.move(moveablePoint);
        moveablePoint.move(moveablePoint);
        System.out.println(moveablePoint.toString());
    }
}
