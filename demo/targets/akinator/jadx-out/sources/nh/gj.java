package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gj extends je implements eh {

    /* renamed from: f, reason: collision with root package name */
    public transient gj f76305f;

    @Override // nh.j4, nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return (eh) this.f76399b;
    }

    @Override // nh.eh, nh.qg
    public Comparator<Object> comparator() {
        return ((gj) ((eh) this.f76399b)).comparator();
    }

    @Override // nh.je, nh.j4
    /* renamed from: d */
    public final ud delegate() {
        return (eh) this.f76399b;
    }

    @Override // nh.j4, nh.e4, nh.l4
    public final Object delegate() {
        return (eh) this.f76399b;
    }

    @Override // nh.eh
    public eh descendingMultiset() {
        gj gjVar = this.f76305f;
        if (gjVar != null) {
            return gjVar;
        }
        gj gjVar2 = new gj(((gj) ((eh) this.f76399b)).descendingMultiset());
        gjVar2.f76305f = this;
        this.f76305f = gjVar2;
        return gjVar2;
    }

    @Override // nh.je
    public final Set e() {
        return og.unmodifiableNavigableSet(((gj) ((eh) this.f76399b)).elementSet());
    }

    @Override // nh.eh
    public td firstEntry() {
        return ((gj) ((eh) this.f76399b)).firstEntry();
    }

    @Override // nh.eh
    public eh headMultiset(Object obj, r0 r0Var) {
        return le.unmodifiableSortedMultiset(((gj) ((eh) this.f76399b)).headMultiset(obj, r0Var));
    }

    @Override // nh.eh
    public td lastEntry() {
        return ((gj) ((eh) this.f76399b)).lastEntry();
    }

    @Override // nh.eh
    public td pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.eh
    public td pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.eh
    public eh subMultiset(Object obj, r0 r0Var, Object obj2, r0 r0Var2) {
        return le.unmodifiableSortedMultiset(((gj) ((eh) this.f76399b)).subMultiset(obj, r0Var, obj2, r0Var2));
    }

    @Override // nh.eh
    public eh tailMultiset(Object obj, r0 r0Var) {
        return le.unmodifiableSortedMultiset(((gj) ((eh) this.f76399b)).tailMultiset(obj, r0Var));
    }

    @Override // nh.je, nh.j4, nh.ud
    public NavigableSet<Object> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
