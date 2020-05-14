public class main extends Thread {
    String s1 = "Hello KSHRD!";
    String s2 = "************************************";
    String s3 = "I will try my best to be here at HRD.";
    String s4 = "------------------------------------";
    String s5 = "Downloading.........";
    String s6 = "Completed 100%";

    public void run() {
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.println();
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.println();
        for (int i = 0; i < s3.length(); i++) {
            System.out.print(s3.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.println();
        for (int i = 0; i < s4.length(); i++) {
            System.out.print(s4.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.println();
        for (int i = 0; i < s5.length(); i++) {
            System.out.print(s5.charAt(i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.print(s6);
    }

    public static void main(String[] args) {
        main m1 = new main();
        m1.start();
        try {
            m1.join();
        } catch (Exception e) {
        }
    }
}
