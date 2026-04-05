package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqc implements zzeya {
    private final zzgus zza;
    private final zzfgn zzb;
    private final int zzc;

    public zzeqc(zzgus zzgusVar, zzfgn zzfgnVar, zzfhd zzfhdVar, int i10) {
        this.zza = zzgusVar;
        this.zzb = zzfgnVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 5;
    }

    public final /* synthetic */ zzeqd zzc() throws GeneralSecurityException {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhB)).booleanValue()) {
            zzfgn zzfgnVar = this.zzb;
            if (this.zzc != 2) {
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfgnVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhD)).booleanValue()) {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhE)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhC)).split(","));
                }
                if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strZzc))) {
                    strZza = zzfhd.zza();
                }
            }
        }
        return new zzeqd(strZza);
    }
}
