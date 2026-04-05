package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgmd {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgmu.zzd(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgmu.zzd(str, Integer.valueOf(i10)));
        }
    }

    public static void zze(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgmu.zzd(str, Long.valueOf(j10)));
        }
    }

    public static void zzf(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzgmu.zzd(str, obj));
        }
    }

    public static void zzg(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(zzgmu.zzd(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void zzh(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void zzj(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalStateException(zzgmu.zzd(str, obj, obj2));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgmu.zzd(str, obj2));
    }

    public static int zzm(int i10, int i11, String str) {
        String strZzd;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzd = zzgmu.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(o2.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
            }
            strZzd = zzgmu.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzp(i10, i11, "index"));
        }
        return i10;
    }

    public static void zzo(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzp(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzp(i11, i12, "end index") : zzgmu.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String zzp(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzgmu.zzd("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzgmu.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(o2.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }
}
