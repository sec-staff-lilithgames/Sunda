package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbw {
    private AudioManager.OnAudioFocusChangeListener zza;
    private Handler zzb;
    private zzd zzc = zzd.zza;

    public zzbw(int i10) {
    }

    public final zzbw zza(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final zzbw zzb(zzd zzdVar) {
        this.zzc = zzdVar;
        return this;
    }

    public final zzbz zzc() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.zzb;
        handler.getClass();
        return new zzbz(1, onAudioFocusChangeListener, handler, this.zzc, false);
    }
}
