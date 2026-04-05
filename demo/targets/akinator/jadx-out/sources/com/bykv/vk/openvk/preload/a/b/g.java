package com.bykv.vk.openvk.preload.a.b;

import com.ironsource.C3191e4;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<Comparable> f16904d = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.g.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static /* synthetic */ boolean f16905i = true;

    /* renamed from: a, reason: collision with root package name */
    int f16906a;

    /* renamed from: b, reason: collision with root package name */
    int f16907b;

    /* renamed from: c, reason: collision with root package name */
    final d<K, V> f16908c;

    /* renamed from: e, reason: collision with root package name */
    private Comparator<? super K> f16909e;

    /* renamed from: f, reason: collision with root package name */
    private d<K, V> f16910f;

    /* renamed from: g, reason: collision with root package name */
    private g<K, V>.a f16911g;

    /* renamed from: h, reason: collision with root package name */
    private g<K, V>.b f16912h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c(this) { // from class: com.bykv.vk.openvk.preload.a.b.g.a.1
                {
                    g gVar = g.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> dVarA;
            if (!(obj instanceof Map.Entry) || (dVarA = g.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            g.this.a((d) dVarA, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g.this.f16906a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends AbstractSet<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new c(this) { // from class: com.bykv.vk.openvk.preload.a.b.g.b.1
                {
                    g gVar = g.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f16924f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return g.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g.this.f16906a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private d<K, V> f16915a;

        /* renamed from: b, reason: collision with root package name */
        private d<K, V> f16916b = null;

        /* renamed from: c, reason: collision with root package name */
        private int f16917c;

        public c() {
            this.f16915a = g.this.f16908c.f16922d;
            this.f16917c = g.this.f16907b;
        }

        public final d<K, V> a() {
            d<K, V> dVar = this.f16915a;
            g gVar = g.this;
            if (dVar == gVar.f16908c) {
                throw new NoSuchElementException();
            }
            if (gVar.f16907b != this.f16917c) {
                throw new ConcurrentModificationException();
            }
            this.f16915a = dVar.f16922d;
            this.f16916b = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16915a != g.this.f16908c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.f16916b;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            g.this.a((d) dVar, true);
            this.f16916b = null;
            this.f16917c = g.this.f16907b;
        }
    }

    public g() {
        this(f16904d);
    }

    private d<K, V> a(K k10, boolean z10) {
        int iCompareTo;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f16909e;
        d<K, V> dVar2 = this.f16910f;
        if (dVar2 != null) {
            Comparable comparable = comparator == f16904d ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(dVar2.f16924f) : comparator.compare(k10, dVar2.f16924f);
                if (iCompareTo != 0) {
                    d<K, V> dVar3 = iCompareTo < 0 ? dVar2.f16920b : dVar2.f16921c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        d<K, V> dVar4 = this.f16908c;
        if (dVar2 != null) {
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f16923e);
            if (iCompareTo < 0) {
                dVar2.f16920b = dVar;
            } else {
                dVar2.f16921c = dVar;
            }
            b(dVar2, true);
        } else {
            if (comparator == f16904d && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f16923e);
            this.f16910f = dVar;
        }
        this.f16906a++;
        this.f16907b++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a((g<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16910f = null;
        this.f16906a = 0;
        this.f16907b++;
        d<K, V> dVar = this.f16908c;
        dVar.f16923e = dVar;
        dVar.f16922d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.a aVar = this.f16911g;
        if (aVar != null) {
            return aVar;
        }
        g<K, V>.a aVar2 = new a();
        this.f16911g = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            return dVarB.f16925g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        g<K, V>.b bVar = this.f16912h;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f16912h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> dVarA = a((g<K, V>) k10, true);
        V v11 = dVarA.f16925g;
        dVarA.f16925g = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> dVarA = a(obj);
        if (dVarA != null) {
            return dVarA.f16925g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16906a;
    }

    private g(Comparator<? super K> comparator) {
        this.f16906a = 0;
        this.f16907b = 0;
        this.f16908c = new d<>();
        this.f16909e = comparator == null ? f16904d : comparator;
    }

    private void b(d<K, V> dVar, boolean z10) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f16920b;
            d<K, V> dVar3 = dVar.f16921c;
            int i10 = dVar2 != null ? dVar2.f16926h : 0;
            int i11 = dVar3 != null ? dVar3.f16926h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                d<K, V> dVar4 = dVar3.f16920b;
                d<K, V> dVar5 = dVar3.f16921c;
                int i13 = (dVar4 != null ? dVar4.f16926h : 0) - (dVar5 != null ? dVar5.f16926h : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    a((d) dVar);
                } else {
                    if (!f16905i && i13 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                d<K, V> dVar6 = dVar2.f16920b;
                d<K, V> dVar7 = dVar2.f16921c;
                int i14 = (dVar6 != null ? dVar6.f16926h : 0) - (dVar7 != null ? dVar7.f16926h : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    b((d) dVar);
                } else {
                    if (!f16905i && i14 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                dVar.f16926h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                if (!f16905i && i12 != -1 && i12 != 1) {
                    throw new AssertionError();
                }
                dVar.f16926h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            dVar = dVar.f16919a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        d<K, V> f16919a;

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f16920b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f16921c;

        /* renamed from: d, reason: collision with root package name */
        d<K, V> f16922d;

        /* renamed from: e, reason: collision with root package name */
        d<K, V> f16923e;

        /* renamed from: f, reason: collision with root package name */
        final K f16924f;

        /* renamed from: g, reason: collision with root package name */
        V f16925g;

        /* renamed from: h, reason: collision with root package name */
        int f16926h;

        public d() {
            this.f16924f = null;
            this.f16923e = this;
            this.f16922d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f16924f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f16925g;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16924f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16925g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f16924f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f16925g;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f16925g;
            this.f16925g = v10;
            return v11;
        }

        public final String toString() {
            return this.f16924f + C3191e4.i.f36525b + this.f16925g;
        }

        public d(d<K, V> dVar, K k10, d<K, V> dVar2, d<K, V> dVar3) {
            this.f16919a = dVar;
            this.f16924f = k10;
            this.f16926h = 1;
            this.f16922d = dVar2;
            this.f16923e = dVar3;
            dVar3.f16922d = this;
            dVar2.f16923e = this;
        }
    }

    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> dVarB = b(entry.getKey());
        if (dVarB == null) {
            return null;
        }
        V v10 = dVarB.f16925g;
        Object value = entry.getValue();
        if (v10 == value || (v10 != null && v10.equals(value))) {
            return dVarB;
        }
        return null;
    }

    public final void a(d<K, V> dVar, boolean z10) {
        int i10;
        if (z10) {
            d<K, V> dVar2 = dVar.f16923e;
            dVar2.f16922d = dVar.f16922d;
            dVar.f16922d.f16923e = dVar2;
        }
        d<K, V> dVar3 = dVar.f16920b;
        d<K, V> dVar4 = dVar.f16921c;
        d<K, V> dVar5 = dVar.f16919a;
        int i11 = 0;
        if (dVar3 != null && dVar4 != null) {
            if (dVar3.f16926h > dVar4.f16926h) {
                d<K, V> dVar6 = dVar3.f16921c;
                while (true) {
                    d<K, V> dVar7 = dVar6;
                    dVar4 = dVar3;
                    dVar3 = dVar7;
                    if (dVar3 == null) {
                        break;
                    } else {
                        dVar6 = dVar3.f16921c;
                    }
                }
            } else {
                while (true) {
                    d<K, V> dVar8 = dVar4.f16920b;
                    if (dVar8 == null) {
                        break;
                    } else {
                        dVar4 = dVar8;
                    }
                }
            }
            a((d) dVar4, false);
            d<K, V> dVar9 = dVar.f16920b;
            if (dVar9 != null) {
                i10 = dVar9.f16926h;
                dVar4.f16920b = dVar9;
                dVar9.f16919a = dVar4;
                dVar.f16920b = null;
            } else {
                i10 = 0;
            }
            d<K, V> dVar10 = dVar.f16921c;
            if (dVar10 != null) {
                i11 = dVar10.f16926h;
                dVar4.f16921c = dVar10;
                dVar10.f16919a = dVar4;
                dVar.f16921c = null;
            }
            dVar4.f16926h = Math.max(i10, i11) + 1;
            a(dVar, dVar4);
            return;
        }
        if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.f16920b = null;
        } else if (dVar4 != null) {
            a(dVar, dVar4);
            dVar.f16921c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar5, false);
        this.f16906a--;
        this.f16907b++;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f16920b;
        d<K, V> dVar3 = dVar.f16921c;
        d<K, V> dVar4 = dVar2.f16920b;
        d<K, V> dVar5 = dVar2.f16921c;
        dVar.f16920b = dVar5;
        if (dVar5 != null) {
            dVar5.f16919a = dVar;
        }
        a(dVar, dVar2);
        dVar2.f16921c = dVar;
        dVar.f16919a = dVar2;
        int iMax = Math.max(dVar3 != null ? dVar3.f16926h : 0, dVar5 != null ? dVar5.f16926h : 0) + 1;
        dVar.f16926h = iMax;
        dVar2.f16926h = Math.max(iMax, dVar4 != null ? dVar4.f16926h : 0) + 1;
    }

    public final d<K, V> a(Object obj) {
        d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            a((d) dVarB, true);
        }
        return dVarB;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f16919a;
        dVar.f16919a = null;
        if (dVar2 != null) {
            dVar2.f16919a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f16920b == dVar) {
                dVar3.f16920b = dVar2;
                return;
            } else {
                if (!f16905i && dVar3.f16921c != dVar) {
                    throw new AssertionError();
                }
                dVar3.f16921c = dVar2;
                return;
            }
        }
        this.f16910f = dVar2;
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f16920b;
        d<K, V> dVar3 = dVar.f16921c;
        d<K, V> dVar4 = dVar3.f16920b;
        d<K, V> dVar5 = dVar3.f16921c;
        dVar.f16921c = dVar4;
        if (dVar4 != null) {
            dVar4.f16919a = dVar;
        }
        a(dVar, dVar3);
        dVar3.f16920b = dVar;
        dVar.f16919a = dVar3;
        int iMax = Math.max(dVar2 != null ? dVar2.f16926h : 0, dVar4 != null ? dVar4.f16926h : 0) + 1;
        dVar.f16926h = iMax;
        dVar3.f16926h = Math.max(iMax, dVar5 != null ? dVar5.f16926h : 0) + 1;
    }
}
