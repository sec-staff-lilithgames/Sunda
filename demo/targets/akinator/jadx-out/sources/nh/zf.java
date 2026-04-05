package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class zf extends kg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f76829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f76830c;

    public zf(Set set, Set set2) {
        this.f76829b = set;
        this.f76830c = set2;
    }

    @Override // nh.kg
    public final int c() {
        return qh.f.saturatedAdd(kg.d(this.f76829b), kg.d(this.f76830c));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76830c.contains(obj) ^ this.f76829b.contains(obj);
    }

    @Override // nh.kg
    public final int e() {
        Set set = this.f76829b;
        int iF = kg.f(set);
        Set set2 = this.f76830c;
        int iD = iF - kg.d(set2);
        return iD >= 0 ? iD : Math.max(kg.f(set2) - kg.d(set), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f76829b.equals(this.f76830c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set set;
        Set set2 = this.f76829b;
        Iterator it = set2.iterator();
        int i10 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            set = this.f76830c;
            if (!zHasNext) {
                break;
            }
            if (!set.contains(it.next())) {
                i10++;
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (!set2.contains(it2.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // nh.kg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public ej iterator() {
        Set set = this.f76829b;
        Iterator it = set.iterator();
        Set set2 = this.f76830c;
        return new yf(it, set2, set2.iterator(), set);
    }
}
