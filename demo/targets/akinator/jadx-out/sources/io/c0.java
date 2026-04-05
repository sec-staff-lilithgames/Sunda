package io;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.k2;
import io.bidmachine.media3.common.util.t0;
import io.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f62078a;

    /* renamed from: b, reason: collision with root package name */
    public final w f62079b;

    /* renamed from: k, reason: collision with root package name */
    public long f62088k;

    /* renamed from: c, reason: collision with root package name */
    public final w.a f62080c = new w.a();

    /* renamed from: d, reason: collision with root package name */
    public final t0 f62081d = new t0();

    /* renamed from: e, reason: collision with root package name */
    public final t0 f62082e = new t0();

    /* renamed from: f, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.d0 f62083f = new io.bidmachine.media3.common.util.d0();

    /* renamed from: g, reason: collision with root package name */
    public long f62084g = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public k2 f62087j = k2.f57977d;

    /* renamed from: h, reason: collision with root package name */
    public long f62085h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f62086i = C.TIME_UNSET;

    public c0(b0 b0Var, w wVar) {
        this.f62078a = b0Var;
        this.f62079b = wVar;
    }

    public void flush() {
        this.f62083f.clear();
        this.f62084g = C.TIME_UNSET;
        this.f62085h = C.TIME_UNSET;
        this.f62086i = C.TIME_UNSET;
        t0 t0Var = this.f62082e;
        if (t0Var.size() > 0) {
            io.bidmachine.media3.common.util.a.checkArgument(t0Var.size() > 0);
            while (t0Var.size() > 1) {
                t0Var.pollFirst();
            }
            Long l9 = (Long) io.bidmachine.media3.common.util.a.checkNotNull(t0Var.pollFirst());
            l9.getClass();
            t0Var.add(0L, l9);
        }
        t0 t0Var2 = this.f62081d;
        if (t0Var2.size() > 0) {
            io.bidmachine.media3.common.util.a.checkArgument(t0Var2.size() > 0);
            while (t0Var2.size() > 1) {
                t0Var2.pollFirst();
            }
            t0Var2.add(0L, (k2) io.bidmachine.media3.common.util.a.checkNotNull(t0Var2.pollFirst()));
        }
    }

    public boolean isEnded() {
        long j10 = this.f62086i;
        return j10 != C.TIME_UNSET && this.f62085h == j10;
    }

    public void onFrameAvailableForRendering(long j10) {
        this.f62083f.add(j10);
        this.f62084g = j10;
        this.f62086i = C.TIME_UNSET;
    }

    public void onStreamStartPositionChanged(long j10) {
        long j11 = this.f62084g;
        this.f62082e.add(j11 == C.TIME_UNSET ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public void onVideoSizeChanged(int i10, int i11) {
        long j10 = this.f62084g;
        this.f62081d.add(j10 == C.TIME_UNSET ? 0L : j10 + 1, new k2(i10, i11));
    }

    public void render(long j10, long j11) throws io.bidmachine.media3.exoplayer.a0 {
        while (true) {
            io.bidmachine.media3.common.util.d0 d0Var = this.f62083f;
            if (d0Var.isEmpty()) {
                return;
            }
            long jElement = d0Var.element();
            Long l9 = (Long) this.f62082e.pollFloor(jElement);
            w wVar = this.f62079b;
            if (l9 != null && l9.longValue() != this.f62088k) {
                this.f62088k = l9.longValue();
                wVar.onProcessedStreamChange();
            }
            int frameReleaseAction = this.f62079b.getFrameReleaseAction(jElement, j10, j11, this.f62088k, false, false, this.f62080c);
            b0 b0Var = this.f62078a;
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.f62085h = jElement;
                boolean z10 = frameReleaseAction == 0;
                long jRemove = d0Var.remove();
                k2 k2Var = (k2) this.f62081d.pollFloor(jRemove);
                if (k2Var != null && !k2Var.equals(k2.f57977d) && !k2Var.equals(this.f62087j)) {
                    this.f62087j = k2Var;
                    ((d) b0Var).onVideoSizeChanged(k2Var);
                }
                ((d) b0Var).renderFrame(z10 ? -1L : this.f62080c.getReleaseTimeNs(), jRemove, wVar.onFrameReleasedIsFirstFrame());
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                this.f62085h = jElement;
                d0Var.remove();
                ((d) b0Var).dropFrame();
            } else {
                if (frameReleaseAction != 4) {
                    if (frameReleaseAction != 5) {
                        throw new IllegalStateException(String.valueOf(frameReleaseAction));
                    }
                    return;
                }
                this.f62085h = jElement;
            }
        }
    }

    public void signalEndOfInput() {
        this.f62086i = this.f62084g;
    }
}
