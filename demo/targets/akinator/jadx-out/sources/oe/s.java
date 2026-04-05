package oe;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f79277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f79278b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79279c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f79280d;

    /* renamed from: e, reason: collision with root package name */
    public int f79281e;

    public s(int i10, int i11) {
        this.f79277a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f79280d = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i10, int i11) {
        if (this.f79278b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f79280d;
            int length = bArr2.length;
            int i13 = this.f79281e;
            if (length < i13 + i12) {
                this.f79280d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f79280d, this.f79281e, i12);
            this.f79281e += i12;
        }
    }

    public boolean endNalUnit(int i10) {
        if (!this.f79278b) {
            return false;
        }
        this.f79281e -= i10;
        this.f79278b = false;
        this.f79279c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f79279c;
    }

    public void reset() {
        this.f79278b = false;
        this.f79279c = false;
    }

    public void startNalUnit(int i10) {
        com.google.android.exoplayer2.util.a.checkState(!this.f79278b);
        boolean z10 = i10 == this.f79277a;
        this.f79278b = z10;
        if (z10) {
            this.f79281e = 3;
            this.f79279c = false;
        }
    }
}
