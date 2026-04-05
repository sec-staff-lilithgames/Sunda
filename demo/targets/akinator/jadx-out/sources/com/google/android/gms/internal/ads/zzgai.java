package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgai {
    private final zzifb zza;
    private final zzifb zzb;
    private final zzifb zzc;
    private final ExecutorService zzd;
    private final zzgjd zze;

    public zzgai(zzifb zzifbVar, zzifb zzifbVar2, zzifb zzifbVar3, ExecutorService executorService, zzgjd zzgjdVar) {
        this.zza = zzifbVar;
        this.zzb = zzifbVar2;
        this.zzc = zzifbVar3;
        this.zzd = executorService;
        this.zze = zzgjdVar;
    }

    private final n1 zze(final int i10) {
        return (zzgua) zzgui.zzj(zzgua.zzw(zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgae
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i10);
            }
        }, this.zzd)), zzgaf.zza, zzguz.zza());
    }

    public final /* synthetic */ zzgjd zza() {
        return this.zze;
    }

    public final n1 zzb(int i10, boolean z10) {
        n1 n1VarZze = zze(i10);
        return (!z10 || i10 == 2) ? n1VarZze : (zzgua) zzgui.zzj((zzgua) zzgui.zzg(zzgua.zzw(n1VarZze), Throwable.class, zzgah.zza, zzguz.zza()), new zzgad(this), zzguz.zza());
    }

    public final /* synthetic */ zzgab zzc(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return (zzgab) this.zza.zzb();
        }
        if (i11 == 2) {
            return (zzgab) this.zzb.zzb();
        }
        if (i11 == 3) {
            return (zzgab) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ n1 zzd(int i10) {
        return zze(2);
    }
}
