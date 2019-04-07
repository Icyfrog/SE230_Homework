# SE230_Homework
Homework Ⅱ of SE230

注意，请将Greeting.java中
````java
public String ss(String beginw, String endw) {
        System.out.println("Please give me two English words, 
        and I will change the first into the second by changing one letter at a time");
        System.out.println();
        System.out.println("Dictionary file name?");
        String fileName = "E:\\IDEAprojects\\ladder\\src\\d.txt";
        HashSet<String> set = new HashSet<>();
        if(readFile(fileName,set)){
            System.out.println("Ending word? (or Enter to quit):");
            System.out.println("Begining word? (or Enter to quit):");
            return access(beginw,endw,set);
        }
        return "wrong";

    }
````
`String fileName = "E:\\IDEAprojects\\ladder\\src\\d.txt";`字典路径改为绝对路径

编译 mvn compile

测试 mvn test

运行 mvn spring-boot:run

打开 http://localhost:8080/Ladder?b=apple&e=happy

其中b表示beginword，e表示endword
