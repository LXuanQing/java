// 一个字节是8位二进制数
// int 4个字节
class Demo {
    public static void main(String[] args) {
        // 小空间数据类型与大空间数据类型计算会向大空间数据类型转换
        // 变量自动转化
        byte a = 2;
        int i = a + 8; // 因为a是变量，如果是127就会溢出，自动转化成不超出定义的数据类型范围就不会报错，不会发生类型的自动提升
        // 常量在做运算的时候只要
        byte b = 3 + 4; // 这种没有问题，是因为不是变量，是具体的数，在范围内不会报错
        // 
        System.out.println(b);
        // 小数类型的转换
        float f = 12.5f; // float 类型必须在小数后面加f
        float f1 = f + 4; // float和常量计算不会有变量提升
        float f2 = f + f1; // float类型和float计算不会有提升

        byte af = 2;
        short sf = 3;
        int iif = 4;
        long lf = 5;
        // float类型和所有整数类型计算结果是float类型

        // double类型
        double d = 43.6;
        // double类型和常量计算结果是double
        // double类型和任何整数类型计算结果是double类型

        // 强制转换
        // 一般指，大空间向小空间转，会有风险
        int e = 100;
        short g = (short)e;
        System.out.println(g);
        
        // 小数转换后会舍弃小数位
        float h = 33.5f;
        int k = (int)h;
        System.out.println(k);

        char m = 'a';
        // char类型可转换成 byte short int long float double
        int n = (int)m;
        // 整数类型也可转换成char类型
        // 除了boolean类型不可转换其他类型

        // 逻辑表达式
        // & 与 都会执行
        // | 或 都会执行
        // && 与 第一个是false，不会向下执行
        // || 或 第一个是true，不会向下执行
    }
}