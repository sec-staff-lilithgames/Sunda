package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d8 extends AbstractList implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final f8 f22055b;

    public d8(f8 f8Var) {
        this.f22055b = f8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22055b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, byte[] bArr) {
        f8.d(this.f22055b, i10, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] get(int i10) {
        return this.f22055b.getByteArray(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] remove(int i10) {
        String strRemove = this.f22055b.remove(i10);
        ((AbstractList) this).modCount++;
        return f8.f(strRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] set(int i10, byte[] bArr) {
        f8 f8Var = f8.f22138e;
        f8 f8Var2 = this.f22055b;
        f8Var2.c();
        Object obj = f8Var2.f22139c.set(i10, bArr);
        ((AbstractList) this).modCount++;
        return f8.f(obj);
    }
}
