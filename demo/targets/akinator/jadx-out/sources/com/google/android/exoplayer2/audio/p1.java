package com.google.android.exoplayer2.audio;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p1 implements u {

    /* renamed from: b, reason: collision with root package name */
    public int f27255b;

    /* renamed from: c, reason: collision with root package name */
    public float f27256c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f27257d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public s f27258e;

    /* renamed from: f, reason: collision with root package name */
    public s f27259f;

    /* renamed from: g, reason: collision with root package name */
    public s f27260g;

    /* renamed from: h, reason: collision with root package name */
    public s f27261h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27262i;

    /* renamed from: j, reason: collision with root package name */
    public o1 f27263j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f27264k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f27265l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f27266m;

    /* renamed from: n, reason: collision with root package name */
    public long f27267n;

    /* renamed from: o, reason: collision with root package name */
    public long f27268o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27269p;

    public p1() {
        s sVar = s.f27278e;
        this.f27258e = sVar;
        this.f27259f = sVar;
        this.f27260g = sVar;
        this.f27261h = sVar;
        ByteBuffer byteBuffer = u.f27291a;
        this.f27264k = byteBuffer;
        this.f27265l = byteBuffer.asShortBuffer();
        this.f27266m = byteBuffer;
        this.f27255b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final s configure(s sVar) throws t {
        if (sVar.f27281c != 2) {
            throw new t(sVar);
        }
        int i10 = this.f27255b;
        if (i10 == -1) {
            i10 = sVar.f27279a;
        }
        this.f27258e = sVar;
        s sVar2 = new s(i10, sVar.f27280b, 2);
        this.f27259f = sVar2;
        this.f27262i = true;
        return sVar2;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void flush() {
        if (isActive()) {
            s sVar = this.f27258e;
            this.f27260g = sVar;
            s sVar2 = this.f27259f;
            this.f27261h = sVar2;
            if (this.f27262i) {
                this.f27263j = new o1(sVar.f27279a, sVar.f27280b, this.f27256c, this.f27257d, sVar2.f27279a);
            } else {
                o1 o1Var = this.f27263j;
                if (o1Var != null) {
                    o1Var.flush();
                }
            }
        }
        this.f27266m = u.f27291a;
        this.f27267n = 0L;
        this.f27268o = 0L;
        this.f27269p = false;
    }

    public final long getMediaDuration(long j10) {
        if (this.f27268o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.f27256c * j10);
        }
        long pendingInputBytes = this.f27267n - ((o1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27263j)).getPendingInputBytes();
        int i10 = this.f27261h.f27279a;
        int i11 = this.f27260g.f27279a;
        return i10 == i11 ? com.google.android.exoplayer2.util.n1.scaleLargeTimestamp(j10, pendingInputBytes, this.f27268o) : com.google.android.exoplayer2.util.n1.scaleLargeTimestamp(j10, pendingInputBytes * i10, this.f27268o * i11);
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final ByteBuffer getOutput() {
        int outputSize;
        o1 o1Var = this.f27263j;
        if (o1Var != null && (outputSize = o1Var.getOutputSize()) > 0) {
            if (this.f27264k.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f27264k = byteBufferOrder;
                this.f27265l = byteBufferOrder.asShortBuffer();
            } else {
                this.f27264k.clear();
                this.f27265l.clear();
            }
            o1Var.getOutput(this.f27265l);
            this.f27268o += outputSize;
            this.f27264k.limit(outputSize);
            this.f27266m = this.f27264k;
        }
        ByteBuffer byteBuffer = this.f27266m;
        this.f27266m = u.f27291a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final boolean isActive() {
        if (this.f27259f.f27279a != -1) {
            return Math.abs(this.f27256c - 1.0f) >= 1.0E-4f || Math.abs(this.f27257d - 1.0f) >= 1.0E-4f || this.f27259f.f27279a != this.f27258e.f27279a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final boolean isEnded() {
        if (!this.f27269p) {
            return false;
        }
        o1 o1Var = this.f27263j;
        return o1Var == null || o1Var.getOutputSize() == 0;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void queueEndOfStream() {
        o1 o1Var = this.f27263j;
        if (o1Var != null) {
            o1Var.queueEndOfStream();
        }
        this.f27269p = true;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o1 o1Var = (o1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27263j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f27267n += iRemaining;
            o1Var.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void reset() {
        this.f27256c = 1.0f;
        this.f27257d = 1.0f;
        s sVar = s.f27278e;
        this.f27258e = sVar;
        this.f27259f = sVar;
        this.f27260g = sVar;
        this.f27261h = sVar;
        ByteBuffer byteBuffer = u.f27291a;
        this.f27264k = byteBuffer;
        this.f27265l = byteBuffer.asShortBuffer();
        this.f27266m = byteBuffer;
        this.f27255b = -1;
        this.f27262i = false;
        this.f27263j = null;
        this.f27267n = 0L;
        this.f27268o = 0L;
        this.f27269p = false;
    }

    public final void setOutputSampleRateHz(int i10) {
        this.f27255b = i10;
    }

    public final void setPitch(float f10) {
        if (this.f27257d != f10) {
            this.f27257d = f10;
            this.f27262i = true;
        }
    }

    public final void setSpeed(float f10) {
        if (this.f27256c != f10) {
            this.f27256c = f10;
            this.f27262i = true;
        }
    }
}
