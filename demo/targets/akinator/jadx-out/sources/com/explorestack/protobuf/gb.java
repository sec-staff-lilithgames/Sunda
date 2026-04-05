package com.explorestack.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class gb extends AbstractMap {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f22166j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f22167b;

    /* renamed from: c, reason: collision with root package name */
    public List f22168c = Collections.EMPTY_LIST;

    /* renamed from: e, reason: collision with root package name */
    public Map f22169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22170f;

    /* renamed from: g, reason: collision with root package name */
    public volatile fb f22171g;

    /* renamed from: h, reason: collision with root package name */
    public Map f22172h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ab f22173i;

    public gb(int i10) {
        this.f22167b = i10;
        Map map = Collections.EMPTY_MAP;
        this.f22169e = map;
        this.f22172h = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f22168c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f22168c
            java.lang.Object r2 = r2.get(r1)
            com.explorestack.protobuf.db r2 = (com.explorestack.protobuf.db) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f22168c
            java.lang.Object r3 = r3.get(r2)
            com.explorestack.protobuf.db r3 = (com.explorestack.protobuf.db) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.gb.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f22170f) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap c() {
        b();
        if (this.f22169e.isEmpty() && !(this.f22169e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22169e = treeMap;
            this.f22172h = treeMap.descendingMap();
        }
        return (SortedMap) this.f22169e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f22168c.isEmpty()) {
            this.f22168c.clear();
        }
        if (this.f22169e.isEmpty()) {
            return;
        }
        this.f22169e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f22169e.containsKey(comparable);
    }

    public final Object d(int i10) {
        b();
        Object value = ((db) this.f22168c.remove(i10)).getValue();
        if (!this.f22169e.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            List list = this.f22168c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new db(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.f22171g == null) {
            this.f22171g = new fb(this);
        }
        return this.f22171g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return super.equals(obj);
        }
        gb gbVar = (gb) obj;
        int size = size();
        if (size != gbVar.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != gbVar.getNumArrayEntries()) {
            return entrySet().equals(gbVar.entrySet());
        }
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!getArrayEntryAt(i10).equals(gbVar.getArrayEntryAt(i10))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.f22169e.equals(gbVar.f22169e);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((db) this.f22168c.get(iA)).getValue() : this.f22169e.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i10) {
        return (Map.Entry) this.f22168c.get(i10);
    }

    public int getNumArrayEntries() {
        return this.f22168c.size();
    }

    public int getNumOverflowEntries() {
        return this.f22169e.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        return this.f22169e.isEmpty() ? tc.f22675c : this.f22169e.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            iHashCode += ((db) this.f22168c.get(i10)).hashCode();
        }
        return getNumOverflowEntries() > 0 ? this.f22169e.hashCode() + iHashCode : iHashCode;
    }

    public boolean isImmutable() {
        return this.f22170f;
    }

    public void makeImmutable() {
        if (this.f22170f) {
            return;
        }
        this.f22169e = this.f22169e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22169e);
        this.f22172h = this.f22172h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22172h);
        this.f22170f = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return d(iA);
        }
        if (this.f22169e.isEmpty()) {
            return null;
        }
        return this.f22169e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22169e.size() + this.f22168c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((db) this.f22168c.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f22168c.isEmpty();
        int i10 = this.f22167b;
        if (zIsEmpty && !(this.f22168c instanceof ArrayList)) {
            this.f22168c = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return c().put(comparable, obj);
        }
        if (this.f22168c.size() == i10) {
            db dbVar = (db) this.f22168c.remove(i10 - 1);
            c().put(dbVar.getKey(), dbVar.getValue());
        }
        this.f22168c.add(i11, new db(this, comparable, obj));
        return null;
    }
}
