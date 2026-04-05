package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlr {
    static final zzlr zza = new zzlr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlr zzd;
    private final Map zze;

    public zzlr() {
        this.zze = new HashMap();
    }

    public static zzlr zza() {
        zzlr zzlrVar = zzd;
        if (zzlrVar != null) {
            return zzlrVar;
        }
        synchronized (zzlr.class) {
            try {
                zzlr zzlrVar2 = zzd;
                if (zzlrVar2 != null) {
                    return zzlrVar2;
                }
                int i10 = zznu.zza;
                zzlr zzlrVarZzb = zzlz.zzb(zzlr.class);
                zzd = zzlrVarZzb;
                return zzlrVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzme zzb(zznm zznmVar, int i10) {
        return (zzme) this.zze.get(new zzlq(zznmVar, i10));
    }

    public zzlr(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
