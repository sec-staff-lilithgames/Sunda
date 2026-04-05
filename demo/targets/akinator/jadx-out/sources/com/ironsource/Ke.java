package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.Me;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ke {
    public final void a(Context context, C3466te request, De tools, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.c().i(request.f());
        tools.a();
        C3551ye c3551yeB = b(context, tools, request);
        if (c3551yeB.b() == null) {
            C3364ne c3364neA = c3551yeB.a();
            if (c3364neA == null) {
                c3364neA = new C3364ne(510, "unknown error");
            }
            listener.a(c3364neA);
            return;
        }
        C3326le c3326le = new C3326le(c3551yeB.b());
        if (c3551yeB.c()) {
            listener.a(c3326le);
        } else {
            listener.a(new C3364ne(C3364ne.f37986e, "serverResponseIsNotValid"));
        }
    }

    private final C3551ye b(Context context, De de2, C3466te c3466te) {
        C3551ye c3551yeA = a(context, de2, c3466te);
        if (c3551yeA.c()) {
            return c3551yeA;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        Me meA = de2.a(context, c3466te.d());
        if (meA == null) {
            return c3551yeA;
        }
        C3551ye c3551ye = new C3551ye(new C3483ue(meA));
        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c3466te.d(), c3466te.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + c3551ye.b(), 1);
        de2.g();
        return c3551ye;
    }

    private final C3551ye a(Context context, De de2, C3466te c3466te) {
        C3364ne c3364ne;
        try {
            String strA = de2.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = de2.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            C3161ca c3161caD = de2.d();
            ArrayList<Pair<String, String>> arrayListF = c3161caD != null ? c3161caD.f() : null;
            kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
            String strA2 = C3266i7.a(Oe.a(context, c3466te.d(), c3466te.f(), str, null, true, arrayListF, false), C3250h9.a().toString(), new ah(b1Var, 1));
            if (strA2 == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new C3551ye(a((String) b1Var.f71816b));
            }
            if (de2.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strA2);
                String encryptedResponse = jSONObject.optString(Me.f34938n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new C3551ye(new C3364ne(2100, C3416qe.f38235h));
                }
                boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                strA2 = a(encryptedResponse, zOptBoolean);
                if (TextUtils.isEmpty(strA2)) {
                    ironLog.warning("encoded response invalid - return null");
                    de2.f();
                    return new C3551ye(new C3364ne(C3364ne.f37987f, C3416qe.f38234g));
                }
            }
            Me me2 = new Me(context, c3466te.d(), c3466te.f(), strA2);
            me2.a(Me.a.SERVER);
            if (!me2.p()) {
                IronLog.INTERNAL.warning("response invalid - return null");
                return new C3551ye(new C3364ne(C3364ne.f37986e, "serverResponseIsNotValid"));
            }
            return new C3551ye(new C3483ue(me2));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.warning("exception = " + e10);
            if (e10 instanceof JSONException) {
                c3364ne = new C3364ne(C3364ne.f37986e, "serverResponseIsNotValid");
            } else {
                c3364ne = new C3364ne(510, "internal error");
            }
            return new C3551ye(c3364ne);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kotlin.jvm.internal.b1 reason, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "$reason");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        reason.f71816b = errorMessage;
    }

    private final String a(String str, boolean z10) {
        if (z10) {
            String strD = L9.d(C3390p5.b().c(), str);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strD, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strD;
        }
        String strB = L9.b(C3390p5.b().c(), str);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strB, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strB;
    }

    private final C3364ne a(String str) {
        if (str != null) {
            return new C3364ne(C3364ne.f37989h, str);
        }
        return new C3364ne(C3364ne.f37985d, "noServerResponse");
    }
}
