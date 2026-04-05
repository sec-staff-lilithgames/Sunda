package io.ktor.http;

import h2.rl.UeklptUrP;
import io.ktor.http.HttpStatusCode;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpStatusCodeKt {
    public static final List<HttpStatusCode> allStatusCodes() {
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return p0.listOf((Object[]) new HttpStatusCode[]{companion.getContinue(), companion.getSwitchingProtocols(), companion.getProcessing(), companion.getOK(), companion.getCreated(), companion.getAccepted(), companion.getNonAuthoritativeInformation(), companion.getNoContent(), companion.getResetContent(), companion.getPartialContent(), companion.getMultiStatus(), companion.getMultipleChoices(), companion.getMovedPermanently(), companion.getFound(), companion.getSeeOther(), companion.getNotModified(), companion.getUseProxy(), companion.getSwitchProxy(), companion.getTemporaryRedirect(), companion.getPermanentRedirect(), companion.getBadRequest(), companion.getUnauthorized(), companion.getPaymentRequired(), companion.getForbidden(), companion.getNotFound(), companion.getMethodNotAllowed(), companion.getNotAcceptable(), companion.getProxyAuthenticationRequired(), companion.getRequestTimeout(), companion.getConflict(), companion.getGone(), companion.getLengthRequired(), companion.getPreconditionFailed(), companion.getPayloadTooLarge(), companion.getRequestURITooLong(), companion.getUnsupportedMediaType(), companion.getRequestedRangeNotSatisfiable(), companion.getExpectationFailed(), companion.getUnprocessableEntity(), companion.getLocked(), companion.getFailedDependency(), companion.getTooEarly(), companion.getUpgradeRequired(), companion.getTooManyRequests(), companion.getRequestHeaderFieldTooLarge(), companion.getInternalServerError(), companion.getNotImplemented(), companion.getBadGateway(), companion.getServiceUnavailable(), companion.getGatewayTimeout(), companion.getVersionNotSupported(), companion.getVariantAlsoNegotiates(), companion.getInsufficientStorage()});
    }

    public static final HttpStatusCode getExceptionFailed(HttpStatusCode.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return companion.getExpectationFailed();
    }

    @f
    public static /* synthetic */ void getExceptionFailed$annotations(HttpStatusCode.Companion companion) {
    }

    public static final boolean isSuccess(HttpStatusCode httpStatusCode) {
        e0.checkNotNullParameter(httpStatusCode, UeklptUrP.TmucsERVhem);
        int value = httpStatusCode.getValue();
        return 200 <= value && value < 300;
    }
}
