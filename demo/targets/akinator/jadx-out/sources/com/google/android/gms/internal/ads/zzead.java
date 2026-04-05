package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzead {
    private final zzgus zza;
    private final zzgus zzb;
    private final zzebn zzc;
    private final zzifb zzd;

    public zzead(zzgus zzgusVar, zzgus zzgusVar2, zzebn zzebnVar, zzifb zzifbVar) {
        this.zza = zzgusVar;
        this.zzb = zzgusVar2;
        this.zzc = zzebnVar;
        this.zzd = zzifbVar;
    }

    public final n1 zza(final zzbxj zzbxjVar) {
        n1 n1VarZzh;
        String str = zzbxjVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            n1VarZzh = zzgui.zzc(new zzecj(1));
        } else {
            n1VarZzh = zzgui.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeac
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzbxjVar);
                }
            }), ExecutionException.class, zzdzz.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgui.zzh(n1VarZzh, zzecj.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeaa
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc(zzbxjVar, callingUid, (zzecj) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzeck zzb(zzbxj zzbxjVar) {
        return (zzeck) this.zzc.zza(zzbxjVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ n1 zzc(final zzbxj zzbxjVar, int i10, zzecj zzecjVar) {
        Bundle bundle;
        if (zzbxjVar != null && (bundle = zzbxjVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgui.zzj(((zzeea) this.zzd.zzb()).zzb(zzbxjVar, i10), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return zzgui.zza(new zzeck((InputStream) obj, zzbxjVar));
            }
        }, this.zzb);
    }
}
