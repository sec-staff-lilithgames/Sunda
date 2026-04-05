package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26200a;

    public m(p pVar) {
        this.f26200a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f26200a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) pVar.f26201a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", pVar.b(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (f10 == 0.0f) {
            f10 = 0.1f;
        }
        pVar.setVolume(f10, f10);
        IAlog.e(strB + "timelog: unmute took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
