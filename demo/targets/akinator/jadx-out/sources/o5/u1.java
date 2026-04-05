package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77737a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.x f77738b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u1(String sql) {
        this(sql, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(sql, "sql");
    }

    public final kv.l getBindingFunction() {
        return this.f77738b;
    }

    public final String getSql() {
        return this.f77737a;
    }

    public u1(String sql, kv.l onBindStatement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sql, "sql");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBindStatement, "onBindStatement");
        this.f77737a = sql;
        this.f77738b = new b1.x(2, onBindStatement);
    }

    public /* synthetic */ u1(String str, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? new f.j0(9) : lVar);
    }
}
