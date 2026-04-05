package nh;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a5 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final transient int f76085e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f76086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b5 f76087g;

    public a5(b5 b5Var, int i10, int i11) {
        this.f76087g = b5Var;
        this.f76085e = i10;
        this.f76086f = i11;
    }

    @Override // nh.u4
    public final Object[] c() {
        return this.f76087g.c();
    }

    @Override // nh.u4
    public final int d() {
        return this.f76087g.e() + this.f76085e + this.f76086f;
    }

    @Override // nh.u4
    public final int e() {
        return this.f76087g.e() + this.f76085e;
    }

    @Override // java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, this.f76086f);
        return this.f76087g.get(i10 + this.f76085e);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // nh.b5, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // nh.b5, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76086f;
    }

    @Override // nh.b5, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return super.listIterator(i10);
    }

    @Override // nh.b5, java.util.List
    public b5 subList(int i10, int i11) {
        mh.p1.checkPositionIndexes(i10, i11, this.f76086f);
        int i12 = this.f76085e;
        return this.f76087g.subList(i10 + i12, i11 + i12);
    }
}
