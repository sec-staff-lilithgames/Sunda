package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f43603a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f43604b = new int[10];

    public void a() {
        this.f43603a = 0;
        Arrays.fill(this.f43604b, 0);
    }

    public int b() {
        if ((this.f43603a & 2) != 0) {
            return this.f43604b[1];
        }
        return -1;
    }

    public int c(int i10) {
        return (this.f43603a & 32) != 0 ? this.f43604b[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f43603a) != 0;
    }

    public int b(int i10) {
        return (this.f43603a & 16) != 0 ? this.f43604b[4] : i10;
    }

    public int c() {
        return (this.f43603a & 128) != 0 ? this.f43604b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public int d() {
        return Integer.bitCount(this.f43603a);
    }

    public m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f43604b;
            if (i10 < iArr.length) {
                this.f43603a = (1 << i10) | this.f43603a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public int a(int i10) {
        return this.f43604b[i10];
    }

    public void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
