package task3.part3;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        X86IntelProcessor x86IntelProcessor = new X86IntelProcessor();
        X8664IntelProcessor x8664IntelProcessor = new X8664IntelProcessor();
        ArmProcessor armProcessor = new ArmProcessor();
        Thread newThread = new Thread(() -> {
            System.out.println(x86IntelProcessor.calculateBinary(25) + "(x86IntelProcessor25");
            System.out.println(x8664IntelProcessor.calculateBinary(25) + "x8664IntelProcessor25");
            System.out.println(armProcessor.calculateBinary(25) + "armProcessor25");

            System.out.println(x86IntelProcessor.calculateBinary(884));
            System.out.println(x8664IntelProcessor.calculateBinary(884));
            System.out.println(armProcessor.calculateBinary(884));

            System.out.println(x86IntelProcessor.calculateBinary(721));
            System.out.println(x8664IntelProcessor.calculateBinary(721));
            System.out.println(armProcessor.calculateBinary(721));
        });
        newThread.start();


   }
}
