package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.ads.DTBMetricReport;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.sz;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.rv;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends com.bytedance.sdk.component.xyk.xyk {

    /* renamed from: jd, reason: collision with root package name */
    private final yd f20880jd;
    private final jpo jpo;
    private final Set<my> wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(boolean z10);
    }

    public ju(jpo jpoVar, yd ydVar, my... myVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.wqx = hashSet;
        this.jpo = jpoVar;
        this.f20880jd = ydVar;
        hashSet.addAll(Arrays.asList(myVarArr));
    }

    private JSONObject jd(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iJpo = se.jpo(sq.jpo(), 0L);
        if (iJpo == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.jpo.jpo(false);
            return;
        }
        JSONObject jSONObjectJpo = jpo(iJpo);
        com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
        try {
            cmVarJd.jd(com.bytedance.sdk.openadsdk.xyk.cm.jpo(cmVarJd, tic.jpo("/api/ad/union/sdk/settings/", false, true)));
            cmVarJd.jd(Command.HTTP_HEADER_USER_AGENT, tic.cm());
        } catch (Exception unused) {
        }
        String string = jd(jSONObjectJpo).toString();
        if (sq.cm().pe() && sz.jpo().cm() == 1) {
            tic.jpo("Pangle_Debug_Mode", string, sq.jpo());
        }
        cmVarJd.jpo(string, sq.cm().prr());
        cmVarJd.jpo(6);
        cmVarJd.jpo("setting");
        com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.settings.ju.1
            @Override // com.bytedance.sdk.openadsdk.sq.cm
            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                return a.h("settings_fetch");
            }
        });
        cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.settings.ju.2
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                JSONObject jSONObject;
                int iOptInt;
                int iJpo2 = jdVar.jpo();
                String strCm = jdVar.cm();
                if (sq.cm().pe() && sz.jpo().cm() == 1) {
                    tic.jpo("Pangle_Debug_Mode", strCm, sq.jpo());
                }
                if (!jdVar.jj() || TextUtils.isEmpty(strCm)) {
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.settings.ju.2.2
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h("settings_fetch");
                        }
                    });
                    if (wqxVar != null) {
                        rq.jpo(wqxVar.cm());
                    }
                } else {
                    String strWqx = null;
                    try {
                        jSONObject = new JSONObject(strCm);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strWqx = com.bytedance.sdk.component.utils.jpo.wqx(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(strWqx)) {
                                try {
                                    jSONObject = new JSONObject(strWqx);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            ju.this.jpo(strWqx, jdVar.wqx());
                        } catch (Throwable unused4) {
                        }
                        try {
                            ju.this.jpo(jSONObject);
                            sq.cm().jpo(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.settings.ju.2.1
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    return a.h("settings_fetch");
                                }
                            });
                            rq.jd();
                        } catch (Throwable unused5) {
                        }
                        ju.this.jpo.jpo(true);
                        return;
                    }
                }
                if (!jdVar.jj()) {
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("settings_fetch", wqxVar.cm(), iJpo2, jdVar.jd());
                }
                ju.this.jpo.jpo(false);
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                ju.this.jpo.jpo(false);
                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.settings.ju.2.3
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        return a.h("settings_fetch");
                    }
                });
                if (wqxVar != null) {
                    rq.jpo(wqxVar.cm());
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("settings_fetch", wqxVar.cm(), -1, iOException != null ? iOException.getMessage() : null);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.ju.jd(Cif.jpo(sq.jpo()));
        DeviceUtils.m493if();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i11 = Integer.parseInt(str2);
                    String str3 = (String) map2.get("ts");
                    if (str3 != null) {
                        long j10 = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strJpo = com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd.jpo(str + i11 + j10);
                        if (strJpo != null) {
                            if (strJpo.equalsIgnoreCase(str4)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        zz.jpo(i10);
    }

    public static JSONObject jpo(int i10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jj jjVarCm = sq.cm();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", tic.dt());
            com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(jSONObject);
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, com.bytedance.sdk.openadsdk.core.zz.jd().yd());
            jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.zz.jd().ju());
            if (jjVarCm.se("mcc")) {
                jSONObject.put("mcc", rv.jd());
            }
            Context contextJpo = sq.jpo();
            jSONObject.put("conn_type", tic.qk(i10));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
            jSONObject.put("time_zone", tic.se());
            jSONObject.put("package_name", tic.jj());
            jSONObject.put(C3191e4.h.L, tic.jpo() ? 1 : 2);
            jSONObject.put("app_version", tic.xyk());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", Cif.wqx(contextJpo));
            String strCm = com.bytedance.sdk.openadsdk.core.zz.jd().cm();
            if (strCm != null) {
                jSONObject.put("app_id", strCm);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (strCm != null) {
                strConcat = strCm.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.my.jpo(strConcat));
            jSONObject.put("tcstring", au.wqx(contextJpo));
            jSONObject.put("tcf_gdpr", au.jd(contextJpo));
            jSONObject.put("lmt", DeviceUtils.wqx());
            jSONObject.put("locale_language", DeviceUtils.cm());
            jSONObject.put("channel", C3191e4.h.Z);
            JSONObject jSONObjectMy = jjVarCm.my();
            if (jSONObjectMy != null) {
                jSONObject.put("digest", jSONObjectMy);
            }
            jSONObject.put("data_time", jjVarCm.jj());
            jSONObject.put("app_set_id_scope", cm.jd());
            jSONObject.put("app_set_id", cm.wqx());
            jSONObject.put("installed_source", cm.cm());
            if (jjVarCm.se(Q6.U0)) {
                jSONObject.put("did", Cif.jpo(sq.jpo()));
            }
            jSONObject.put(Q6.U0, com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            String strQk = com.bytedance.sdk.openadsdk.core.zz.jd().qk();
            if (!TextUtils.isEmpty(strQk)) {
                jSONObject.put(DTBMetricReport.ADSERVER, strQk);
            }
            jSONObject.put(C3191e4.h.G, DeviceUtils.jpo(contextJpo, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.zz.jd().hmu());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean jpo(JSONObject jSONObject) {
        this.f20880jd.jpo(jSONObject);
        for (my myVar : this.wqx) {
            if (myVar != null) {
                myVar.jpo(jSONObject);
            }
        }
        return this.f20880jd.wqx;
    }

    public static boolean jpo() {
        return BinderPoolService.jpo;
    }
}
