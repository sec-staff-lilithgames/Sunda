package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.P7;
import com.ironsource.V3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Me {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";

    /* renamed from: a0, reason: collision with root package name */
    protected static final String f34897a0 = "genericParams";

    /* renamed from: a1, reason: collision with root package name */
    protected static final String f34898a1 = "pixel";

    /* renamed from: a2, reason: collision with root package name */
    protected static final String f34899a2 = "tokenGenericParams";

    /* renamed from: b0, reason: collision with root package name */
    protected static final String f34900b0 = "adUnits";

    /* renamed from: b1, reason: collision with root package name */
    protected static final String f34901b1 = "pixelEventsUrl";

    /* renamed from: b2, reason: collision with root package name */
    protected static final String f34902b2 = "compressToken";

    /* renamed from: c0, reason: collision with root package name */
    protected static final String f34903c0 = "providerLoadName";

    /* renamed from: c1, reason: collision with root package name */
    protected static final String f34904c1 = "pixelEventsEnabled";

    /* renamed from: c2, reason: collision with root package name */
    protected static final String f34905c2 = "compressExternalToken";

    /* renamed from: d0, reason: collision with root package name */
    protected static final String f34906d0 = "application";

    /* renamed from: d1, reason: collision with root package name */
    protected static final String f34907d1 = "placements";

    /* renamed from: d2, reason: collision with root package name */
    protected static final String f34908d2 = "instanceType";

    /* renamed from: e0, reason: collision with root package name */
    protected static final String f34909e0 = "rewardedVideo";

    /* renamed from: e1, reason: collision with root package name */
    protected static final String f34910e1 = "placementId";

    /* renamed from: e2, reason: collision with root package name */
    protected static final String f34911e2 = "maxAdsPerSession";

    /* renamed from: f0, reason: collision with root package name */
    protected static final String f34912f0 = "interstitial";

    /* renamed from: f1, reason: collision with root package name */
    protected static final String f34913f1 = "placementName";

    /* renamed from: f2, reason: collision with root package name */
    protected static final String f34914f2 = "reward";

    /* renamed from: g0, reason: collision with root package name */
    protected static final String f34915g0 = "banner";

    /* renamed from: g1, reason: collision with root package name */
    protected static final String f34916g1 = "delivery";

    /* renamed from: g2, reason: collision with root package name */
    protected static final String f34917g2 = "name";

    /* renamed from: h0, reason: collision with root package name */
    protected static final String f34918h0 = "nativeAd";

    /* renamed from: h1, reason: collision with root package name */
    protected static final String f34919h1 = "isDefault";

    /* renamed from: h2, reason: collision with root package name */
    protected static final String f34920h2 = "amount";

    /* renamed from: i0, reason: collision with root package name */
    protected static final String f34921i0 = "integration";

    /* renamed from: i1, reason: collision with root package name */
    protected static final String f34922i1 = "capping";

    /* renamed from: i2, reason: collision with root package name */
    protected static final String f34923i2 = "bannerRefreshRate";

    /* renamed from: j0, reason: collision with root package name */
    protected static final String f34924j0 = "loggers";

    /* renamed from: j1, reason: collision with root package name */
    protected static final String f34925j1 = "pacing";

    /* renamed from: j2, reason: collision with root package name */
    protected static final String f34926j2 = "protocolVersion";

    /* renamed from: k0, reason: collision with root package name */
    protected static final String f34927k0 = "segment";

    /* renamed from: k1, reason: collision with root package name */
    protected static final String f34928k1 = "enabled";

    /* renamed from: k2, reason: collision with root package name */
    protected static final String f34929k2 = "adFormats";

    /* renamed from: l, reason: collision with root package name */
    public static final String f34930l = "appKey";

    /* renamed from: l0, reason: collision with root package name */
    protected static final String f34931l0 = "events";

    /* renamed from: l1, reason: collision with root package name */
    protected static final String f34932l1 = "maxImpressions";

    /* renamed from: l2, reason: collision with root package name */
    protected static final String f34933l2 = "adUnits";

    /* renamed from: m, reason: collision with root package name */
    public static final String f34934m = "userId";

    /* renamed from: m0, reason: collision with root package name */
    protected static final String f34935m0 = "crashReporter";

    /* renamed from: m1, reason: collision with root package name */
    protected static final String f34936m1 = "numOfSeconds";

    /* renamed from: m2, reason: collision with root package name */
    protected static final String f34937m2 = "rewarded";

    /* renamed from: n, reason: collision with root package name */
    public static final String f34938n = "response";

    /* renamed from: n0, reason: collision with root package name */
    protected static final String f34939n0 = "token";

    /* renamed from: n1, reason: collision with root package name */
    protected static final String f34940n1 = "unit";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f34941o = "error";

    /* renamed from: o0, reason: collision with root package name */
    protected static final String f34942o0 = "external";

    /* renamed from: o1, reason: collision with root package name */
    protected static final String f34943o1 = "virtualItemName";

    /* renamed from: p, reason: collision with root package name */
    protected static final int f34944p = 3;

    /* renamed from: p0, reason: collision with root package name */
    protected static final String f34945p0 = "mediationTypes";

    /* renamed from: p1, reason: collision with root package name */
    protected static final String f34946p1 = "virtualItemCount";

    /* renamed from: q, reason: collision with root package name */
    protected static final boolean f34947q = false;

    /* renamed from: q0, reason: collision with root package name */
    protected static final String f34948q0 = "providerDefaultInstance";

    /* renamed from: q1, reason: collision with root package name */
    protected static final String f34949q1 = "uuidEnabled";

    /* renamed from: r, reason: collision with root package name */
    protected static final boolean f34950r = true;

    /* renamed from: r0, reason: collision with root package name */
    protected static final String f34951r0 = "testSuite";

    /* renamed from: r1, reason: collision with root package name */
    protected static final String f34952r1 = "abt";

    /* renamed from: s, reason: collision with root package name */
    protected static final boolean f34953s = true;

    /* renamed from: s0, reason: collision with root package name */
    protected static final String f34954s0 = "controllerUrl";

    /* renamed from: s1, reason: collision with root package name */
    protected static final String f34955s1 = "delayLoadFailure";

    /* renamed from: t, reason: collision with root package name */
    protected static final int f34956t = 2;

    /* renamed from: t0, reason: collision with root package name */
    protected static final String f34957t0 = "AdQuality";

    /* renamed from: t1, reason: collision with root package name */
    protected static final String f34958t1 = "keysToInclude";

    /* renamed from: u, reason: collision with root package name */
    protected static final int f34959u = 2;

    /* renamed from: u0, reason: collision with root package name */
    protected static final String f34960u0 = "initMode";

    /* renamed from: u1, reason: collision with root package name */
    protected static final String f34961u1 = "reporterURL";

    /* renamed from: v, reason: collision with root package name */
    protected static final int f34962v = 1;

    /* renamed from: v0, reason: collision with root package name */
    protected static final String f34963v0 = "adq_init_blob";

    /* renamed from: v1, reason: collision with root package name */
    protected static final String f34964v1 = "reporterKeyword";

    /* renamed from: w, reason: collision with root package name */
    protected static final int f34965w = 1;

    /* renamed from: w0, reason: collision with root package name */
    protected static final String f34966w0 = "settings";

    /* renamed from: w1, reason: collision with root package name */
    protected static final String f34967w1 = "includeANR";

    /* renamed from: x, reason: collision with root package name */
    protected static final boolean f34968x = true;

    /* renamed from: x0, reason: collision with root package name */
    protected static final String f34969x0 = "collectBiddingDataTimeout";

    /* renamed from: x1, reason: collision with root package name */
    protected static final String f34970x1 = "timeout";

    /* renamed from: y, reason: collision with root package name */
    protected static final boolean f34971y = false;

    /* renamed from: y0, reason: collision with root package name */
    protected static final String f34972y0 = "providers";

    /* renamed from: y1, reason: collision with root package name */
    protected static final String f34973y1 = "setIgnoreDebugger";

    /* renamed from: z, reason: collision with root package name */
    protected static final boolean f34974z = false;

    /* renamed from: z0, reason: collision with root package name */
    protected static final String f34975z0 = "parallelInit";

    /* renamed from: z1, reason: collision with root package name */
    protected static final String f34976z1 = "adSourceName";

    /* renamed from: a, reason: collision with root package name */
    private Bd f34977a;

    /* renamed from: b, reason: collision with root package name */
    private Dd f34978b;

    /* renamed from: c, reason: collision with root package name */
    private V3 f34979c;

    /* renamed from: d, reason: collision with root package name */
    private String f34980d;

    /* renamed from: e, reason: collision with root package name */
    private String f34981e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f34982f;

    /* renamed from: g, reason: collision with root package name */
    private Context f34983g;

    /* renamed from: h, reason: collision with root package name */
    private a f34984h;

    /* renamed from: i, reason: collision with root package name */
    private P7.a f34985i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34986j;

    /* renamed from: k, reason: collision with root package name */
    private Q5 f34987k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* renamed from: a, reason: collision with root package name */
        private final String f34992a;

        a(String str) {
            this.f34992a = str;
        }

        public String b() {
            return this.f34992a;
        }
    }

    public Me(Context context, String str, String str2, String str3) {
        this.f34984h = a.NOT_SET;
        this.f34986j = false;
        this.f34983g = context;
        this.f34985i = Mb.O().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f34982f = new JSONObject();
            } else {
                this.f34982f = new JSONObject(str3);
            }
            this.f34986j = n();
            s();
            q();
            r();
            this.f34980d = TextUtils.isEmpty(str) ? "" : str;
            this.f34981e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f34982f);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            a();
        }
    }

    public static a a(Me me2) {
        return me2 != null ? me2.h() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.f34987k = new Q5(jSONObject.optJSONObject(C3500ve.f39133d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C3262i3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f34919h1, false);
        C3343md c3343mdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C3262i3 c3262i3 = new C3262i3(iOptInt, strOptString, zOptBoolean, c3343mdA);
        if (c3343mdA != null) {
            this.f34985i.b(this.f34983g, c3262i3, IronSource.a.BANNER);
        }
        return c3262i3;
    }

    private K9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f34919h1, false);
        C3343md c3343mdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        K9 k92 = new K9(iOptInt, strOptString, zOptBoolean, c3343mdA);
        if (c3343mdA != null) {
            this.f34985i.b(this.f34983g, k92, IronSource.a.f37252c);
        }
        return k92;
    }

    private String l() {
        return this.f34986j ? "rewarded" : "rewardedVideo";
    }

    private boolean m() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f34982f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f34982f, "configurations"), b());
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int iOptInt;
        try {
            iOptInt = this.f34982f.optInt(f34926j2, 0);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Me.q():void");
    }

    private void r() {
        try {
            JSONObject jSONObjectC = c(this.f34982f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, l());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.f34977a = new Bd();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                    String strOptString = jSONArrayB.optString(i10);
                    this.f34977a.d(strOptString);
                    NetworkSettings networkSettingsB = Dd.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < jSONArrayB2.length(); i11++) {
                    String strOptString2 = jSONArrayB2.optString(i11);
                    this.f34977a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = Dd.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i11);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i12 = 0; i12 < jSONArrayB3.length(); i12++) {
                    String strOptString3 = jSONArrayB3.optString(i12);
                    this.f34977a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = Dd.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i12);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i13 = 0; i13 < jSONArrayB4.length(); i13++) {
                    String strOptString4 = jSONArrayB4.optString(i13);
                    this.f34977a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = Dd.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void s() {
        JSONObject jSONObject;
        Iterator<String> it;
        try {
            this.f34978b = Dd.c();
            JSONObject jSONObjectC = c(this.f34982f, "providerSettings");
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectC2 = c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = c(jSONObjectC2, l());
                    JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                    if (this.f34978b.a(next)) {
                        Mb.U().q().a(new C5(D5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = this.f34978b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (b(strOptString4)) {
                            jSONObject = jSONObjectC;
                            NetworkSettings networkSettingsB2 = this.f34978b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            it = itKeys;
                            NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectB), IronSourceUtils.b(new JSONObject(interstitialSettings2.toString()), jSONObjectB2), IronSourceUtils.b(new JSONObject(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(new JSONObject(nativeAdSettings2.toString()), jSONObjectB4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                            this.f34978b.a(networkSettings);
                        } else {
                            jSONObject = jSONObjectC;
                            it = itKeys;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            this.f34978b.a(networkSettings2);
                        }
                        jSONObjectC = jSONObject;
                        itKeys = it;
                    }
                }
            }
            this.f34978b.b();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C3160c9 f() {
        return new C3160c9(this.f34980d, this.f34981e);
    }

    public List<IronSource.a> g() {
        Bd bd2;
        Bd bd3;
        Bd bd4;
        Bd bd5;
        if (this.f34982f == null || this.f34979c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f34979c.f() != null && (bd5 = this.f34977a) != null && !bd5.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.f34979c.d() != null && (bd4 = this.f34977a) != null && !bd4.b().isEmpty()) {
            arrayList.add(IronSource.a.f37252c);
        }
        if (this.f34979c.c() != null && (bd3 = this.f34977a) != null && !bd3.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.f34979c.e() != null && (bd2 = this.f34977a) != null && !bd2.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a h() {
        return this.f34984h;
    }

    public JSONObject i() {
        return this.f34982f;
    }

    public Bd j() {
        return this.f34977a;
    }

    public Dd k() {
        return this.f34978b;
    }

    public boolean o() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean p() {
        JSONObject jSONObject = this.f34982f;
        return (jSONObject == null || jSONObject.has("error") || this.f34977a == null || this.f34978b == null || this.f34979c == null || !m()) ? false : true;
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f34980d);
            jSONObject.put("userId", this.f34981e);
            jSONObject.put(f34938n, this.f34982f);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.f34986j ? "adFormats" : X0.f35701c;
    }

    private C3163cc f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f34919h1, false);
        C3343md c3343mdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C3163cc c3163cc = new C3163cc(iOptInt, strOptString, zOptBoolean, c3343mdA);
        if (c3343mdA != null) {
            this.f34985i.b(this.f34983g, c3163cc, IronSource.a.NATIVE_AD);
        }
        return c3163cc;
    }

    private Of h(JSONObject jSONObject) {
        Of of2 = new Of();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            of2.b(jSONObjectC.optString(wHkgq.fPupZsKqpN));
        }
        return of2;
    }

    public V3 c() {
        return this.f34979c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f34986j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new V9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    public void a(a aVar) {
        this.f34984h = aVar;
    }

    private void a() {
        this.f34982f = new JSONObject();
        this.f34980d = "";
        this.f34981e = "";
        this.f34977a = new Bd();
        this.f34978b = Dd.c();
        this.f34979c = new V3.a().a();
        this.f34985i = Mb.O().x();
        b(this.f34982f);
    }

    private boolean b(String str) {
        return this.f34978b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : new JSONObject();
    }

    public Q5 e() {
        return this.f34987k;
    }

    private Context d() {
        return this.f34983g;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f34982f, "configurations"), "adFormats"), str), X0.f35701c);
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(f34919h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static C3149bg b(Me me2) {
        if (me2 != null && me2.p()) {
            return me2.c().b().k();
        }
        return C3149bg.a();
    }

    private C3325ld g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f34919h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C3343md c3343mdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        C3325ld c3325ld = new C3325ld(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c3343mdA);
        if (c3343mdA != null) {
            this.f34985i.b(this.f34983g, c3325ld, IronSource.a.REWARDED_VIDEO);
        }
        return c3325ld;
    }

    public Me(Me me2) {
        this.f34984h = a.NOT_SET;
        this.f34986j = false;
        try {
            this.f34983g = me2.d();
            this.f34982f = new JSONObject(me2.f34982f.toString());
            this.f34980d = me2.f34980d;
            this.f34981e = me2.f34981e;
            this.f34986j = me2.f34986j;
            this.f34977a = me2.j();
            this.f34978b = me2.k();
            this.f34979c = me2.c();
            this.f34984h = me2.h();
            this.f34985i = Mb.O().x();
            b(this.f34982f);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            a();
        }
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                iArr5[i10] = jSONArrayOptJSONArray.optInt(i10);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                iArr6[i11] = jSONArrayOptJSONArray2.optInt(i11);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                iArr7[i12] = jSONArrayOptJSONArray3.optInt(i12);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                iArr4[i13] = jSONArrayOptJSONArray4.optInt(i13);
            }
        }
        return new H1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z10) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i10 : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j10 : jOptLong;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v3 com.ironsource.qd) = (r7v1 com.ironsource.qd), (r7v2 com.ironsource.qd) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.C3343md a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.md$a r1 = new com.ironsource.md$a
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.qd r7 = com.ironsource.EnumC3415qd.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.qd r7 = com.ironsource.EnumC3415qd.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.md r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Me.a(org.json.JSONObject):com.ironsource.md");
    }
}
