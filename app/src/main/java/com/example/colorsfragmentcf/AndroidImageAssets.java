package com.example.colorsfragmentcf;

import java.util.ArrayList;

public class AndroidImageAssets {

    private static final ArrayList<Integer> heads = new ArrayList<Integer>() {{
        add(R.color.red2);
        add(R.color.yellow);
        add(R.color.black);
        add(R.color.Green);
        add(R.color.blue);
    }};

    private static final ArrayList<Integer> bodies = new ArrayList<Integer>() {{
        add(R.color.black);
        add(R.color.yellow);
        add(R.color.red2);
        add(R.color.green1);
        add(R.color.white);
    }};

    private static final ArrayList<Integer> legs = new ArrayList<Integer>() {{
        add(R.color.white);
        add(R.color.red3);
        add(R.color.black);
        add(R.color.orange);
        add(R.color.blue3);
    }};

    private static final ArrayList<Integer> all = new ArrayList<Integer>() {{
        addAll(heads);
        addAll(bodies);
        addAll(legs);
    }};

    public static ArrayList<Integer> getHeads() {
        return heads;
    }

    public static ArrayList<Integer> getBodies() {
        return bodies;
    }

    public static ArrayList<Integer> getLegs() {
        return legs;
    }

    public static ArrayList<Integer> getAll() {
        return all;
    }

}
