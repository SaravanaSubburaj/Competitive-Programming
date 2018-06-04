import java.io.*;
import java.lang.reflect.Field;
import java.util.Arrays;
 
public class Main{
 
 
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            return ret;
        }
 
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
    }
 
    static class Writer {
        private static final int BUFSIZE = 0x10000;
        private final FileOutputStream fos;
        private final byte[] buffer = new byte[BUFSIZE];
        private int offset = 0;
 
        private FileOutputStream getFileOutputStream(PrintStream out) {
            try {
                Field field = out.getClass().getSuperclass()
                        .getDeclaredField("out");
                field.setAccessible(true);
                OutputStream os = (OutputStream) field.get(out);
                if (os instanceof BufferedOutputStream) {
                    BufferedOutputStream bos = (BufferedOutputStream) os;
                    field = bos.getClass().getSuperclass().getDeclaredField("out");
                    field.setAccessible(true);
                    return (FileOutputStream) field.get(bos);
                }
                return (FileOutputStream) field.get(out);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return null;
        }
 
        Writer(PrintStream out) throws IOException {
            fos = getFileOutputStream(out);
        }
 
        private static final int[] boundaries = new int[]{9, 99, 999, 9999,
                99999, 999999, 9999999, 99999999, 999999999};
        private static final int[] divs = new int[]{1, 10, 100, 1000, 10000,
                100000, 1000000, 10000000, 100000000};
        private static final byte[] numbers = "0123456789".getBytes();
 
        void writeln(int number) throws IOException {
            if (offset > BUFSIZE - 100)
                flush();
            int index;
            for (index = 0; index < boundaries.length; index++)
                if (number <= boundaries[index])
                    break;
            for (; index >= 0; index--) {
                int mult = number / divs[index];
                buffer[offset++] = numbers[mult];
                number -= mult * divs[index];
            }
            buffer[offset++] = '\n';
        }
 
        void flush() throws IOException {
            if (offset > 0) {
                fos.write(buffer, 0, offset);
                offset = 0;
            }
        }
    }
 
    //Main
 
    public static void main(String[] args) throws IOException {
        Reader input = new Reader();
        Writer out = new Writer(System.out);
 
        int n = input.nextInt();
        int[] arr = new int[n];
 
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
 
        Arrays.sort(arr);
        for (int num:arr){
            out.writeln(num);
        }
        out.flush();
    }
}
