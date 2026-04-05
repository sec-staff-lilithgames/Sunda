package u5;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements x5.d {

    /* renamed from: b, reason: collision with root package name */
    public final x5.d f87936b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f87937c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f87938e;

    public m(x5.d delegate, String[] columnNames, int[] mapping) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(columnNames, "columnNames");
        e0.checkNotNullParameter(mapping, "mapping");
        this.f87936b = delegate;
        this.f87937c = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map mapCreateMapBuilder = o1.createMapBuilder();
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            mapCreateMapBuilder.put(columnNames[i10], Integer.valueOf(this.f87937c[i11]));
            i10++;
            i11++;
        }
        int columnCount = getColumnCount();
        for (int i12 = 0; i12 < columnCount; i12++) {
            if (!mapCreateMapBuilder.containsKey(getColumnName(i12))) {
                mapCreateMapBuilder.put(getColumnName(i12), Integer.valueOf(i12));
            }
        }
        this.f87938e = o1.build(mapCreateMapBuilder);
    }

    @Override // x5.d
    public void bindBlob(int i10, byte[] value) {
        e0.checkNotNullParameter(value, "value");
        this.f87936b.bindBlob(i10, value);
    }

    @Override // x5.d
    public void bindBoolean(int i10, boolean z10) {
        this.f87936b.bindBoolean(i10, z10);
    }

    @Override // x5.d
    public void bindDouble(int i10, double d10) {
        this.f87936b.bindDouble(i10, d10);
    }

    @Override // x5.d
    public void bindFloat(int i10, float f10) {
        this.f87936b.bindFloat(i10, f10);
    }

    @Override // x5.d
    public void bindInt(int i10, int i11) {
        this.f87936b.bindInt(i10, i11);
    }

    @Override // x5.d
    public void bindLong(int i10, long j10) {
        this.f87936b.bindLong(i10, j10);
    }

    @Override // x5.d
    public void bindNull(int i10) {
        this.f87936b.bindNull(i10);
    }

    @Override // x5.d
    public void bindText(int i10, String value) {
        e0.checkNotNullParameter(value, "value");
        this.f87936b.bindText(i10, value);
    }

    @Override // x5.d
    public void clearBindings() {
        this.f87936b.clearBindings();
    }

    @Override // x5.d, java.lang.AutoCloseable
    public void close() {
        this.f87936b.close();
    }

    @Override // x5.d
    public byte[] getBlob(int i10) {
        return this.f87936b.getBlob(i10);
    }

    @Override // x5.d
    public boolean getBoolean(int i10) {
        return this.f87936b.getBoolean(i10);
    }

    @Override // x5.d
    public int getColumnCount() {
        return this.f87936b.getColumnCount();
    }

    public final int getColumnIndex(String name) {
        e0.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f87938e.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // x5.d
    public String getColumnName(int i10) {
        return this.f87936b.getColumnName(i10);
    }

    @Override // x5.d
    public List<String> getColumnNames() {
        return this.f87936b.getColumnNames();
    }

    @Override // x5.d
    public int getColumnType(int i10) {
        return this.f87936b.getColumnType(i10);
    }

    @Override // x5.d
    public double getDouble(int i10) {
        return this.f87936b.getDouble(i10);
    }

    @Override // x5.d
    public float getFloat(int i10) {
        return this.f87936b.getFloat(i10);
    }

    @Override // x5.d
    public int getInt(int i10) {
        return this.f87936b.getInt(i10);
    }

    @Override // x5.d
    public long getLong(int i10) {
        return this.f87936b.getLong(i10);
    }

    @Override // x5.d
    public String getText(int i10) {
        return this.f87936b.getText(i10);
    }

    @Override // x5.d
    public boolean isNull(int i10) {
        return this.f87936b.isNull(i10);
    }

    @Override // x5.d
    public void reset() {
        this.f87936b.reset();
    }

    @Override // x5.d
    public boolean step() {
        return this.f87936b.step();
    }
}
