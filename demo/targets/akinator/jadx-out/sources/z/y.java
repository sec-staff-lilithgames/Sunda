package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends uu.k1 {

    /* renamed from: b, reason: collision with root package name */
    public int f96990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f96991c;

    public y(x xVar) {
        this.f96991c = xVar;
    }

    public final int getIndex() {
        return this.f96990b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96990b < this.f96991c.size();
    }

    @Override // uu.k1
    public long nextLong() {
        int i10 = this.f96990b;
        this.f96990b = i10 + 1;
        return this.f96991c.keyAt(i10);
    }

    public final void setIndex(int i10) {
        this.f96990b = i10;
    }
}
