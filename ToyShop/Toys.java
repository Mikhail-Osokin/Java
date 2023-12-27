package ToyShop;

import java.util.StringTokenizer;

public class Toys {
    protected int id;
    private int frequency;
    private String name;
 
public Toys(int id, int frequency, String name) {
        this.id = id;
        this.frequency = frequency;
        this.name = name;
}

public int getId(){
    return this.id;
}

public int getFrequency(){
    return this.frequency;
}

public String getName(){
    return this.name;
}

public String getToy(){
    return this.id + "; " + this.frequency + "; " + this.name;
}

public void set(String string){
    StringTokenizer str = new StringTokenizer(string, " ");
    while (str.hasMoreTokens())
    {
    this.id = Integer.parseInt(str.nextToken());
    this.frequency = Integer.parseInt(str.nextToken());
    this.name = str.nextToken();
}
}
}
