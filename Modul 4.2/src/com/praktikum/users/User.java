package com.praktikum.users;

import java.util.Scanner;

public abstract class User{
    protected String name;
    protected String id;
    public static Scanner input = new Scanner(System.in);


    public abstract void displayAppMenu();
    }

