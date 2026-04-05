package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3161ca;
import com.ironsource.C3241h0;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Mb;
import com.ironsource.N6;
import com.ironsource.O6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;
import sv.n0;
import sv.x;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return e0.areEqual(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z10 = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z10);
                return z10;
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                logEvent$default(this, D5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(D5 d52, Integer num, String str) throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            if (num != null) {
                jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                jSONObjectB.put("reason", str);
            }
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, a.f37264a.a().b());
            Mb.f34856s.d().q().a(new C5(d52, jSONObjectB));
        }

        public static /* synthetic */ void logEvent$default(Companion companion, D5 d52, Integer num, String str, int i10, Object obj) throws JSONException {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            companion.logEvent(d52, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) throws NumberFormatException {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i10 = 0;
            String[] strArr = (String[]) n0.split$default((CharSequence) new x("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            String[] strArr2 = (String[]) n0.split$default((CharSequence) new x("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            while (i10 < strArr.length && i10 < strArr2.length && e0.areEqual(strArr[i10], strArr2[i10])) {
                i10++;
            }
            if (i10 >= strArr.length || i10 >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int iIntValue = Integer.valueOf(strArr[i10]).intValue();
            Integer numValueOf = Integer.valueOf(strArr2[i10]);
            e0.checkNotNullExpressionValue(numValueOf, "valueOf(vals2[i])");
            return Integer.signum(e0.compare(iIntValue, numValueOf.intValue()));
        }

        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            e0.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        private Companion() {
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR : ISAdQualityLogLevel.WARNING : ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.VERBOSE;
    }

    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strA = N6.a().a("is_coppa");
        return strA != null && Boolean.parseBoolean(strA);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(N6.a().a(O6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final void logEvent(D5 d52, Integer num, String str) throws JSONException {
        Companion.logEvent(d52, num, str);
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        e0.checkNotNullParameter(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(C3161ca segment) {
        e0.checkNotNullParameter(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.g() != null) {
            builder.setSegmentName(segment.g());
        }
        if (segment.a() > -1) {
            builder.setAge(segment.a());
        }
        if (segment.b() != null) {
            builder.setGender(segment.b());
        }
        if (segment.e() > -1) {
            builder.setLevel(segment.e());
        }
        if (segment.d() != null) {
            builder.setIsPaying(segment.d().get());
        }
        if (segment.c() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.c());
        }
        if (segment.h() > 0) {
            builder.setUserCreationDate(segment.h());
        }
        Iterator<Pair<String, String>> it = segment.f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            String key = (String) next.first;
            String str = (String) next.second;
            e0.checkNotNullExpressionValue(key, "key");
            if (k0.startsWith$default(key, "custom_", false, 2, null)) {
                builder.setCustomData(n0.removePrefix(key, (CharSequence) "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }

    public AdQualityBridge(Context context, String appKey, String str, C3241h0 c3241h0, int i10) throws JSONException {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(c3241h0, VPCjETNfjxu.kFGPrbnHOkbOI);
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i10)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) throws JSONException {
                e0.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                e0.checkNotNullParameter(message, "message");
                D5 d52 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    d52 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(d52, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, D5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = c3241h0.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, D5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }
}
