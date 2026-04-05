package com.moloco.sdk.internal.services.bidtoken;

import b0.e2;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b0 {
    public static final boolean a(com.moloco.sdk.internal.bidtoken.a aVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        long millis = TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = TimeUnit.MINUTES.toMillis(2L);
        boolean z10 = j10 >= millis - millis2;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbR = e2.r(j10, "[sbt] currentTimeInMillis: ", ", expirationTimeMillis: ");
        sbR.append(millis);
        e2.A(sbR, ", expiredThresholdMillis: ", millis2, ", expired: ");
        sbR.append(z10);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ServerBidTokenCache", sbR.toString(), false, 4, null);
        return z10;
    }

    public static final boolean b(com.moloco.sdk.internal.bidtoken.a aVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        long millis = TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = TimeUnit.MINUTES.toMillis(15L);
        boolean z10 = !a(aVar, j10) && millis - j10 <= millis2;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbR = e2.r(j10, "[sbt] currentTimeInMillis: ", ", expiryTimeMillis: ");
        sbR.append(millis);
        e2.A(sbR, ", nearExpiryThresholdMillis: ", millis2, ", expiring: ");
        sbR.append(z10);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ServerBidTokenCache", sbR.toString(), false, 4, null);
        return z10;
    }
}
