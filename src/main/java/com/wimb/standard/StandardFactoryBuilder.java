package com.wimb.standard;

// 流式API 构造器实现构造器可选参数构建
public class StandardFactoryBuilder {
    // 必填构造参数
    private String name;
    private int age;
    // 可选参数
    private String address;
    private Long salary;

    public StandardFactoryBuilder(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
        salary = builder.salary;
    }

    public static class Builder {
        private String name;
        private int age;

        private String address = "BeiJing";
        private Long salary = 100L;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder salary(Long salary) {
            this.salary = salary;
            return this;
        }
        public StandardFactoryBuilder build() {
            return new StandardFactoryBuilder(this);
        }
    }
}

//    标准构造器
//    public static void main(String[] args) {
//        StandardFactoryBuilder standardFactoryBuilder =
//                new StandardFactoryBuilder.Builder("wimb", 10).address("Shanghai").salary(100L).build();
//    }