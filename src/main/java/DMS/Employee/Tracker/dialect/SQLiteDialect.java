package DMS.Employee.Tracker.dialect;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.env.spi.NameQualifierSupport;

public class SQLiteDialect extends Dialect {
//   public class SQLiteDialect extends org.hibernate.dialect.Dialect {
    public SQLiteDialect() {
        super();
   }

    @Override
   public NameQualifierSupport getNameQualifierSupport() {
       return NameQualifierSupport.NONE;}
    @Override
    public boolean supportsIfExistsBeforeTableName() {
       return true;
    }

    @Override
    public boolean supportsIfExistsAfterTableName() {
        return false;
    }
}



