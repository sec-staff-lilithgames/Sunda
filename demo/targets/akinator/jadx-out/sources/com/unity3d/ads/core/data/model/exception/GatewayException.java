package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GatewayException extends UnityAdsNetworkException {
    public static final Companion Companion = new Companion(null);
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GatewayException(String str, Throwable th2, String str2, String str3, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th2, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gatewayException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = gatewayException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        return gatewayException.copy(str, th2, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final GatewayException copy(String message, Throwable th2, String reason, String str) {
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(reason, "reason");
        return new GatewayException(message, th2, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) obj;
        return e0.areEqual(getMessage(), gatewayException.getMessage()) && e0.areEqual(this.throwable, gatewayException.throwable) && e0.areEqual(this.reason, gatewayException.reason) && e0.areEqual(this.reasonDebug, gatewayException.reasonDebug);
    }

    @Override // com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th2 = this.throwable;
        int iE = o2.e((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.reason);
        String str = this.reasonDebug;
        return iE + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GatewayException(message=");
        sb2.append(getMessage());
        sb2.append(", throwable=");
        sb2.append(this.throwable);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", reasonDebug=");
        return o2.q(sb2, this.reasonDebug, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(String message, Throwable th2, String reason, String str) {
        super(message, null, null, null, null, null, null, 126, null);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th2;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
