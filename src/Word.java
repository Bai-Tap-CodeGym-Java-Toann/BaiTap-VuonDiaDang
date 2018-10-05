public class Word {
    public static void main(String[] args) {
        Snake lucifer = new Snake();
        Apple tao = new Apple();
        System.out.println("sinh ra adam");
        Human adam = new Human("andam",true);
        System.out.println("sinh ra eva");
        Human eva = new Human("eva",false);
        God.say(" ăn táo là chết với tao");
        lucifer.say(" làm miếng đi em");
        adam.say("oke");
        while (!tao.isEmpty()){
            adam.eat(tao);
            eva.eat(tao);
        }
        eva.sleep();
        adam.sleep();
        God.say(" adam sẽ phải cuốc đất trồng lấy mà ăn");
        God.say("eva ngươi sẽ phải nghe lời chồng và đau đơn khi sinh con");
        System.out.println("end");
    }
}
