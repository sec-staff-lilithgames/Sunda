package nh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class zi extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final NavigableMap f76833b;

    /* renamed from: c, reason: collision with root package name */
    public final aj f76834c;

    /* renamed from: e, reason: collision with root package name */
    public final ze f76835e;

    public zi(NavigableMap navigableMap, ze zeVar) {
        this.f76833b = navigableMap;
        this.f76834c = new aj(navigableMap);
        this.f76835e = zeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // nh.mb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Iterator a() {
        /*
            r5 = this;
            nh.ze r0 = r5.f76835e
            boolean r1 = r0.hasLowerBound()
            nh.aj r2 = r5.f76834c
            if (r1 == 0) goto L24
            java.lang.Comparable r1 = r0.lowerEndpoint()
            nh.v2 r1 = (nh.v2) r1
            nh.r0 r3 = r0.lowerBoundType()
            nh.r0 r4 = nh.r0.f76592c
            if (r3 != r4) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            java.util.NavigableMap r1 = r2.tailMap(r1, r3)
            java.util.Collection r1 = r1.values()
            goto L28
        L24:
            java.util.Collection r1 = r2.values()
        L28:
            java.util.Iterator r1 = r1.iterator()
            nh.xe r1 = nh.z7.peekingIterator(r1)
            nh.t2 r2 = nh.t2.f76651c
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L4c
            r0 = r1
            nh.x7 r0 = (nh.x7) r0
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r0 = r0.peek()
            nh.ze r0 = (nh.ze) r0
            nh.v2 r0 = r0.f76827b
            if (r0 == r2) goto L4c
            goto L5d
        L4c:
            r0 = r1
            nh.x7 r0 = (nh.x7) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r0 = r0.next()
            nh.ze r0 = (nh.ze) r0
            nh.v2 r2 = r0.f76828c
        L5d:
            nh.tf r0 = new nh.tf
            r3 = 1
            r0.<init>(r5, r2, r1, r3)
            return r0
        L64:
            nh.s7 r0 = nh.s7.f76631f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.zi.a():java.util.Iterator");
    }

    @Override // nh.j0
    public final Iterator b() {
        v2 v2Var;
        ze zeVar = this.f76835e;
        boolean zHasUpperBound = zeVar.hasUpperBound();
        r2 r2Var = r2.f76594c;
        x7 x7Var = (x7) z7.peekingIterator(this.f76834c.headMap((aj) (zHasUpperBound ? (v2) zeVar.upperEndpoint() : r2Var), zeVar.hasUpperBound() && zeVar.upperBoundType() == r0.f76592c).descendingMap().values().iterator());
        boolean zHasNext = x7Var.hasNext();
        NavigableMap navigableMap = this.f76833b;
        if (zHasNext) {
            v2Var = ((ze) x7Var.peek()).f76828c == r2Var ? ((ze) x7Var.next()).f76827b : (v2) navigableMap.higherKey(((ze) x7Var.peek()).f76828c);
        } else {
            t2 t2Var = t2.f76651c;
            if (!zeVar.contains(t2Var) || navigableMap.containsKey(t2Var)) {
                return s7.f76631f;
            }
            v2Var = (v2) navigableMap.higherKey(t2Var);
        }
        return new tf(this, (v2) mh.g1.firstNonNull(v2Var, r2Var), x7Var, 2);
    }

    public final NavigableMap c(ze zeVar) {
        ze zeVar2 = this.f76835e;
        if (!zeVar2.isConnected(zeVar)) {
            return s6.of();
        }
        return new zi(this.f76833b, zeVar.intersection(zeVar2));
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
        if (obj instanceof v2) {
            try {
                v2 v2Var = (v2) obj;
                Map.Entry<v2, ze> entryFirstEntry = tailMap(v2Var, true).firstEntry();
                if (entryFirstEntry != null && entryFirstEntry.getKey().equals(v2Var)) {
                    return entryFirstEntry.getValue();
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
