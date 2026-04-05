package com.moloco.sdk.internal.services.bidtoken;

import android.os.Build;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import io.ktor.client.HttpClient;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f46767a = tu.q.lazy(new a1.k(18));

    public static final e0 a() {
        String str;
        String str2;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        a.e eVar = a.e.f47447a;
        HttpClient httpClientA = com.moloco.sdk.internal.http.b.a(eVar.h().invoke(), eVar.l().invoke());
        k kVar = new k(2800L, 3, 200L);
        String language = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(language, "getLanguage(...)");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Build.MODEL;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.HARDWARE;
        if (str5 == null) {
            String str6 = str4;
            str2 = "";
            str = str6;
        } else {
            str = str4;
            str2 = str5;
        }
        return new e0(new e(BuildConfig.SDK_VERSION_NAME, httpClientA, kVar, new h(language, RELEASE, str3, str, str2)), CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(com.moloco.sdk.internal.scheduling.c.a().getIo())), z.f46962a.a(new com.moloco.sdk.internal.bidtoken.c(), new com.moloco.sdk.internal.services.j()));
    }

    public static final e0 c() {
        return (e0) f46767a.getValue();
    }
}
