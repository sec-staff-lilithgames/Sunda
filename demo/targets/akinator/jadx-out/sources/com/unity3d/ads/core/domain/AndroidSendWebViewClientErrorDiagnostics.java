package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(List<WebViewClientError> errors) {
        e0.checkNotNullParameter(errors, "errors");
        for (WebViewClientError webViewClientError : errors) {
            String url = webViewClientError.getUrl();
            Map mapMapOf = (url == null || url.length() == 0) ? null : o1.mapOf(tu.e0.to("webview_url", webViewClientError.getUrl()));
            Map mapMutableMapOf = p1.mutableMapOf(tu.e0.to("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                mapMutableMapOf.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, mapMapOf, mapMutableMapOf, null, null, 50, null);
        }
    }
}
