package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazc extends zzazr {
    private final zzaxg zzh;
    private final long zzi;
    private final long zzj;

    public zzazc(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11, zzaxg zzaxgVar, long j10, long j11) {
        super(zzaydVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", zzaucVar, i10, 11);
        this.zzh = zzaxgVar;
        this.zzi = j10;
        this.zzj = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxg zzaxgVar = this.zzh;
        if (zzaxgVar != null) {
            zzaxe zzaxeVar = new zzaxe((String) this.zze.invoke(null, zzaxgVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzauc zzaucVar = this.zzd;
            synchronized (zzaucVar) {
                try {
                    zzaucVar.zzf(zzaxeVar.zza.longValue());
                    if (zzaxeVar.zzb.longValue() >= 0) {
                        zzaucVar.zzW(zzaxeVar.zzb.longValue());
                    }
                    if (zzaxeVar.zzc.longValue() >= 0) {
                        zzaucVar.zzX(zzaxeVar.zzc.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
