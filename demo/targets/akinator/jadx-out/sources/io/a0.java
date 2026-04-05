package io;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f59819g = new a0();

    /* renamed from: b, reason: collision with root package name */
    public volatile long f59820b = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f59821c;

    /* renamed from: e, reason: collision with root package name */
    public Choreographer f59822e;

    /* renamed from: f, reason: collision with root package name */
    public int f59823f;

    public a0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerCreateHandler = a1.createHandler(handlerThread.getLooper(), this);
        this.f59821c = handlerCreateHandler;
        handlerCreateHandler.sendEmptyMessage(1);
    }

    public static a0 getInstance() {
        return f59819g;
    }

    public void addObserver() {
        this.f59821c.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        this.f59820b = j10;
        ((Choreographer) io.bidmachine.media3.common.util.a.checkNotNull(this.f59822e)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f59822e = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                io.bidmachine.media3.common.util.b0.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f59822e;
            if (choreographer != null) {
                int i11 = this.f59823f + 1;
                this.f59823f = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f59822e;
        if (choreographer2 != null) {
            int i12 = this.f59823f - 1;
            this.f59823f = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f59820b = C.TIME_UNSET;
            }
        }
        return true;
    }

    public void removeObserver() {
        this.f59821c.sendEmptyMessage(3);
    }
}
