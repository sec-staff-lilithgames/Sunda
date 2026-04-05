package com.moloco.sdk.publisher;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoAdError {
    public static final int $stable = 0;
    private final String adUnitId;
    private final String description;
    private final ErrorType errorType;
    private final String networkName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdCreateError {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ AdCreateError[] $VALUES;
        public static final AdCreateError SDK_INIT_FAILED = new AdCreateError("SDK_INIT_FAILED", 0, "Failed to create `ad` object due to SDK initialization failure.", 1011);
        public static final AdCreateError SDK_INIT_WAS_NOT_COMPLETED = new AdCreateError("SDK_INIT_WAS_NOT_COMPLETED", 1, "Failed to create `ad` object due to `Moloco.initialize()` not complete.", TTAdConstant.IMAGE_MODE_1012);
        public static final AdCreateError UNABLE_TO_CREATE_AD = new AdCreateError("UNABLE_TO_CREATE_AD", 2, "Failed to create `ad` object due to `Moloco.initialize()` not complete in time", C3227g4.f36755i);
        private final String description;
        private final int errorCode;

        private static final /* synthetic */ AdCreateError[] $values() {
            return new AdCreateError[]{SDK_INIT_FAILED, SDK_INIT_WAS_NOT_COMPLETED, UNABLE_TO_CREATE_AD};
        }

        static {
            AdCreateError[] adCreateErrorArr$values = $values();
            $VALUES = adCreateErrorArr$values;
            $ENTRIES = cv.b.enumEntries(adCreateErrorArr$values);
        }

        private AdCreateError(String str, int i10, String str2, int i11) {
            this.description = str2;
            this.errorCode = i11;
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static AdCreateError valueOf(String str) {
            return (AdCreateError) Enum.valueOf(AdCreateError.class, str);
        }

        public static AdCreateError[] values() {
            return (AdCreateError[]) $VALUES.clone();
        }

        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorType {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        private final String description;
        private final int errorCode;
        public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 0, "Generic failure error code", -1);
        public static final ErrorType SDK_INIT_ERROR = new ErrorType("SDK_INIT_ERROR", 1, "SDK initialization error", 1000);
        public static final ErrorType SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT = new ErrorType("SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT", 2, "WorkManager crash that prevents us from creating a persistent http request client", 1001);
        public static final ErrorType SDK_INVALID_CONFIGURATION = new ErrorType("SDK_INVALID_CONFIGURATION", 3, "Ad object cannot be created, due to invalid configuration", 1002);
        public static final ErrorType AD_LOAD_FAILED = new ErrorType("AD_LOAD_FAILED", 4, "Ad is not loaded", 2000);
        public static final ErrorType AD_LOAD_FAILED_SDK_NOT_INIT = new ErrorType("AD_LOAD_FAILED_SDK_NOT_INIT", 5, "Ad load failed because SDK was not initialized", 2001);
        public static final ErrorType AD_LOAD_TIMEOUT_ERROR = new ErrorType("AD_LOAD_TIMEOUT_ERROR", 6, "Ad failed to load because the request timed out", 2003);
        public static final ErrorType AD_LOAD_LIMIT_REACHED = new ErrorType("AD_LOAD_LIMIT_REACHED", 7, "Ad load limit reached", 2004);
        public static final ErrorType AD_LOAD_BID_FAILED = new ErrorType("AD_LOAD_BID_FAILED", 8, "Ad failed to load because bid request failed or no fill", 2005);
        public static final ErrorType AD_LOAD_WEBVIEW_FAILED = new ErrorType("AD_LOAD_WEBVIEW_FAILED", 9, "Ad failed to load because Webview was *not* available", 2006);
        public static final ErrorType AD_SHOW_ERROR = new ErrorType("AD_SHOW_ERROR", 10, "Ad show failed despite a successful ad load. Internal renderer error", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        public static final ErrorType AD_SHOW_ERROR_NOT_LOADED = new ErrorType("AD_SHOW_ERROR_NOT_LOADED", 11, "Ad show failed because ad load was not called", 3001);
        public static final ErrorType AD_SHOW_ERROR_ALREADY_DISPLAYING = new ErrorType("AD_SHOW_ERROR_ALREADY_DISPLAYING", 12, "Ad show failed because show() was invoked multiple times when ad was already rendering", 3002);
        public static final ErrorType AD_BID_PARSE_ERROR = new ErrorType("AD_BID_PARSE_ERROR", 13, "The bid response received was not parseable by the SDK", 4000);
        public static final ErrorType AD_SIGNAL_COLLECTION_FAILED = new ErrorType("AD_SIGNAL_COLLECTION_FAILED", 14, "The bid token couldn’t be retrieved.", 5000);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{UNKNOWN, SDK_INIT_ERROR, SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT, SDK_INVALID_CONFIGURATION, AD_LOAD_FAILED, AD_LOAD_FAILED_SDK_NOT_INIT, AD_LOAD_TIMEOUT_ERROR, AD_LOAD_LIMIT_REACHED, AD_LOAD_BID_FAILED, AD_LOAD_WEBVIEW_FAILED, AD_SHOW_ERROR, AD_SHOW_ERROR_NOT_LOADED, AD_SHOW_ERROR_ALREADY_DISPLAYING, AD_BID_PARSE_ERROR, AD_SIGNAL_COLLECTION_FAILED};
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = cv.b.enumEntries(errorTypeArr$values);
        }

        private ErrorType(String str, int i10, String str2, int i11) {
            this.description = str2;
            this.errorCode = i11;
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }

        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public MolocoAdError(String networkName, String adUnitId, ErrorType errorType, String description) {
        e0.checkNotNullParameter(networkName, "networkName");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(errorType, "errorType");
        e0.checkNotNullParameter(description, "description");
        this.networkName = networkName;
        this.adUnitId = adUnitId;
        this.errorType = errorType;
        this.description = description;
    }

    public static /* synthetic */ MolocoAdError copy$default(MolocoAdError molocoAdError, String str, String str2, ErrorType errorType, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = molocoAdError.networkName;
        }
        if ((i10 & 2) != 0) {
            str2 = molocoAdError.adUnitId;
        }
        if ((i10 & 4) != 0) {
            errorType = molocoAdError.errorType;
        }
        if ((i10 & 8) != 0) {
            str3 = molocoAdError.description;
        }
        return molocoAdError.copy(str, str2, errorType, str3);
    }

    public final String component1() {
        return this.networkName;
    }

    public final String component2() {
        return this.adUnitId;
    }

    public final ErrorType component3() {
        return this.errorType;
    }

    public final String component4() {
        return this.description;
    }

    public final MolocoAdError copy(String networkName, String adUnitId, ErrorType errorType, String description) {
        e0.checkNotNullParameter(networkName, "networkName");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(errorType, "errorType");
        e0.checkNotNullParameter(description, "description");
        return new MolocoAdError(networkName, adUnitId, errorType, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoAdError)) {
            return false;
        }
        MolocoAdError molocoAdError = (MolocoAdError) obj;
        return e0.areEqual(this.networkName, molocoAdError.networkName) && e0.areEqual(this.adUnitId, molocoAdError.adUnitId) && this.errorType == molocoAdError.errorType && e0.areEqual(this.description, molocoAdError.description);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public int hashCode() {
        return this.description.hashCode() + ((this.errorType.hashCode() + o2.e(this.networkName.hashCode() * 31, 31, this.adUnitId)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MolocoAdError(networkName=");
        sb2.append(this.networkName);
        sb2.append(", adUnitId=");
        sb2.append(this.adUnitId);
        sb2.append(", errorType=");
        sb2.append(this.errorType);
        sb2.append(", description=");
        return o2.q(sb2, this.description, ')');
    }

    public /* synthetic */ MolocoAdError(String str, String str2, ErrorType errorType, String str3, int i10, u uVar) {
        this(str, str2, errorType, (i10 & 8) != 0 ? errorType.getDescription() : str3);
    }
}
