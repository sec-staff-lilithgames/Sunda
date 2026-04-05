package io.odeeo.internal.p;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f65523a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f65524b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65525c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f65526d;

    /* renamed from: e, reason: collision with root package name */
    public int f65527e;

    public r(int i10, int i11) {
        this.f65523a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f65526d = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i10, int i11) {
        if (this.f65524b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f65526d;
            int length = bArr2.length;
            int i13 = this.f65527e + i12;
            if (length < i13) {
                this.f65526d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f65526d, this.f65527e, i12);
            this.f65527e += i12;
        }
    }

    public boolean endNalUnit(int i10) {
        if (!this.f65524b) {
            return false;
        }
        this.f65527e -= i10;
        this.f65524b = false;
        this.f65525c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f65525c;
    }

    public void reset() {
        this.f65524b = false;
        this.f65525c = false;
    }

    public void startNalUnit(int i10) {
        io.odeeo.internal.q0.a.checkState(!this.f65524b);
        boolean z10 = i10 == this.f65523a;
        this.f65524b = z10;
        if (z10) {
            this.f65527e = 3;
            this.f65525c = false;
        }
    }
}
