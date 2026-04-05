package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaze extends zzazr {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzaze(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        super(zzaydVar, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", zzaucVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zza("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzauc zzaucVar = this.zzd;
        synchronized (zzaucVar) {
            zzaucVar.zza(zzh);
        }
    }
}
