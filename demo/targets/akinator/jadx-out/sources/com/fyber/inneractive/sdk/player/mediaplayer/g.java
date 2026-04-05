package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26193a;

    public g(p pVar) {
        this.f26193a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f26193a);
        Handler handler = this.f26193a.f26215o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26193a.f26215o = null;
        }
        this.f26193a.f26214n = null;
        Looper.myLooper().quit();
    }
}
