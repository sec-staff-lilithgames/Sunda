package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends b2 {

    /* renamed from: t, reason: collision with root package name */
    public final kv.l f77687t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(y0 database, w container, boolean z10, String[] tableNames, kv.l lambdaFunction) {
        super(database, container, z10, tableNames, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(lambdaFunction, "lambdaFunction");
        this.f77687t = lambdaFunction;
    }

    @Override // o5.b2
    public Object compute(zu.d<Object> dVar) {
        return u5.c.performSuspending(this.f77503l, true, this.f77505n, this.f77687t, dVar);
    }
}
