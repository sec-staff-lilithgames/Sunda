package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzabq {
    static final zzabq zza = new zzabq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzabq zzd;
    private final Map zze;

    public zzabq() {
        this.zze = new HashMap();
    }

    public static zzabq zza() {
        zzabq zzabqVar = zzd;
        if (zzabqVar != null) {
            return zzabqVar;
        }
        synchronized (zzabq.class) {
            try {
                zzabq zzabqVar2 = zzd;
                if (zzabqVar2 != null) {
                    return zzabqVar2;
                }
                int i10 = zzadt.zza;
                zzabq zzabqVarZzb = zzaby.zzb(zzabq.class);
                zzd = zzabqVarZzb;
                return zzabqVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzace zzb(zzadl zzadlVar, int i10) {
        return (zzace) this.zze.get(new zzabp(zzadlVar, i10));
    }

    public zzabq(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
