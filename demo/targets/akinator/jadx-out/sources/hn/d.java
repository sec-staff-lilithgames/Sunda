package hn;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f59030a;

    public static int abandonAudioFocusRequest(AudioManager audioManager, c cVar) {
        return a1.f60679a >= 26 ? audioManager.abandonAudioFocusRequest(com.google.android.gms.internal.ads.a.a(io.bidmachine.media3.common.util.a.checkNotNull(cVar.f59029f))) : audioManager.abandonAudioFocus(cVar.getOnAudioFocusChangeListener());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f59030a = null;
            }
            AudioManager audioManager = f59030a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                io.bidmachine.media3.common.util.j jVar = new io.bidmachine.media3.common.util.j();
                io.bidmachine.media3.common.util.b.get().execute(new gm.c(21, applicationContext, jVar));
                jVar.blockUninterruptible();
                return (AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(f59030a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f59030a = audioManager2;
            return (AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int getStreamMaxVolume(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int getStreamMinVolume(AudioManager audioManager, int i10) {
        if (a1.f60679a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int getStreamVolume(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            b0.w("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager, int i10) {
        return a1.f60679a >= 23 ? audioManager.isStreamMute(i10) : getStreamVolume(audioManager, i10) == 0;
    }

    public static int requestAudioFocus(AudioManager audioManager, c cVar) {
        return a1.f60679a >= 26 ? audioManager.requestAudioFocus(com.google.android.gms.internal.ads.a.a(io.bidmachine.media3.common.util.a.checkNotNull(cVar.f59029f))) : audioManager.requestAudioFocus(cVar.getOnAudioFocusChangeListener(), cVar.getAudioAttributes().getStreamType(), cVar.getFocusGain());
    }
}
