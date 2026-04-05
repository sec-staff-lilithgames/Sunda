package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f24646g = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f24647a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24648b;

    /* renamed from: c, reason: collision with root package name */
    public long f24649c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f24650d = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: e, reason: collision with root package name */
    public int f24651e;

    /* renamed from: f, reason: collision with root package name */
    public int f24652f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, long j10, long j11) {
        this.f24647a = hVar;
        this.f24649c = j10;
        this.f24648b = j11;
    }

    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f24650d, this.f24651e - i11, bArr, i10, i11);
        return true;
    }

    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, EOFException {
        int iA;
        int i12 = this.f24652f;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f24650d, 0, bArr, i10, iMin);
            b(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f24649c += iA;
        }
        return iA != -1;
    }

    public final boolean a(int i10, boolean z10) throws InterruptedException, EOFException {
        int i11 = this.f24651e + i10;
        byte[] bArr = this.f24650d;
        if (i11 > bArr.length) {
            int length = bArr.length * 2;
            int i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE + i11;
            int i13 = z.f26070a;
            this.f24650d = Arrays.copyOf(this.f24650d, Math.max(i12, Math.min(length, i11 + 524288)));
        }
        int iMin = Math.min(this.f24652f - this.f24651e, i10);
        while (iMin < i10) {
            int i14 = i10;
            boolean z11 = z10;
            iMin = a(this.f24650d, this.f24651e, i14, iMin, z11);
            if (iMin == -1) {
                return false;
            }
            i10 = i14;
            z10 = z11;
        }
        int i15 = this.f24651e + i10;
        this.f24651e = i15;
        this.f24652f = Math.max(this.f24652f, i15);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f24652f - i10;
        this.f24652f = i11;
        this.f24651e = 0;
        byte[] bArr = this.f24650d;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f24650d = bArr2;
    }

    public final void a(int i10) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f24652f, i10);
        b(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(f24646g, -iA, Math.min(i10, iA + 4096), iA, false);
        }
        if (iA != -1) {
            this.f24649c += iA;
        }
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, EOFException {
        if (!Thread.interrupted()) {
            int i13 = this.f24647a.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                return i12 + i13;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
