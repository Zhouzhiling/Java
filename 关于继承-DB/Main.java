package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Database db = new Database();
        db.add(new CD("Don't wanna know","Bravvo",5,240,"Nice song!"));
        db.add(new CD("Don't wanna know too","Bravvo2",5,240,"Nice song!"));

        db.add(new DVD("DVD1","dir1",50,"2333"));
        db.add(new DVD("DVD2","dir2",50,"2333"));
        db.list();
    }
}
