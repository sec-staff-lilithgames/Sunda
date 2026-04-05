package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public abstract class v3 extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f6061i = 0;

    /* renamed from: b, reason: collision with root package name */
    public List f6062b;

    /* renamed from: c, reason: collision with root package name */
    public Map f6063c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6064e;

    /* renamed from: f, reason: collision with root package name */
    public volatile u3 f6065f;

    /* renamed from: g, reason: collision with root package name */
    public Map f6066g;

    /* renamed from: h, reason: collision with root package name */
    public volatile r3 f6067h;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f6062b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f6062b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.s3 r2 = (androidx.datastore.preferences.protobuf.s3) r2
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
            java.util.List r3 = r4.f6062b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.s3 r3 = (androidx.datastore.preferences.protobuf.s3) r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.v3.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f6064e) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap c() {
        b();
        if (this.f6063c.isEmpty() && !(this.f6063c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6063c = treeMap;
            this.f6066g = treeMap.descendingMap();
        }
        return (SortedMap) this.f6063c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f6062b.isEmpty()) {
            this.f6062b.clear();
        }
        if (this.f6063c.isEmpty()) {
            return;
        }
        this.f6063c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6063c.containsKey(comparable);
    }

    public final Object d(int i10) {
        b();
        Object value = ((s3) this.f6062b.remove(i10)).getValue();
        if (!this.f6063c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            List list = this.f6062b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new s3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.f6065f == null) {
            this.f6065f = new u3(this);
        }
        return this.f6065f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return super.equals(obj);
        }
        v3 v3Var = (v3) obj;
        int size = size();
        if (size != v3Var.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != v3Var.getNumArrayEntries()) {
            return entrySet().equals(v3Var.entrySet());
        }
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!getArrayEntryAt(i10).equals(v3Var.getArrayEntryAt(i10))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.f6063c.equals(v3Var.f6063c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((s3) this.f6062b.get(iA)).getValue() : this.f6063c.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i10) {
        return (Map.Entry) this.f6062b.get(i10);
    }

    public int getNumArrayEntries() {
        return this.f6062b.size();
    }

    public int getNumOverflowEntries() {
        return this.f6063c.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        return this.f6063c.isEmpty() ? Collections.EMPTY_SET : this.f6063c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            iHashCode += ((s3) this.f6062b.get(i10)).hashCode();
        }
        return getNumOverflowEntries() > 0 ? this.f6063c.hashCode() + iHashCode : iHashCode;
    }

    public boolean isImmutable() {
        return this.f6064e;
    }

    public void makeImmutable() {
        if (this.f6064e) {
            return;
        }
        this.f6063c = this.f6063c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6063c);
        this.f6066g = this.f6066g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6066g);
        this.f6064e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return d(iA);
        }
        if (this.f6063c.isEmpty()) {
            return null;
        }
        return this.f6063c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6063c.size() + this.f6062b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((s3) this.f6062b.get(iA)).setValue(obj);
        }
        b();
        if (this.f6062b.isEmpty() && !(this.f6062b instanceof ArrayList)) {
            this.f6062b = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return c().put(comparable, obj);
        }
        if (this.f6062b.size() == 16) {
            s3 s3Var = (s3) this.f6062b.remove(15);
            c().put(s3Var.getKey(), s3Var.getValue());
        }
        this.f6062b.add(i10, new s3(this, comparable, obj));
        return null;
    }
}
