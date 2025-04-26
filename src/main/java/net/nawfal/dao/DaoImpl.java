package net.nawfal.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnes");
        double t = 34;
        return t;
    }
}
