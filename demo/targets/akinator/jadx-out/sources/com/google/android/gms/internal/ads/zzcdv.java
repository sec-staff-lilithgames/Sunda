package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcdv implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcdu zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcdv(Context context, zzcdu zzcduVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcduVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzq();
                return;
            }
            return;
        }
        if (this.zzc) {
            return;
        }
        AudioManager audioManager2 = this.zza;
        if (audioManager2 != null) {
            this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.zzb.zzq();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.zzc = i10 > 0;
        this.zzb.zzq();
    }

    public final void zza(boolean z10) {
        this.zze = z10;
        zzf();
    }

    public final void zzb(float f10) {
        this.zzf = f10;
        zzf();
    }

    public final float zzc() {
        float f10 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f10;
        }
        return 0.0f;
    }

    public final void zzd() {
        this.zzd = true;
        zzf();
    }

    public final void zze() {
        this.zzd = false;
        zzf();
    }
}
