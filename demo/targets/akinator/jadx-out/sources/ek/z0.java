package ek;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f54684a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.a f54685b;

    static {
        ui.a aVarBuild = new wi.e().configureWith(i.f54547a).ignoreNullValues(true).build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVarBuild, "build(...)");
        f54685b = aVarBuild;
    }

    public static /* synthetic */ y0 buildSession$default(z0 z0Var, com.google.firebase.g gVar, x0 x0Var, ik.o oVar, Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = uu.p1.emptyMap();
        }
        return z0Var.buildSession(gVar, x0Var, oVar, map, (i10 & 16) != 0 ? "" : str, (i10 & 32) != 0 ? "" : str2);
    }

    public final y0 buildSession(com.google.firebase.g firebaseApp, x0 sessionDetails, ik.o sessionsSettings, Map<fk.e, ? extends fk.g> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(subscribers, "subscribers");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        r rVar = r.f54620c;
        String sessionId = sessionDetails.getSessionId();
        String firstSessionId = sessionDetails.getFirstSessionId();
        int sessionIndex = sessionDetails.getSessionIndex();
        long sessionStartTimestampUs = sessionDetails.getSessionStartTimestampUs();
        fk.g gVar = subscribers.get(fk.e.f55732c);
        m mVar = gVar == null ? m.f54581c : gVar.isDataCollectionEnabled() ? m.f54582e : m.f54583f;
        fk.g gVar2 = subscribers.get(fk.e.f55731b);
        return new y0(rVar, new h1(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs, new n(mVar, gVar2 == null ? m.f54581c : gVar2.isDataCollectionEnabled() ? m.f54582e : m.f54583f, sessionsSettings.getSamplingRate()), firebaseInstallationId, firebaseAuthenticationToken), getApplicationInfo(firebaseApp));
    }

    public final b getApplicationInfo(com.google.firebase.g firebaseApp) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationId, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        i0 i0Var = i0.f54548c;
        kotlin.jvm.internal.e0.checkNotNull(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        Context applicationContext2 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        r0 r0Var = r0.f54624a;
        q0 myProcessDetails = r0Var.getMyProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        return new b(applicationId, MODEL, "3.0.3", RELEASE, i0Var, new a(packageName, str2, strValueOf, MANUFACTURER, myProcessDetails, r0Var.getAppProcessDetails(applicationContext3)));
    }

    public final ui.a getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return f54685b;
    }
}
