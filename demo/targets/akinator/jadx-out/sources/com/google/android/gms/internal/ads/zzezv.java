package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezv implements zzeya {
    public zzezv(zzcay zzcayVar, zzgus zzgusVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        final n1 n1VarZza = zzgui.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgt)).booleanValue()) {
            n1VarZza = zzgui.zza(null);
        }
        final n1 n1VarZza2 = zzgui.zza(null);
        return zzgui.zzo(n1VarZza, n1VarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzezw((String) n1VarZza.get(), (String) n1VarZza2.get());
            }
        }, zzcbv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 47;
    }
}
