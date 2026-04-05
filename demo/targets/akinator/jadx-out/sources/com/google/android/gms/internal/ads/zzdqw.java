package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqw extends zzdqh implements zzdgv {
    private zzdgv zza;

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void zzdV() {
        zzdgv zzdgvVar = this.zza;
        if (zzdgvVar != null) {
            zzdgvVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void zzdz() {
        zzdgv zzdgvVar = this.zza;
        if (zzdgvVar != null) {
            zzdgvVar.zzdz();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkn zzbknVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbkp zzbkpVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdgv zzdgvVar) throws Throwable {
        try {
            try {
                zzm(zzaVar, zzbknVar, zzrVar, zzbkpVar, zzadVar);
                this.zza = zzdgvVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
