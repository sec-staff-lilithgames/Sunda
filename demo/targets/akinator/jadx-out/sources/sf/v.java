package sf;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.impl.f9;
import com.google.android.exoplayer2.z0;
import io.bidmachine.media3.exoplayer.b1;
import on.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f85732a;

    /* renamed from: b, reason: collision with root package name */
    public final w f85733b;

    public v(Handler handler, w wVar) {
        this.f85732a = wVar != null ? (Handler) com.google.android.exoplayer2.util.a.checkNotNull(handler) : null;
        this.f85733b = wVar;
    }

    public void decoderInitialized(String str, long j10, long j11) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.audio.w(this, str, j10, j11, 5));
        }
    }

    public void decoderReleased(String str) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new z(9, this, str));
        }
    }

    public void disabled(ce.f fVar) {
        fVar.ensureUpdated();
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new u(this, fVar, 0));
        }
    }

    public void droppedFrames(int i10, long j10) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new t(this, i10, j10));
        }
    }

    public void enabled(ce.f fVar) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new u(this, fVar, 1));
        }
    }

    public void inputFormatChanged(z0 z0Var, ce.k kVar) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new b1(this, 15, z0Var, kVar));
        }
    }

    public void renderedFirstFrame(Object obj) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new f9(this, obj, SystemClock.elapsedRealtime(), 5));
        }
    }

    public void reportVideoFrameProcessingOffset(long j10, int i10) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new t(this, j10, i10));
        }
    }

    public void videoCodecError(Exception exc) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new z(10, this, exc));
        }
    }

    public void videoSizeChanged(x xVar) {
        Handler handler = this.f85732a;
        if (handler != null) {
            handler.post(new z(8, this, xVar));
        }
    }
}
