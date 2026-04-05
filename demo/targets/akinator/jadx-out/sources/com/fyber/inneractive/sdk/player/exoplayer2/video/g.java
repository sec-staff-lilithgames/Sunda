package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final g f26116e = new g();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f26117a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f26118b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f26119c;

    /* renamed from: d, reason: collision with root package name */
    public int f26120d;

    public g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f26118b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f26117a = j10;
        this.f26119c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f26119c = Choreographer.getInstance();
            return true;
        }
        if (i10 == 1) {
            int i11 = this.f26120d + 1;
            this.f26120d = i11;
            if (i11 == 1) {
                this.f26119c.postFrameCallback(this);
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int i12 = this.f26120d - 1;
        this.f26120d = i12;
        if (i12 == 0) {
            this.f26119c.removeFrameCallback(this);
            this.f26117a = 0L;
        }
        return true;
    }
}
