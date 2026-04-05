package x5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d extends AutoCloseable {
    void bindBlob(int i10, byte[] bArr);

    default void bindBoolean(int i10, boolean z10) {
        bindLong(i10, z10 ? 1L : 0L);
    }

    void bindDouble(int i10, double d10);

    default void bindFloat(int i10, float f10) {
        bindDouble(i10, f10);
    }

    default void bindInt(int i10, int i11) {
        bindLong(i10, i11);
    }

    void bindLong(int i10, long j10);

    void bindNull(int i10);

    void bindText(int i10, String str);

    void clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i10);

    default boolean getBoolean(int i10) {
        return getLong(i10) != 0;
    }

    int getColumnCount();

    String getColumnName(int i10);

    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(getColumnName(i10));
        }
        return arrayList;
    }

    int getColumnType(int i10);

    double getDouble(int i10);

    default float getFloat(int i10) {
        return (float) getDouble(i10);
    }

    default int getInt(int i10) {
        return (int) getLong(i10);
    }

    long getLong(int i10);

    String getText(int i10);

    boolean isNull(int i10);

    void reset();

    boolean step();
}
