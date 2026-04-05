package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class wf extends kg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f76744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f76745c;

    public wf(Set set, Set set2) {
        this.f76744b = set;
        this.f76745c = set2;
    }

    @Override // nh.kg
    public final int c() {
        return Math.min(kg.d(this.f76744b), kg.d(this.f76745c));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76744b.contains(obj) && this.f76745c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return this.f76744b.containsAll(collection) && this.f76745c.containsAll(collection);
    }

    @Override // nh.kg
    public final int e() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return Collections.disjoint(this.f76745c, this.f76744b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Iterator it = this.f76744b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f76745c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // nh.kg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public ej iterator() {
        return new vf(this.f76744b, this.f76745c, 0);
    }
}
