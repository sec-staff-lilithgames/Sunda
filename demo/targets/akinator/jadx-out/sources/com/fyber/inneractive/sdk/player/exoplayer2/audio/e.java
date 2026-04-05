package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f24500d;

    public e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f24500d = eventDispatcher;
        this.f24497a = str;
        this.f24498b = j10;
        this.f24499c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24500d.listener.onAudioDecoderInitialized(this.f24497a, this.f24498b, this.f24499c);
    }
}
