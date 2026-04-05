package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26199a;

    public l(p pVar) {
        this.f26199a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f26199a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.setVolume(0.0f, 0.0f);
        IAlog.e(strB + "timelog: mute took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
