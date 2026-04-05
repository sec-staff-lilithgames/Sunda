package io;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.impl.f9;
import com.ironsource.lh;
import gn.k2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f62122a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f62123b;

    public f0(Handler handler, g0 g0Var) {
        this.f62122a = g0Var != null ? (Handler) io.bidmachine.media3.common.util.a.checkNotNull(handler) : null;
        this.f62123b = g0Var;
    }

    public void decoderInitialized(String str, long j10, long j11) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.audio.w(this, str, j10, j11, 2));
        }
    }

    public void decoderReleased(String str) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new im.k(3, this, str));
        }
    }

    public void disabled(io.bidmachine.media3.exoplayer.j jVar) {
        jVar.ensureUpdated();
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new e0(this, jVar, 0));
        }
    }

    public void droppedFrames(int i10, long j10) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new d0(this, i10, j10));
        }
    }

    public void enabled(io.bidmachine.media3.exoplayer.j jVar) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new e0(this, jVar, 1));
        }
    }

    public void inputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new lh(this, 28, bVar, kVar));
        }
    }

    public void renderedFirstFrame(Object obj) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new f9(this, obj, SystemClock.elapsedRealtime(), 3));
        }
    }

    public void reportVideoFrameProcessingOffset(long j10, int i10) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new d0(this, j10, i10));
        }
    }

    public void videoCodecError(Exception exc) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new im.k(2, this, exc));
        }
    }

    public void videoSizeChanged(k2 k2Var) {
        Handler handler = this.f62122a;
        if (handler != null) {
            handler.post(new im.k(4, this, k2Var));
        }
    }
}
