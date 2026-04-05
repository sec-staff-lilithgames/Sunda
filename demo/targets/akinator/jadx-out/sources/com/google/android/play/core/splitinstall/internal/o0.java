package com.google.android.play.core.splitinstall.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.IllegalFormatException;
import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29628a;

    public static String a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = e3.g.k(str2, " [", TextUtils.join(", ", objArr), C3191e4.i.f36531e);
            }
        }
        return w0.i.d(str, " : ", str2);
    }

    public final int zza(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", a(this.f29628a, str, objArr));
        }
        return 0;
    }

    public final int zzb(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.f29628a, str, objArr));
        }
        return 0;
    }

    public final int zzc(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.f29628a, str, objArr), th2);
        }
        return 0;
    }

    public final int zzd(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", a(this.f29628a, str, objArr));
        }
        return 0;
    }

    public final int zze(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", a(this.f29628a, str, objArr));
        }
        return 0;
    }

    public o0(String str) {
        this.f29628a = o2.i(Process.myUid(), Process.myPid(), "UID: [", SUvoXnn.jlFYwweoemPizSp, "] ").concat(str);
    }
}
