package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzacy {
    public static final List zza(Object obj, long j10) {
        zzacn zzacnVar = (zzacn) zzaet.zzf(obj, j10);
        if (zzacnVar.zzc()) {
            return zzacnVar;
        }
        int size = zzacnVar.size();
        zzacn zzacnVarZzd = zzacnVar.zzd(size == 0 ? 10 : size + size);
        zzaet.zzs(obj, j10, zzacnVarZzd);
        return zzacnVarZzd;
    }
}
