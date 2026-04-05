package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f24510b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10) {
        this.f24510b = eventDispatcher;
        this.f24509a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24510b.listener.onAudioSessionId(this.f24509a);
    }
}
