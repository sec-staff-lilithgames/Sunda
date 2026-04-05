package com.bytedance.sdk.openadsdk;

import a.b;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.amazon.device.ads.DtbConstants;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.hmu;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.settings.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.cm.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.Q6;
import com.ironsource.Y1;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApmHelper {

    /* renamed from: cm, reason: collision with root package name */
    private static boolean f19127cm = false;

    /* renamed from: jd, reason: collision with root package name */
    private static final AtomicBoolean f19128jd = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private static jpo f19129jj = null;
    private static volatile boolean jpo = false;
    private static jd my;
    private static String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jpo(String str, String str2, Throwable th2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public final String f19133jd;
        public final String jpo;
        public final Throwable wqx;

        public jpo(String str, String str2, Throwable th2) {
            this.jpo = str;
            this.f19133jd = str2;
            this.wqx = th2;
        }
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.U0, com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            jSONObject.put("ipv6", cm.jd("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put(TtmlNode.TAG_REGION, sq.cm().ef());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new hmu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (f19128jd.compareAndSet(false, true) && !jpo) {
            duq.jpo(new xyk("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.jpo) {
                        jj jjVarCm = sq.cm();
                        boolean unused = ApmHelper.f19127cm = jjVarCm.va();
                        String strOpi = tic.opi();
                        if (ApmHelper.f19127cm && !TextUtils.isEmpty(strOpi)) {
                            String unused2 = ApmHelper.wqx = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strJpo = Cif.jpo(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.rq.jpo.jpo("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", sq.cm().ez());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7605L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapXyk = ApmHelper.xyk();
                                        if (mapXyk.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapXyk.get("render_type"));
                                            return mapXyk;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapXyk;
                                    }
                                });
                                if (jjVarCm.hks()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strJpo);
                                monitorCrashInitSDK.setReportUrl(strOpi);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.wqx);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                jd unused3 = ApmHelper.my = new jd() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.jd
                                    public void jpo(String str, String str2, Throwable th2) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th2);
                                    }
                                };
                                boolean unused4 = ApmHelper.jpo = true;
                                ApmHelper.wqx(strJpo, strOpi);
                                jpo jpoVar = ApmHelper.f19129jj;
                                jpo unused5 = ApmHelper.f19129jj = null;
                                if (jpoVar != null) {
                                    ApmHelper.my.jpo(jpoVar.jpo, jpoVar.f19133jd, jpoVar.wqx);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.jpo = false;
                            }
                        }
                    }
                    ApmHelper.f19128jd.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return jpo;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        jd jdVar = my;
        if (jdVar != null) {
            jdVar.jpo(str, str2, th2);
        } else {
            f19129jj = new jpo(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() throws JSONException {
        if (f19127cm) {
            jd(Cif.jpo(sq.jpo()), tic.opi());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> xyk() {
        HashMap map = new HashMap();
        dt dtVarJd = com.bytedance.sdk.openadsdk.utils.jd.jd();
        if (dtVarJd != null) {
            map.put("adType", String.valueOf(dtVarJd.jp()));
            map.put("aid", String.valueOf(dtVarJd.jkf()));
            map.put(BidResponsedEx.KEY_CID, dtVarJd.fc());
            map.put("reqId", dtVarJd.hbg());
            map.put("rit", dtVarJd.sz(Y1.f35726f));
            int iTl = dtVarJd.tl();
            if (dtVarJd.cql() != 2) {
                iTl = -1;
            }
            map.put("render_type", String.valueOf(iTl));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx(String str, String str2) throws JSONException {
        jd(str, str2);
    }

    private static void jd(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strL = b.l(DtbConstants.HTTPS, str2, "/monitor/collect/c/session?version_code=7605&device_platform=android&aid=10000001");
        sq.wqx().jpo(jd(str), strL);
    }

    private static JSONObject jd(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", wqx);
            jSONObject2.putOpt(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM, jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            nmd.wqx("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
