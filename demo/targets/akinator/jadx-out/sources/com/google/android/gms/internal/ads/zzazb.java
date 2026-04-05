package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazb extends zzazr {
    private final zzaxv zzh;

    public zzazb(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, zzaxv zzaxvVar) {
        super(zzaydVar, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", zzaucVar, i10, 94);
        this.zzh = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zzaj(zzauo.zza(iIntValue));
        }
    }
}
