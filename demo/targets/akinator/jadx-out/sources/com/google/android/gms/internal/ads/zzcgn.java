package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcgn extends zzccx {
    private final zzcds zzc;
    private zzcgo zzd;
    private Uri zze;
    private zzccw zzf;
    private boolean zzg;
    private int zzh;

    public zzcgn(Context context, zzcds zzcdsVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcdsVar;
        zzcdsVar.zza(this);
    }

    @EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzu() {
        int i10 = this.zzh;
        return (i10 == 1 || i10 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i10) {
        if (i10 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i10;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcgn.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return a.b.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzb(zzccw zzccwVar) {
        this.zzf = zzccwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzc(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcgo(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcgo zzcgoVar = this.zzd;
        if (zzcgoVar != null) {
            zzcgoVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzi(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzccx, com.google.android.gms.internal.ads.zzcdu
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    public final /* synthetic */ void zzr() {
        zzccw zzccwVar = this.zzf;
        if (zzccwVar != null) {
            zzccwVar.zzb();
        }
    }

    public final /* synthetic */ void zzs() {
        zzccw zzccwVar = this.zzf;
        if (zzccwVar != null) {
            if (!this.zzg) {
                zzccwVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzt() {
        zzccw zzccwVar = this.zzf;
        if (zzccwVar != null) {
            zzccwVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzj(float f10, float f11) {
    }
}
