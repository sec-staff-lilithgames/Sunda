package io.ktor.http;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.v;
import uu.o1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpStatusCode implements Comparable<HttpStatusCode> {
    private static final List<HttpStatusCode> allStatusCodes;
    private static final Map<Integer, HttpStatusCode> statusCodesMap;
    private final String description;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final HttpStatusCode Continue = new HttpStatusCode(100, "Continue");
    private static final HttpStatusCode SwitchingProtocols = new HttpStatusCode(101, "Switching Protocols");
    private static final HttpStatusCode Processing = new HttpStatusCode(102, "Processing");
    private static final HttpStatusCode OK = new HttpStatusCode(200, "OK");
    private static final HttpStatusCode Created = new HttpStatusCode(201, "Created");
    private static final HttpStatusCode Accepted = new HttpStatusCode(202, "Accepted");
    private static final HttpStatusCode NonAuthoritativeInformation = new HttpStatusCode(203, "Non-Authoritative Information");
    private static final HttpStatusCode NoContent = new HttpStatusCode(204, "No Content");
    private static final HttpStatusCode ResetContent = new HttpStatusCode(205, "Reset Content");
    private static final HttpStatusCode PartialContent = new HttpStatusCode(206, "Partial Content");
    private static final HttpStatusCode MultiStatus = new HttpStatusCode(207, "Multi-Status");
    private static final HttpStatusCode MultipleChoices = new HttpStatusCode(300, "Multiple Choices");
    private static final HttpStatusCode MovedPermanently = new HttpStatusCode(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, "Moved Permanently");
    private static final HttpStatusCode Found = new HttpStatusCode(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, "Found");
    private static final HttpStatusCode SeeOther = new HttpStatusCode(303, "See Other");
    private static final HttpStatusCode NotModified = new HttpStatusCode(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "Not Modified");
    private static final HttpStatusCode UseProxy = new HttpStatusCode(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "Use Proxy");
    private static final HttpStatusCode SwitchProxy = new HttpStatusCode(306, "Switch Proxy");
    private static final HttpStatusCode TemporaryRedirect = new HttpStatusCode(307, "Temporary Redirect");
    private static final HttpStatusCode PermanentRedirect = new HttpStatusCode(308, "Permanent Redirect");
    private static final HttpStatusCode BadRequest = new HttpStatusCode(400, "Bad Request");
    private static final HttpStatusCode Unauthorized = new HttpStatusCode(401, "Unauthorized");
    private static final HttpStatusCode PaymentRequired = new HttpStatusCode(TTAdConstant.AD_ID_IS_NULL_CODE, "Payment Required");
    private static final HttpStatusCode Forbidden = new HttpStatusCode(403, "Forbidden");
    private static final HttpStatusCode NotFound = new HttpStatusCode(404, "Not Found");
    private static final HttpStatusCode MethodNotAllowed = new HttpStatusCode(405, "Method Not Allowed");
    private static final HttpStatusCode NotAcceptable = new HttpStatusCode(406, "Not Acceptable");
    private static final HttpStatusCode ProxyAuthenticationRequired = new HttpStatusCode(407, "Proxy Authentication Required");
    private static final HttpStatusCode RequestTimeout = new HttpStatusCode(408, "Request Timeout");
    private static final HttpStatusCode Conflict = new HttpStatusCode(409, "Conflict");
    private static final HttpStatusCode Gone = new HttpStatusCode(410, "Gone");
    private static final HttpStatusCode LengthRequired = new HttpStatusCode(411, "Length Required");
    private static final HttpStatusCode PreconditionFailed = new HttpStatusCode(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");
    private static final HttpStatusCode PayloadTooLarge = new HttpStatusCode(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large");
    private static final HttpStatusCode RequestURITooLong = new HttpStatusCode(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
    private static final HttpStatusCode UnsupportedMediaType = new HttpStatusCode(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
    private static final HttpStatusCode RequestedRangeNotSatisfiable = new HttpStatusCode(TTAdConstant.PACKAGE_NAME_CODE, "Requested Range Not Satisfiable");
    private static final HttpStatusCode ExpectationFailed = new HttpStatusCode(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
    private static final HttpStatusCode UnprocessableEntity = new HttpStatusCode(422, "Unprocessable Entity");
    private static final HttpStatusCode Locked = new HttpStatusCode(423, "Locked");
    private static final HttpStatusCode FailedDependency = new HttpStatusCode(424, "Failed Dependency");
    private static final HttpStatusCode TooEarly = new HttpStatusCode(425, "Too Early");
    private static final HttpStatusCode UpgradeRequired = new HttpStatusCode(426, "Upgrade Required");
    private static final HttpStatusCode TooManyRequests = new HttpStatusCode(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests");
    private static final HttpStatusCode RequestHeaderFieldTooLarge = new HttpStatusCode(431, "Request Header Fields Too Large");
    private static final HttpStatusCode InternalServerError = new HttpStatusCode(500, "Internal Server Error");
    private static final HttpStatusCode NotImplemented = new HttpStatusCode(501, "Not Implemented");
    private static final HttpStatusCode BadGateway = new HttpStatusCode(502, "Bad Gateway");
    private static final HttpStatusCode ServiceUnavailable = new HttpStatusCode(503, "Service Unavailable");
    private static final HttpStatusCode GatewayTimeout = new HttpStatusCode(504, "Gateway Timeout");
    private static final HttpStatusCode VersionNotSupported = new HttpStatusCode(505, "HTTP Version Not Supported");
    private static final HttpStatusCode VariantAlsoNegotiates = new HttpStatusCode(506, "Variant Also Negotiates");
    private static final HttpStatusCode InsufficientStorage = new HttpStatusCode(507, "Insufficient Storage");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final HttpStatusCode fromValue(int i10) {
            HttpStatusCode httpStatusCode = (HttpStatusCode) HttpStatusCode.statusCodesMap.get(Integer.valueOf(i10));
            return httpStatusCode == null ? new HttpStatusCode(i10, "Unknown Status Code") : httpStatusCode;
        }

        public final HttpStatusCode getAccepted() {
            return HttpStatusCode.Accepted;
        }

        public final List<HttpStatusCode> getAllStatusCodes() {
            return HttpStatusCode.allStatusCodes;
        }

        public final HttpStatusCode getBadGateway() {
            return HttpStatusCode.BadGateway;
        }

        public final HttpStatusCode getBadRequest() {
            return HttpStatusCode.BadRequest;
        }

        public final HttpStatusCode getConflict() {
            return HttpStatusCode.Conflict;
        }

        public final HttpStatusCode getContinue() {
            return HttpStatusCode.Continue;
        }

        public final HttpStatusCode getCreated() {
            return HttpStatusCode.Created;
        }

        public final HttpStatusCode getExpectationFailed() {
            return HttpStatusCode.ExpectationFailed;
        }

        public final HttpStatusCode getFailedDependency() {
            return HttpStatusCode.FailedDependency;
        }

        public final HttpStatusCode getForbidden() {
            return HttpStatusCode.Forbidden;
        }

        public final HttpStatusCode getFound() {
            return HttpStatusCode.Found;
        }

        public final HttpStatusCode getGatewayTimeout() {
            return HttpStatusCode.GatewayTimeout;
        }

        public final HttpStatusCode getGone() {
            return HttpStatusCode.Gone;
        }

        public final HttpStatusCode getInsufficientStorage() {
            return HttpStatusCode.InsufficientStorage;
        }

        public final HttpStatusCode getInternalServerError() {
            return HttpStatusCode.InternalServerError;
        }

        public final HttpStatusCode getLengthRequired() {
            return HttpStatusCode.LengthRequired;
        }

        public final HttpStatusCode getLocked() {
            return HttpStatusCode.Locked;
        }

        public final HttpStatusCode getMethodNotAllowed() {
            return HttpStatusCode.MethodNotAllowed;
        }

        public final HttpStatusCode getMovedPermanently() {
            return HttpStatusCode.MovedPermanently;
        }

        public final HttpStatusCode getMultiStatus() {
            return HttpStatusCode.MultiStatus;
        }

        public final HttpStatusCode getMultipleChoices() {
            return HttpStatusCode.MultipleChoices;
        }

        public final HttpStatusCode getNoContent() {
            return HttpStatusCode.NoContent;
        }

        public final HttpStatusCode getNonAuthoritativeInformation() {
            return HttpStatusCode.NonAuthoritativeInformation;
        }

        public final HttpStatusCode getNotAcceptable() {
            return HttpStatusCode.NotAcceptable;
        }

        public final HttpStatusCode getNotFound() {
            return HttpStatusCode.NotFound;
        }

        public final HttpStatusCode getNotImplemented() {
            return HttpStatusCode.NotImplemented;
        }

        public final HttpStatusCode getNotModified() {
            return HttpStatusCode.NotModified;
        }

        public final HttpStatusCode getOK() {
            return HttpStatusCode.OK;
        }

        public final HttpStatusCode getPartialContent() {
            return HttpStatusCode.PartialContent;
        }

        public final HttpStatusCode getPayloadTooLarge() {
            return HttpStatusCode.PayloadTooLarge;
        }

        public final HttpStatusCode getPaymentRequired() {
            return HttpStatusCode.PaymentRequired;
        }

        public final HttpStatusCode getPermanentRedirect() {
            return HttpStatusCode.PermanentRedirect;
        }

        public final HttpStatusCode getPreconditionFailed() {
            return HttpStatusCode.PreconditionFailed;
        }

        public final HttpStatusCode getProcessing() {
            return HttpStatusCode.Processing;
        }

        public final HttpStatusCode getProxyAuthenticationRequired() {
            return HttpStatusCode.ProxyAuthenticationRequired;
        }

        public final HttpStatusCode getRequestHeaderFieldTooLarge() {
            return HttpStatusCode.RequestHeaderFieldTooLarge;
        }

        public final HttpStatusCode getRequestTimeout() {
            return HttpStatusCode.RequestTimeout;
        }

        public final HttpStatusCode getRequestURITooLong() {
            return HttpStatusCode.RequestURITooLong;
        }

        public final HttpStatusCode getRequestedRangeNotSatisfiable() {
            return HttpStatusCode.RequestedRangeNotSatisfiable;
        }

        public final HttpStatusCode getResetContent() {
            return HttpStatusCode.ResetContent;
        }

        public final HttpStatusCode getSeeOther() {
            return HttpStatusCode.SeeOther;
        }

        public final HttpStatusCode getServiceUnavailable() {
            return HttpStatusCode.ServiceUnavailable;
        }

        public final HttpStatusCode getSwitchProxy() {
            return HttpStatusCode.SwitchProxy;
        }

        public final HttpStatusCode getSwitchingProtocols() {
            return HttpStatusCode.SwitchingProtocols;
        }

        public final HttpStatusCode getTemporaryRedirect() {
            return HttpStatusCode.TemporaryRedirect;
        }

        public final HttpStatusCode getTooEarly() {
            return HttpStatusCode.TooEarly;
        }

        public final HttpStatusCode getTooManyRequests() {
            return HttpStatusCode.TooManyRequests;
        }

        public final HttpStatusCode getUnauthorized() {
            return HttpStatusCode.Unauthorized;
        }

        public final HttpStatusCode getUnprocessableEntity() {
            return HttpStatusCode.UnprocessableEntity;
        }

        public final HttpStatusCode getUnsupportedMediaType() {
            return HttpStatusCode.UnsupportedMediaType;
        }

        public final HttpStatusCode getUpgradeRequired() {
            return HttpStatusCode.UpgradeRequired;
        }

        public final HttpStatusCode getUseProxy() {
            return HttpStatusCode.UseProxy;
        }

        public final HttpStatusCode getVariantAlsoNegotiates() {
            return HttpStatusCode.VariantAlsoNegotiates;
        }

        public final HttpStatusCode getVersionNotSupported() {
            return HttpStatusCode.VersionNotSupported;
        }

        private Companion() {
        }
    }

    static {
        List<HttpStatusCode> listAllStatusCodes = HttpStatusCodeKt.allStatusCodes();
        allStatusCodes = listAllStatusCodes;
        List<HttpStatusCode> list = listAllStatusCodes;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((HttpStatusCode) obj).value), obj);
        }
        statusCodesMap = linkedHashMap;
    }

    public HttpStatusCode(int i10, String description) {
        e0.checkNotNullParameter(description, "description");
        this.value = i10;
        this.description = description;
    }

    public static /* synthetic */ HttpStatusCode copy$default(HttpStatusCode httpStatusCode, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = httpStatusCode.value;
        }
        if ((i11 & 2) != 0) {
            str = httpStatusCode.description;
        }
        return httpStatusCode.copy(i10, str);
    }

    public final int component1() {
        return this.value;
    }

    public final String component2() {
        return this.description;
    }

    public final HttpStatusCode copy(int i10, String description) {
        e0.checkNotNullParameter(description, "description");
        return new HttpStatusCode(i10, description);
    }

    public final HttpStatusCode description(String value) {
        e0.checkNotNullParameter(value, "value");
        return copy$default(this, 0, value, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpStatusCode) && ((HttpStatusCode) obj).value == this.value;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public String toString() {
        return this.value + ' ' + this.description;
    }

    @Override // java.lang.Comparable
    public int compareTo(HttpStatusCode other) {
        e0.checkNotNullParameter(other, "other");
        return this.value - other.value;
    }
}
