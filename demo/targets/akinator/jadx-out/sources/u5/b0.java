package u5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f87859c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f87860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87861b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        public final b0 read(y5.c database, String viewName) {
            e0.checkNotNullParameter(database, "database");
            e0.checkNotNullParameter(viewName, "viewName");
            return read(new r5.a(database), viewName);
        }

        public final b0 read(x5.b connection, String viewName) {
            e0.checkNotNullParameter(connection, "connection");
            e0.checkNotNullParameter(viewName, "viewName");
            return x.readViewInfo(connection, viewName);
        }
    }

    public b0(String name, String str) {
        e0.checkNotNullParameter(name, "name");
        this.f87860a = name;
        this.f87861b = str;
    }

    public static final b0 read(x5.b bVar, String str) {
        return f87859c.read(bVar, str);
    }

    public boolean equals(Object obj) {
        return c0.equalsCommon(this, obj);
    }

    public int hashCode() {
        return c0.hashCodeCommon(this);
    }

    public String toString() {
        return c0.toStringCommon(this);
    }

    @tu.f
    public static final b0 read(y5.c cVar, String str) {
        return f87859c.read(cVar, str);
    }
}
