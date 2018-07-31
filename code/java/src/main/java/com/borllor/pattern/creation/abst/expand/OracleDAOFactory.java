package com.borllor.pattern.creation.abst.expand;

import com.borllor.pattern.creation.abst.expand.DAOFactory;
import com.borllor.pattern.creation.abst.expand.dao.OracleOrderDAO;
import com.borllor.pattern.creation.abst.expand.dao.OracleProductDAO;
import com.borllor.pattern.creation.abst.expand.dao.OrderDAO;
import com.borllor.pattern.creation.abst.expand.dao.ProductDAO;

/**
 * Created by borllor on 2017/11/26.
 */
public class OracleDAOFactory implements DAOFactory {
    public OrderDAO createOrderDAL() {
        return new OracleOrderDAO();
    }

    public ProductDAO createProductDAL() {
        return new OracleProductDAO();
    }
}
