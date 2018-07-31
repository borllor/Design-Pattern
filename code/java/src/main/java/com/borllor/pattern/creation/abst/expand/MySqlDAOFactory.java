package com.borllor.pattern.creation.abst.expand;

import com.borllor.pattern.creation.abst.expand.dao.*;

/**
 * Created by borllor on 2017/11/26.
 */
public class MySqlDAOFactory implements DAOFactory {
    public OrderDAO createOrderDAL() {
        return new MySqlOrderDAO();
    }

    public ProductDAO createProductDAL() {
        return new MySqlProductDAO();
    }
}
