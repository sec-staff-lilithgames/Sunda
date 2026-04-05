package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class uf extends kg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f76695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f76696c;

    public uf(Set set, Set set2) {
        this.f76695b = set;
        this.f76696c = set2;
    }

    @Override // nh.kg
    public final int c() {
        return qh.f.saturatedAdd(kg.d(this.f76695b), kg.d(this.f76696c));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76695b.contains(obj) || this.f76696c.contains(obj);
    }

    @Override // nh.kg
    public <S extends Set<Object>> S copyInto(S s10) {
        s10.addAll(this.f76695b);
        s10.addAll(this.f76696c);
        return s10;
    }

    @Override // nh.kg
    public final int e() {
        return Math.max(kg.f(this.f76695b), kg.f(this.f76696c));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f76695b.isEmpty() && this.f76696c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set set = this.f76695b;
        int size = set.size();
        Iterator it = this.f76696c.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                size++;
            }
        }
        return size;
    }

    @Override // nh.kg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public ej iterator() {
        return new tf(this.f76695b, this.f76696c);
    }
}
