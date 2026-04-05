package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcb {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final zzdf zzdfVar = new zzdf(zzdc.zza);
                zzcw.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzca
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcb.zzd(applicationContext, zzdfVar);
                    }
                });
                zzdfVar.zzd();
                AudioManager audioManager2 = zza;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int zzb(AudioManager audioManager, zzbz zzbzVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(zzbzVar.zzc());
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerZzb = zzbzVar.zzb();
        zzbzVar.zza();
        return audioManager.requestAudioFocus(onAudioFocusChangeListenerZzb, 3, 1);
    }

    public static int zzc(AudioManager audioManager, zzbz zzbzVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.abandonAudioFocusRequest(zzbzVar.zzc()) : audioManager.abandonAudioFocus(zzbzVar.zzb());
    }

    public static /* synthetic */ void zzd(Context context, zzdf zzdfVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdfVar.zza();
    }
}
