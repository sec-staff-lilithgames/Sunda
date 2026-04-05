package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements d1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f80248a;

    public i0(j0 j0Var) {
        this.f80248a = j0Var;
    }

    @Override // d1.l
    public void dispose() {
        Object obj = this.f80248a.f80263f;
        j0 j0Var = this.f80248a;
        synchronized (obj) {
            j0Var.getObserverHolder$runtime().getObserver();
            if (kotlin.jvm.internal.e0.areEqual((Object) null, (Object) null)) {
                j0Var.getObserverHolder$runtime().setObserver(null);
                j0Var.getObserverHolder$runtime().setRoot(false);
            }
        }
    }
}
