package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f80421a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f80422b;

    public r0(d1.k kVar, boolean z10, f0 f0Var) {
        this.f80421a = z10;
        this.f80422b = f0Var;
    }

    public final d1.k current() {
        if (this.f80421a) {
            return null;
        }
        this.f80422b.getObserverHolder$runtime();
        kotlin.jvm.internal.e0.areEqual((Object) null, (Object) null);
        return null;
    }

    public final d1.k getObserver() {
        return null;
    }

    public final boolean getRoot() {
        return this.f80421a;
    }

    public final void setRoot(boolean z10) {
        this.f80421a = z10;
    }

    public /* synthetic */ r0(d1.k kVar, boolean z10, f0 f0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : kVar, (i10 & 2) != 0 ? false : z10, f0Var);
    }

    public final void setObserver(d1.k kVar) {
    }
}
