package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgjd {
    private final zzfzn zza;
    private final zzfxa zzb;

    public zzgjd(zzfxa zzfxaVar, zzfzn zzfznVar) {
        this.zza = zzfznVar;
        this.zzb = zzfxaVar;
    }

    public final zzgjb zza(int i10) {
        return new zzgjb(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th2) {
        this.zza.zzb(i10 - 1, -1L, th2, null);
    }

    public final n1 zze(int i10, n1 n1Var) {
        zzgjb zzgjbVarZza = zza(i10);
        zzgjbVarZza.zza();
        zzgui.zzr(n1Var, new zzgjc(this, zzgjbVarZza), zzguz.zza());
        return n1Var;
    }

    public final void zzf(int i10, Runnable runnable) {
        try {
            zza(i10).zza();
            runnable.run();
        } finally {
        }
    }
}
