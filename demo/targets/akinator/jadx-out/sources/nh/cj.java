package nh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cj extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final ze f76161b;

    /* renamed from: c, reason: collision with root package name */
    public final ze f76162c;

    /* renamed from: e, reason: collision with root package name */
    public final NavigableMap f76163e;

    /* renamed from: f, reason: collision with root package name */
    public final aj f76164f;

    public cj(ze zeVar, ze zeVar2, NavigableMap navigableMap) {
        this.f76161b = (ze) mh.p1.checkNotNull(zeVar);
        this.f76162c = (ze) mh.p1.checkNotNull(zeVar2);
        this.f76163e = (NavigableMap) mh.p1.checkNotNull(navigableMap);
        this.f76164f = new aj(navigableMap);
    }

    @Override // nh.mb
    public final Iterator a() {
        Iterator it;
        ze zeVar = this.f76162c;
        boolean zIsEmpty = zeVar.isEmpty();
        v2 v2Var = zeVar.f76827b;
        if (zIsEmpty) {
            return s7.f76631f;
        }
        ze zeVar2 = this.f76161b;
        v2 v2Var2 = zeVar2.f76828c;
        v2 v2Var3 = zeVar2.f76827b;
        if (v2Var2.g(v2Var)) {
            return s7.f76631f;
        }
        if (v2Var3.g(v2Var)) {
            it = this.f76164f.tailMap((aj) v2Var, false).values().iterator();
        } else {
            it = this.f76163e.tailMap((v2) v2Var3.e(), zeVar2.lowerBoundType() == r0.f76592c).values().iterator();
        }
        return new tf(this, it, (v2) we.natural().min(zeVar2.f76828c, v2.a(zeVar.f76828c)));
    }

    @Override // nh.j0
    public final Iterator b() {
        ze zeVar = this.f76162c;
        if (zeVar.isEmpty()) {
            return s7.f76631f;
        }
        v2 v2Var = (v2) we.natural().min(this.f76161b.f76828c, v2.a(zeVar.f76828c));
        return new u1(this, this.f76163e.headMap((v2) v2Var.e(), v2Var.j() == r0.f76592c).descendingMap().values().iterator(), 5);
    }

    public final NavigableMap c(ze zeVar) {
        ze zeVar2 = this.f76161b;
        return !zeVar.isConnected(zeVar2) ? s6.of() : new cj(zeVar2.intersection(zeVar), this.f76162c, this.f76163e);
    }

    @Override // java.util.SortedMap
    public Comparator<? super v2> comparator() {
        return we.natural();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public int size() {
        return z7.size(a());
    }

    @Override // nh.j0, java.util.AbstractMap, java.util.Map
    public ze get(Object obj) {
        ze zeVar = this.f76162c;
        if (obj instanceof v2) {
            try {
                v2 v2Var = (v2) obj;
                if (this.f76161b.contains(v2Var) && v2Var.compareTo(zeVar.f76827b) >= 0 && v2Var.compareTo(zeVar.f76828c) < 0) {
                    boolean zEquals = v2Var.equals(zeVar.f76827b);
                    NavigableMap navigableMap = this.f76163e;
                    if (zEquals) {
                        Map.Entry entryFloorEntry = navigableMap.floorEntry(v2Var);
                        ze zeVar2 = (ze) (entryFloorEntry == null ? null : entryFloorEntry.getValue());
                        if (zeVar2 != null && zeVar2.f76828c.compareTo(zeVar.f76827b) > 0) {
                            return zeVar2.intersection(zeVar);
                        }
                    } else {
                        ze zeVar3 = (ze) navigableMap.get(v2Var);
                        if (zeVar3 != null) {
                            return zeVar3.intersection(zeVar);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> headMap(v2 v2Var, boolean z10) {
        return c(ze.upTo(v2Var, r0.a(z10)));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> subMap(v2 v2Var, boolean z10, v2 v2Var2, boolean z11) {
        return c(ze.range(v2Var, r0.a(z10), v2Var2, r0.a(z11)));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<v2, ze> tailMap(v2 v2Var, boolean z10) {
        return c(ze.downTo(v2Var, r0.a(z10)));
    }
}
