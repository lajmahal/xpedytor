package com.xpedytor.repository;

import com.xpedytor.repository.impl.TableRepositoryImpl;

/**
 * Created by chakushy on 3/7/16.
 */
public class TableRepositoryFactory {
    public static TableRepository get() {
        return new TableRepositoryImpl();
    }
}
