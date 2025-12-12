interface Playable{
    void play();

}
class Guitar implements Playable{
    public void play(){
        System.out.println("play guitar");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("play piano");
    }
}
public class Interface{
    public static void main(String[] args) {
        Guitar o1=new Guitar();
        Piano o2=new Piano();
        o1.play();
        o2.play();
    }
}