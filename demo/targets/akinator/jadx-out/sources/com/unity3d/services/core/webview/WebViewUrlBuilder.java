package com.unity3d.services.core.webview;

import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbU = o2.u("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbU.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder sbU2 = o2.u(sbU.toString());
        sbU2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = j1.o2.l(str, sbU2.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return C3191e4.i.f36527c + str + C3191e4.i.f36525b + URLEncoder.encode(str2, C.UTF8_NAME);
            } catch (UnsupportedEncodingException e10) {
                DeviceLog.exception("Unsupported charset when encoding " + str, e10);
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
