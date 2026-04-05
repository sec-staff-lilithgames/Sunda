package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhq {
    private final zzgmv zza;
    private final Handler zzb;
    private zzhp zzc;
    private zzd zzd;
    private int zzf;
    private zzbz zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzhq(final Context context, Looper looper, zzhp zzhpVar) {
        this.zza = zzgmz.zza(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzho
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return zzcb.zza(context);
            }
        });
        this.zzc = zzhpVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i10 = this.zze;
        if (i10 == 1 || i10 == 0 || this.zzh == null) {
            return;
        }
        zzcb.zzc((AudioManager) this.zza.zza(), this.zzh);
    }

    private final void zzg(int i10) {
        if (this.zze == i10) {
            return;
        }
        this.zze = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.zzg != f10) {
            this.zzg = f10;
            zzhp zzhpVar = this.zzc;
            if (zzhpVar != null) {
                zzhpVar.zza(f10);
            }
        }
    }

    private final void zzh(int i10) {
        zzhp zzhpVar = this.zzc;
        if (zzhpVar != null) {
            zzhpVar.zzb(i10);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public final int zzc(boolean z10, int i10) {
        if (i10 == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        if (!z10) {
            int i11 = this.zze;
            if (i11 != 1) {
                return i11 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzbw zzbwVar = new zzbw(1);
            zzd zzdVar = this.zzd;
            zzdVar.getClass();
            zzbwVar.zzb(zzdVar);
            zzbwVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzhn
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i12) {
                    this.zza.zze(i12);
                }
            }, this.zzb);
            this.zzh = zzbwVar.zzc();
        }
        if (zzcb.zzb((AudioManager) this.zza.zza(), this.zzh) == 1) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    public final /* synthetic */ void zze(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i10 == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i10 != 1) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(i10).length() + 27), "Unknown focus change type: ", i10, "AudioFocusManager");
        } else {
            zzg(2);
            zzh(1);
        }
    }
}
