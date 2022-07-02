package Project3;

public class Backpack {
    int cylinder;
    int flat;
    int circle;

    public Backpack() {
        this.cylinder = 0;
        this.flat = 0;
        this.circle = 0;
    }
    public void add(Object obj){
        if(obj.property.equals("cylinder") && this.cylinder == 0){
            this.cylinder += 1;
        }else if(obj.property.equals("flat") && this.flat == 0){
            this.flat += 1;
        }else if(obj.property.equals("circle") && this.circle < 50){
            this.circle += 1;
        }else {
            System.out.println("There no place for " + obj.name);
            return;
        }
        System.out.println("Successfully added object - " + obj.name);
    }
}