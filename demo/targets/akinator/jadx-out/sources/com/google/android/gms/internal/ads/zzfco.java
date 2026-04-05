package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfco implements zzfdm {
    private zzcxv zza;
    private final Executor zzb = zzguz.zza();

    public final zzcxv zza() {
        return this.zza;
    }

    public final n1 zzb(zzfdn zzfdnVar, zzfdl zzfdlVar, zzcxv zzcxvVar) {
        zzcxu zzcxuVarZza = zzfdlVar.zza(zzfdnVar.zzb);
        zzcxuVarZza.zzj(new zzfdq(true));
        zzcxv zzcxvVar2 = (zzcxv) zzcxuVarZza.zzh();
        this.zza = zzcxvVar2;
        final zzcus zzcusVarZza = zzcxvVar2.zza();
        final zzfil zzfilVar = new zzfil();
        zzgua zzguaVarZzw = zzgua.zzw(zzcusVarZza.zzb());
        zzgtq zzgtqVar = new zzgtq(this) { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                zzfgf zzfgfVar = (zzfgf) obj;
                zzfilVar.zzb = zzfgfVar;
                Iterator it = zzfgfVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzffu) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzcusVarZza.zzc(zzgui.zza(zzfgfVar));
                    }
                }
                return zzgui.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgua) zzgui.zzk((zzgua) zzgui.zzj(zzguaVarZzw, zzgtqVar, executor), new zzglu() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                zzfil zzfilVar2 = zzfilVar;
                zzfilVar2.zzc = (zzcto) obj;
                return zzfilVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdm
    public final /* bridge */ /* synthetic */ n1 zzc(zzfdn zzfdnVar, zzfdl zzfdlVar, Object obj) {
        return zzb(zzfdnVar, zzfdlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfdm
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
