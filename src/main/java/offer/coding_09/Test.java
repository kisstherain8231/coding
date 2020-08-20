package offer.coding_09;

public class Test {


    @org.junit.Test
    public void test() {

        CQueue cQueue = new CQueue();

        System.out.println(cQueue.deleteHead());

        cQueue.appendTail(5);
        cQueue.appendTail(2);

        System.out.println(cQueue.deleteHead());

        System.out.println(cQueue.deleteHead());

    }

}
