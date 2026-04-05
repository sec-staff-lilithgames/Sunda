package sf;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final r f85703g = new r();

    /* renamed from: b, reason: collision with root package name */
    public volatile long f85704b = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f85705c;

    /* renamed from: e, reason: collision with root package name */
    public Choreographer f85706e;

    /* renamed from: f, reason: collision with root package name */
    public int f85707f;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerCreateHandler = n1.createHandler(handlerThread.getLooper(), this);
        this.f85705c = handlerCreateHandler;
        handlerCreateHandler.sendEmptyMessage(0);
    }

    public static r getInstance() {
        return f85703g;
    }

    public void addObserver() {
        this.f85705c.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        this.f85704b = j10;
        ((Choreographer) com.google.android.exoplayer2.util.a.checkNotNull(this.f85706e)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f85706e = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                f0.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f85706e;
            if (choreographer != null) {
                int i11 = this.f85707f + 1;
                this.f85707f = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f85706e;
        if (choreographer2 != null) {
            int i12 = this.f85707f - 1;
            this.f85707f = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f85704b = C.TIME_UNSET;
            }
        }
        return true;
    }

    public void removeObserver() {
        this.f85705c.sendEmptyMessage(2);
    }
}
