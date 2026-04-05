package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayu extends zzazr {
    private final long zzh;

    public zzayu(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, long j10, int i10, int i11) {
        super(zzaydVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", zzaucVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            try {
                zzaucVar.zzac(jLongValue);
                long j10 = this.zzh;
                if (j10 != 0) {
                    zzaucVar.zzk(jLongValue - j10);
                    zzaucVar.zzn(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
