package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkz implements zzvf, zzrv {
    final /* synthetic */ zzle zza;
    private final zzlb zzb;

    public zzkz(zzle zzleVar, zzlb zzlbVar) {
        Objects.requireNonNull(zzleVar);
        this.zza = zzleVar;
        this.zzb = zzlbVar;
    }

    private final Pair zzf(int i10, zzuu zzuuVar) {
        zzuu zzuuVarZza;
        zzuu zzuuVar2 = null;
        if (zzuuVar != null) {
            zzlb zzlbVar = this.zzb;
            int i11 = 0;
            while (true) {
                List list = zzlbVar.zzc;
                if (i11 >= list.size()) {
                    zzuuVarZza = null;
                    break;
                }
                if (((zzuu) list.get(i11)).zzd == zzuuVar.zzd) {
                    Object obj = zzuuVar.zza;
                    Object obj2 = zzlbVar.zzb;
                    int i12 = zzll.zzb;
                    zzuuVarZza = zzuuVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (zzuuVarZza == null) {
                return null;
            }
            zzuuVar2 = zzuuVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzuuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcT(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar, final int i11) {
        final Pair pairZzf = zzf(0, zzuuVar);
        if (pairZzf != null) {
            zzle zzleVar = this.zza;
            zzleVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzcT(((Integer) pair.first).intValue(), (zzuu) pair.second, zzulVar, zzuqVar, i11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcU(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar) {
        final Pair pairZzf = zzf(0, zzuuVar);
        if (pairZzf != null) {
            zzle zzleVar = this.zza;
            zzleVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzcU(((Integer) pair.first).intValue(), (zzuu) pair.second, zzulVar, zzuqVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcV(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar) {
        final Pair pairZzf = zzf(0, zzuuVar);
        if (pairZzf != null) {
            zzle zzleVar = this.zza;
            zzleVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzcV(((Integer) pair.first).intValue(), (zzuu) pair.second, zzulVar, zzuqVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcW(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar, final IOException iOException, final boolean z10) {
        final Pair pairZzf = zzf(0, zzuuVar);
        if (pairZzf != null) {
            zzle zzleVar = this.zza;
            zzleVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzcW(((Integer) pair.first).intValue(), (zzuu) pair.second, zzulVar, zzuqVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcX(int i10, zzuu zzuuVar, final zzuq zzuqVar) {
        final Pair pairZzf = zzf(0, zzuuVar);
        if (pairZzf != null) {
            zzle zzleVar = this.zza;
            zzleVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzcX(((Integer) pair.first).intValue(), (zzuu) pair.second, zzuqVar);
                }
            });
        }
    }
}
