package ao;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7831b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f7832c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7833e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7834f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f7835g = new AtomicReference();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public int f7836b = 0;

        public a() {
        }

        @Override // ao.o1
        public boolean isReady() {
            return v.this.f7834f.get();
        }

        @Override // ao.o1
        public void maybeThrowError() throws IOException {
            Throwable th2 = (Throwable) v.this.f7835g.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // ao.o1
        public int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10) {
            int i11 = this.f7836b;
            if (i11 == 2) {
                gVar.addFlag(4);
                return -4;
            }
            int i12 = i10 & 2;
            v vVar = v.this;
            if (i12 != 0 || i11 == 0) {
                r0Var.f61543b = vVar.f7832c.get(0).getFormat(0);
                this.f7836b = 1;
                return -5;
            }
            AtomicBoolean atomicBoolean = vVar.f7834f;
            byte[] bArr = vVar.f7833e;
            if (!atomicBoolean.get()) {
                return -3;
            }
            int length = bArr.length;
            gVar.addFlag(1);
            gVar.f77082h = 0L;
            if ((i10 & 4) == 0) {
                gVar.ensureSpaceForWrite(length);
                gVar.f77080f.put(bArr, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f7836b = 2;
            }
            return -4;
        }

        @Override // ao.o1
        public int skipData(long j10) {
            return 0;
        }
    }

    public v(Uri uri, String str, u uVar) {
        this.f7831b = uri;
        this.f7832c = new b2(new gn.v1(new gn.w().setSampleMimeType(str).build()));
        this.f7833e = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // ao.i0, ao.q1
    public boolean continueLoading(io.bidmachine.media3.exoplayer.w0 w0Var) {
        return !this.f7834f.get();
    }

    @Override // ao.i0, ao.q1
    public long getBufferedPositionUs() {
        return this.f7834f.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ao.i0, ao.q1
    public long getNextLoadPositionUs() {
        return this.f7834f.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ao.i0
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // ao.i0
    public b2 getTrackGroups() {
        return this.f7832c;
    }

    @Override // ao.i0, ao.q1
    public boolean isLoading() {
        return !this.f7834f.get();
    }

    @Override // ao.i0
    public void prepare(h0 h0Var, long j10) {
        h0Var.onPrepared(this);
        new t(this.f7831b);
        throw null;
    }

    @Override // ao.i0
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // ao.i0
    public long selectTracks(fo.l[] lVarArr, boolean[] zArr, o1[] o1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            if (o1VarArr[i10] != null && (lVarArr[i10] == null || !zArr[i10])) {
                o1VarArr[i10] = null;
            }
            if (o1VarArr[i10] == null && lVarArr[i10] != null) {
                o1VarArr[i10] = new a();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // ao.i0
    public void maybeThrowPrepareError() {
    }

    public void releasePeriod() {
    }

    @Override // ao.i0, ao.q1
    public void reevaluateBuffer(long j10) {
    }

    @Override // ao.i0
    public long seekToUs(long j10) {
        return j10;
    }

    @Override // ao.i0
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // ao.i0
    public long getAdjustedSeekPositionUs(long j10, io.bidmachine.media3.exoplayer.y1 y1Var) {
        return j10;
    }
}
