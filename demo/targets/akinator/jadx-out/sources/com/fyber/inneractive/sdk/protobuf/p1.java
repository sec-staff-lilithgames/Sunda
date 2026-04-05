package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 extends c implements q1, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26451b;

    static {
        new p1(10).f26354a = false;
    }

    public p1(int i10) {
        this.f26451b = new ArrayList(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final q1 a() {
        return this.f26354a ? new r3(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        c();
        this.f26451b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f26451b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i10) {
        if (i10 < this.f26451b.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f26451b);
        return new p1(arrayList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f26451b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object obj = this.f26451b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            String strF = sVar.f();
            if (sVar.c()) {
                this.f26451b.set(i10, strF);
            }
            return strF;
        }
        byte[] bArr = (byte[]) obj;
        String strA = l1.a(bArr);
        if (d4.f26366a.b(bArr, 0, bArr.length)) {
            this.f26451b.set(i10, strA);
        }
        return strA;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = this.f26451b.remove(i10);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof s ? ((s) objRemove).f() : l1.a((byte[]) objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        Object obj2 = this.f26451b.set(i10, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof s ? ((s) obj2).f() : l1.a((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26451b.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(s sVar) {
        c();
        this.f26451b.add(sVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof q1) {
            collection = ((q1) collection).b();
        }
        boolean zAddAll = this.f26451b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public p1(ArrayList arrayList) {
        this.f26451b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final Object a(int i10) {
        return this.f26451b.get(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final List b() {
        return Collections.unmodifiableList(this.f26451b);
    }
}
