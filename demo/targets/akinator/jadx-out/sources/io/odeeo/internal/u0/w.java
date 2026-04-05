package io.odeeo.internal.u0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w<E> extends u<E> {

    /* renamed from: h, reason: collision with root package name */
    public transient int[] f67131h;

    /* renamed from: i, reason: collision with root package name */
    public transient int[] f67132i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f67133j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f67134k;

    public w() {
    }

    public static <E> w<E> create() {
        return new w<>();
    }

    public static <E> w<E> createWithExpectedSize(int i10) {
        return new w<>(i10);
    }

    @Override // io.odeeo.internal.u0.u
    public void a(int i10, float f10) {
        super.a(i10, f10);
        int[] iArr = new int[i10];
        this.f67131h = iArr;
        this.f67132i = new int[i10];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f67132i, -1);
        this.f67133j = -2;
        this.f67134k = -2;
    }

    public final void b(int i10, int i11) {
        if (i10 == -2) {
            this.f67133j = i11;
        } else {
            this.f67132i[i10] = i11;
        }
        if (i11 == -2) {
            this.f67134k = i10;
        } else {
            this.f67131h[i11] = i10;
        }
    }

    @Override // io.odeeo.internal.u0.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        this.f67133j = -2;
        this.f67134k = -2;
        Arrays.fill(this.f67131h, -1);
        Arrays.fill(this.f67132i, -1);
    }

    @Override // io.odeeo.internal.u0.u
    public void e(int i10) {
        super.e(i10);
        int[] iArr = this.f67131h;
        int length = iArr.length;
        this.f67131h = Arrays.copyOf(iArr, i10);
        this.f67132i = Arrays.copyOf(this.f67132i, i10);
        if (length < i10) {
            Arrays.fill(this.f67131h, length, i10, -1);
            Arrays.fill(this.f67132i, length, i10, -1);
        }
    }

    @Override // io.odeeo.internal.u0.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return m2.a(this);
    }

    public w(int i10) {
        super(i10);
    }

    public static <E> w<E> create(Collection<? extends E> collection) {
        w<E> wVarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        wVarCreateWithExpectedSize.addAll(collection);
        return wVarCreateWithExpectedSize;
    }

    @Override // io.odeeo.internal.u0.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m2.a((Collection<?>) this, (Object[]) tArr);
    }

    public static <E> w<E> create(E... eArr) {
        w<E> wVarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(wVarCreateWithExpectedSize, eArr);
        return wVarCreateWithExpectedSize;
    }

    @Override // io.odeeo.internal.u0.u
    public void b(int i10) {
        int size = size() - 1;
        super.b(i10);
        b(this.f67131h[i10], this.f67132i[i10]);
        if (size != i10) {
            b(this.f67131h[size], i10);
            b(i10, this.f67132i[size]);
        }
        this.f67131h[size] = -1;
        this.f67132i[size] = -1;
    }

    @Override // io.odeeo.internal.u0.u
    public void a(int i10, E e10, int i11) {
        super.a(i10, (int) e10, i11);
        b(this.f67134k, i10);
        b(i10, -2);
    }

    @Override // io.odeeo.internal.u0.u
    public int a() {
        return this.f67133j;
    }

    @Override // io.odeeo.internal.u0.u
    public int a(int i10, int i11) {
        return i10 == size() ? i11 : i10;
    }

    @Override // io.odeeo.internal.u0.u
    public int a(int i10) {
        return this.f67132i[i10];
    }
}
