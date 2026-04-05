package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26038a;

    /* renamed from: b, reason: collision with root package name */
    public int f26039b;

    /* renamed from: c, reason: collision with root package name */
    public int f26040c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26041d;

    public m(byte[] bArr) {
        int length = bArr.length;
        this.f26038a = bArr;
        this.f26041d = length;
    }

    public final int a(int i10) {
        int i11;
        this.f26040c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f26040c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f26040c = i13;
            byte[] bArr = this.f26038a;
            int i14 = this.f26039b;
            this.f26039b = i14 + 1;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.f26038a;
        int i15 = this.f26039b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f26040c = 0;
            this.f26039b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f26039b = i11;
        this.f26040c = i10 - (i11 * 8);
        a();
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f26039b + i11;
        this.f26039b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f26040c;
        this.f26040c = i13;
        if (i13 > 7) {
            this.f26039b = i12 + 1;
            this.f26040c = i13 - 8;
        }
        a();
    }

    public final boolean b() {
        byte[] bArr = this.f26038a;
        int i10 = this.f26039b;
        byte b10 = bArr[i10];
        int i11 = this.f26040c;
        boolean z10 = (b10 & (128 >> i11)) != 0;
        int i12 = i11 + 1;
        this.f26040c = i12;
        if (i12 == 8) {
            this.f26040c = 0;
            this.f26039b = i10 + 1;
        }
        a();
        return z10;
    }

    public final void a() {
        int i10 = this.f26039b;
        if (i10 >= 0) {
            int i11 = this.f26041d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f26040c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
