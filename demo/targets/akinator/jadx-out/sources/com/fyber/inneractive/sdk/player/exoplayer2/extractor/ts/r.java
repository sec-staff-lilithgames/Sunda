package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f25491a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25492b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25493c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f25494d;

    /* renamed from: e, reason: collision with root package name */
    public int f25495e;

    public r(int i10) {
        this.f25491a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f25494d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f25492b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f25494d;
            int length = bArr2.length;
            int i13 = this.f25495e + i12;
            if (length < i13) {
                this.f25494d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f25494d, this.f25495e, i12);
            this.f25495e += i12;
        }
    }

    public final void b(int i10) {
        if (this.f25492b) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f25491a;
        this.f25492b = z10;
        if (z10) {
            this.f25495e = 3;
            this.f25493c = false;
        }
    }

    public final boolean a(int i10) {
        if (!this.f25492b) {
            return false;
        }
        this.f25495e -= i10;
        this.f25492b = false;
        this.f25493c = true;
        return true;
    }
}
