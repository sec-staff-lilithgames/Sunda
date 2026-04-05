package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f3 {
    public static final <X> l1 distinctUntilChanged(l1 l1Var) {
        r1 r1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.w0 w0Var = new kotlin.jvm.internal.w0();
        w0Var.f71863b = true;
        if (l1Var.isInitialized()) {
            w0Var.f71863b = false;
            r1Var = new r1(l1Var.getValue());
        } else {
            r1Var = new r1();
        }
        r1Var.addSource(l1Var, new d3(new c3(1, r1Var, w0Var)));
        return r1Var;
    }

    public static final <X, Y> l1 map(l1 l1Var, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        r1 r1Var = l1Var.isInitialized() ? new r1(transform.invoke(l1Var.getValue())) : new r1();
        r1Var.addSource(l1Var, new d3(new c3(0, r1Var, transform)));
        return r1Var;
    }

    public static final <X, Y> l1 switchMap(l1 l1Var, kv.l transform) {
        l1 l1Var2;
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
        r1 r1Var = (l1Var.isInitialized() && (l1Var2 = (l1) transform.invoke(l1Var.getValue())) != null && l1Var2.isInitialized()) ? new r1(l1Var2.getValue()) : new r1();
        r1Var.addSource(l1Var, new d3(new b3(transform, 0, b1Var, r1Var)));
        return r1Var;
    }

    @tu.f
    public static final /* synthetic */ l1 map(l1 l1Var, t.a mapFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mapFunction, "mapFunction");
        r1 r1Var = new r1();
        r1Var.addSource(l1Var, new d3(new c3(2, r1Var, mapFunction)));
        return r1Var;
    }

    @tu.f
    public static final /* synthetic */ l1 switchMap(l1 l1Var, t.a switchMapFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        r1 r1Var = new r1();
        r1Var.addSource(l1Var, new e3(switchMapFunction, r1Var));
        return r1Var;
    }
}
