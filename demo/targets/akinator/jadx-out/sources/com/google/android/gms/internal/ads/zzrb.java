package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzrb {
    private final AudioTrack zza;
    private final zzpj zzb;
    private final Handler zzc;
    private AudioRouting.OnRoutingChangedListener zzd = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzra
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
            this.zza.zzb(audioRouting);
        }
    };

    public zzrb(AudioTrack audioTrack, zzpj zzpjVar) {
        this.zza = audioTrack;
        this.zzb = zzpjVar;
        Handler handler = new Handler(Looper.myLooper());
        this.zzc = handler;
        audioTrack.addOnRoutingChangedListener(this.zzd, handler);
    }

    public final void zza() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzd;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzd = null;
    }

    public final /* synthetic */ void zzb(final AudioRouting audioRouting) {
        if (this.zzd == null) {
            return;
        }
        zzcw.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzc(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd(routedDevice);
                }
            });
        }
    }

    public final /* synthetic */ void zzd(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzd == null) {
            return;
        }
        this.zzb.zzc(audioDeviceInfo);
    }
}
