package it.restaurantSite.databaseInterface;

import it.restaurantSite.databaseInterface.IDatabaseDataPath;

public interface IDatabaseDetails extends IDatabaseDataPath{
    void select();
    void view();
}
