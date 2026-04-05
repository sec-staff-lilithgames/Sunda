package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements b {

    /* renamed from: b, reason: collision with root package name */
    public int f25951b;

    /* renamed from: c, reason: collision with root package name */
    public int f25952c;

    /* renamed from: d, reason: collision with root package name */
    public int f25953d = 0;

    /* renamed from: e, reason: collision with root package name */
    public a[] f25954e = new a[100];

    /* renamed from: a, reason: collision with root package name */
    public final a[] f25950a = new a[1];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f25951b;
        this.f25951b = i10;
        if (z10) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        try {
            int i10 = this.f25953d;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f25954e;
            if (length >= aVarArr2.length) {
                this.f25954e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f25849a;
                if (bArr != null && bArr.length != 65536) {
                    throw new IllegalArgumentException();
                }
                a[] aVarArr3 = this.f25954e;
                int i11 = this.f25953d;
                this.f25953d = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f25952c -= aVarArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        int i10 = this.f25951b;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
        int iMax = Math.max(0, ((i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f25952c);
        int i12 = this.f25953d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f25954e, iMax, i12, (Object) null);
        this.f25953d = iMax;
    }
}
