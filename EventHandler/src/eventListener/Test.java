package eventListener;

public class Test {

	public static void main(String[] args) {
		Mother mother = new Mother();
		Father father = new Father();
		Child child = new Child();
		mother.addListener(father);
		mother.addListener(child);
		mother.notifyEverybody();

	}

}
