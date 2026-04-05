package com.unity3d.ads.core.data.model;

import a.b;
import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class LoadResult {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Failure extends LoadResult {
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th2, String str2, String str3, boolean z10, int i10, u uVar) {
            this(unityAdsLoadError, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th2, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th2, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.throwable;
            }
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i10 & 32) != 0) {
                z10 = failure.isScarAd;
            }
            String str4 = str3;
            boolean z11 = z10;
            return failure.copy(unityAdsLoadError, str, th2, str2, str4, z11);
        }

        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        public final Failure copy(UnityAds.UnityAdsLoadError error, String str, Throwable th2, String reason, String str2, boolean z10) {
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(reason, "reason");
            return new Failure(error, str, th2, reason, str2, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && e0.areEqual(this.message, failure.message) && e0.areEqual(this.throwable, failure.throwable) && e0.areEqual(this.reason, failure.reason) && e0.areEqual(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
        }

        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final String getMessage() {
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

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.throwable;
            int iE = o2.e((iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.reason);
            String str2 = this.reasonDebug;
            int iHashCode3 = (iE + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.isScarAd;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode3 + i10;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(error=");
            sb2.append(this.error);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", throwable=");
            sb2.append(this.throwable);
            sb2.append(", reason=");
            sb2.append(this.reason);
            sb2.append(", reasonDebug=");
            sb2.append(this.reasonDebug);
            sb2.append(", isScarAd=");
            return b.p(sb2, this.isScarAd, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(UnityAds.UnityAdsLoadError error, String str, Throwable th2, String reason, String str2, boolean z10) {
            super(null);
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th2;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject) {
            super(null);
            e0.checkNotNullParameter(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            e0.checkNotNullParameter(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && e0.areEqual(this.adObject, ((Success) obj).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(u uVar) {
        this();
    }

    private LoadResult() {
    }
}
