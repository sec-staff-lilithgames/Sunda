package io.odeeo.internal.d;

import android.os.Handler;
import com.applovin.impl.k9;
import io.bidmachine.media3.exoplayer.b1;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f63356a;

        /* renamed from: b, reason: collision with root package name */
        public final g f63357b;

        public a(Handler handler, g gVar) {
            this.f63356a = gVar != null ? (Handler) io.odeeo.internal.q0.a.checkNotNull(handler) : null;
            this.f63357b = gVar;
        }

        public void audioCodecError(Exception exc) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new ls.a(this, exc, 1));
            }
        }

        public void audioSinkError(Exception exc) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new ls.a(this, exc, 0));
            }
        }

        public void decoderInitialized(String str, long j10, long j11) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new com.google.android.exoplayer2.audio.w(this, str, j10, j11, 4));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new im.k(24, this, str));
            }
        }

        public void disabled(io.odeeo.internal.e.e eVar) {
            eVar.ensureUpdated();
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new ls.b(this, eVar, 0));
            }
        }

        public void enabled(io.odeeo.internal.e.e eVar) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new ls.b(this, eVar, 1));
            }
        }

        public void inputFormatChanged(io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new b1(this, 9, tVar, iVar));
            }
        }

        public void positionAdvancing(long j10) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new com.google.android.exoplayer2.audio.y(this, j10, 3));
            }
        }

        public void skipSilenceEnabledChanged(boolean z10) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new k9(this, z10, 8));
            }
        }

        public void underrun(int i10, long j10, long j11) {
            Handler handler = this.f63356a;
            if (handler != null) {
                handler.post(new at.a(this, j10, j11, i10, 4));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, long j10, long j11) {
            ((g) g0.castNonNull(this.f63357b)).onAudioDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(io.odeeo.internal.e.e eVar) {
            ((g) g0.castNonNull(this.f63357b)).onAudioEnabled(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Exception exc) {
            ((g) g0.castNonNull(this.f63357b)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar) {
            ((g) g0.castNonNull(this.f63357b)).onAudioInputFormatChanged(tVar);
            ((g) g0.castNonNull(this.f63357b)).onAudioInputFormatChanged(tVar, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j10) {
            ((g) g0.castNonNull(this.f63357b)).onAudioPositionAdvancing(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, long j10, long j11) {
            ((g) g0.castNonNull(this.f63357b)).onAudioUnderrun(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            ((g) g0.castNonNull(this.f63357b)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(io.odeeo.internal.e.e eVar) {
            eVar.ensureUpdated();
            ((g) g0.castNonNull(this.f63357b)).onAudioDisabled(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10) {
            ((g) g0.castNonNull(this.f63357b)).onSkipSilenceEnabledChanged(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            ((g) g0.castNonNull(this.f63357b)).onAudioCodecError(exc);
        }
    }

    @Deprecated
    default void onAudioInputFormatChanged(io.odeeo.internal.b.t tVar) {
    }

    default void onAudioInputFormatChanged(io.odeeo.internal.b.t tVar, io.odeeo.internal.e.i iVar) {
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(io.odeeo.internal.e.e eVar) {
    }

    default void onAudioEnabled(io.odeeo.internal.e.e eVar) {
    }

    default void onAudioPositionAdvancing(long j10) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioUnderrun(int i10, long j10, long j11) {
    }
}
