package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class VungleError extends Exception {
    private final int code;
    private final String errorMessage;
    private LogEntry logEntry;
    private final Sdk.SDKError.Reason loggableReason;

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, u uVar) {
        this(reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e0.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) obj;
        return this.loggableReason == vungleError.loggableReason && e0.areEqual(this.errorMessage, vungleError.errorMessage) && e0.areEqual(this.logEntry, vungleError.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iE = o2.e(this.loggableReason.hashCode() * 31, 31, this.errorMessage);
        LogEntry logEntry = this.logEntry;
        return iE + (logEntry != null ? logEntry.hashCode() : 0);
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    public final VungleError setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
        return this;
    }

    private VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.loggableReason = reason;
        this.errorMessage = str;
        this.code = reason.getNumber();
    }
}
