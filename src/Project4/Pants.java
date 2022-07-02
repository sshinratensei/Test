package Project4;

import Project3.Object;

public class Pants {
    Object right_pocket;
    Object left_pocket;

    public Pants() {
    }

    public void add_to_pocket(Object obj1, Object obj2){
        this.right_pocket = obj1;
        this.left_pocket = obj2;
    }

    public void check_pocket(int number){
        if(number == 1){
            System.out.println(right_pocket.property);
        }else if(number == 2){
            System.out.println(left_pocket.property);
        }else
            System.out.println("I do not now it");
    }

}