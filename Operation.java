public class Operation extends Thread {
    String operationName;
    int operationTime; //время операции в секунда

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        System.out.println( "Operation  " + operationName + "started");
        for (int i=0; i<operationTime; i++){
            System.out.println(operationName + ": " + i + "seconds");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Operation " + operationName + "finished");

    }
}
