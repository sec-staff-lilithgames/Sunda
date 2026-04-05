package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbeu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaa {
    private static volatile float zzc = -1.0f;
    private static volatile long zzd;
    private static final Object zze = new Object();
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoU)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            return zzg(audioManager);
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoV)).intValue();
        if (zzc != -1.0f && jCurrentTimeMillis - zzd < jIntValue) {
            return zzc;
        }
        synchronized (zze) {
            try {
                long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (zzc != -1.0f && jCurrentTimeMillis2 - zzd < jIntValue) {
                    return zzc;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    zzc = 0.0f;
                    zzd = jCurrentTimeMillis2;
                    return 0.0f;
                }
                zzc = zzg(audioManager2);
                zzd = jCurrentTimeMillis2;
                return zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized boolean zzf() {
        return this.zzb >= 0.0f;
    }

    private static float zzg(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void zza(float f10) {
        this.zzb = f10;
    }

    public final synchronized float zzb() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z10) {
        this.zza = z10;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }
}
