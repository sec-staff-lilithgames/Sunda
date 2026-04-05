package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k6.n;
import k6.w;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import sv.n0;
import tu.a0;
import tu.z;
import uu.o1;
import uu.p0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final MutableStateFlow<Boolean> _isRenderProcessGone;
    private final CompletableDeferred<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final StateFlow<Boolean> isRenderProcessGone;
    private final MutableStateFlow<List<WebViewClientError>> loadErrors;
    private final Deferred<List<WebViewClientError>> onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final MutableStateFlow<String> webviewType;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = StateFlowKt.MutableStateFlow(p0.emptyList());
        CompletableDeferred<List<WebViewClientError>> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._onLoadFinished = completableDeferredCompletableDeferred$default;
        this.onLoadFinished = completableDeferredCompletableDeferred$default;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isRenderProcessGone = MutableStateFlow;
        this.isRenderProcessGone = FlowKt.asStateFlow(MutableStateFlow);
        this.webviewType = StateFlowKt.MutableStateFlow("");
    }

    public final Deferred<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final StateFlow<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String str;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(url, "url");
        if (e0.areEqual(url, BLANK_PAGE)) {
            MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
            while (true) {
                List<WebViewClientError> value = mutableStateFlow.getValue();
                str = url;
                if (mutableStateFlow.compareAndSet(value, y0.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        this._onLoadFinished.complete(this.loadErrors.getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView view, WebResourceRequest request, n error) {
        List<WebViewClientError> value;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        ErrorReason errorReasonWebResourceToErrorReason = w.isFeatureSupported("WEB_RESOURCE_ERROR_GET_CODE") ? IntExtensionKt.webResourceToErrorReason(error.getErrorCode()) : ErrorReason.REASON_UNKNOWN;
        MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, y0.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(request.getUrl().toString(), errorReasonWebResourceToErrorReason, null, 4, null))));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        List<WebViewClientError> value;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        WebViewClientError webViewClientError = new WebViewClientError(request.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(errorResponse.getStatusCode()));
        MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, y0.plus((Collection<? extends WebViewClientError>) value, webViewClientError)));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        List<WebViewClientError> value;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (this._onLoadFinished.isCompleted()) {
            this._isRenderProcessGone.setValue(Boolean.TRUE);
            return true;
        }
        MutableStateFlow<List<WebViewClientError>> mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, y0.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        this._onLoadFinished.complete(this.loadErrors.getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Map mapEmptyMap;
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(url.getQueryParameter("webviewType"));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            String str = (String) objM7131constructorimpl;
            if (str != null && !n0.isBlank(str)) {
                this.webviewType.setValue(str);
            }
            if (e0.areEqual(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            e0.checkNotNullExpressionValue(url2, "request.url");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null || (mapEmptyMap = o1.mapOf(tu.e0.to("reason", message))) == null) {
                mapEmptyMap = p1.emptyMap();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, mapEmptyMap, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
