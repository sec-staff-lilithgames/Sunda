package s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends uu.g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final d f85146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85147c;

    /* renamed from: e, reason: collision with root package name */
    public final int f85148e;

    public c(d dVar, int i10, int i11) {
        this.f85146b = dVar;
        this.f85147c = i10;
        y0.d.checkRangeIndexes$runtime(i10, i11, dVar.size());
        this.f85148e = i11 - i10;
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        y0.d.checkElementIndex$runtime(i10, this.f85148e);
        return this.f85146b.get(this.f85147c + i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f85148e;
    }

    @Override // uu.g, java.util.List, s0.d
    public d subList(int i10, int i11) {
        y0.d.checkRangeIndexes$runtime(i10, i11, this.f85148e);
        int i12 = this.f85147c;
        return new c(this.f85146b, i10 + i12, i12 + i11);
    }
}
