package o5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements y5.i, y5.h {

    /* renamed from: k, reason: collision with root package name */
    public static final a f77763k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final TreeMap f77764l = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f77765b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f77766c;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f77767e;

    /* renamed from: f, reason: collision with root package name */
    public final double[] f77768f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f77769g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f77770h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f77771i;

    /* renamed from: j, reason: collision with root package name */
    public int f77772j;

    public w1(int i10, kotlin.jvm.internal.u uVar) {
        this.f77765b = i10;
        int i11 = i10 + 1;
        this.f77771i = new int[i11];
        this.f77767e = new long[i11];
        this.f77768f = new double[i11];
        this.f77769g = new String[i11];
        this.f77770h = new byte[i11][];
    }

    public static final w1 acquire(String str, int i10) {
        return f77763k.acquire(str, i10);
    }

    public static final w1 copyFrom(y5.i iVar) {
        return f77763k.copyFrom(iVar);
    }

    @Override // y5.h
    public void bindBlob(int i10, byte[] value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77771i[i10] = 5;
        this.f77770h[i10] = value;
    }

    @Override // y5.h
    public void bindDouble(int i10, double d10) {
        this.f77771i[i10] = 3;
        this.f77768f[i10] = d10;
    }

    @Override // y5.h
    public void bindLong(int i10, long j10) {
        this.f77771i[i10] = 2;
        this.f77767e[i10] = j10;
    }

    @Override // y5.h
    public void bindNull(int i10) {
        this.f77771i[i10] = 1;
    }

    @Override // y5.h
    public void bindString(int i10, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77771i[i10] = 4;
        this.f77769g[i10] = value;
    }

    public final void bindText(int i10, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        bindString(i10, value);
    }

    @Override // y5.i
    public void bindTo(y5.h statement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f77771i[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.f77767e[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.f77768f[i10]);
            } else if (i11 == 4) {
                String str = this.f77769g[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f77770h[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // y5.h
    public void clearBindings() {
        uu.f0.fill$default(this.f77771i, 1, 0, 0, 6, (Object) null);
        uu.f0.fill$default(this.f77769g, (Object) null, 0, 0, 6, (Object) null);
        uu.f0.fill$default(this.f77770h, (Object) null, 0, 0, 6, (Object) null);
        this.f77766c = null;
    }

    public final void copyArgumentsFrom(w1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.f77771i, 0, this.f77771i, 0, argCount);
        System.arraycopy(other.f77767e, 0, this.f77767e, 0, argCount);
        System.arraycopy(other.f77769g, 0, this.f77769g, 0, argCount);
        System.arraycopy(other.f77770h, 0, this.f77770h, 0, argCount);
        System.arraycopy(other.f77768f, 0, this.f77768f, 0, argCount);
    }

    @Override // y5.i
    public int getArgCount() {
        return this.f77772j;
    }

    public final int getCapacity() {
        return this.f77765b;
    }

    @Override // y5.i
    public String getSql() {
        String str = this.f77766c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void init(String query, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        this.f77766c = query;
        this.f77772j = i10;
    }

    public final void release() {
        TreeMap treeMap = f77764l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f77765b), this);
            f77763k.prunePoolLocked$room_runtime_release();
        }
    }

    public final u1 toRoomRawQuery() {
        return new u1(getSql(), new aw.f(this, 26));
    }

    public final void bindTo(x5.d statement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f77771i[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.f77767e[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.f77768f[i10]);
            } else if (i11 == 4) {
                String str = this.f77769g[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindText(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f77770h[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final w1 acquire(String query, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
            TreeMap treeMap = w1.f77764l;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    w1 w1Var = new w1(i10, null);
                    w1Var.init(query, i10);
                    return w1Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                w1 w1Var2 = (w1) entryCeilingEntry.getValue();
                w1Var2.init(query, i10);
                kotlin.jvm.internal.e0.checkNotNull(w1Var2);
                return w1Var2;
            }
        }

        public final w1 copyFrom(y5.i supportSQLiteQuery) {
            kotlin.jvm.internal.e0.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            w1 w1VarAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new v1(w1VarAcquire));
            return w1VarAcquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap treeMap = w1.f77764l;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
