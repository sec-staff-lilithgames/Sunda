package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.TimeoutCancellationException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final InitializationException parseFrom(Exception e10) {
            String str;
            e0.checkNotNullParameter(e10, "e");
            if (e10 instanceof TimeoutCancellationException ? true : e10 instanceof NetworkTimeoutException) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, e10, "timeout", e10.getMessage());
            }
            if (e10 instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e10;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            if (!(e10 instanceof UnityAdsNetworkException)) {
                return e10 instanceof InitializationException ? (InitializationException) e10 : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, e10, "unknown", e10.getMessage());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e10;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, e10, str, unityAdsNetworkException.getMessage());
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th2, String str2, String str3, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th2, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th2, str2, str3);
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

    public final InitializationException copy(String message, Throwable th2, String reason, String str) {
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(reason, "reason");
        return new InitializationException(message, th2, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return e0.areEqual(getMessage(), initializationException.getMessage()) && e0.areEqual(this.throwable, initializationException.throwable) && e0.areEqual(this.reason, initializationException.reason) && e0.areEqual(this.reasonDebug, initializationException.reasonDebug);
    }

    @Override // java.lang.Throwable
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
        StringBuilder sb2 = new StringBuilder("InitializationException(message=");
        sb2.append(getMessage());
        sb2.append(", throwable=");
        sb2.append(this.throwable);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", reasonDebug=");
        return o2.q(sb2, this.reasonDebug, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th2, String reason, String str) {
        super(message);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th2;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
