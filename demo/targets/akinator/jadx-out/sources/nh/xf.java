package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xf extends kg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f76771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f76772c;

    public xf(Set set, Set set2) {
        this.f76771b = set;
        this.f76772c = set2;
    }

    @Override // nh.kg
    public final int c() {
        return kg.d(this.f76771b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76771b.contains(obj) && !this.f76772c.contains(obj);
    }

    @Override // nh.kg
    public final int e() {
        return Math.max(kg.f(this.f76771b) - kg.d(this.f76772c), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f76772c.containsAll(this.f76771b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Iterator it = this.f76771b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!this.f76772c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // nh.kg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public ej iterator() {
        return new vf(this.f76771b, this.f76772c, 1);
    }
}
