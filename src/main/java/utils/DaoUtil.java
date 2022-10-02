package utils;

import com.zz.core.SqlSessionFactory;
import com.zz.core.SqlSessionFactoryBuilder;
import com.zz.utils.Resources;

import java.io.InputStream;

public class DaoUtil {
    private static final SqlSessionFactoryBuilder sqlSessionFactoryBuilder;

    private static final InputStream configInputStream;

    static {
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        configInputStream = Resources.getResourceAsStream("easydao-config.xml");
    }

    /**
     * 获取SqlSessionFactory对象
     *
     * @return SqlSessionFactory对象
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactoryBuilder.build(configInputStream);
    }
}
