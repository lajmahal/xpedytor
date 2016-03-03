package com.xpedytor.repository;

import com.xpedytor.model.Table;

import java.util.List;

/**
 * Created by laj on 3/3/16.
 */
public interface ITableRepository {

    List<Table> findAllTables();

    Table findTable(int tableNumber);
}
