package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j2 extends h2 {

    /* renamed from: h, reason: collision with root package name */
    public transient int[] f76379h;

    /* renamed from: i, reason: collision with root package name */
    public transient int[] f76380i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f76381j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f76382k;

    public static <E> j2 create() {
        return new j2();
    }

    public static <E> j2 createWithExpectedSize(int i10) {
        return new j2(i10);
    }

    @Override // nh.h2
    public final int a(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // nh.h2
    public final int c() {
        int iC = super.c();
        this.f76379h = new int[iC];
        this.f76380i = new int[iC];
        return iC;
    }

    @Override // nh.h2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (n()) {
            return;
        }
        this.f76381j = -2;
        this.f76382k = -2;
        int[] iArr = this.f76379h;
        if (iArr != null && this.f76380i != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f76380i, 0, size(), 0);
        }
        super.clear();
    }

    @Override // nh.h2
    public final LinkedHashSet d() {
        LinkedHashSet linkedHashSetD = super.d();
        this.f76379h = null;
        this.f76380i = null;
        return linkedHashSetD;
    }

    @Override // nh.h2
    public final int f() {
        return this.f76381j;
    }

    @Override // nh.h2
    public final int g(int i10) {
        Objects.requireNonNull(this.f76380i);
        return r0[i10] - 1;
    }

    @Override // nh.h2
    public final void i(int i10) {
        super.i(i10);
        this.f76381j = -2;
        this.f76382k = -2;
    }

    @Override // nh.h2
    public final void j(int i10, int i11, int i12, Object obj) {
        super.j(i10, i11, i12, obj);
        s(this.f76382k, i10);
        s(i10, -2);
    }

    @Override // nh.h2
    public final void m(int i10, int i11) {
        int size = size() - 1;
        super.m(i10, i11);
        Objects.requireNonNull(this.f76379h);
        s(r4[i10] - 1, g(i10));
        if (i10 < size) {
            Objects.requireNonNull(this.f76379h);
            s(r4[size] - 1, i10);
            s(i10, g(size));
        }
        int[] iArr = this.f76379h;
        Objects.requireNonNull(iArr);
        iArr[size] = 0;
        int[] iArr2 = this.f76380i;
        Objects.requireNonNull(iArr2);
        iArr2[size] = 0;
    }

    @Override // nh.h2
    public final void q(int i10) {
        super.q(i10);
        int[] iArr = this.f76379h;
        Objects.requireNonNull(iArr);
        this.f76379h = Arrays.copyOf(iArr, i10);
        int[] iArr2 = this.f76380i;
        Objects.requireNonNull(iArr2);
        this.f76380i = Arrays.copyOf(iArr2, i10);
    }

    public final void s(int i10, int i11) {
        if (i10 == -2) {
            this.f76381j = i11;
        } else {
            int[] iArr = this.f76380i;
            Objects.requireNonNull(iArr);
            iArr[i10] = i11 + 1;
        }
        if (i11 == -2) {
            this.f76382k = i10;
            return;
        }
        int[] iArr2 = this.f76379h;
        Objects.requireNonNull(iArr2);
        iArr2[i11] = i10 + 1;
    }

    @Override // nh.h2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        pe.b(this, objArr);
        return objArr;
    }

    @Override // nh.h2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) pe.c(this, tArr);
    }

    public static <E> j2 create(Collection<? extends E> collection) {
        j2 j2VarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        j2VarCreateWithExpectedSize.addAll(collection);
        return j2VarCreateWithExpectedSize;
    }

    @SafeVarargs
    public static <E> j2 create(E... eArr) {
        j2 j2VarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(j2VarCreateWithExpectedSize, eArr);
        return j2VarCreateWithExpectedSize;
    }
}
