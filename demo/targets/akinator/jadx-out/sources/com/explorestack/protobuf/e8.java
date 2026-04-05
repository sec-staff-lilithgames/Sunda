package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e8 extends AbstractList implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final f8 f22088b;

    public e8(f8 f8Var) {
        this.f22088b = f8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22088b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, ByteString byteString) {
        f8.e(this.f22088b, i10, byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i10) {
        return this.f22088b.getByteString(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString remove(int i10) {
        String strRemove = this.f22088b.remove(i10);
        ((AbstractList) this).modCount++;
        return f8.g(strRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString set(int i10, ByteString byteString) {
        f8 f8Var = f8.f22138e;
        f8 f8Var2 = this.f22088b;
        f8Var2.c();
        Object obj = f8Var2.f22139c.set(i10, byteString);
        ((AbstractList) this).modCount++;
        return f8.g(obj);
    }
}
