package tecball;

public class Base {

    protected final static String nom      = null;
    protected final static int    version  = 1;
    protected SQLiteDatabase      mDb      = null;
    protected DatabaseHandler     mHandler = null;

    public DAOBase(Context pContext) {
	this.mHandler = new DatabaseHandler(pContext, nom, null, version);
    }

    public SQLiteDataBase open() {
	mDb = mHandler.getWritableDatabase();
	return mDb;	
    }

    public void close() {
   	mDb.close();
    }

    public SQLiteDatabase getDb() {
	return mDb;
    }
}
