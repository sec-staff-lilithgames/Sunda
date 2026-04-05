package io.odeeo.internal.d;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import io.odeeo.internal.d.f;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements f {

    /* renamed from: b, reason: collision with root package name */
    public int f63522b;

    /* renamed from: c, reason: collision with root package name */
    public float f63523c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f63524d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public f.a f63525e;

    /* renamed from: f, reason: collision with root package name */
    public f.a f63526f;

    /* renamed from: g, reason: collision with root package name */
    public f.a f63527g;

    /* renamed from: h, reason: collision with root package name */
    public f.a f63528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63529i;

    /* renamed from: j, reason: collision with root package name */
    public v f63530j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f63531k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f63532l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f63533m;

    /* renamed from: n, reason: collision with root package name */
    public long f63534n;

    /* renamed from: o, reason: collision with root package name */
    public long f63535o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63536p;

    public w() {
        f.a aVar = f.a.f63351e;
        this.f63525e = aVar;
        this.f63526f = aVar;
        this.f63527g = aVar;
        this.f63528h = aVar;
        ByteBuffer byteBuffer = f.f63350a;
        this.f63531k = byteBuffer;
        this.f63532l = byteBuffer.asShortBuffer();
        this.f63533m = byteBuffer;
        this.f63522b = -1;
    }

    @Override // io.odeeo.internal.d.f
    public f.a configure(f.a aVar) throws f.b {
        if (aVar.f63354c != 2) {
            throw new f.b(aVar);
        }
        int i10 = this.f63522b;
        if (i10 == -1) {
            i10 = aVar.f63352a;
        }
        this.f63525e = aVar;
        f.a aVar2 = new f.a(i10, aVar.f63353b, 2);
        this.f63526f = aVar2;
        this.f63529i = true;
        return aVar2;
    }

    @Override // io.odeeo.internal.d.f
    public void flush() {
        if (isActive()) {
            f.a aVar = this.f63525e;
            this.f63527g = aVar;
            f.a aVar2 = this.f63526f;
            this.f63528h = aVar2;
            if (this.f63529i) {
                this.f63530j = new v(aVar.f63352a, aVar.f63353b, this.f63523c, this.f63524d, aVar2.f63352a);
            } else {
                v vVar = this.f63530j;
                if (vVar != null) {
                    vVar.flush();
                }
            }
        }
        this.f63533m = f.f63350a;
        this.f63534n = 0L;
        this.f63535o = 0L;
        this.f63536p = false;
    }

    public long getMediaDuration(long j10) {
        if (this.f63535o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.f63523c * j10);
        }
        long pendingInputBytes = this.f63534n - ((v) io.odeeo.internal.q0.a.checkNotNull(this.f63530j)).getPendingInputBytes();
        int i10 = this.f63528h.f63352a;
        int i11 = this.f63527g.f63352a;
        return i10 == i11 ? g0.scaleLargeTimestamp(j10, pendingInputBytes, this.f63535o) : g0.scaleLargeTimestamp(j10, pendingInputBytes * i10, this.f63535o * i11);
    }

    @Override // io.odeeo.internal.d.f
    public ByteBuffer getOutput() {
        int outputSize;
        v vVar = this.f63530j;
        if (vVar != null && (outputSize = vVar.getOutputSize()) > 0) {
            if (this.f63531k.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f63531k = byteBufferOrder;
                this.f63532l = byteBufferOrder.asShortBuffer();
            } else {
                this.f63531k.clear();
                this.f63532l.clear();
            }
            vVar.getOutput(this.f63532l);
            this.f63535o += outputSize;
            this.f63531k.limit(outputSize);
            this.f63533m = this.f63531k;
        }
        ByteBuffer byteBuffer = this.f63533m;
        this.f63533m = f.f63350a;
        return byteBuffer;
    }

    @Override // io.odeeo.internal.d.f
    public boolean isActive() {
        if (this.f63526f.f63352a != -1) {
            return Math.abs(this.f63523c - 1.0f) >= 1.0E-4f || Math.abs(this.f63524d - 1.0f) >= 1.0E-4f || this.f63526f.f63352a != this.f63525e.f63352a;
        }
        return false;
    }

    @Override // io.odeeo.internal.d.f
    public boolean isEnded() {
        if (!this.f63536p) {
            return false;
        }
        v vVar = this.f63530j;
        return vVar == null || vVar.getOutputSize() == 0;
    }

    @Override // io.odeeo.internal.d.f
    public void queueEndOfStream() {
        v vVar = this.f63530j;
        if (vVar != null) {
            vVar.queueEndOfStream();
        }
        this.f63536p = true;
    }

    @Override // io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            v vVar = (v) io.odeeo.internal.q0.a.checkNotNull(this.f63530j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f63534n += iRemaining;
            vVar.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // io.odeeo.internal.d.f
    public void reset() {
        this.f63523c = 1.0f;
        this.f63524d = 1.0f;
        f.a aVar = f.a.f63351e;
        this.f63525e = aVar;
        this.f63526f = aVar;
        this.f63527g = aVar;
        this.f63528h = aVar;
        ByteBuffer byteBuffer = f.f63350a;
        this.f63531k = byteBuffer;
        this.f63532l = byteBuffer.asShortBuffer();
        this.f63533m = byteBuffer;
        this.f63522b = -1;
        this.f63529i = false;
        this.f63530j = null;
        this.f63534n = 0L;
        this.f63535o = 0L;
        this.f63536p = false;
    }

    public void setOutputSampleRateHz(int i10) {
        this.f63522b = i10;
    }

    public void setPitch(float f10) {
        if (this.f63524d != f10) {
            this.f63524d = f10;
            this.f63529i = true;
        }
    }

    public void setSpeed(float f10) {
        if (this.f63523c != f10) {
            this.f63523c = f10;
            this.f63529i = true;
        }
    }
}
