package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class eg extends e4 implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final transient b5 f76230b;

    /* renamed from: c, reason: collision with root package name */
    public final transient u0 f76231c;

    public eg(b5 b5Var, u0 u0Var) {
        this.f76230b = b5Var;
        this.f76231c = u0Var;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76231c;
    }

    @Override // nh.e4, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = list.size();
        b5 b5Var = this.f76230b;
        if (size != b5Var.size()) {
            return false;
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!((l6) b5Var.get(i10)).contains(it.next())) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76231c;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof eg) {
            return this.f76230b.equals(((eg) obj).f76230b);
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size() && containsAll(set)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        b5 b5Var;
        int i10 = 1;
        int size = size() - 1;
        int i11 = 0;
        while (true) {
            b5Var = this.f76230b;
            if (i11 >= b5Var.size()) {
                break;
            }
            size = ~(~(size * 31));
            i11++;
        }
        ej it = b5Var.iterator();
        while (it.hasNext()) {
            Set set = (Set) it.next();
            i10 = ~(~((set.hashCode() * (size() / set.size())) + (i10 * 31)));
        }
        return ~(~(i10 + size));
    }
}
