package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import java.util.IllegalFormatException;
import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzglf {
    private final String zza;

    public zzglf(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(iMyUid, iMyPid, "UID: [", "]  PID: [", sb2);
        sb2.append("] ");
        this.zza = sb2.toString().concat(str);
    }

    private static String zze(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                String strJoin = TextUtils.join(", ", objArr);
                int length = String.valueOf(str2).length();
                str2 = o2.r(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, C3191e4.i.f36531e);
            }
        }
        return a.b.o(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public final int zza(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzc(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr), th2);
        }
        return 0;
    }
}
