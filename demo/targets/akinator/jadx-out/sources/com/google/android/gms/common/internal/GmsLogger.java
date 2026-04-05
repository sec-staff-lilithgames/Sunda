package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class GmsLogger {
    private final String zza;
    private final String zzb;

    public GmsLogger(String str) {
        this(str, null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String str2 = this.zzb;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    public boolean canLog(int i10) {
        return Log.isLoggable(this.zza, i10);
    }

    public boolean canLogPii() {
        return false;
    }

    public void d(String str, String str2) {
        if (canLog(3)) {
            Log.d(str, zza(str2));
        }
    }

    public void e(String str, String str2) {
        if (canLog(6)) {
            Log.e(str, zza(str2));
        }
    }

    public void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zzb(str2, objArr));
        }
    }

    public void i(String str, String str2) {
        if (canLog(4)) {
            Log.i(str, zza(str2));
        }
    }

    public void pii(String str, String str2) {
    }

    public void v(String str, String str2) {
        if (canLog(2)) {
            Log.v(str, zza(str2));
        }
    }

    public void w(String str, String str2) {
        if (canLog(5)) {
            Log.w(str, zza(str2));
        }
    }

    public void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            Log.w(this.zza, zzb(str2, objArr));
        }
    }

    public void wtf(String str, String str2, Throwable th2) {
        if (canLog(7)) {
            Log.e(str, zza(str2), th2);
            Log.wtf(str, zza(str2), th2);
        }
    }

    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public void pii(String str, String str2, Throwable th2) {
    }

    public void d(String str, String str2, Throwable th2) {
        if (canLog(3)) {
            Log.d(str, zza(str2), th2);
        }
    }

    public void e(String str, String str2, Throwable th2) {
        if (canLog(6)) {
            Log.e(str, zza(str2), th2);
        }
    }

    public void i(String str, String str2, Throwable th2) {
        if (canLog(4)) {
            Log.i(str, zza(str2), th2);
        }
    }

    public void v(String str, String str2, Throwable th2) {
        if (canLog(2)) {
            Log.v(str, zza(str2), th2);
        }
    }

    public void w(String str, String str2, Throwable th2) {
        if (canLog(5)) {
            Log.w(str, zza(str2), th2);
        }
    }
}
