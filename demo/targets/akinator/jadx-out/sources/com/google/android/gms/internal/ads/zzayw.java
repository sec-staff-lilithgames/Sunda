package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayw implements Callable {
    private final zzayd zza;
    private final zzauc zzb;

    public zzayw(zzayd zzaydVar, zzauc zzaucVar) {
        this.zza = zzaydVar;
        this.zzb = zzaucVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzayd zzaydVar = this.zza;
        if (zzaydVar.zzm() != null) {
            zzaydVar.zzm().get();
        }
        zzauz zzauzVarZzl = zzaydVar.zzl();
        if (zzauzVarZzl == null) {
            return null;
        }
        try {
            zzauc zzaucVar = this.zzb;
            synchronized (zzaucVar) {
                zzaucVar.zzaY(zzauzVarZzl.zzaN(), zzhvy.zza());
            }
            return null;
        } catch (zzhxd | NullPointerException unused) {
            return null;
        }
    }
}
