package com.fyber.inneractive.sdk.logger;

import android.content.Context;
import android.util.Log;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends FMPLogger {
    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void debug(String str, Object... objArr) {
        if (IAlog.f26748a <= 3) {
            Log.d("Inneractive_debug", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void error(String str, Throwable th2, Object... objArr) {
        if (IAlog.f26748a <= 6) {
            if (th2 == null) {
                Log.e("Inneractive_error", String.format(str, objArr));
            } else {
                Log.e("Inneractive_error", String.format(str, objArr), th2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void info(String str, Object... objArr) {
        if (IAlog.f26748a <= 4) {
            Log.i("Inneractive_info", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void log(int i10, Exception exc, String str, Object... objArr) {
        if (IAlog.f26748a <= i10) {
            if (exc == null) {
                Log.v("Inneractive_general", String.format(str, objArr));
            } else {
                Log.v("Inneractive_general", String.format(str, objArr), exc);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Object... objArr) {
        if (IAlog.f26748a <= 2) {
            Log.v("Inneractive_verbose", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void warning(String str, Object... objArr) {
        if (IAlog.f26748a <= 4) {
            Log.w("Inneractive_warning", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Throwable th2, Object... objArr) {
        if (IAlog.f26748a <= 2) {
            Log.v("Inneractive_verbose", String.format(str, objArr), th2);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void initialize(Context context) {
    }
}
