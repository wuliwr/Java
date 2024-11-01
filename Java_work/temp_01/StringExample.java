public class StringExample {
    public static void main(String args[]) {
        String s1 = new String("you are a student");
        String s2 = new String("how are you");
        // 使用equals方法判断s1与s2是否相同
        if (s1.equals(s2)) {
            System.out.println("s1与s2相同");
        } else {
            System.out.println("s1与s2不相同");
        }
        
        String s3 = new String("13971918888");
        // 判断手机号是否以“139”开头
        if (s3.startsWith("139")) {
            System.out.println("手机号以139开头");
        }

        String s4 = new String("你"), s5 = new String("我");
        // 按着字典序s4大于s5的表达式
        if (s4.compareTo(s5) > 0) {
            System.out.println("按字典序s4大于s5");
        } else {
            System.out.println("按字典序s4小于s5");
        }

        /******************************************************/
        int position = 0;
        String path = "d:\\java\\A.java";
        // 获取path中最后出现\\的位置
        position = path.lastIndexOf("\\");
        System.out.println(path + "中最后出现\\的位置为: " + position);
        // 利用字符串截取方法获取path中“A.java”子字符串
        String fileName = path.substring(position + 1);
        System.out.println(path + "中含有的文件名为: " + fileName);
        /******************************************************/
        String s6 = new String("100");
        String s7 = new String("123.678");
        // 将s6转化成int型数据
        int n1 = Integer.parseInt(s6);
        // 将s7转化成double型数据
        double n2 = Double.parseDouble(s7);
        double m = n1 + n2;
        System.out.println(n1 + " + " + n2 + " 的和为: " + m);
        // String类调用valueOf(double n)方法将m转化为字符串对象
        String s8 = String.valueOf(m);
        position = s8.indexOf(".");
        // 利用字符串截取方法获取s8中小数点后面的小数
        String temp = s8.substring(position + 1);
        System.out.println("数字" + m + "有" + temp.length() + "位小数");
        
        String s9 = new String("ABCDEF");
        // 将s9存放到数组a中
        char a[] = s9.toCharArray();
        System.out.print(s9 + " 逆序字符输出为: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
