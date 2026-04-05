package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.android.gms.common.internal.Preconditions;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgu extends zzjf {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgs zzd;
    private final zzgs zze;
    private final zzgs zzf;
    private final zzgs zzg;
    private final zzgs zzh;
    private final zzgs zzi;
    private final zzgs zzj;
    private final zzgs zzk;
    private final zzgs zzl;

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgs(this, 6, false, false);
        this.zze = new zzgs(this, 6, true, false);
        this.zzf = new zzgs(this, 6, false, true);
        this.zzg = new zzgs(this, 5, false, false);
        this.zzh = new zzgs(this, 5, true, false);
        this.zzi = new zzgs(this, 5, false, true);
        this.zzj = new zzgs(this, 4, false, false);
        this.zzk = new zzgs(this, 3, false, false);
        this.zzl = new zzgs(this, 2, false, false);
    }

    public static Object zzl(String str) {
        if (str == null) {
            return null;
        }
        return new zzgt(str);
    }

    public static String zzo(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strZzp = zzp(z10, obj);
        String strZzp2 = zzp(z10, obj2);
        String strZzp3 = zzp(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb2.append(str2);
            sb2.append(strZzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strZzp2);
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb2.append(str3);
            sb2.append(strZzp3);
        }
        return sb2.toString();
    }

    public static String zzp(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l9.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(o2.C(str.length() + length + 3, String.valueOf(jRound2).length(), str));
            e2.A(sb2, str, jRound, APSSharedUtil.TRUNCATE_SEPARATOR);
            return e2.i(jRound2, str, sb2);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof zzgt ? ((zzgt) obj).zza() : z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strZzq = zzq(zzic.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    public static String zzq(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return false;
    }

    public final zzgs zzb() {
        return this.zzd;
    }

    public final zzgs zzc() {
        return this.zze;
    }

    public final zzgs zzd() {
        return this.zzf;
    }

    public final zzgs zze() {
        return this.zzg;
    }

    public final zzgs zzf() {
        return this.zzh;
    }

    public final zzgs zzh() {
        return this.zzi;
    }

    public final zzgs zzi() {
        return this.zzj;
    }

    public final zzgs zzj() {
        return this.zzk;
    }

    public final zzgs zzk() {
        return this.zzl;
    }

    public final void zzm(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(zzn(), i10)) {
            Log.println(i10, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhz zzhzVarZzi = this.zzu.zzi();
        if (zzhzVarZzi == null) {
            Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzhzVarZzi.zzv()) {
                Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            zzhzVarZzi.zzj(new zzgr(this, i10, str, obj, obj2, obj3));
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzn() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzu.zzc().zzb();
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final /* synthetic */ char zzr() {
        return this.zza;
    }

    public final /* synthetic */ void zzs(char c10) {
        this.zza = c10;
    }

    public final /* synthetic */ long zzt() {
        return this.zzb;
    }

    public final /* synthetic */ void zzu(long j10) {
        this.zzb = 133005L;
    }
}
