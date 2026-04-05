package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class yi extends dj {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dj f76800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public yi(dj djVar) {
        super(new zi(djVar.f76192b, ze.all()));
        this.f76800g = djVar;
    }

    @Override // nh.dj, nh.k0, nh.af
    public void add(ze zeVar) {
        this.f76800g.remove(zeVar);
    }

    @Override // nh.dj, nh.k0, nh.af
    public af complement() {
        return this.f76800g;
    }

    @Override // nh.dj, nh.k0, nh.af
    public boolean contains(Comparable<?> comparable) {
        return !this.f76800g.contains(comparable);
    }

    @Override // nh.dj, nh.k0, nh.af
    public void remove(ze zeVar) {
        this.f76800g.add(zeVar);
    }
}
