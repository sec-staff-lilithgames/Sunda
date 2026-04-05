package r5;

import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import sv.n0;
import tu.k;
import y5.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f implements x5.d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f83794f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final y5.c f83795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83796c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83797e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final f create(y5.c db2, String sql) {
            e0.checkNotNullParameter(db2, "db");
            e0.checkNotNullParameter(sql, "sql");
            String string = n0.trim(sql).toString();
            if (string.length() >= 3) {
                String strSubstring = string.substring(0, 3);
                e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String upperCase = strSubstring.toUpperCase(Locale.ROOT);
                e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                int iHashCode = upperCase.hashCode();
                if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                    return new b(db2, sql);
                }
            }
            return new c(db2, sql);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f {

        /* renamed from: m, reason: collision with root package name */
        public static final a f83798m = new a(null);

        /* renamed from: g, reason: collision with root package name */
        public int[] f83799g;

        /* renamed from: h, reason: collision with root package name */
        public long[] f83800h;

        /* renamed from: i, reason: collision with root package name */
        public double[] f83801i;

        /* renamed from: j, reason: collision with root package name */
        public String[] f83802j;

        /* renamed from: k, reason: collision with root package name */
        public byte[][] f83803k;

        /* renamed from: l, reason: collision with root package name */
        public Cursor f83804l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(u uVar) {
            }

            public static final int access$getDataType(a aVar, Cursor cursor, int i10) {
                aVar.getClass();
                int type = cursor.getType(i10);
                int type2 = cursor.getType(i10);
                if (type2 == 0) {
                    return 5;
                }
                int i11 = 1;
                if (type2 != 1) {
                    i11 = 2;
                    if (type2 != 2) {
                        i11 = 3;
                        if (type2 != 3) {
                            if (type2 == 4) {
                                return 4;
                            }
                            throw new IllegalStateException(("Unknown field type: " + type).toString());
                        }
                    }
                }
                return i11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y5.c db2, String sql) {
            super(db2, sql, null);
            e0.checkNotNullParameter(db2, "db");
            e0.checkNotNullParameter(sql, "sql");
            this.f83799g = new int[0];
            this.f83800h = new long[0];
            this.f83801i = new double[0];
            this.f83802j = new String[0];
            this.f83803k = new byte[0][];
        }

        public static void i(Cursor cursor, int i10) {
            if (i10 < 0 || i10 >= cursor.getColumnCount()) {
                throw o2.x(25, "column index out of range");
            }
        }

        @Override // r5.f, x5.d
        public void bindBlob(int i10, byte[] value) {
            e0.checkNotNullParameter(value, "value");
            d();
            e(4, i10);
            this.f83799g[i10] = 4;
            this.f83803k[i10] = value;
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindBoolean(int i10, boolean z10) {
            super.bindBoolean(i10, z10);
        }

        @Override // r5.f, x5.d
        public void bindDouble(int i10, double d10) {
            d();
            e(2, i10);
            this.f83799g[i10] = 2;
            this.f83801i[i10] = d10;
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindFloat(int i10, float f10) {
            super.bindFloat(i10, f10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindInt(int i10, int i11) {
            super.bindInt(i10, i11);
        }

        @Override // r5.f, x5.d
        public void bindLong(int i10, long j10) {
            d();
            e(1, i10);
            this.f83799g[i10] = 1;
            this.f83800h[i10] = j10;
        }

        @Override // r5.f, x5.d
        public void bindNull(int i10) {
            d();
            e(5, i10);
            this.f83799g[i10] = 5;
        }

        @Override // r5.f, x5.d
        public void bindText(int i10, String value) {
            e0.checkNotNullParameter(value, "value");
            d();
            e(3, i10);
            this.f83799g[i10] = 3;
            this.f83802j[i10] = value;
        }

        @Override // r5.f, x5.d
        public void clearBindings() {
            d();
            this.f83799g = new int[0];
            this.f83800h = new long[0];
            this.f83801i = new double[0];
            this.f83802j = new String[0];
            this.f83803k = new byte[0][];
        }

        @Override // r5.f, x5.d, java.lang.AutoCloseable
        public void close() {
            if (!this.f83797e) {
                clearBindings();
                reset();
            }
            this.f83797e = true;
        }

        public final void e(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f83799g;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.f83799g = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f83800h;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.f83800h = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f83801i;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    e0.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.f83801i = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f83802j;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f83802j = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f83803k;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                e0.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.f83803k = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // r5.f, x5.d
        public byte[] getBlob(int i10) {
            d();
            Cursor cursorK = k();
            i(cursorK, i10);
            byte[] blob = cursorK.getBlob(i10);
            e0.checkNotNullExpressionValue(blob, "getBlob(...)");
            return blob;
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ boolean getBoolean(int i10) {
            return super.getBoolean(i10);
        }

        @Override // r5.f, x5.d
        public int getColumnCount() {
            d();
            h();
            Cursor cursor = this.f83804l;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // r5.f, x5.d
        public String getColumnName(int i10) {
            d();
            h();
            Cursor cursor = this.f83804l;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            i(cursor, i10);
            String columnName = cursor.getColumnName(i10);
            e0.checkNotNullExpressionValue(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ List getColumnNames() {
            return super.getColumnNames();
        }

        @Override // r5.f, x5.d
        public int getColumnType(int i10) {
            d();
            h();
            Cursor cursor = this.f83804l;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            i(cursor, i10);
            return a.access$getDataType(f83798m, cursor, i10);
        }

        @Override // r5.f, x5.d
        public double getDouble(int i10) {
            d();
            Cursor cursorK = k();
            i(cursorK, i10);
            return cursorK.getDouble(i10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ float getFloat(int i10) {
            return super.getFloat(i10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ int getInt(int i10) {
            return super.getInt(i10);
        }

        @Override // r5.f, x5.d
        public long getLong(int i10) {
            d();
            Cursor cursorK = k();
            i(cursorK, i10);
            return cursorK.getLong(i10);
        }

        @Override // r5.f, x5.d
        public String getText(int i10) {
            d();
            Cursor cursorK = k();
            i(cursorK, i10);
            String string = cursorK.getString(i10);
            e0.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        public final void h() {
            if (this.f83804l == null) {
                this.f83804l = this.f83795b.query(new g(this));
            }
        }

        @Override // r5.f, x5.d
        public boolean isNull(int i10) {
            d();
            Cursor cursorK = k();
            i(cursorK, i10);
            return cursorK.isNull(i10);
        }

        public final Cursor k() {
            Cursor cursor = this.f83804l;
            if (cursor != null) {
                return cursor;
            }
            throw o2.x(21, "no row");
        }

        @Override // r5.f, x5.d
        public void reset() {
            d();
            Cursor cursor = this.f83804l;
            if (cursor != null) {
                cursor.close();
            }
            this.f83804l = null;
        }

        @Override // r5.f, x5.d
        public boolean step() {
            d();
            h();
            Cursor cursor = this.f83804l;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public f(y5.c cVar, String str, u uVar) {
        this.f83795b = cVar;
        this.f83796c = str;
    }

    @Override // x5.d
    public abstract /* synthetic */ void bindBlob(int i10, byte[] bArr);

    @Override // x5.d
    public /* bridge */ /* synthetic */ void bindBoolean(int i10, boolean z10) {
        super.bindBoolean(i10, z10);
    }

    @Override // x5.d
    public abstract /* synthetic */ void bindDouble(int i10, double d10);

    @Override // x5.d
    public /* bridge */ /* synthetic */ void bindFloat(int i10, float f10) {
        super.bindFloat(i10, f10);
    }

    @Override // x5.d
    public /* bridge */ /* synthetic */ void bindInt(int i10, int i11) {
        super.bindInt(i10, i11);
    }

    @Override // x5.d
    public abstract /* synthetic */ void bindLong(int i10, long j10);

    @Override // x5.d
    public abstract /* synthetic */ void bindNull(int i10);

    @Override // x5.d
    public abstract /* synthetic */ void bindText(int i10, String str);

    @Override // x5.d
    public abstract /* synthetic */ void clearBindings();

    @Override // x5.d, java.lang.AutoCloseable
    public abstract /* synthetic */ void close();

    public final void d() {
        if (this.f83797e) {
            throw o2.x(21, "statement is closed");
        }
    }

    @Override // x5.d
    public abstract /* synthetic */ byte[] getBlob(int i10);

    @Override // x5.d
    public /* bridge */ /* synthetic */ boolean getBoolean(int i10) {
        return super.getBoolean(i10);
    }

    @Override // x5.d
    public abstract /* synthetic */ int getColumnCount();

    @Override // x5.d
    public abstract /* synthetic */ String getColumnName(int i10);

    @Override // x5.d
    public /* bridge */ /* synthetic */ List getColumnNames() {
        return super.getColumnNames();
    }

    @Override // x5.d
    public abstract /* synthetic */ int getColumnType(int i10);

    @Override // x5.d
    public abstract /* synthetic */ double getDouble(int i10);

    @Override // x5.d
    public /* bridge */ /* synthetic */ float getFloat(int i10) {
        return super.getFloat(i10);
    }

    @Override // x5.d
    public /* bridge */ /* synthetic */ int getInt(int i10) {
        return super.getInt(i10);
    }

    @Override // x5.d
    public abstract /* synthetic */ long getLong(int i10);

    @Override // x5.d
    public abstract /* synthetic */ String getText(int i10);

    @Override // x5.d
    public abstract /* synthetic */ boolean isNull(int i10);

    @Override // x5.d
    public abstract /* synthetic */ void reset();

    @Override // x5.d
    public abstract /* synthetic */ boolean step();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f {

        /* renamed from: g, reason: collision with root package name */
        public final j f83805g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y5.c db2, String sql) {
            super(db2, sql, null);
            e0.checkNotNullParameter(db2, "db");
            e0.checkNotNullParameter(sql, "sql");
            this.f83805g = db2.compileStatement(sql);
        }

        @Override // r5.f, x5.d
        public void bindBlob(int i10, byte[] value) {
            e0.checkNotNullParameter(value, "value");
            d();
            this.f83805g.bindBlob(i10, value);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindBoolean(int i10, boolean z10) {
            super.bindBoolean(i10, z10);
        }

        @Override // r5.f, x5.d
        public void bindDouble(int i10, double d10) {
            d();
            this.f83805g.bindDouble(i10, d10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindFloat(int i10, float f10) {
            super.bindFloat(i10, f10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ void bindInt(int i10, int i11) {
            super.bindInt(i10, i11);
        }

        @Override // r5.f, x5.d
        public void bindLong(int i10, long j10) {
            d();
            this.f83805g.bindLong(i10, j10);
        }

        @Override // r5.f, x5.d
        public void bindNull(int i10) {
            d();
            this.f83805g.bindNull(i10);
        }

        @Override // r5.f, x5.d
        public void bindText(int i10, String value) {
            e0.checkNotNullParameter(value, "value");
            d();
            this.f83805g.bindString(i10, value);
        }

        @Override // r5.f, x5.d
        public void clearBindings() {
            d();
            this.f83805g.clearBindings();
        }

        @Override // r5.f, x5.d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f83805g.close();
            this.f83797e = true;
        }

        @Override // r5.f, x5.d
        public byte[] getBlob(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ boolean getBoolean(int i10) {
            return super.getBoolean(i10);
        }

        @Override // r5.f, x5.d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // r5.f, x5.d
        public String getColumnName(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ List getColumnNames() {
            return super.getColumnNames();
        }

        @Override // r5.f, x5.d
        public int getColumnType(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public double getDouble(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ float getFloat(int i10) {
            return super.getFloat(i10);
        }

        @Override // r5.f, x5.d
        public /* bridge */ /* synthetic */ int getInt(int i10) {
            return super.getInt(i10);
        }

        @Override // r5.f, x5.d
        public long getLong(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public String getText(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public boolean isNull(int i10) {
            d();
            x5.a.throwSQLiteException(21, "no row");
            throw new k();
        }

        @Override // r5.f, x5.d
        public boolean step() {
            d();
            this.f83805g.execute();
            return false;
        }

        @Override // r5.f, x5.d
        public void reset() {
        }
    }
}
