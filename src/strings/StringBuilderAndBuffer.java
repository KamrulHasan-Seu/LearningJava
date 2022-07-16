package strings;

public class StringBuilderAndBuffer {
    public static void main(String[] args) throws InterruptedException {
        int n=10;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilderScaler stringBuilderScaler = new StringBuilderScaler(stringBuilder);
        StringBuilderScaler stringBuilderScaler1 = new StringBuilderScaler(stringBuilder);
        StringBuilderScaler stringBuilderScaler2 = new StringBuilderScaler(stringBuilder);

        stringBuilderScaler.start();
        stringBuilderScaler1.start();
        stringBuilderScaler2.start();

        //stringBuilder.join();

        System.out.println("StringBuilder "+stringBuilder.toString());
    }

    private static class StringBuilderScaler extends Thread{
        StringBuilder text;
        public StringBuilderScaler(StringBuilder stringBuilderParam) {
            this.text = stringBuilderParam;

        }

        public void run(){
            for (int i =0;i<=10;i++){
                text.append(i);
            }
        }
    }
}
