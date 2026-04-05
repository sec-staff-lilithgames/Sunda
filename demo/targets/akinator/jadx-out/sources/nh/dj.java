package nh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class dj extends k0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractMap f76192b;

    /* renamed from: c, reason: collision with root package name */
    public transient xi f76193c;

    /* renamed from: e, reason: collision with root package name */
    public transient xi f76194e;

    /* renamed from: f, reason: collision with root package name */
    public transient yi f76195f;

    /* JADX WARN: Multi-variable type inference failed */
    public dj(NavigableMap navigableMap) {
        this.f76192b = (AbstractMap) navigableMap;
    }

    public static <C extends Comparable<?>> dj create() {
        return new dj(new TreeMap());
    }

    public final void a(ze zeVar) {
        boolean zIsEmpty = zeVar.isEmpty();
        v2 v2Var = zeVar.f76827b;
        AbstractMap abstractMap = this.f76192b;
        if (zIsEmpty) {
            abstractMap.remove(v2Var);
        } else {
            abstractMap.put(v2Var, zeVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public void add(ze zeVar) {
        mh.p1.checkNotNull(zeVar);
        if (zeVar.isEmpty()) {
            return;
        }
        v2 v2Var = zeVar.f76827b;
        v2 v2Var2 = zeVar.f76828c;
        ?? r12 = this.f76192b;
        Map.Entry entryLowerEntry = r12.lowerEntry(v2Var);
        if (entryLowerEntry != null) {
            ze zeVar2 = (ze) entryLowerEntry.getValue();
            v2 v2Var3 = zeVar2.f76828c;
            if (v2Var3.compareTo(v2Var) >= 0) {
                if (v2Var3.compareTo(v2Var2) >= 0) {
                    v2Var2 = v2Var3;
                }
                v2Var = zeVar2.f76827b;
            }
        }
        Map.Entry entryFloorEntry = r12.floorEntry(v2Var2);
        if (entryFloorEntry != null) {
            ze zeVar3 = (ze) entryFloorEntry.getValue();
            if (zeVar3.f76828c.compareTo(v2Var2) >= 0) {
                v2Var2 = zeVar3.f76828c;
            }
        }
        r12.subMap(v2Var, v2Var2).clear();
        a(new ze(v2Var, v2Var2));
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll((Iterable<ze>) iterable);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public Set<ze> asDescendingSetOfRanges() {
        xi xiVar = this.f76194e;
        if (xiVar != null) {
            return xiVar;
        }
        xi xiVar2 = new xi(this.f76192b.descendingMap().values());
        this.f76194e = xiVar2;
        return xiVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // nh.k0, nh.af
    public Set<ze> asRanges() {
        xi xiVar = this.f76193c;
        if (xiVar != null) {
            return xiVar;
        }
        xi xiVar2 = new xi(this.f76192b.values());
        this.f76193c = xiVar2;
        return xiVar2;
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // nh.k0, nh.af
    public af complement() {
        yi yiVar = this.f76195f;
        if (yiVar != null) {
            return yiVar;
        }
        yi yiVar2 = new yi(this);
        this.f76195f = yiVar2;
        return yiVar2;
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public boolean encloses(ze zeVar) {
        mh.p1.checkNotNull(zeVar);
        Map.Entry entryFloorEntry = this.f76192b.floorEntry(zeVar.f76827b);
        return entryFloorEntry != null && ((ze) entryFloorEntry.getValue()).encloses(zeVar);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll((Iterable<ze>) iterable);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public boolean intersects(ze zeVar) {
        mh.p1.checkNotNull(zeVar);
        v2 v2Var = zeVar.f76827b;
        ?? r12 = this.f76192b;
        Map.Entry entryCeilingEntry = r12.ceilingEntry(v2Var);
        if (entryCeilingEntry != null && ((ze) entryCeilingEntry.getValue()).isConnected(zeVar) && !((ze) entryCeilingEntry.getValue()).intersection(zeVar).isEmpty()) {
            return true;
        }
        Map.Entry entryLowerEntry = r12.lowerEntry(zeVar.f76827b);
        return (entryLowerEntry == null || !((ze) entryLowerEntry.getValue()).isConnected(zeVar) || ((ze) entryLowerEntry.getValue()).intersection(zeVar).isEmpty()) ? false : true;
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public ze rangeContaining(Comparable<?> comparable) {
        mh.p1.checkNotNull(comparable);
        Map.Entry entryFloorEntry = this.f76192b.floorEntry(v2.a(comparable));
        if (entryFloorEntry == null || !((ze) entryFloorEntry.getValue()).contains(comparable)) {
            return null;
        }
        return (ze) entryFloorEntry.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public void remove(ze zeVar) {
        mh.p1.checkNotNull(zeVar);
        boolean zIsEmpty = zeVar.isEmpty();
        v2 v2Var = zeVar.f76827b;
        v2 v2Var2 = zeVar.f76828c;
        if (zIsEmpty) {
            return;
        }
        ?? r02 = this.f76192b;
        Map.Entry entryLowerEntry = r02.lowerEntry(v2Var);
        if (entryLowerEntry != null) {
            ze zeVar2 = (ze) entryLowerEntry.getValue();
            v2 v2Var3 = zeVar2.f76828c;
            if (v2Var3.compareTo(v2Var) >= 0) {
                if (zeVar.hasUpperBound() && v2Var3.compareTo(v2Var2) >= 0) {
                    a(new ze(v2Var2, v2Var3));
                }
                a(new ze(zeVar2.f76827b, v2Var));
            }
        }
        Map.Entry entryFloorEntry = r02.floorEntry(v2Var2);
        if (entryFloorEntry != null) {
            ze zeVar3 = (ze) entryFloorEntry.getValue();
            if (zeVar.hasUpperBound() && zeVar3.f76828c.compareTo(v2Var2) >= 0) {
                a(new ze(v2Var2, zeVar3.f76828c));
            }
        }
        r02.subMap(v2Var, v2Var2).clear();
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll((Iterable<ze>) iterable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // nh.k0, nh.af
    public ze span() {
        ?? r02 = this.f76192b;
        Map.Entry entryFirstEntry = r02.firstEntry();
        Map.Entry entryLastEntry = r02.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return new ze(((ze) entryFirstEntry.getValue()).f76827b, ((ze) entryLastEntry.getValue()).f76828c);
    }

    @Override // nh.k0, nh.af
    public af subRangeSet(ze zeVar) {
        return zeVar.equals(ze.all()) ? this : new bj(this, zeVar);
    }

    public static <C extends Comparable<?>> dj create(af afVar) {
        dj djVarCreate = create();
        djVarCreate.addAll(afVar);
        return djVarCreate;
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void addAll(af afVar) {
        super.addAll(afVar);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ boolean enclosesAll(af afVar) {
        return super.enclosesAll(afVar);
    }

    @Override // nh.k0, nh.af
    public /* bridge */ /* synthetic */ void removeAll(af afVar) {
        super.removeAll(afVar);
    }

    public static <C extends Comparable<?>> dj create(Iterable<ze> iterable) {
        dj djVarCreate = create();
        djVarCreate.addAll(iterable);
        return djVarCreate;
    }
}
