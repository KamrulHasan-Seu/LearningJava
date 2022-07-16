package strings;

public class Scaler {

    public static void main(String[] args) throws InterruptedException {
        int n = 10;

        StringBuilder text = new StringBuilder();
        StringBuilderScaler builderThread = new StringBuilderScaler(text);
        StringBuilderScaler builderThread2 = new StringBuilderScaler(text);
        StringBuilderScaler builderThread3 = new StringBuilderScaler(text);
        builderThread.start();
        builderThread2.start();
        builderThread3.start();
        builderThread.join();
        builderThread2.join();
        builderThread3.join();
        System.out.println("StringBuilder:" + text.toString());


    }

    static class StringBuilderScaler extends Thread {
        StringBuilder text;

        public StringBuilderScaler (StringBuilder sb) {
            text = sb;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                text.append(i);
            }
        }

    }
}
