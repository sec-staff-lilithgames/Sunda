package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26197b;

    public j(p pVar, int i10) {
        this.f26197b = pVar;
        this.f26196a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        p pVar = this.f26197b;
        int i10 = this.f26196a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.seekTo(i10);
        IAlog.e(strB + "timelog: seekTo took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
