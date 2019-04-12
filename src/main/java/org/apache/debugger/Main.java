package org.apache.debugger;

/**
 * @author yiji@apache.org
 */
public class Main {

    /**
     * vm options:
     *
     * -javaagent:/Users/Jason/opensource/cloud-debugger/cloud-debugger-agent/target/cloud-debugger-agent-1.0.0-SNAPSHOT-jar-with-dependencies.jar=/Users/Jason/opensource/cloud-debugger/cloud-debugger-spy/target/cloud-debugger-spy-1.0.0-SNAPSHOT.jar;
     *
     * source code in github:
     *
     * https://github.com/zonghaishang/cloud-debugger.git
     *
     */
    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();

        int a = 0, b = 0, i = 1;
        while (true) {
            a += 1;
            b += 2;
            try {
                System.out.print("loop #" + i++ + " ");
                hello.add(a, b);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

}