package com.sparta.kd;

public enum Lifts {
    SQUAT("Squat", 1),
    BENCH("Bench", 2),
    DEADLIFT("Deadlift", 3);

    private String name;
    private int order;

    Lifts(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
