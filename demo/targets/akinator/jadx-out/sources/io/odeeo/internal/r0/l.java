package io.odeeo.internal.r0;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.impl.f9;
import com.google.android.exoplayer2.audio.w;
import com.ironsource.lh;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f66220a;

        /* renamed from: b, reason: collision with root package name */
        public final l f66221b;

        public a(Handler handler, l lVar) {
            this.f66220a = lVar != null ? (Handler) io.odeeo.internal.q0.a.checkNotNull(handler) : null;
            this.f66221b = lVar;
        }

        public void decoderInitialized(String str, long j10, long j11) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new w(this, str, j10, j11, 1));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new com.ironsource.environment.thread.a(24, this, str));
            }
        }

        public void disabled(io.odeeo.internal.e.e eVar) {
            eVar.ensureUpdated();
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new et.a(this, eVar, 1));
            }
        }

        public void droppedFrames(int i10, long j10) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new et.b(i10, j10, this));
            }
        }

        public void enabled(io.odeeo.internal.e.e eVar) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new et.a(this, eVar, 0));
            }
        }

        public void inputFormatChanged(t tVar, io.odeeo.internal.e.i iVar) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new lh(this, 23, tVar, iVar));
            }
        }

        public void renderedFirstFrame(Object obj) {
            if (this.f66220a != null) {
                this.f66220a.post(new f9(this, obj, SystemClock.elapsedRealtime(), 2));
            }
        }

        public void reportVideoFrameProcessingOffset(long j10, int i10) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new et.b(this, j10, i10, 0));
            }
        }

        public void videoCodecError(Exception exc) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new com.ironsource.environment.thread.a(25, this, exc));
            }
        }

        public void videoSizeChanged(m mVar) {
            Handler handler = this.f66220a;
            if (handler != null) {
                handler.post(new com.ironsource.environment.thread.a(26, this, mVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, long j10, long j11) {
            ((l) g0.castNonNull(this.f66221b)).onVideoDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(io.odeeo.internal.e.e eVar) {
            ((l) g0.castNonNull(this.f66221b)).onVideoEnabled(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(t tVar, io.odeeo.internal.e.i iVar) {
            ((l) g0.castNonNull(this.f66221b)).onVideoInputFormatChanged(tVar);
            ((l) g0.castNonNull(this.f66221b)).onVideoInputFormatChanged(tVar, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, long j10) {
            ((l) g0.castNonNull(this.f66221b)).onDroppedFrames(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j10, int i10) {
            ((l) g0.castNonNull(this.f66221b)).onVideoFrameProcessingOffset(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(m mVar) {
            ((l) g0.castNonNull(this.f66221b)).onVideoSizeChanged(mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j10) {
            ((l) g0.castNonNull(this.f66221b)).onRenderedFirstFrame(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            ((l) g0.castNonNull(this.f66221b)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(io.odeeo.internal.e.e eVar) {
            eVar.ensureUpdated();
            ((l) g0.castNonNull(this.f66221b)).onVideoDisabled(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            ((l) g0.castNonNull(this.f66221b)).onVideoCodecError(exc);
        }
    }

    @Deprecated
    default void onVideoInputFormatChanged(t tVar) {
    }

    default void onVideoInputFormatChanged(t tVar, io.odeeo.internal.e.i iVar) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(io.odeeo.internal.e.e eVar) {
    }

    default void onVideoEnabled(io.odeeo.internal.e.e eVar) {
    }

    default void onVideoSizeChanged(m mVar) {
    }

    default void onDroppedFrames(int i10, long j10) {
    }

    default void onRenderedFirstFrame(Object obj, long j10) {
    }

    default void onVideoFrameProcessingOffset(long j10, int i10) {
    }

    default void onVideoDecoderInitialized(String str, long j10, long j11) {
    }
}
