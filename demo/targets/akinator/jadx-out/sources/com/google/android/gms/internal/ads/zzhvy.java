package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhvy {
    static final zzhvy zza = new zzhvy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzhvy zzd;
    private final Map zze;

    public zzhvy() {
        this.zze = new HashMap();
    }

    public static zzhvy zza() {
        int i10 = zzhuv.zza;
        return zza;
    }

    public static zzhvy zzb() {
        zzhvy zzhvyVar = zzd;
        if (zzhvyVar != null) {
            return zzhvyVar;
        }
        synchronized (zzhvy.class) {
            try {
                zzhvy zzhvyVar2 = zzd;
                if (zzhvyVar2 != null) {
                    return zzhvyVar2;
                }
                int i10 = zzhuv.zza;
                zzhvy zzhvyVarZzb = zzhwg.zzb(zzhvy.class);
                zzd = zzhvyVarZzb;
                return zzhvyVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzhwm zzc(zzhxz zzhxzVar, int i10) {
        return (zzhwm) this.zze.get(new zzhvx(zzhxzVar, i10));
    }

    public zzhvy(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
