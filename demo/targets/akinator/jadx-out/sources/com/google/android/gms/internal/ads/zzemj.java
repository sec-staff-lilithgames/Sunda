package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzemj implements zzczx {
    boolean zza;
    final /* synthetic */ zzehn zzb;
    final /* synthetic */ zzcca zzc;

    public zzemj(zzemm zzemmVar, zzehn zzehnVar, zzcca zzccaVar) {
        this.zzb = zzehnVar;
        this.zzc = zzccaVar;
        Objects.requireNonNull(zzemmVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzge)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzeho(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final synchronized void zzb(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzemm.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final synchronized void zzc(int i10, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzemm.zze(this.zzb.zza, i10);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
