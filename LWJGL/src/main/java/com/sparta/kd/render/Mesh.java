package com.sparta.kd.render;

public class Mesh {
    private int vao;
    private int vertices;

    public Mesh(int vao, int vertex) {
        this.vao = vao;
        this.vertices = vertex;
    }

    public int getVao() {
        return vao;
    }

    public int getVertices() {
        return vertices;
    }
}
