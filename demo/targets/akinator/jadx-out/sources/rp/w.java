package rp;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f84917a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84918b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f84919c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f84920d;

    /* renamed from: e, reason: collision with root package name */
    public int f84921e;

    public w(int i10, int i11) {
        this.f84917a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f84920d = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i10, int i11) {
        if (this.f84918b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f84920d;
            int length = bArr2.length;
            int i13 = this.f84921e;
            if (length < i13 + i12) {
                this.f84920d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f84920d, this.f84921e, i12);
            this.f84921e += i12;
        }
    }

    public boolean endNalUnit(int i10) {
        if (!this.f84918b) {
            return false;
        }
        this.f84921e -= i10;
        this.f84918b = false;
        this.f84919c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f84919c;
    }

    public void reset() {
        this.f84918b = false;
        this.f84919c = false;
    }

    public void startNalUnit(int i10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f84918b);
        boolean z10 = i10 == this.f84917a;
        this.f84918b = z10;
        if (z10) {
            this.f84921e = 3;
            this.f84919c = false;
        }
    }
}
