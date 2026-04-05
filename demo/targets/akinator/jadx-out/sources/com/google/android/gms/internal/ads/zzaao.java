package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaao {
    private final Context zza;
    private final zzaba zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = MBInterstitialActivity.WEB_LOAD_TIME;
    private final zzabb zzh = new zzabb(1.0f);
    private zzdc zze = zzdc.zza;

    public zzaao(Context context, zzaba zzabaVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzabaVar;
    }

    public final zzaao zza(boolean z10) {
        this.zzd = true;
        return this;
    }

    public final zzaao zzb(zzdc zzdcVar) {
        this.zze = zzdcVar;
        return this;
    }

    public final zzaao zzc(long j10) {
        this.zzg = j10;
        return this;
    }

    public final zzaaw zzd() {
        zzgmd.zzh(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzaau(false);
        }
        zzaaw zzaawVar = new zzaaw(this, null);
        this.zzf = true;
        return zzaawVar;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzaba zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final /* synthetic */ zzdc zzi() {
        return this.zze;
    }

    public final /* synthetic */ long zzj() {
        return this.zzg;
    }

    public final /* synthetic */ zzabb zzk() {
        return this.zzh;
    }
}
