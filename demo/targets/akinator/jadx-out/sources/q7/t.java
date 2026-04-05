package q7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82560a;

    public t(boolean z10) {
        super(null);
        this.f82560a = z10;
    }

    @Override // q7.r
    public boolean allowHardwareMainThread(m7.j jVar) {
        return this.f82560a;
    }

    @Override // q7.r
    public boolean allowHardwareWorkerThread() {
        return this.f82560a;
    }
}
