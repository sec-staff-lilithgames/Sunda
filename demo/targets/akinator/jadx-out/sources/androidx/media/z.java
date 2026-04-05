package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f6886c;

    public z(h0 h0Var, i0 i0Var) {
        this.f6886c = h0Var;
        this.f6885b = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k kVar = (k) this.f6886c.f6827a.f6775f.remove(((j0) this.f6885b).asBinder());
        if (kVar != null) {
            ((j0) kVar.f6836f).asBinder().unlinkToDeath(kVar, 0);
        }
    }
}
