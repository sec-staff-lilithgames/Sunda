package io.odeeo.sdk.advertisement.data;

import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import e3.g;
import kotlin.jvm.internal.e0;
import lk.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Request {

    @c(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE)
    private final String adRequestType;

    @c("retry_delay")
    private final long retryDelay;

    @c("retry_number")
    private final int retryNumber;

    @c("session_id")
    private final String sessionId;

    public Request(String sessionId, String adRequestType, int i10, long j10) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(adRequestType, "adRequestType");
        this.sessionId = sessionId;
        this.adRequestType = adRequestType;
        this.retryNumber = i10;
        this.retryDelay = j10;
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = request.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = request.adRequestType;
        }
        if ((i11 & 4) != 0) {
            i10 = request.retryNumber;
        }
        if ((i11 & 8) != 0) {
            j10 = request.retryDelay;
        }
        int i12 = i10;
        return request.copy(str, str2, i12, j10);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.adRequestType;
    }

    public final int component3() {
        return this.retryNumber;
    }

    public final long component4() {
        return this.retryDelay;
    }

    public final Request copy(String sessionId, String adRequestType, int i10, long j10) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(adRequestType, "adRequestType");
        return new Request(sessionId, adRequestType, i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return e0.areEqual(this.sessionId, request.sessionId) && e0.areEqual(this.adRequestType, request.adRequestType) && this.retryNumber == request.retryNumber && this.retryDelay == request.retryDelay;
    }

    public final String getAdRequestType() {
        return this.adRequestType;
    }

    public final long getRetryDelay() {
        return this.retryDelay;
    }

    public final int getRetryNumber() {
        return this.retryNumber;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.retryDelay) + g.d(this.retryNumber, o2.e(this.sessionId.hashCode() * 31, 31, this.adRequestType), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request(sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", adRequestType=");
        sb2.append(this.adRequestType);
        sb2.append(", retryNumber=");
        sb2.append(this.retryNumber);
        sb2.append(", retryDelay=");
        return g.n(sb2, this.retryDelay, ')');
    }
}
