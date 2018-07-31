package com.borllor.pattern.creation.abst.expand;

import com.borllor.pattern.creation.abst.expand.dao.OrderDAO;
import com.borllor.pattern.creation.abst.expand.dao.ProductDAO;

/**
 * Created by borllor on 2017/11/26.
 */
public interface DAOFactory {
    public OrderDAO createOrderDAL();

    public ProductDAO createProductDAL();
}
