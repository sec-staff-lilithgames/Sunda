package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbz {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzd zzd;
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    public zzbz(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzd zzdVar, boolean z10) {
        this.zzc = handler;
        this.zzd = zzdVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.zzb = new zzby(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = i11 >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes(zzdVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbz)) {
            return false;
        }
        zzbz zzbzVar = (zzbz) obj;
        return Objects.equals(this.zzb, zzbzVar.zzb) && Objects.equals(this.zzc, zzbzVar.zzc) && Objects.equals(this.zzd, zzbzVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    public final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return a.a(obj);
    }
}
