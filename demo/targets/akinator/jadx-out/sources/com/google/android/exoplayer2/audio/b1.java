package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27051a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    public final a1 f27052b = new a1(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f27053c;

    public b1(c1 c1Var) {
        this.f27053c = c1Var;
    }

    public void register(AudioTrack audioTrack) {
        Handler handler = this.f27051a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new androidx.browser.customtabs.i(handler, 0), this.f27052b);
    }

    public void unregister(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f27052b);
        this.f27051a.removeCallbacksAndMessages(null);
    }
}
