package com.amazon.aps.ads.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import b0.e2;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import e3.g;
import i8.a;
import j1.o2;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsUtils {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ApsUtils";
    private static final String AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;
    private static final String AMAZON_APP_STORE_LINK = ApsAdWebViewSupportClient.AMAZON_APP_STORE_LINK;
    private static final String GOOGLE_PLAY_STORE_LINK = ApsAdWebViewSupportClient.GOOGLE_PLAY_STORE_LINK;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean fireAAXImpressionPixel$lambda$1(ApsAd apsAd) {
            return Boolean.valueOf(DtbCommonUtils.fireAAXImpressionCall(apsAd.getImpressionUrl()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fireAAXImpressionPixel$lambda$2(ApsAd apsAd, ApsResult apsResult, Boolean bool) {
            ApsMetrics.Companion.customEvent(e2.m("%s_AAX_IMP_PXL", "format(...)", 1, new Object[]{apsAd.getBidder()}), apsResult.toString(), null);
        }

        public final void directAppStoreLinkToBrowser(Context context, Uri uri) throws ActivityNotFoundException, NullPointerException {
            String strK;
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(uri, "uri");
            if (e0.areEqual(getAMAZON_SCHEME(), uri.getScheme())) {
                ApsLog.d(getTAG(), "Amazon app store unavailable in the device");
                strK = o2.l(getAMAZON_APP_STORE_LINK(), uri.getQuery());
            } else {
                ApsLog.d(getTAG(), "App store unavailable in the device");
                strK = g.k(getGOOGLE_PLAY_STORE_LINK(), uri.getHost(), "?", uri.getQuery());
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strK));
            context.startActivity(intent);
        }

        public final void fireAAXImpressionPixel(ApsAd apsAd) {
            e0.checkNotNullParameter(apsAd, "apsAd");
            if (apsAd.bidderRenderingFlowEnabled()) {
                String str = String.format("Firing Impression for bidder : %s", Arrays.copyOf(new Object[]{apsAd.getBidder()}, 1));
                e0.checkNotNullExpressionValue(str, "format(...)");
                ApsLog.d(str);
                ApsAsyncUtil.getInstance().runAsyncAndCallback(new a(apsAd), new a(apsAd));
            }
        }

        public final String getAMAZON_APP_STORE_LINK() {
            return ApsUtils.AMAZON_APP_STORE_LINK;
        }

        public final String getAMAZON_SCHEME() {
            return ApsUtils.AMAZON_SCHEME;
        }

        public final String getGOOGLE_PLAY_STORE_LINK() {
            return ApsUtils.GOOGLE_PLAY_STORE_LINK;
        }

        public final String getTAG() {
            return ApsUtils.TAG;
        }

        public final boolean isNullOrEmpty(String str) {
            return k0.equals$default(str, null, false, 2, null) || k0.equals$default(str, "", false, 2, null);
        }

        public final void setupMetrics(Context context) {
            if (context != null) {
                ApsMetrics.Companion.init(context, new ApsMetricsDeviceInfo(DtbCommonUtils.getSDKFramework(), DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), "portrait"), DtbDeviceDataRetriever.isTablet() ? "tablet" : "phone", DtbDeviceData.getConnectionType(), null, 16, null), new ApsMetricsSdkInfo(Aps.getSdkVersion(), AdRegistration.getAppKey()));
            }
        }

        private Companion() {
        }
    }

    private ApsUtils() {
    }
}
