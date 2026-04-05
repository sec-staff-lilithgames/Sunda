package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;
import b0.e2;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBExpectedSizeProvider;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.DtbDeviceData;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.amazon.device.ads.DtbSharedPreferences;
import com.amazon.device.ads.WebResourceService;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsAdViewFetchUtils {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void fetchAd(ApsAdViewImpl webView, String str, Map<String, ? extends Object> map) {
            e0.checkNotNullParameter(webView, "webView");
            try {
                Bundle bundleInitializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            bundleInitializeEmptyBundle.putString(key, (String) value);
                        } else if (value instanceof Boolean) {
                            bundleInitializeEmptyBundle.putBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            bundleInitializeEmptyBundle.putInt(key, ((Number) value).intValue());
                        } else if (value instanceof Long) {
                            bundleInitializeEmptyBundle.putLong(key, ((Number) value).longValue());
                        }
                    }
                }
                webView.fetchAd(str, bundleInitializeEmptyBundle);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with map bundle", e10);
            }
        }

        public final void fetchAdWithLocation(Context context, WebView webView, boolean z10, String str) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(webView, "webView");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<script>");
                sb2.append(getEnvironment(context, null));
                sb2.append("</script>");
                loadLocalFile(context, z10, "aps-mraid", sb2);
                sb2.append("<script>");
                sb2.append("window.location=\"");
                sb2.append(str);
                sb2.append("\";");
                sb2.append("</script>");
                webView.loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", C.UTF8_NAME, null);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAdWithLocation method", e10);
            }
        }

        public final void getAdInfo(String str, Bundle adInfoBundle) {
            e0.checkNotNullParameter(adInfoBundle, "adInfoBundle");
            if (str == null || !n0.contains$default((CharSequence) str, (CharSequence) "amzn.dtb.loadAd", false, 2, (Object) null)) {
                return;
            }
            Matcher matcher = Pattern.compile("amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)").matcher(str);
            if (matcher.find() && matcher.groupCount() == 4) {
                adInfoBundle.putString("event_server_parameter", matcher.group(1));
                adInfoBundle.putString("bid_identifier", matcher.group(2));
                adInfoBundle.putString("hostname_identifier", matcher.group(3));
                adInfoBundle.putBoolean("video_flag", Boolean.parseBoolean(matcher.group(4)));
            }
        }

        public final Bundle getBundleForFetchAd(DTBAdMRAIDController mraidHandler, String str, Bundle bundle) {
            e0.checkNotNullParameter(mraidHandler, "mraidHandler");
            if (str == null && bundle != null) {
                str = bundle.getString("bid_html_template", null);
            }
            if (bundle != null && (mraidHandler instanceof DTBAdMRAIDBannerController)) {
                DTBAdBannerListener dTBAdBannerListener = ((DTBAdMRAIDBannerController) mraidHandler).bannerListener;
                int i10 = bundle.getInt("expected_width", 0);
                int i11 = bundle.getInt("expected_height", 0);
                if (i11 > 0 && i10 > 0 && (dTBAdBannerListener instanceof DTBExpectedSizeProvider)) {
                    DTBExpectedSizeProvider dTBExpectedSizeProvider = (DTBExpectedSizeProvider) dTBAdBannerListener;
                    dTBExpectedSizeProvider.setExpectedWidth(i10);
                    dTBExpectedSizeProvider.setExpectedHeight(i11);
                }
            }
            if (!DTBMetricsConfiguration.getInstance().isFeatureEnabled("webviewAdInfo_feature") || bundle != null) {
                return bundle;
            }
            Bundle bundle2 = new Bundle();
            getAdInfo(str, bundle2);
            bundle2.putString("amazon_ad_info", e2.m("{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}", "format(...)", 3, new Object[]{bundle2.getString("bid_identifier"), bundle2.getString("hostname_identifier"), bundle2.getString("event_server_parameter")}));
            return bundle2;
        }

        public final String getEnvironment(Context context, Bundle bundle) throws JSONException {
            CharSequence applicationLabel;
            e0.checkNotNullParameter(context, "context");
            String string = bundle != null ? bundle.getString("amazon_ad_info") : null;
            PackageManager packageManager = context.getPackageManager();
            String str = (packageManager == null || (applicationLabel = packageManager.getApplicationLabel(context.getApplicationInfo())) == null) ? "" : (String) applicationLabel;
            String idfa = DtbSharedPreferences.getInstance().getIdfa();
            if (DtbCommonUtils.isNullOrEmpty(idfa)) {
                idfa = "unknown";
            }
            String str2 = idfa;
            Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
            if (optOut == null) {
                optOut = Boolean.FALSE;
            }
            Boolean bool = optOut;
            String mobileDeviceInfo = getMobileDeviceInfo();
            return string == null ? e2.m("window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};", "format(...)", 8, new Object[]{"3.0", DtbCommonUtils.getSDKMRAIDVersion(), DtbConstants.SDK_VERSION, k0.replace$default(str, "'", "\\'", false, 4, (Object) null), str2, bool, Boolean.FALSE, mobileDeviceInfo}) : e2.m("window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};", "format(...)", 9, new Object[]{"3.0", DtbCommonUtils.getSDKMRAIDVersion(), DtbConstants.SDK_VERSION, k0.replace$default(str, "'", "\\'", false, 4, (Object) null), str2, bool, Boolean.FALSE, string, mobileDeviceInfo});
        }

        public final String getMobileDeviceInfo() throws JSONException {
            String string;
            String string2;
            String string3;
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject paramsJson;
            String str5 = "";
            try {
                paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
            } catch (RuntimeException e10) {
                e = e10;
                string = "";
                string2 = string;
                string3 = string2;
            }
            if (paramsJson == null) {
                str4 = "";
                str3 = str4;
                str2 = str3;
                str = str2;
                return e2.m("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", "format(...)", 6, new Object[]{"android", DtbCommonUtils.getSDKFramework(), str4, str3, str2, str});
            }
            if (paramsJson.has("osVersion")) {
                string3 = paramsJson.getString("osVersion");
                e0.checkNotNullExpressionValue(string3, "getString(...)");
            } else {
                string3 = "";
            }
            try {
                if (paramsJson.has("model")) {
                    string2 = paramsJson.getString("model");
                    e0.checkNotNullExpressionValue(string2, "getString(...)");
                } else {
                    string2 = "";
                }
                try {
                    if (paramsJson.has(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY)) {
                        string = paramsJson.getString(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY);
                        e0.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = "";
                    }
                    try {
                        if (paramsJson.has("orientation")) {
                            String string4 = paramsJson.getString("orientation");
                            e0.checkNotNullExpressionValue(string4, "getString(...)");
                            str5 = string4;
                        }
                    } catch (RuntimeException e11) {
                        e = e11;
                        ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to parse deviceData in getMobileDeviceInfo method", e);
                        str2 = string;
                        str3 = string2;
                        str4 = string3;
                        str = str5;
                        return e2.m("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", "format(...)", 6, new Object[]{"android", DtbCommonUtils.getSDKFramework(), str4, str3, str2, str});
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                    string = "";
                }
            } catch (RuntimeException e13) {
                e = e13;
                string = "";
                string2 = string;
            }
            str2 = string;
            str3 = string2;
            str4 = string3;
            str = str5;
            return e2.m("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", "format(...)", 6, new Object[]{"android", DtbCommonUtils.getSDKFramework(), str4, str3, str2, str});
        }

        public final void loadLocalFile(Context context, boolean z10, String name, StringBuilder sb2) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(sb2, "sb");
            if (!z10) {
                try {
                    String strLoadFile = WebResourceService.getInstance().loadFile(name);
                    if (strLoadFile != null) {
                        sb2.append("<script>");
                        sb2.append(strLoadFile);
                        sb2.append("</script>");
                        return;
                    }
                } catch (Exception unused) {
                    ApsAdExtensionsKt.e(this, "Failed to read local file");
                }
            }
            sb2.append("<script>");
            try {
                InputStream inputStreamOpen = context.getAssets().open(name + ".js");
                e0.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(n0.trim(line).toString());
                    sb2.append("\n");
                }
                bufferedReader.close();
                inputStreamOpen.close();
            } catch (Exception unused2) {
                ApsAdExtensionsKt.e(this, "Error reading file:" + name);
            }
            sb2.append("</script>");
        }

        private Companion() {
        }

        public final void fetchAd(ApsAdViewImpl webView, DTBAdMRAIDController mraidListener, String str, Bundle bundle) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(mraidListener, "mraidListener");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<!DOCTYPE html><html><head>");
                sb2.append("<script>");
                sb2.append(getEnvironment(webView.getAdViewContext(), bundle));
                sb2.append("</script>");
                Context context = webView.getContext();
                e0.checkNotNullExpressionValue(context, "getContext(...)");
                loadLocalFile(context, webView.getLocalOnly(), "aps-mraid", sb2);
                Context context2 = webView.getContext();
                e0.checkNotNullExpressionValue(context2, "getContext(...)");
                loadLocalFile(context2, webView.getLocalOnly(), "dtb-m", sb2);
                if (DtbOmSdkSessionManager.getFeatureEnableFlag()) {
                    Context context3 = webView.getContext();
                    e0.checkNotNullExpressionValue(context3, "getContext(...)");
                    loadLocalFile(context3, webView.getLocalOnly(), "omsdk-v1", sb2);
                }
                sb2.append("</head>");
                sb2.append("<body style='margin:0;padding:0;'>");
                sb2.append(str);
                sb2.append("</body></html>");
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                    if (mraidListener instanceof DTBAdMRAIDBannerController) {
                        ApsMetrics.Companion.customEvent("bannerCreativeRenderingStart", webView.getBidId(), null);
                    } else {
                        ApsMetrics.Companion.customEvent("interstitialCreativeRenderingStart", webView.getBidId(), null);
                    }
                }
                webView.loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", C.UTF8_NAME, null);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with bundle", e10);
            }
        }
    }

    private ApsAdViewFetchUtils() {
    }

    public static final void fetchAdWithLocation(Context context, WebView webView, boolean z10, String str) {
        Companion.fetchAdWithLocation(context, webView, z10, str);
    }

    public static final void getAdInfo(String str, Bundle bundle) {
        Companion.getAdInfo(str, bundle);
    }

    public static final String getEnvironment(Context context, Bundle bundle) {
        return Companion.getEnvironment(context, bundle);
    }

    public static final String getMobileDeviceInfo() {
        return Companion.getMobileDeviceInfo();
    }

    public static final void loadLocalFile(Context context, boolean z10, String str, StringBuilder sb2) {
        Companion.loadLocalFile(context, z10, str, sb2);
    }
}
