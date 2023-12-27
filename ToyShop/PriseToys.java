package ToyShop;

public class PriseToys extends Toys {
    public PriseToys(int id, int frequency, String name){
    super(id, frequency, name);
    }

@Override
public String getToy(){
    int a = (int)(Math.random()*9)+1;
    String b = "";
    if (a == 1 & this.getFrequency() == a) {
        b = this.getId() + "; " + this.getFrequency() + "; " + this.getName();
    }
    else if (a > 1 & a < 2 | a == 2 & this.getFrequency() == a) {
        b = this.getId() + "; " + this.getFrequency() + "; " + this.getName();
    }
    else if (a>2 & this.getFrequency() == a) {
        b = this.getId() + "; " + this.getFrequency() + "; " + this.getName();      
    }
    return b;
}
}