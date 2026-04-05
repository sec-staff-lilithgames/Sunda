package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzhzc {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i10, long j10);

    public abstract void zzb(Object obj, int i10, int i11);

    public abstract void zzc(Object obj, int i10, long j10);

    public abstract void zzd(Object obj, int i10, zzhvi zzhviVar);

    public abstract void zze(Object obj, int i10, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzhym zzhymVar, int i10) throws IOException {
        int iZzc = zzhymVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzhymVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzhymVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzhymVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzhxd("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzhxc("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzhymVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzhxd("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhymVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzhymVar, i14)) {
        }
        if ((i13 | 4) != zzhymVar.zzc()) {
            throw new zzhxd("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}
