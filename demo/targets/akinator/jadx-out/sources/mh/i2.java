package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i2 extends y {

    /* renamed from: c, reason: collision with root package name */
    public final char[] f74635c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74636e;

    /* renamed from: f, reason: collision with root package name */
    public final long f74637f;

    public i2(char[] cArr, long j10, boolean z10, String str) {
        super(str);
        this.f74635c = cArr;
        this.f74637f = j10;
        this.f74636e = z10;
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        if (this.f74636e) {
            bitSet.set(0);
        }
        for (char c10 : this.f74635c) {
            if (c10 != 0) {
                bitSet.set(c10);
            }
        }
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        if (c10 == 0) {
            return this.f74636e;
        }
        if (((this.f74637f >> c10) & 1) != 1) {
            return false;
        }
        char[] cArr = this.f74635c;
        int length = cArr.length - 1;
        int iRotateLeft = (Integer.rotateLeft(11601 * c10, 15) * 461845907) & length;
        int i10 = iRotateLeft;
        do {
            char c11 = cArr[i10];
            if (c11 == 0) {
                return false;
            }
            if (c11 == c10) {
                return true;
            }
            i10 = (i10 + 1) & length;
        } while (i10 != iRotateLeft);
        return false;
    }
}
