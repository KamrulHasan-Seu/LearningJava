package strings;

public class TimingForBufferAndBuilder {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<=1000000;i++){
            stringBuffer.append("abcd");
        }
        System.out.println("StringBuffer Time is: "+(System.currentTimeMillis()-time));

        long time1 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<=1000000;i++){
            stringBuilder.append("abcd");
        }
        System.out.println("StringBuilder Time is: "+(System.currentTimeMillis()-time1));

    }
}
