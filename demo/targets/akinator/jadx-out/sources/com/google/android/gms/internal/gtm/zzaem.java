package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzaem {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i10, int i11);

    public abstract void zze(Object obj, int i10, long j10);

    public abstract void zzf(Object obj, int i10, Object obj2);

    public abstract void zzg(Object obj, int i10, zzyx zzyxVar);

    public abstract void zzh(Object obj, int i10, long j10);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzadw zzadwVar, int i10) throws IOException {
        int iZzd = zzadwVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 == 0) {
            zzh(obj, i11, zzadwVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zze(obj, i11, zzadwVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zzg(obj, i11, zzadwVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i11, zzadwVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzadwVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzadwVar, i14)) {
        }
        if ((i13 | 4) != zzadwVar.zzd()) {
            throw new zzacq("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i11, zzc(objZzb));
        return true;
    }
}
