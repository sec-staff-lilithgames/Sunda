package pn;

import ao.o1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.r0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f81570b;

    /* renamed from: e, reason: collision with root package name */
    public long[] f81572e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81573f;

    /* renamed from: g, reason: collision with root package name */
    public qn.f f81574g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81575h;

    /* renamed from: i, reason: collision with root package name */
    public int f81576i;

    /* renamed from: c, reason: collision with root package name */
    public final vo.c f81571c = new vo.c();

    /* renamed from: j, reason: collision with root package name */
    public long f81577j = C.TIME_UNSET;

    public u(qn.f fVar, io.bidmachine.media3.common.b bVar, boolean z10) {
        this.f81570b = bVar;
        this.f81574g = fVar;
        this.f81572e = fVar.f83337b;
        updateEventStream(fVar, z10);
    }

    public String eventStreamId() {
        return this.f81574g.id();
    }

    @Override // ao.o1
    public boolean isReady() {
        return true;
    }

    @Override // ao.o1
    public int readData(r0 r0Var, nn.g gVar, int i10) throws IOException {
        int i11 = this.f81576i;
        boolean z10 = i11 == this.f81572e.length;
        if (z10 && !this.f81573f) {
            gVar.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f81575h) {
            r0Var.f61543b = this.f81570b;
            this.f81575h = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f81576i = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrEncode = this.f81571c.encode(this.f81574g.f83336a[i11]);
            gVar.ensureSpaceForWrite(bArrEncode.length);
            gVar.f77080f.put(bArrEncode);
        }
        gVar.f77082h = this.f81572e[i11];
        gVar.setFlags(1);
        return -4;
    }

    public void seekToUs(long j10) {
        int iBinarySearchCeil = a1.binarySearchCeil(this.f81572e, j10, true, false);
        this.f81576i = iBinarySearchCeil;
        if (!this.f81573f || iBinarySearchCeil != this.f81572e.length) {
            j10 = C.TIME_UNSET;
        }
        this.f81577j = j10;
    }

    @Override // ao.o1
    public int skipData(long j10) {
        int iMax = Math.max(this.f81576i, a1.binarySearchCeil(this.f81572e, j10, true, false));
        int i10 = iMax - this.f81576i;
        this.f81576i = iMax;
        return i10;
    }

    public void updateEventStream(qn.f fVar, boolean z10) {
        int i10 = this.f81576i;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f81572e[i10 - 1];
        this.f81573f = z10;
        this.f81574g = fVar;
        long[] jArr = fVar.f83337b;
        this.f81572e = jArr;
        long j11 = this.f81577j;
        if (j11 != C.TIME_UNSET) {
            seekToUs(j11);
        } else if (j10 != C.TIME_UNSET) {
            this.f81576i = a1.binarySearchCeil(jArr, j10, false, false);
        }
    }

    @Override // ao.o1
    public void maybeThrowError() throws IOException {
    }
}
