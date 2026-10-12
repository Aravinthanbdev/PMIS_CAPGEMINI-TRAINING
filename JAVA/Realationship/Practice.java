public class Practice {
    
static class UserAccount {
    private String username;
    private static int totalUsers = 0;


    UserAccount(String username) {
        this.username = username;
        totalUsers++;
    }

    public String getUsername() {
        return username;
    }


    public static int getTotalUsers() {
        return totalUsers;
    }
}

public class StaticDemo1 {
    public static void main(String[] args) {

        System.out.println("Initial user count: "
                + UserAccount.getTotalUsers());


        UserAccount user1 = new UserAccount("Aarav");
        UserAccount user2 = new UserAccount("Priya");
        UserAccount user3 = new UserAccount("Rohan");

 
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Username: " + user2.getUsername());
        System.out.println("Username: " + user3.getUsername());


        System.out.println("Total registered users: "
                + UserAccount.getTotalUsers());
    }
}

}
