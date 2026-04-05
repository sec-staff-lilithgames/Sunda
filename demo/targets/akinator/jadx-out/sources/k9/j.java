package k9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f70670a;

    @Override // k9.k
    public void setRecycled(boolean z10) {
        this.f70670a = z10;
    }

    @Override // k9.k
    public void throwIfRecycled() {
        if (this.f70670a) {
            throw new IllegalStateException("Already released");
        }
    }
}
