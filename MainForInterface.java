public class MainForInterface {
    public static void main(String[] args) {


        UserForInterface u1 = new UserForInterface("A1", "B1");
        UserForInterface u2 = new UserForInterface("A2", "B2");
        UserForInterface u3 = new UserForInterface("A3", "Smith");
        UserForInterface u4 = new UserForInterface("John", "B4");
        UserForInterface u5 = new UserForInterface("A5", "B5");
        UserForInterface u6 = new UserForInterface("A6", "B6");
        UserForInterface u7 = new UserForInterface("A7", "B7");
        UserForInterface u8 = new UserForInterface("John", "B8");
        UserForInterface u9 = new UserForInterface("A9", "Smith");
        UserForInterface u10 = new UserForInterface("A10", "B10");

        UserForInterface array [] = {u1, u2, u3, u4, u5, u6, u7, u8, u9, u10};
        UserBeanImp imp = new UserBeanImp(array);

        imp.getAllUsers();
        imp.getUsersBySurname("Smith");
        imp.getUsersByName("John");


    }
}
