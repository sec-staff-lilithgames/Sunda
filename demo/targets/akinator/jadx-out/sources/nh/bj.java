package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bj extends dj {

    /* renamed from: g, reason: collision with root package name */
    public final ze f76143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dj f76144h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public bj(dj djVar, ze zeVar) {
        super(new cj(ze.all(), zeVar, djVar.f76192b));
        this.f76144h = djVar;
        this.f76143g = zeVar;
    }

    @Override // nh.dj, nh.k0, nh.af
    public void add(ze zeVar) {
        ze zeVar2 = this.f76143g;
        mh.p1.checkArgument(zeVar2.encloses(zeVar), "Cannot add range %s to subRangeSet(%s)", zeVar, zeVar2);
        this.f76144h.add(zeVar);
    }

    @Override // nh.dj, nh.k0, nh.af
    public void clear() {
        this.f76144h.remove(this.f76143g);
    }

    @Override // nh.dj, nh.k0, nh.af
    public boolean contains(Comparable<?> comparable) {
        return this.f76143g.contains(comparable) && this.f76144h.contains(comparable);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.dj, nh.k0, nh.af
    public boolean encloses(ze zeVar) {
        ze zeVar2 = this.f76143g;
        if (zeVar2.isEmpty() || !zeVar2.encloses(zeVar)) {
            return false;
        }
        mh.p1.checkNotNull(zeVar);
        Map.Entry entryFloorEntry = this.f76144h.f76192b.floorEntry(zeVar.f76827b);
        ze zeVar3 = (entryFloorEntry == null || !((ze) entryFloorEntry.getValue()).encloses(zeVar)) ? null : (ze) entryFloorEntry.getValue();
        return (zeVar3 == null || zeVar3.intersection(zeVar2).isEmpty()) ? false : true;
    }

    @Override // nh.dj, nh.k0, nh.af
    public ze rangeContaining(Comparable<?> comparable) {
        ze zeVarRangeContaining;
        ze zeVar = this.f76143g;
        if (zeVar.contains(comparable) && (zeVarRangeContaining = this.f76144h.rangeContaining(comparable)) != null) {
            return zeVarRangeContaining.intersection(zeVar);
        }
        return null;
    }

    @Override // nh.dj, nh.k0, nh.af
    public void remove(ze zeVar) {
        ze zeVar2 = this.f76143g;
        if (zeVar.isConnected(zeVar2)) {
            this.f76144h.remove(zeVar.intersection(zeVar2));
        }
    }

    @Override // nh.dj, nh.k0, nh.af
    public af subRangeSet(ze zeVar) {
        ze zeVar2 = this.f76143g;
        return zeVar.encloses(zeVar2) ? this : zeVar.isConnected(zeVar2) ? new bj(this, zeVar2.intersection(zeVar)) : j6.of();
    }
}
