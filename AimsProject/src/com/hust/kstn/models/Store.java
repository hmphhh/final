package com.hust.kstn.models;

public class Store {

    private static final int STORE_CAPACITY = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[STORE_CAPACITY];
    private int storeQuantity = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (storeQuantity >= STORE_CAPACITY) {
            System.out.println("The store is almost full!");
            return;
        }
        itemsInStore[storeQuantity] = disc;
        storeQuantity++;
        System.out.println("The disc has been added successfully.");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (storeQuantity == 0) {
            System.out.println("The store is empty!");
            return;
        }
        for (int i = 0; i < storeQuantity; i++) {
            if (itemsInStore[i].equals(disc)) {
                itemsInStore[i] = itemsInStore[storeQuantity - 1];
                itemsInStore[storeQuantity - 1] = null;
                storeQuantity--;
                System.out.println("The disc has been removed successfully.");
                return;
            }
        }
        System.out.println("The disc does not exist!");
    }
}
