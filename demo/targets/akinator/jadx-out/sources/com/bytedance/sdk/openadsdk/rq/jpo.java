package com.bytedance.sdk.openadsdk.rq;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.component.utils.xyk;
import com.bytedance.sdk.openadsdk.core.hmu;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.settings.ju;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.yd.jd;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.tu.cm;
import com.bytedance.sdk.openadsdk.tu.wqx;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    public static String f21469jd;
    public static final ConcurrentHashMap<String, Object> jpo = new ConcurrentHashMap<>();
    private static volatile wqx wqx;

    public static boolean cm() {
        return jd() && jpo("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static boolean jd() {
        return jpo("ad_load_and_render_opt", a.f37604j, 0) == 1;
    }

    public static int jj() {
        if (jd()) {
            return jpo("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static wqx jpo(final Context context, final String str) {
        if (wqx == null) {
            synchronized (jpo.class) {
                try {
                    if (wqx == null) {
                        try {
                            wqx wqxVar = new wqx(new cm() { // from class: com.bytedance.sdk.openadsdk.rq.jpo.1
                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public Handler cm() {
                                    return oya.jd();
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public Context jd() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : sq.jpo();
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public JSONObject jj() {
                                    try {
                                        JSONObject jSONObjectJpo = ju.jpo(se.jpo(sq.jpo(), 0L));
                                        if (!jSONObjectJpo.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectJpo.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(zz.jd().cm())) {
                                                    return null;
                                                }
                                                jSONObjectJpo.put("app_id", zz.jd().cm());
                                            }
                                        }
                                        return com.bytedance.sdk.component.utils.jpo.jpo(jSONObjectJpo);
                                    } catch (Throwable th2) {
                                        nmd.wqx("StrategyUtils", th2.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public ExecutorService jpo() {
                                    return duq.my();
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public String my() {
                                    String strJpo = tic.jpo("/api/ad/union/sdk/strategies/adn", false, true);
                                    jpo.f21469jd = strJpo;
                                    return strJpo;
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public Map<String, String> qk() throws JSONException {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, tic.cm());
                                    String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strJd.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strJd);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new hmu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", au.jrx().ez());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public String wqx() {
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public JSONObject jpo(JSONObject jSONObject) {
                                    int iOptInt = jSONObject.optInt("cypher", -1);
                                    if (iOptInt != -1 && iOptInt == 3) {
                                        String strWqx = com.bytedance.sdk.component.utils.jpo.wqx(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                        if (!TextUtils.isEmpty(strWqx)) {
                                            try {
                                                return new JSONObject(strWqx);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.cm
                                public HandlerThread jpo(String str2, int i10) {
                                    return xyk.jpo(str2, i10);
                                }
                            });
                            wqx = wqxVar;
                            wqxVar.jpo(new com.bytedance.sdk.openadsdk.tu.jpo() { // from class: com.bytedance.sdk.openadsdk.rq.jpo.2
                                @Override // com.bytedance.sdk.openadsdk.tu.jpo
                                public void jd() {
                                    com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.rq.jpo.2.2
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.h("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.jj.jpo.jpo().jd();
                                    com.bytedance.sdk.openadsdk.nmd.jpo.wqx.jpo().jd();
                                    rq.jd();
                                    HashMap map = new HashMap();
                                    String strJpo = jpo.jpo(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strJpo)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strJpo);
                                    }
                                    jd.jd().jpo(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.jpo
                                public void jpo() {
                                    com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.rq.jpo.2.1
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.h("strategy_fetch");
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.tu.jpo
                                public void jpo(int i10, String str2) {
                                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.rq.jpo.2.3
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.h("strategy_fetch");
                                        }
                                    });
                                    rq.jpo(jpo.f21469jd);
                                }
                            });
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return wqx;
    }

    public static int my() {
        if (jd()) {
            return jpo("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean qk() {
        return jpo("jsb_opt_enable", 0) == 1;
    }

    public static boolean wqx() {
        return jd() && jpo("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    private static wqx xyk() {
        return jpo(sq.jpo(), zz.jd().cm());
    }

    public static int jpo(String str, int i10) {
        wqx wqxVarXyk = xyk();
        return wqxVarXyk != null ? wqxVarXyk.jpo(str, i10) : i10;
    }

    public static boolean jpo(String str, boolean z10) {
        wqx wqxVarXyk = xyk();
        return wqxVarXyk != null ? wqxVarXyk.jpo(str, z10) : z10;
    }

    public static String jpo(String str, String str2) {
        wqx wqxVarXyk = xyk();
        return wqxVarXyk != null ? wqxVarXyk.jpo(str, str2) : str2;
    }

    public static int jpo(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = i.d(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = jpo;
            Object obj = concurrentHashMap.get(strD);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strJpo = xyk().jpo(str, "");
                if (!TextUtils.isEmpty(strJpo)) {
                    int iOptInt = new JSONObject(strJpo).optInt(str2, i10);
                    concurrentHashMap.put(strD, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th2) {
                nmd.wqx("StrategyUtils", th2.getMessage());
            }
        }
        return i10;
    }

    public static String jpo(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = i.d(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = jpo;
            Object obj = concurrentHashMap.get(strD);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strJpo = xyk().jpo(str, "");
                if (!TextUtils.isEmpty(strJpo)) {
                    String strOptString = new JSONObject(strJpo).optString(str2, str3);
                    concurrentHashMap.put(strD, strOptString);
                    return strOptString;
                }
            } catch (Throwable th2) {
                nmd.wqx("StrategyUtils", th2.getMessage());
            }
        }
        return str3;
    }

    public static void jpo() {
        wqx wqxVarXyk = xyk();
        if (wqxVarXyk != null) {
            wqxVarXyk.jpo();
        }
    }
}
