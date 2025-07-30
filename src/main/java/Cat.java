public class Cat {
    private String name;
    private Long hearCount;

    public Cat() {
        super();
    }
    public Cat(String name, Long hearCount) {
        super();
        this.name = name;
        this.hearCount = hearCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHearCount() {
        return hearCount;
    }

    public void setHearCount(Long hearCount) {
        this.hearCount = hearCount;
    }

    @Override
    public String toString() {
        return "Cat: " +
                "Имя: '" + name + '\'' +
                ", Кол-во волосков: " + hearCount +
                '!';
    }
}
