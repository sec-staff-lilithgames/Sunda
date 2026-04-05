package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import sh.n1;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdnq implements zzczi {
    private final zzdlq zza;
    private final zzdlv zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdnq(zzdlq zzdlqVar, zzdlv zzdlvVar, Executor executor, Executor executor2) {
        this.zza = zzdlqVar;
        this.zzb = zzdlvVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcgy zzcgyVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgyVar.zze("onSdkImpression", new f());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        if (this.zzb.zzd()) {
            zzdlq zzdlqVar = this.zza;
            zzehf zzehfVarZzZ = zzdlqVar.zzZ();
            if (zzehfVarZzZ == null && zzdlqVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfW)).booleanValue()) {
                n1 n1VarZzX = zzdlqVar.zzX();
                zzcca zzccaVarZzY = zzdlqVar.zzY();
                if (n1VarZzX == null || zzccaVarZzY == null) {
                    return;
                }
                zzgui.zzr(zzgui.zzq(n1VarZzX, zzccaVarZzY), new zzdno(this), this.zzd);
                return;
            }
            if (zzehfVarZzZ != null) {
                zzcgy zzcgyVarZzW = zzdlqVar.zzW();
                zzcgy zzcgyVarZzT = zzdlqVar.zzT();
                if (zzcgyVarZzW == null) {
                    zzcgyVarZzW = zzcgyVarZzT == null ? null : zzcgyVarZzT;
                }
                if (zzcgyVarZzW != null) {
                    zza(zzcgyVarZzW);
                }
            }
        }
    }
}
