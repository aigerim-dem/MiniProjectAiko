public class UserBeanImp implements UserBean{
    UserForInterface[] users;

    public UserBeanImp(UserForInterface[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i=0; i<users.length; i++){
            System.out.println(users[i]);
        }


    }

    @Override
    public void getUsersByName(String name) {
        for (int i=0; i<users.length; i++){
            if (name.equalsIgnoreCase(users[i].getName())) System.out.println(users[i]);
        }


    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i=0; i< users.length; i++){
            if (surname.equalsIgnoreCase(users[i].getSurname())) System.out.println(users[i]);
        }


    }
}
