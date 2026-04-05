package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f61014a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    public final s0 f61015b = new s0(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f61016c;

    public t0(u0 u0Var) {
        this.f61016c = u0Var;
    }

    public void register(AudioTrack audioTrack) {
        Handler handler = this.f61014a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new androidx.browser.customtabs.i(handler, 0), this.f61015b);
    }

    public void unregister(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f61015b);
        this.f61014a.removeCallbacksAndMessages(null);
    }
}
