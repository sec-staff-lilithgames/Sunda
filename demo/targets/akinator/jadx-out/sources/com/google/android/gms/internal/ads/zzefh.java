package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbdz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzefh implements zzfkt {
    private final zzeev zza;
    private final zzeez zzb;

    public zzefh(zzeev zzeevVar, zzeez zzeezVar) {
        this.zza = zzeevVar;
        this.zzb = zzeezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdQ(zzfkm zzfkmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue()) {
            if (zzfkm.RENDERER == zzfkmVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfkm.PRELOADED_LOADER == zzfkmVar || zzfkm.SERVER_TRANSACTION == zzfkmVar) {
                zzeev zzeevVar = this.zza;
                zzeevVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzeez zzeezVar = this.zzb;
                final long jZzb = zzeevVar.zzb();
                zzeezVar.zza.zza(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzeey
                    @Override // com.google.android.gms.internal.ads.zzfjx
                    public final /* synthetic */ Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeezVar.zzf()) {
                            return null;
                        }
                        long j10 = jZzb;
                        zzbdz.zzaf.zza.C0161zza c0161zzaZzz = zzbdz.zzaf.zza.zzz();
                        c0161zzaZzz.zzad(j10);
                        byte[] bArrZzaN = c0161zzaZzz.zzbu().zzaN();
                        zzefg.zzf(sQLiteDatabase, false, false);
                        zzefg.zze(sQLiteDatabase, j10, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdR(zzfkm zzfkmVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue() && zzfkm.RENDERER == zzfkmVar) {
            zzeev zzeevVar = this.zza;
            if (zzeevVar.zzh() != 0) {
                zzeevVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeevVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdS(zzfkm zzfkmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue() && zzfkm.RENDERER == zzfkmVar) {
            zzeev zzeevVar = this.zza;
            if (zzeevVar.zzh() != 0) {
                zzeevVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeevVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdP(zzfkm zzfkmVar, String str) {
    }
}
