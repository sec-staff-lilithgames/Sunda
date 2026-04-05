package y5;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final C0811a f94071e = new C0811a(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f94072b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f94073c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: y5.a$a, reason: collision with other inner class name */
    public static final class C0811a {
        public C0811a(u uVar) {
        }

        public final void bind(h statement, Object[] objArr) {
            e0.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    statement.bindNull(i10);
                } else if (obj instanceof byte[]) {
                    statement.bindBlob(i10, (byte[]) obj);
                } else if (obj instanceof Float) {
                    statement.bindDouble(i10, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    statement.bindDouble(i10, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    statement.bindLong(i10, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    statement.bindLong(i10, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    statement.bindLong(i10, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    statement.bindLong(i10, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    statement.bindString(i10, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    statement.bindLong(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public a(String query, Object[] objArr) {
        e0.checkNotNullParameter(query, "query");
        this.f94072b = query;
        this.f94073c = objArr;
    }

    public static final void bind(h hVar, Object[] objArr) {
        f94071e.bind(hVar, objArr);
    }

    @Override // y5.i
    public void bindTo(h statement) {
        e0.checkNotNullParameter(statement, "statement");
        f94071e.bind(statement, this.f94073c);
    }

    @Override // y5.i
    public int getArgCount() {
        Object[] objArr = this.f94073c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // y5.i
    public String getSql() {
        return this.f94072b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        e0.checkNotNullParameter(query, "query");
    }
}
