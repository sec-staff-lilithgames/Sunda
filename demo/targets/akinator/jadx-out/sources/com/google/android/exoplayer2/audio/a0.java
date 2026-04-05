package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.applovin.impl.k9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27046a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f27047b;

    public a0(Handler handler, b0 b0Var) {
        this.f27046a = b0Var != null ? (Handler) com.google.android.exoplayer2.util.a.checkNotNull(handler) : null;
        this.f27047b = b0Var;
    }

    public void audioCodecError(Exception exc) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new x(this, exc, 0));
        }
    }

    public void audioSinkError(Exception exc) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new x(this, exc, 1));
        }
    }

    public void decoderInitialized(String str, long j10, long j11) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new w(this, str, j10, j11, 0));
        }
    }

    public void decoderReleased(String str) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new af.n(25, this, str));
        }
    }

    public void disabled(ce.f fVar) {
        fVar.ensureUpdated();
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new z(this, fVar, 1));
        }
    }

    public void enabled(ce.f fVar) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new z(this, fVar, 0));
        }
    }

    public void inputFormatChanged(com.google.android.exoplayer2.z0 z0Var, ce.k kVar) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new androidx.browser.customtabs.g(this, 27, z0Var, kVar));
        }
    }

    public void positionAdvancing(long j10) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new y(this, j10, 0));
        }
    }

    public void skipSilenceEnabledChanged(boolean z10) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new k9(this, z10, 1));
        }
    }

    public void underrun(int i10, long j10, long j11) {
        Handler handler = this.f27046a;
        if (handler != null) {
            handler.post(new at.a(this, j10, j11, i10, 1));
        }
    }
}
