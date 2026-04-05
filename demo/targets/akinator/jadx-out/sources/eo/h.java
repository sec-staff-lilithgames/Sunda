package eo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ao.k0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.x0;
import hp.j;
import hp.n;
import hp.o;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.a0;
import io.bidmachine.media3.exoplayer.i;
import io.bidmachine.media3.exoplayer.j0;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.u1;
import java.io.IOException;
import java.util.Objects;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends i implements Handler.Callback {
    public n A;
    public o B;
    public o C;
    public int D;
    public final Handler E;
    public final g F;
    public final r0 G;
    public boolean H;
    public boolean I;
    public io.bidmachine.media3.common.b J;
    public long K;
    public long L;
    public boolean M;
    public IOException N;

    /* renamed from: t, reason: collision with root package name */
    public final hp.a f54798t;

    /* renamed from: u, reason: collision with root package name */
    public final nn.g f54799u;

    /* renamed from: v, reason: collision with root package name */
    public a f54800v;

    /* renamed from: w, reason: collision with root package name */
    public final f f54801w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f54802x;

    /* renamed from: y, reason: collision with root package name */
    public int f54803y;

    /* renamed from: z, reason: collision with root package name */
    public j f54804z;

    public h(g gVar, Looper looper) {
        this(gVar, looper, f.f54797a);
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void d() {
        this.J = null;
        this.L = C.TIME_UNSET;
        n();
        this.K = C.TIME_UNSET;
        if (this.f54804z != null) {
            q();
            ((j) io.bidmachine.media3.common.util.a.checkNotNull(this.f54804z)).release();
            this.f54804z = null;
            this.f54803y = 0;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z10) {
        this.M = z10;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) {
        this.K = j10;
        a aVar = this.f54800v;
        if (aVar != null) {
            aVar.clear();
        }
        n();
        this.H = false;
        this.I = false;
        this.L = C.TIME_UNSET;
        io.bidmachine.media3.common.b bVar = this.J;
        if (bVar == null || Objects.equals(bVar.f60665o, "application/x-media3-cues")) {
            return;
        }
        if (this.f54803y == 0) {
            q();
            j jVar = (j) io.bidmachine.media3.common.util.a.checkNotNull(this.f54804z);
            jVar.flush();
            jVar.setOutputStartTimeUs(this.f61247n);
            return;
        }
        q();
        ((j) io.bidmachine.media3.common.util.a.checkNotNull(this.f54804z)).release();
        this.f54804z = null;
        this.f54803y = 0;
        this.f54802x = true;
        j jVarCreateDecoder = ((e) this.f54801w).createDecoder((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.J));
        this.f54804z = jVarCreateDecoder;
        jVarCreateDecoder.setOutputStartTimeUs(this.f61247n);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        in.d dVar = (in.d) message.obj;
        b5 b5Var = dVar.f59799a;
        j0 j0Var = (j0) this.F;
        j0Var.onCues(b5Var);
        j0Var.onCues(dVar);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return this.I;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        if (this.J != null) {
            if (this.N == null) {
                try {
                    maybeThrowStreamError();
                } catch (IOException e10) {
                    this.N = e10;
                }
            }
            if (this.N != null) {
                if (Objects.equals(((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.J)).f60665o, "application/x-media3-cues")) {
                    return ((a) io.bidmachine.media3.common.util.a.checkNotNull(this.f54800v)).getNextCueChangeTimeUs(this.K) != Long.MIN_VALUE;
                }
                if (!this.I) {
                    if (this.H) {
                        o oVar = this.B;
                        long j10 = this.K;
                        if (oVar == null || oVar.getEventTime(oVar.getEventTimeCount() - 1) <= j10) {
                            o oVar2 = this.C;
                            long j11 = this.K;
                            if ((oVar2 == null || oVar2.getEventTime(oVar2.getEventTimeCount() - 1) <= j11) && this.A != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void k(io.bidmachine.media3.common.b[] bVarArr, long j10, long j11, k0 k0Var) {
        io.bidmachine.media3.common.b bVar = bVarArr[0];
        this.J = bVar;
        if (Objects.equals(bVar.f60665o, "application/x-media3-cues")) {
            this.f54800v = this.J.K == 1 ? new c() : new d();
            return;
        }
        m();
        if (this.f54804z != null) {
            this.f54803y = 1;
            return;
        }
        this.f54802x = true;
        j jVarCreateDecoder = ((e) this.f54801w).createDecoder((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.J));
        this.f54804z = jVarCreateDecoder;
        jVarCreateDecoder.setOutputStartTimeUs(this.f61247n);
    }

    public final void m() {
        io.bidmachine.media3.common.util.a.checkState(this.M || Objects.equals(this.J.f60665o, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.J.f60665o, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.J.f60665o, MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.J.f60665o + " samples (expected application/x-media3-cues).");
    }

    public final void n() {
        in.d dVar = new in.d(b5.of(), p(this.K));
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
            return;
        }
        j0 j0Var = (j0) this.F;
        j0Var.onCues(dVar.f59799a);
        j0Var.onCues(dVar);
    }

    public final long o() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        io.bidmachine.media3.common.util.a.checkNotNull(this.B);
        if (this.D >= this.B.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.B.getEventTime(this.D);
    }

    public final long p(long j10) {
        io.bidmachine.media3.common.util.a.checkState(j10 != C.TIME_UNSET);
        return j10 - this.f61246m;
    }

    public final void q() {
        this.A = null;
        this.D = -1;
        o oVar = this.B;
        if (oVar != null) {
            oVar.release();
            this.B = null;
        }
        o oVar2 = this.C;
        if (oVar2 != null) {
            oVar2.release();
            this.C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(long r20, long r22) throws nn.f {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.h.render(long, long):void");
    }

    public void setFinalStreamEndPositionUs(long j10) {
        io.bidmachine.media3.common.util.a.checkState(isCurrentStreamFinal());
        this.L = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws a0 {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public int supportsFormat(io.bidmachine.media3.common.b bVar) {
        if (Objects.equals(bVar.f60665o, "application/x-media3-cues") || ((e) this.f54801w).supportsFormat(bVar)) {
            return u1.create(bVar.N == 0 ? 4 : 2);
        }
        return x0.isText(bVar.f60665o) ? u1.create(1) : u1.create(0);
    }

    public h(g gVar, Looper looper, f fVar) {
        super(3);
        this.F = (g) io.bidmachine.media3.common.util.a.checkNotNull(gVar);
        this.E = looper == null ? null : a1.createHandler(looper, this);
        this.f54801w = fVar;
        this.f54798t = new hp.a();
        this.f54799u = new nn.g(1);
        this.G = new r0();
        this.L = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.M = false;
    }
}
