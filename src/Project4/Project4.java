package Project4;

import Project3.Object;

public class Project4 {
    public static void main(String[] args) {
        Pants my_pants = new Pants();
        Object notebook = new Object("notebook", "paper");
        Object phone = new Object("phone", "solid");
        my_pants.add_to_pocket(notebook, phone);
        my_pants.check_pocket(1);
        my_pants.check_pocket(2);
    }
}
