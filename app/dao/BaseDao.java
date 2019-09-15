package dao;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.google.inject.Inject;

public class BaseDao
{
    protected static EbeanServer db;

    @Inject
    public BaseDao()
    {
        if(null == db)
        {
            db = Ebean.getServer("default");
        }
    }
}