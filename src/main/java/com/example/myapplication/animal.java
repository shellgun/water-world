package com.example.myapplication;

public class animal {
    private  String name;
    private  String typeAnimal;
    private int animalResource;

    public animal(String членистоногие_, int rak, String s) {
    }

    public static void add(animal членистоногие_) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public int getAnimalResource() {
        return animalResource;
    }

    public void setAnimalResource(int animalResource) {
        this.animalResource = animalResource;
    }

    public animal (String name, String typeAnimal, int animalResource){
        this.name =name;
        this.typeAnimal=typeAnimal;
    }

}
