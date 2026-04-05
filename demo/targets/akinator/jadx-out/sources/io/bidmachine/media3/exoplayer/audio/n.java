package io.bidmachine.media3.exoplayer.audio;

import android.os.Handler;
import com.applovin.impl.k9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f60990a;

    /* renamed from: b, reason: collision with root package name */
    public final o f60991b;

    public n(Handler handler, o oVar) {
        this.f60990a = oVar != null ? (Handler) io.bidmachine.media3.common.util.a.checkNotNull(handler) : null;
        this.f60991b = oVar;
    }

    public void audioCodecError(Exception exc) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new k(this, exc, 1));
        }
    }

    public void audioSinkError(Exception exc) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new k(this, exc, 0));
        }
    }

    public void audioTrackInitialized(p pVar) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new l(this, pVar, 0));
        }
    }

    public void audioTrackReleased(p pVar) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new l(this, pVar, 1));
        }
    }

    public void decoderInitialized(String str, long j10, long j11) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.audio.w(this, str, j10, j11, 3));
        }
    }

    public void decoderReleased(String str) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new im.k(10, this, str));
        }
    }

    public void disabled(io.bidmachine.media3.exoplayer.j jVar) {
        jVar.ensureUpdated();
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new m(this, jVar, 0));
        }
    }

    public void enabled(io.bidmachine.media3.exoplayer.j jVar) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new m(this, jVar, 1));
        }
    }

    public void inputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new io.bidmachine.media3.exoplayer.b1(this, 2, bVar, kVar));
        }
    }

    public void positionAdvancing(long j10) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.audio.y(this, j10, 2));
        }
    }

    public void skipSilenceEnabledChanged(boolean z10) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new k9(this, z10, 6));
        }
    }

    public void underrun(int i10, long j10, long j11) {
        Handler handler = this.f60990a;
        if (handler != null) {
            handler.post(new at.a(this, j10, j11, i10, 3));
        }
    }
}
