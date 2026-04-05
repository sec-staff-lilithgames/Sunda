package ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 implements f0 {
    @Override // ic.f0
    public e0 acquireAndLinkPooled() {
        return acquirePooled();
    }

    @Override // ic.f0
    public abstract e0 acquirePooled();

    @Override // ic.f0
    public boolean clear() {
        return false;
    }

    @Override // ic.f0
    public int pooledCount() {
        return -1;
    }

    @Override // ic.f0
    public void releasePooled(e0 e0Var) {
    }
}
