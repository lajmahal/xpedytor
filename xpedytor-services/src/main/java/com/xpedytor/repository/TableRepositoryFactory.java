package com.xpedytor.repository;

/**
 * Created by chakushy on 3/7/16.
 */
public class TableRepositoryFactory {
    public static TableRepository get() {
        return new TableRepository();
    }
}
