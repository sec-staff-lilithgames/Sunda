package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q2 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final q2 f26460d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f26461b;

    /* renamed from: c, reason: collision with root package name */
    public int f26462c;

    static {
        q2 q2Var = new q2(new Object[0], 0);
        f26460d = q2Var;
        q2Var.f26354a = false;
    }

    public q2(Object[] objArr, int i10) {
        this.f26461b = objArr;
        this.f26462c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f26462c;
        Object[] objArr = this.f26461b;
        if (i10 == objArr.length) {
            this.f26461b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f26461b;
        int i11 = this.f26462c;
        this.f26462c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i10) {
        if (i10 >= this.f26462c) {
            return new q2(Arrays.copyOf(this.f26461b, i10), this.f26462c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f26462c) {
            return this.f26461b[i10];
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f26462c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 < 0 || i10 >= (i11 = this.f26462c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26462c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        Object[] objArr = this.f26461b;
        Object obj = objArr[i10];
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f26462c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        if (i10 < 0 || i10 >= this.f26462c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26462c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        Object[] objArr = this.f26461b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26462c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f26462c)) {
            Object[] objArr = this.f26461b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f26461b, i10, objArr2, i10 + 1, this.f26462c - i10);
                this.f26461b = objArr2;
            }
            this.f26461b[i10] = obj;
            this.f26462c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f26462c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
