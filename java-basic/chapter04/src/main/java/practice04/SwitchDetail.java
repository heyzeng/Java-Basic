package practice04;



public class SwitchDetail {

    public static void main(String[] args) {

        char myChose = 'd';
        switch (myChose) {
            case 'a':
                System.out.println("a");
            case 'b':
                System.out.println("b");
            case 'd':
                System.out.println("d");
                break;
            default:
                System.out.println("----");

                int month = 4;
                switch (month) {
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("春季");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("夏季");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("秋季");
                        break;
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("冬季");
                        break;
                    default:
                        System.out.println("你的月份输入不正确..");
                }
        }
    }}
