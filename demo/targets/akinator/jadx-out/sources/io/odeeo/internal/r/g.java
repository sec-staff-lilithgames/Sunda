package io.odeeo.internal.r;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f66041a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f66042b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f66043c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f66044d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f66045e = 15;

    public final void a() {
        int[] iArr = this.f66044d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f66041a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f66044d, 0, iArr2, i11, i10);
        this.f66041a = 0;
        this.f66042b = this.f66043c - 1;
        this.f66044d = iArr2;
        this.f66045e = length - 1;
    }

    public void add(int i10) {
        if (this.f66043c == this.f66044d.length) {
            a();
        }
        int i11 = (this.f66042b + 1) & this.f66045e;
        this.f66042b = i11;
        this.f66044d[i11] = i10;
        this.f66043c++;
    }

    public int capacity() {
        return this.f66044d.length;
    }

    public void clear() {
        this.f66041a = 0;
        this.f66042b = -1;
        this.f66043c = 0;
    }

    public boolean isEmpty() {
        return this.f66043c == 0;
    }

    public int remove() {
        int i10 = this.f66043c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f66044d;
        int i11 = this.f66041a;
        int i12 = iArr[i11];
        this.f66041a = (i11 + 1) & this.f66045e;
        this.f66043c = i10 - 1;
        return i12;
    }

    public int size() {
        return this.f66043c;
    }
}
