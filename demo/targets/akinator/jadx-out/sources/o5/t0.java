package o5;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends b2 {

    /* renamed from: t, reason: collision with root package name */
    public final Callable f77717t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(y0 database, w container, boolean z10, String[] tableNames, Callable<Object> callableFunction) {
        super(database, container, z10, tableNames, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(callableFunction, "callableFunction");
        this.f77717t = callableFunction;
    }

    @Override // o5.b2
    public Object compute(zu.d<Object> dVar) {
        return this.f77717t.call();
    }
}
