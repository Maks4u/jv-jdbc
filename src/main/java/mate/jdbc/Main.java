package mate.jdbc;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.lib.Injector;
import mate.jdbc.models.Manufacturer;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.jdbc");

    public static void main(String[] args) {
        ManufacturerDao manufacturerDao = (ManufacturerDao) injector
                .getInstance(ManufacturerDao.class);
        for (Manufacturer manufacturer : manufacturerDao.getAll()) {
            System.out.println(manufacturer.getName());
        }
        System.out.println(manufacturerDao.get(4L));
    }
}
