package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f24511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f24512b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f24512b = rVar;
        this.f24511a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f24511a.flush();
            this.f24511a.release();
        } finally {
            this.f24512b.f24536e.open();
        }
    }
}
