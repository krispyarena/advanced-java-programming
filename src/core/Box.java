package core;

public class Box {
    
    private int l,b,h;

     void setData(int x, int y , int z){

         l = x;
         b = y;
         h = z;
     }

    int findVolume(){
        return l*b*h;
    }
}

class BoxTest{
    public static void main(String[] args) {

        Box b = new Box();
        b.setData(10,5,2);

        System.out.println(b.findVolume());


    }
}
