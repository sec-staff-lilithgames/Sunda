package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f24506d;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10, long j11) {
        this.f24506d = eventDispatcher;
        this.f24503a = i10;
        this.f24504b = j10;
        this.f24505c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24506d.listener.onAudioTrackUnderrun(this.f24503a, this.f24504b, this.f24505c);
    }
}
