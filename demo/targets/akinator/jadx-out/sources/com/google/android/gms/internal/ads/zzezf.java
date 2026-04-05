package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezf implements zzeya {
    private final Executor zza;
    private final String zzb;

    public zzezf(zzcbb zzcbbVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        n1 n1VarZza = zzgui.zza(this.zzb);
        zzeze zzezeVar = zzeze.zza;
        Executor executor = this.zza;
        return zzgui.zzh(zzgui.zzk(n1VarZza, zzezeVar, executor), Throwable.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzezd
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ n1 zzc(Throwable th2) {
        return zzgui.zza(new zzezg(this.zzb));
    }
}
