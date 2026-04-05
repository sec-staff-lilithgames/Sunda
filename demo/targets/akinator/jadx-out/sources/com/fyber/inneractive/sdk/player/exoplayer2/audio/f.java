package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f24501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f24502b;

    public f(AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.f24502b = eventDispatcher;
        this.f24501a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24502b.listener.onAudioInputFormatChanged(this.f24501a);
    }
}
