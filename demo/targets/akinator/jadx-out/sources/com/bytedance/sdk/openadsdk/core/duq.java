package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.multipro.jd.jpo;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class duq {
    private static boolean jpo = false;

    public static void jpo(boolean z10) {
        jpo = z10;
    }

    private static com.bytedance.sdk.openadsdk.prr.jpo.jd jpo(int i10, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        com.bytedance.sdk.openadsdk.prr.jpo.jd jdVar = new com.bytedance.sdk.openadsdk.prr.jpo.jd();
        jdVar.jpo(jd.jpo.jpo);
        jdVar.jpo(dtVar);
        jdVar.jd(com.bytedance.sdk.openadsdk.utils.tic.jpo(dtVar));
        jdVar.jpo(i10);
        jdVar.jpo(false);
        jdVar.jd(dtVar.pzk());
        return jdVar;
    }

    public static boolean jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar, String str, com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar, boolean z10, int i11) {
        String strJpo;
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(-1, dtVar));
        if (context != null && dtVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.au auVarCnl = dtVar.cnl();
            HashMap map = new HashMap();
            if (dtVar.tda() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && dtVar.ig()) {
                map.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (auVarCnl != null && !TextUtils.isEmpty(auVarCnl.jpo())) {
                if (jpo(context, dtVar, i10, str, z10, map)) {
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(2, dtVar));
                    com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                    return true;
                }
                if (auVarCnl.wqx() != 2 || dtVar.iqh() == 5 || dtVar.iqh() == 15) {
                    if (auVarCnl.wqx() == 1 && !TextUtils.isEmpty(auVarCnl.jd())) {
                        strJpo = auVarCnl.jd();
                    } else {
                        strJpo = jpo(dtVar);
                    }
                } else if (jjVar != null) {
                    if (!jjVar.jpo(dtVar)) {
                        if (jjVar.cm(dtVar)) {
                            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(3, dtVar));
                            com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                            return true;
                        }
                        strJpo = jpo(auVarCnl, dtVar);
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(3, dtVar));
                    } else {
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(3, dtVar));
                        com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                        return true;
                    }
                } else {
                    strJpo = jpo(auVarCnl, dtVar);
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_fallback_url", map);
            } else {
                strJpo = jpo(dtVar);
            }
            String str2 = strJpo;
            if (dtVar.tda() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(4, dtVar));
                boolean zJpo = com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm.jpo(context, str2, strSubstring, str, dtVar);
                if (zJpo) {
                    com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
                }
                return zJpo;
            }
            boolean zJpo2 = jpo(context, dtVar, i10, pAGNativeAd, jpoVar, str, z10, str2);
            if (zJpo2) {
                com.bytedance.sdk.openadsdk.utils.my.jpo(dtVar);
            }
            return zJpo2;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(1, dtVar));
        return false;
    }

    private static String jpo(com.bytedance.sdk.openadsdk.core.model.au auVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (!TextUtils.isEmpty(auVar.jd())) {
            return auVar.jd();
        }
        return jpo(dtVar);
    }

    private static String jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar.ig() && dtVar.zuz() != null) {
            return dtVar.zuz().zz();
        }
        return dtVar.iwg();
    }

    public static boolean jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, String str, boolean z10, Map<String, Object> map) throws JSONException {
        if (dtVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.au auVarCnl = dtVar.cnl();
        if (auVarCnl != null && !TextUtils.isEmpty(auVarCnl.jpo())) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map2 = map;
            String strJpo = auVarCnl.jpo();
            if (com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo()) {
                return com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo(context, strJpo, dtVar, i10, map2, z10);
            }
            Uri uri = Uri.parse(strJpo);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (com.bytedance.sdk.openadsdk.utils.tic.cm(context)) {
                tic.jd jdVarJpo = com.bytedance.sdk.openadsdk.utils.tic.jpo(context, intent);
                if (jdVarJpo.f21607jd > 0) {
                    if (sq.cm().xyk()) {
                        com.bytedance.sdk.openadsdk.utils.tic.jpo(dtVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 1);
                    map2.put("matched_count", Integer.valueOf(jdVarJpo.f21607jd));
                    map2.put("url", strJpo);
                    ComponentName componentName = jdVarJpo.jpo;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_url_app", map2);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.cm.au.jpo().jpo(map2).jpo(dtVar, str);
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo("dp_start_act_success", dtVar, str, map2);
                        return true;
                    } catch (Exception e10) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e10.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        cm.jpo(dtVar, str, -4, jSONObject);
                        if (!sq.cm().xyk()) {
                            jpo(context, dtVar.iwg(), dtVar, i10, str, z10);
                        }
                        return false;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                cm.jpo(dtVar, str, -3, jSONObject2);
            } else {
                try {
                    if (sq.cm().xyk()) {
                        com.bytedance.sdk.openadsdk.utils.tic.jpo(dtVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_url_app", map2);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.cm.au.jpo().jpo(map2).jpo(dtVar, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        cm.jpo(dtVar, str, auVarCnl == null ? -1 : -2, auVarCnl != null ? auVarCnl.cm() : null);
        return false;
    }

    public static boolean jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.rv.jd(dtVar)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpo(5, dtVar));
            return false;
        }
        int iPzk = dtVar.pzk();
        if (iPzk != 2 && iPzk != 8) {
            com.bytedance.sdk.component.utils.jd.jpo(context, jpo(context, str2, dtVar, i10, pAGNativeAd, jpoVar, str, z10), null);
            jpo = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.tu.jpo(context, str2, dtVar, jd.jpo.jpo);
    }

    public static void jpo(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, String str2, boolean z10) {
        com.bytedance.sdk.component.utils.jd.jpo(context, jpo(context, str, dtVar, i10, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.cm.jpo) null, str2, z10), null);
    }

    public static void jpo(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, final String str2, boolean z10, jr jrVar) {
        com.bytedance.sdk.component.utils.jd.jpo(context, jpo(context, str, dtVar, i10, null, null, str2, z10, true, jrVar), new jd.InterfaceC0092jd() { // from class: com.bytedance.sdk.openadsdk.core.duq.1
            @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
            public void jpo() throws JSONException {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
            public void jpo(Throwable th2) throws JSONException {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent jpo(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar, String str2, boolean z10) {
        return jpo(context, str, dtVar, i10, pAGNativeAd, jpoVar, str2, z10, false, null);
    }

    public static boolean jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i11);
            com.bytedance.sdk.openadsdk.cm.wqx.jj(dtVar, str, jSONObject);
            Intent intentJpo = jpo(context, dtVar, str, i10);
            if (intentJpo == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.jd.jpo(context, intentJpo, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, int i10) {
        if (context == null || dtVar == null || !com.bytedance.sdk.openadsdk.core.model.rv.jd(dtVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strYd = com.bytedance.sdk.openadsdk.core.model.rv.yd(dtVar);
        if (!TextUtils.isEmpty(strYd)) {
            if (strYd.contains("?")) {
                strYd = strYd.concat("&orientation=portrait");
            } else {
                strYd = strYd.concat("?orientation=portrait");
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            intent.putExtra("url", strYd);
            intent.putExtra("event_tag", str);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", dtVar.afh());
            intent.putExtra("web_title", dtVar.ozw());
            intent.putExtra("adid", dtVar.fc());
            intent.putExtra("log_extra", dtVar.fxd());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, dtVar.gum().toString());
            return intent;
        }
        dtVar.my(strYd);
        dtVar.jj(str);
        dtVar.jd(i10);
        intent.putExtra("meta_index", pdm.jpo().jpo(dtVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent jpo(Context context, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar, String str2, boolean z10, boolean z11, jr jrVar) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.rv.jd(dtVar) && (pAGNativeAd != 0 || jpoVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zJpo = jpo(dtVar, z10);
            intent.putExtra("ad_pending_download", zJpo);
            String strYd = com.bytedance.sdk.openadsdk.core.model.rv.yd(dtVar);
            if (!TextUtils.isEmpty(strYd)) {
                if (strYd.contains("?")) {
                    str = strYd.concat("&orientation=portrait");
                } else {
                    str = strYd.concat("?orientation=portrait");
                }
            }
            dtVar.jd(zJpo);
        } else if (!z11 && dtVar.pzk() == 3 && ((dtVar.jkt() == 2 || (dtVar.jkt() == 1 && jpo)) && !dtVar.biu())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            intent.putExtra("url", str);
            intent.putExtra("event_tag", str2);
            intent.putExtra("source", i10);
            intent.putExtra("gecko_id", dtVar.afh());
            if (!z11 || jrVar == null) {
                intent.putExtra("web_title", dtVar.ozw());
            } else {
                intent.putExtra("web_title", jrVar.jd());
                intent.putExtra("only_loading", jrVar.jpo());
            }
            intent.putExtra("adid", dtVar.fc());
            intent.putExtra("log_extra", dtVar.fxd());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, dtVar.gum().toString());
        } else {
            if (z11 && jrVar != null) {
                dtVar.nmd(jrVar.jd());
                dtVar.jpo(jrVar.jpo());
            }
            dtVar.my(str);
            dtVar.jj(str2);
            dtVar.jd(i10);
            intent.putExtra("meta_index", pdm.jpo().jpo(dtVar));
        }
        if (dtVar.iqh() == 5 || dtVar.iqh() == 15 || dtVar.iqh() == 50) {
            com.bytedance.sdk.openadsdk.multipro.jd.jpo jpoVarWqx = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof jpo.InterfaceC0146jpo) {
                    jpoVarWqx = ((jpo.InterfaceC0146jpo) pAGNativeAd).jj();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.jpo.jd.jpo.jd) {
                    jpoVarWqx = ((com.bytedance.sdk.openadsdk.jpo.jd.jpo.jd) pAGNativeAd).jd();
                }
                if (jpoVarWqx != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, jpoVarWqx.jpo().toString());
                }
            }
            if (jpoVar != null && jpoVar.jd() && (jpoVarWqx = jpoVar.wqx()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, jpoVarWqx.jpo().toString());
            }
            if (jpoVarWqx != null) {
                intent.putExtra("video_is_auto_play", jpoVarWqx.f21285cm);
                if (com.bytedance.sdk.component.utils.prr.cm()) {
                    jpoVarWqx.jpo().toString();
                }
            }
        }
        return intent;
    }

    private static boolean jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, boolean z10) {
        if (z10 && dtVar != null && dtVar.pzk() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.rv.jd(dtVar);
        }
        return false;
    }
}
