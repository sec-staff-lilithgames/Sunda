package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0.d0 f80144a = new z0.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.d0 f80145b = new z0.d0();

    public static final r0.c derivedStateObservers() {
        z0.d0 d0Var = f80145b;
        r0.c cVar = (r0.c) d0Var.get();
        if (cVar != null) {
            return cVar;
        }
        r0.c cVar2 = new r0.c(new e1[0], 0);
        d0Var.set(cVar2);
        return cVar2;
    }

    public static final <T> v5 derivedStateOf(kv.a aVar) {
        return new b1(aVar, null);
    }

    public static final <R> void observeDerivedStateRecalculations(e1 e1Var, kv.a aVar) {
        r0.c cVarDerivedStateObservers = z4.derivedStateObservers();
        try {
            cVarDerivedStateObservers.add(e1Var);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            cVarDerivedStateObservers.removeAt(cVarDerivedStateObservers.getSize() - 1);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final <T> v5 derivedStateOf(y4 y4Var, kv.a aVar) {
        return new b1(aVar, y4Var);
    }
}
