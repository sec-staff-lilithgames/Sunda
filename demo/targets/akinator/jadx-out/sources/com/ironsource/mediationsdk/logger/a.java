package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C3191e4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends IronSourceLogger {

    /* renamed from: c, reason: collision with root package name */
    public static final String f37581c = "console";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37582d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        String strQ = a.b.q(new StringBuilder("UIThread: "), Looper.getMainLooper() == Looper.myLooper(), " ");
        String strE = i.e(new StringBuilder("Activity: "), ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE, " ");
        if (i10 == 0) {
            Log.v(f37582d + ironSourceTag, strQ + strE + str);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Log.w(f37582d + ironSourceTag, str);
                return;
            } else if (i10 == 3) {
                Log.e(f37582d + ironSourceTag, str);
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        Log.i(f37582d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        StringBuilder sbT = a.b.t(str, ":stacktrace[");
        sbT.append(Log.getStackTraceString(th2));
        sbT.append(C3191e4.i.f36531e);
        log(ironSourceTag, sbT.toString(), 3);
    }

    public a(int i10) {
        super("console", i10);
    }
}
