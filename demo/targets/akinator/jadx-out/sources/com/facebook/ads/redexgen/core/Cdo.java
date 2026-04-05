package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class Cdo implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C3E A00;

    public Cdo(C3E c3e) {
        this.A00 = c3e;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new D8(this, i10));
    }
}
