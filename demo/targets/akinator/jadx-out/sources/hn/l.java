package hn;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import io.bidmachine.media3.common.util.a1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    public int f59073b;

    /* renamed from: c, reason: collision with root package name */
    public float f59074c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f59075d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public f f59076e;

    /* renamed from: f, reason: collision with root package name */
    public f f59077f;

    /* renamed from: g, reason: collision with root package name */
    public f f59078g;

    /* renamed from: h, reason: collision with root package name */
    public f f59079h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f59080i;

    /* renamed from: j, reason: collision with root package name */
    public k f59081j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f59082k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f59083l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f59084m;

    /* renamed from: n, reason: collision with root package name */
    public long f59085n;

    /* renamed from: o, reason: collision with root package name */
    public long f59086o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f59087p;

    public l() {
        f fVar = f.f59037e;
        this.f59076e = fVar;
        this.f59077f = fVar;
        this.f59078g = fVar;
        this.f59079h = fVar;
        ByteBuffer byteBuffer = h.f59042a;
        this.f59082k = byteBuffer;
        this.f59083l = byteBuffer.asShortBuffer();
        this.f59084m = byteBuffer;
        this.f59073b = -1;
    }

    @Override // hn.h
    public f configure(f fVar) throws g {
        if (fVar.f59040c != 2) {
            throw new g(fVar);
        }
        int i10 = this.f59073b;
        if (i10 == -1) {
            i10 = fVar.f59038a;
        }
        this.f59076e = fVar;
        f fVar2 = new f(i10, fVar.f59039b, 2);
        this.f59077f = fVar2;
        this.f59080i = true;
        return fVar2;
    }

    @Override // hn.h
    public void flush() {
        if (isActive()) {
            f fVar = this.f59076e;
            this.f59078g = fVar;
            f fVar2 = this.f59077f;
            this.f59079h = fVar2;
            if (this.f59080i) {
                this.f59081j = new k(fVar.f59038a, fVar.f59039b, this.f59074c, this.f59075d, fVar2.f59038a);
            } else {
                k kVar = this.f59081j;
                if (kVar != null) {
                    kVar.flush();
                }
            }
        }
        this.f59084m = h.f59042a;
        this.f59085n = 0L;
        this.f59086o = 0L;
        this.f59087p = false;
    }

    @Override // hn.h
    public long getDurationAfterProcessorApplied(long j10) {
        return getPlayoutDuration(j10);
    }

    public long getMediaDuration(long j10) {
        if (this.f59086o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.f59074c * j10);
        }
        long pendingInputBytes = this.f59085n - ((k) io.bidmachine.media3.common.util.a.checkNotNull(this.f59081j)).getPendingInputBytes();
        int i10 = this.f59079h.f59038a;
        int i11 = this.f59078g.f59038a;
        return i10 == i11 ? a1.scaleLargeTimestamp(j10, pendingInputBytes, this.f59086o) : a1.scaleLargeTimestamp(j10, pendingInputBytes * i10, this.f59086o * i11);
    }

    @Override // hn.h
    public ByteBuffer getOutput() {
        int outputSize;
        k kVar = this.f59081j;
        if (kVar != null && (outputSize = kVar.getOutputSize()) > 0) {
            if (this.f59082k.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f59082k = byteBufferOrder;
                this.f59083l = byteBufferOrder.asShortBuffer();
            } else {
                this.f59082k.clear();
                this.f59083l.clear();
            }
            kVar.getOutput(this.f59083l);
            this.f59086o += outputSize;
            this.f59082k.limit(outputSize);
            this.f59084m = this.f59082k;
        }
        ByteBuffer byteBuffer = this.f59084m;
        this.f59084m = h.f59042a;
        return byteBuffer;
    }

    public long getPlayoutDuration(long j10) {
        if (this.f59086o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j10 / this.f59074c);
        }
        long pendingInputBytes = this.f59085n - ((k) io.bidmachine.media3.common.util.a.checkNotNull(this.f59081j)).getPendingInputBytes();
        int i10 = this.f59079h.f59038a;
        int i11 = this.f59078g.f59038a;
        return i10 == i11 ? a1.scaleLargeTimestamp(j10, this.f59086o, pendingInputBytes) : a1.scaleLargeTimestamp(j10, this.f59086o * i11, pendingInputBytes * i10);
    }

    public long getProcessedInputBytes() {
        return this.f59085n - ((k) io.bidmachine.media3.common.util.a.checkNotNull(this.f59081j)).getPendingInputBytes();
    }

    @Override // hn.h
    public boolean isActive() {
        if (this.f59077f.f59038a != -1) {
            return Math.abs(this.f59074c - 1.0f) >= 1.0E-4f || Math.abs(this.f59075d - 1.0f) >= 1.0E-4f || this.f59077f.f59038a != this.f59076e.f59038a;
        }
        return false;
    }

    @Override // hn.h
    public boolean isEnded() {
        if (!this.f59087p) {
            return false;
        }
        k kVar = this.f59081j;
        return kVar == null || kVar.getOutputSize() == 0;
    }

    @Override // hn.h
    public void queueEndOfStream() {
        k kVar = this.f59081j;
        if (kVar != null) {
            kVar.queueEndOfStream();
        }
        this.f59087p = true;
    }

    @Override // hn.h
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            k kVar = (k) io.bidmachine.media3.common.util.a.checkNotNull(this.f59081j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f59085n += iRemaining;
            kVar.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // hn.h
    public void reset() {
        this.f59074c = 1.0f;
        this.f59075d = 1.0f;
        f fVar = f.f59037e;
        this.f59076e = fVar;
        this.f59077f = fVar;
        this.f59078g = fVar;
        this.f59079h = fVar;
        ByteBuffer byteBuffer = h.f59042a;
        this.f59082k = byteBuffer;
        this.f59083l = byteBuffer.asShortBuffer();
        this.f59084m = byteBuffer;
        this.f59073b = -1;
        this.f59080i = false;
        this.f59081j = null;
        this.f59085n = 0L;
        this.f59086o = 0L;
        this.f59087p = false;
    }

    public void setOutputSampleRateHz(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 == -1 || i10 > 0);
        this.f59073b = i10;
    }

    public void setPitch(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f);
        if (this.f59075d != f10) {
            this.f59075d = f10;
            this.f59080i = true;
        }
    }

    public void setSpeed(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f);
        if (this.f59074c != f10) {
            this.f59074c = f10;
            this.f59080i = true;
        }
    }
}
