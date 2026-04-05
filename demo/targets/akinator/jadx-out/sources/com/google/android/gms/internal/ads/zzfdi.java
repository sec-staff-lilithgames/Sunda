package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfdi {
    private final zzfic zza;
    private final zzcxv zzb;
    private final Executor zzc;
    private zzfdg zzd;

    public zzfdi(zzfic zzficVar, zzcxv zzcxvVar, Executor executor) {
        this.zza = zzficVar;
        this.zzb = zzcxvVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfim zzb() {
        zzfgn zzfgnVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzfgnVarZzb.zzd, zzfgnVarZzb.zzg, zzfgnVarZzb.zzk);
    }

    public final n1 zza() {
        n1 n1VarZza;
        zzfdg zzfdgVar = this.zzd;
        if (zzfdgVar != null) {
            return zzgui.zza(zzfdgVar);
        }
        if (((Boolean) zzbhb.zza.zze()).booleanValue()) {
            zzgua zzguaVarZzw = zzgua.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfdf zzfdfVar = new zzfdf(this);
            Executor executor = this.zzc;
            n1VarZza = (zzgua) zzgui.zzg((zzgua) zzgui.zzk(zzguaVarZzw, zzfdfVar, executor), zzecj.class, new zzfde(this), executor);
        } else {
            zzfdg zzfdgVar2 = new zzfdg(null, zzb(), null);
            this.zzd = zzfdgVar2;
            n1VarZza = zzgui.zza(zzfdgVar2);
        }
        return zzgui.zzk(n1VarZza, zzfdh.zza, this.zzc);
    }

    public final /* synthetic */ zzfdg zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd(zzfdg zzfdgVar) {
        this.zzd = zzfdgVar;
    }
}
