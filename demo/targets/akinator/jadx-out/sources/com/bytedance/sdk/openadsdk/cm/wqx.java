package com.bytedance.sdk.openadsdk.cm;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.cm.jpo;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.hx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3191e4;
import com.ironsource.C3352n2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.vungle.ads.internal.protos.Sdk;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static void cm(final dt dtVar, final String str, final int i10) {
        jpo(System.currentTimeMillis(), dtVar, str, "material_status", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.13
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i10);
                    jSONObject.put("image_mode", dtVar.iqh());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject jd(dt dtVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rv.jd(dtVar) && dtVar.cgk()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th2) {
                nmd.wqx(th2.getMessage(), new Object[0]);
            }
        }
        jpo(jSONObject);
        return jSONObject;
    }

    public static void jj(dt dtVar, String str, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, "click_playable_button", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.48
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                return jSONObject;
            }
        });
    }

    public static void my(dt dtVar, final com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar, final String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.30
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                try {
                    com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar2 = jpoVar;
                    if (jpoVar2 == null || jpoVar2.jpo() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", jpoVar.jpo());
                    jSONObject.put("hit_extra", jpoVar.jd());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", jpoVar.wqx());
                    jSONObject.put("current_url_index", jpoVar.cm());
                    jSONObject.put("arbi_start_x", jpoVar.my());
                    jSONObject.put("arbi_start_y", jpoVar.jj());
                    jSONObject.put("click_duration", jpoVar.qk());
                    jSONObject.put("is_trigger_jump", jpoVar.xyk());
                    jSONObject.put("click_type", String.valueOf(jpoVar.jr()));
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", "onWebBehaviorClick", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void wqx(dt dtVar, String str, final long j10) {
        jpo(System.currentTimeMillis(), dtVar, str, "load_feeling_duration", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.6
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", th2.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    public static void cm(dt dtVar, final com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar, final String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.29
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", jpoVar.wqx());
                    jSONObject.put("current_url_index", jpoVar.cm());
                    jSONObject.put("trigger_scroll_x", jpoVar.zz());
                    jSONObject.put("trigger_scroll_y", jpoVar.yd());
                    jSONObject.put("arbi_offset_y", jpoVar.ju());
                    jSONObject.put("scroll_type", jpoVar.m491if());
                    jSONObject.put("scroll_duration", jpoVar.au());
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", "onWebBehaviorScroll", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void jpo() throws ClassNotFoundException {
        try {
            Class.forName(wqx.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void my(dt dtVar, String str, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, "click_next_ad_button", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.47
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                return jSONObject;
            }
        });
    }

    public static void wqx(dt dtVar, String str, final int i10) {
        jpo(System.currentTimeMillis(), dtVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.8
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.au.jrx().umr());
                    return jSONObject;
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        public static void jpo(String str, final JSONObject jSONObject, dt dtVar) {
            String strJpo = tic.jpo(dtVar);
            if (strJpo == null) {
                return;
            }
            wqx.jpo(System.currentTimeMillis(), dtVar, strJpo.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.jpo.1
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    return jSONObject;
                }
            });
        }

        public static void jpo(final int i10, final int i11, dt dtVar) {
            String strJpo = tic.jpo(dtVar);
            if (strJpo == null) {
                return;
            }
            wqx.jpo(System.currentTimeMillis(), dtVar, strJpo.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.jpo.2
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i11);
                        jSONObject.put("hit_times", i10);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }

        public static void jpo(final long j10, final dt dtVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            wqx.jpo(System.currentTimeMillis(), dtVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.jpo.3
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jd() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jpo() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(dt.f20576jd, dtVar.zrw() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(iLoader, str2);
                        jSONObject.put("url", dtVar.iwg());
                        jSONObject.put("channel_name", dtVar.afh());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(dtVar.afh()) || iJpo <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iJpo);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }

        public static void jpo(final int i10, final int i11, final int i12, final int i13, final dt dtVar, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(dtVar.afh())) {
                return;
            }
            wqx.jpo(System.currentTimeMillis(), dtVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.jpo.4
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", dtVar.iwg());
                        jSONObject.put("channel_name", dtVar.afh());
                        jSONObject.put("preload_status", i10 <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i14);
                        jSONObject.put("preload_h5_type", dtVar.sz());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i10);
                        jSONObject2.put("failResourceCount", i11);
                        jSONObject2.put("successCount", i12);
                        jSONObject2.put("failCount", i13);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void cm(dt dtVar, String str, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, "show_next_ad_hint", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.46
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, String str, final int i10) {
        jpo(System.currentTimeMillis(), dtVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.1
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void wqx(final dt dtVar, String str) {
        if (dtVar == null || !dt.wqx(dtVar) || dtVar.rv() == null) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.25
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", dtVar.rv().wqx());
                    jSONObject.putOpt("id", dtVar.rv().jpo());
                    jSONObject.putOpt("md5", dtVar.rv().jd());
                    if (dtVar.ww() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(dtVar.ww().cm()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(final dt dtVar, String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.12
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (dt.wqx(dtVar)) {
                        if (dtVar.rv() != null) {
                            jSONObject.putOpt("url", dtVar.rv().wqx());
                            jSONObject.putOpt("id", dtVar.rv().jpo());
                            jSONObject.putOpt("md5", dtVar.rv().jd());
                        }
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", dtVar.ww().m375if());
                        jSONObject.putOpt("style_id", dtVar.hx());
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void jpo(final dt dtVar, String str, final long j10) {
        jpo(System.currentTimeMillis(), dtVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.22
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (dt.wqx(dtVar)) {
                        if (dtVar.rv() != null) {
                            jSONObject.putOpt("url", dtVar.rv().wqx());
                            jSONObject.putOpt("id", dtVar.rv().jpo());
                            jSONObject.putOpt("md5", dtVar.rv().jd());
                        }
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", dtVar.ww().m375if());
                        jSONObject.putOpt("style_id", dtVar.hx());
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void wqx(dt dtVar, final com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar, final String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.28
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", jpoVar.wqx());
                    jSONObject.put("current_url_index", jpoVar.cm());
                    jSONObject.put("arbi_stay_duration", jpoVar.oya());
                    jSONObject.put("browsing_percentage", jpoVar.prr());
                    jSONObject.put("out_focus_scene", jpoVar.hna());
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", "onWebBehaviorStay", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void jd(dt dtVar, String str, final long j10) {
        if (dtVar != null && j10 > 0 && j10 < 200000) {
            jpo(System.currentTimeMillis(), dtVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.3
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void jpo(final dt dtVar, String str, final long j10, final int i10, final String str2, final String str3) {
        jpo(System.currentTimeMillis(), dtVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.33
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (dt.wqx(dtVar)) {
                        if (dtVar.rv() != null) {
                            jSONObject.putOpt("url", dtVar.rv().wqx());
                            jSONObject.putOpt("id", dtVar.rv().jpo());
                            jSONObject.putOpt("md5", dtVar.rv().jd());
                        }
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", dtVar.ww().m375if());
                        jSONObject.putOpt("style_id", dtVar.hx());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void wqx(dt dtVar, String str, String str2, final JSONObject jSONObject) {
        if (dtVar == null || jSONObject == null) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.36
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jd(dt dtVar, String str, final int i10) {
        jpo(System.currentTimeMillis(), dtVar, str, "check_meta", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.7
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.au.jrx().umr());
                    return jSONObject;
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void jpo(final dt dtVar, String str, final long j10, final int i10, final int i11) {
        jpo(System.currentTimeMillis(), dtVar, str, "load", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.44
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(dtVar.cgn()));
                    jSONObject.put("first_page", i11);
                    jSONObject.put("preload_h5_type", dtVar.sz());
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i12));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void wqx(dt dtVar, String str, JSONObject jSONObject) {
        if (dtVar == null) {
            return;
        }
        jpo(dtVar, str, -1L, jSONObject);
    }

    public static void jd(final dt dtVar, String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "picture_click", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.14
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", dtVar.cxb());
                    jSONObject.put("interaction_method", dtVar.cgn());
                    return jSONObject;
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void jpo(String str, dt dtVar, String str2, final Map<String, Object> map) {
        jpo(System.currentTimeMillis(), dtVar, str2, str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.49
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void jd(dt dtVar, String str, String str2, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.18
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jpo(long j10, dt dtVar, String str, String str2, final JSONObject jSONObject) {
        jpo(j10, dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.50
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jd(final long j10, final dt dtVar, String str, final String str2) {
        jpo(System.currentTimeMillis(), dtVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.24
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (dt.wqx(dtVar)) {
                        if (dtVar.rv() != null) {
                            jSONObject.putOpt("url", dtVar.rv().wqx());
                            jSONObject.putOpt("id", dtVar.rv().jpo());
                            jSONObject.putOpt("md5", dtVar.rv().jd());
                        }
                        jSONObject.putOpt("from", str2);
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", dtVar.ww().m375if());
                        jSONObject.put("style_id", dtVar.hx());
                        if (dtVar.ww() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    @DungeonFlag
    public static void jpo(dt dtVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        jpo(dtVar, C3352n2.f37928v, str, jSONObject, jSONObject2);
    }

    public static void jd(dt dtVar, final com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar, final String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.27
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", jpoVar.wqx());
                    jSONObject.put("current_url_index", jpoVar.cm());
                    jSONObject.put("arbi_load_duration", jpoVar.opi());
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", "onWebBehaviorLoad", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    private static void jpo(final dt dtVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (dtVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (dtVar.tic() && C3352n2.f37928v.equals(str)) {
            return;
        }
        if (C3352n2.f37928v.equals(str)) {
            dtVar.qk(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        jpo(new com.bytedance.sdk.component.xyk.xyk("onShow") { // from class: com.bytedance.sdk.openadsdk.cm.wqx.51
            @Override // java.lang.Runnable
            public void run() {
                final String strJpo;
                if (com.bytedance.sdk.openadsdk.core.sq.cm().et()) {
                    strJpo = com.bytedance.sdk.openadsdk.core.yd.jpo.jpo.jpo((Application) com.bytedance.sdk.openadsdk.core.sq.jpo()).jpo(str2, DeviceUtils.jpo(), dtVar.jl());
                } else {
                    strJpo = "none";
                }
                wqx.jpo(jCurrentTimeMillis, dtVar, str2, str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.51.1
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                        JSONObject jSONObject3 = jSONObject2;
                        JSONObject jSONObjectJd = jSONObject3 == null ? wqx.jd(dtVar, new JSONObject()) : wqx.jd(dtVar, jSONObject3);
                        if (C3352n2.f37928v.equals(str)) {
                            com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jSONObjectJd, dtVar.jp());
                        }
                        return jSONObjectJd;
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject wqx() {
                        try {
                            AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                            JSONObject jSONObject3 = jSONObject;
                            if (jSONObject3 != null) {
                                jSONObject3.put("interaction_method", dtVar.cgn());
                                AnonymousClass51 anonymousClass512 = AnonymousClass51.this;
                                jSONObject.put("real_interaction_method", dtVar.jkt());
                                jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.sq.cm().mo479if(String.valueOf(dtVar.jl())));
                                jSONObject.put("au_show", strJpo);
                                return jSONObject;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", dtVar.cgn());
                            jSONObject4.put("real_interaction_method", dtVar.jkt());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.sq.cm().mo479if(String.valueOf(dtVar.jl())));
                            jSONObject4.put("au_show", strJpo);
                            return jSONObject4;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jd() throws JSONException {
                        Object obj;
                        try {
                            hx.jd(dtVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", dtVar.fxd());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - dtVar.iy()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(dtVar.np()));
                                String strVk = dtVar.vk();
                                if (!TextUtils.isEmpty(strVk) && !TextUtils.isEmpty(strVk)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strVk) * 100000.0f));
                                    } catch (Throwable th2) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        nmd.wqx("TTAD.AdEvent", th2.getMessage());
                                    }
                                }
                                if (dtVar.gy() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = dtVar.gy().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = dtVar.gy().get(YsiBvdpw.WFB)) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th3) {
                                    nmd.jpo("TTAD.AdEvent", "client bidding price error: ", th3);
                                    return jSONObject3;
                                }
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if (C3352n2.f37928v.equals(str)) {
                    if (!dtVar.dd()) {
                        if (dtVar.aul()) {
                            com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jpo(dtVar.fp(), new wqx.jd("show_urls", dtVar));
                        } else {
                            wqx.jpo(dtVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (dtVar.dm() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.zz.jpo().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.51.2
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        AnonymousClass51 anonymousClass51 = AnonymousClass51.this;
                                        wqx.jd(dtVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                        nmd.wqx("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.au.jrx().erj());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.yd.wqx.jpo(dtVar, strJpo);
                }
            }
        });
    }

    public static void jd(dt dtVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        if (dtVar == null || jSONObject == null) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.35
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jd(dt dtVar, String str, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.f19523jj, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.38
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                return jSONObject;
            }
        });
    }

    public static void jd(dt dtVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        jpo(dtVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    public static void jd(dt dtVar, String str, int i10, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        jd(dtVar, str, "download_app_ad_track", jSONObject);
    }

    private static void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectJpo = xyk.jpo();
            if (jSONObjectJpo != null) {
                Iterator<String> itKeys = jSONObjectJpo.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectJpo.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(dt dtVar) {
        if (TextUtils.isEmpty(Cif.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(dtVar.fp(), true), 1, dtVar.fc());
    }

    @DungeonFlag
    public static void jpo(final String str, final dt dtVar, final String str2, final qk qkVar) {
        if (dtVar == null || qkVar == null || !qkVar.jpo()) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.52
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                try {
                    qk qkVar2 = qkVar;
                    if (qkVar2 == null || qkVar2.jd() == null) {
                        return null;
                    }
                    JSONObject jSONObjectJd = qkVar.jd();
                    if (str2.equals("open_ad")) {
                        jSONObjectJd.put("is_icon_only", dtVar.se() ? 1 : 0);
                    }
                    return jSONObjectJd;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void jpo(final dt dtVar, final String str, final dm dmVar) {
        if (dtVar == null) {
            return;
        }
        final long jCm = dmVar.cm();
        jpo(System.currentTimeMillis(), dtVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.2
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jCm);
                    jSONObject.put("click_time", dmVar.jpo);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", dtVar.se() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, final String str, final int i10, final String str2, final long j10, final boolean z10, final int i11, final long j11) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.f19521cm, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.4
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j10);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j11);
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, String str, final long j10, final boolean z10) {
        jpo(System.currentTimeMillis(), dtVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.5
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                    return jSONObject;
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z10 ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void jpo(dt dtVar, String str, final int i10, final String str2, final int i11) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.jpo, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.9
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i11);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, final String str, final int i10, final String str2, final float f10) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.f19522jd, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.10
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, final String str, final int i10, final String str2, final String str3, final int i11) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.wqx, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.11
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i11);
                } catch (Throwable th2) {
                    nmd.wqx(th2.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void jpo(final String str, final dt dtVar, final com.bytedance.sdk.openadsdk.core.model.Cif cif, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        jpo(new com.bytedance.sdk.component.xyk.xyk("onClick") { // from class: com.bytedance.sdk.openadsdk.cm.wqx.15
            @Override // java.lang.Runnable
            public void run() {
                dt dtVar2 = dtVar;
                if (dtVar2 == null) {
                    return;
                }
                wqx.jpo(jCurrentTimeMillis, dtVar2, str2, str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.15.1
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jd() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.Cif cif2 = cif;
                            if (cif2 != null) {
                                JSONObject jSONObjectJpo = cif2.jpo();
                                jSONObjectJpo.put("is_valid", z10);
                                int i11 = i10;
                                if (i11 > 0 && i11 <= 2) {
                                    jSONObjectJpo.put("user_behavior_type", i11);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey(IronSourceConstants.EVENTS_DURATION)) {
                                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, map.get(IronSourceConstants.EVENTS_DURATION));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!IronSourceConstants.EVENTS_DURATION.equals(entry.getKey())) {
                                            jSONObjectJpo.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectJpo.put("interaction_method", dtVar.cgn());
                                if (str2.equals("open_ad")) {
                                    jSONObjectJpo.put("is_icon_only", dtVar.se() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectJpo.toString());
                            }
                            jSONObject.putOpt("log_extra", dtVar.fxd());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - dtVar.iy()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(dtVar.np()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(Cif.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(dtVar.mg(), true), 2, dtVar.fc());
                }
                if ("click".equals(str)) {
                    hx.wqx(dtVar);
                }
            }
        });
    }

    public static void jpo(dt dtVar, String str, String str2, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.16
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!jSONObject.has(IronSourceConstants.EVENTS_DURATION)) {
                        return jSONObject2;
                    }
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, jSONObject.get(IronSourceConstants.EVENTS_DURATION));
                    return jSONObject2;
                } catch (Exception e10) {
                    nmd.wqx("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
        if ("click".equals(str2)) {
            hx.wqx(dtVar);
        }
    }

    public static void jpo(dt dtVar, String str, final String str2, final long j10, final int i10, JSONObject jSONObject, final qk qkVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.17
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(IronSourceConstants.EVENTS_DURATION, j10);
                    jSONObject3.put("percent", i10);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                qk qkVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (qkVar2 = qkVar) != null) {
                        qkVar2.jpo(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void jpo(dt dtVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.19
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jpo(final dt dtVar, String str, String str2, final Map<String, Object> map) {
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.20
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get(IronSourceConstants.EVENTS_DURATION);
                        if (obj instanceof Long) {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", dtVar.tda());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void jpo(long j10, dt dtVar, String str, String str2) {
        jpo(j10, dtVar, str, str2, (com.bytedance.sdk.openadsdk.prr.wqx.jd) null);
    }

    @DungeonFlag
    public static void jpo(final long j10, final dt dtVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.prr.wqx.jd jdVar) {
        if (dtVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || jpo(dtVar.xk(), str2)) {
            return;
        }
        jpo(new com.bytedance.sdk.component.xyk.xyk(str2) { // from class: com.bytedance.sdk.openadsdk.cm.wqx.21
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.prr.wqx.jd jdVar2 = jdVar;
                    if (jdVar2 != null) {
                        jSONObject = jdVar2.jd();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    com.bytedance.sdk.openadsdk.prr.wqx.jd jdVar3 = jdVar;
                    if (jdVar3 != null) {
                        JSONObject jSONObjectJpo = jdVar3.jpo();
                        JSONObject jSONObjectWqx = jdVar.wqx();
                        if (jSONObjectJpo != null) {
                            if (jSONObjectWqx == null) {
                                jSONObjectWqx = new JSONObject();
                            }
                            jSONObjectWqx.put("pag_json_data", jSONObjectJpo.toString());
                            jSONObject.put("ad_extra_data", jSONObjectWqx.toString());
                        } else if (jSONObjectWqx != null) {
                            jSONObject.put("ad_extra_data", jSONObjectWqx.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", dtVar.fxd());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(dtVar.np()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new jpo.C0102jpo(j10, dtVar).jd(str).wqx(str2).my(dtVar.fc()).xyk(dtVar.roc()).jpo(dtVar.oo()).jpo(jSONObject).qk(dtVar.hbg()).jpo((com.bytedance.sdk.openadsdk.cm.jd.jpo) null);
            }
        });
    }

    public static void jpo(dt dtVar, String str, final String str2, final int i10) {
        jpo(System.currentTimeMillis(), dtVar, str, "playable_track", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.23
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i10);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, final com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar, final String str) {
        jpo(System.currentTimeMillis(), dtVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.26
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", jpoVar.wqx());
                    jSONObject.put("keyword", jpoVar.sq());
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.AdEvent", "onWebBehaviorKeyword", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(final long j10, final dt dtVar, String str) {
        if (dtVar == null || !dt.wqx(dtVar) || dtVar.rv() == null) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.31
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", dtVar.rv().wqx());
                    jSONObject.putOpt("id", dtVar.rv().jpo());
                    jSONObject.putOpt("md5", dtVar.rv().jd());
                    if (dtVar.ww() == null) {
                        return jSONObject;
                    }
                    jSONObject.putOpt("render_type", Integer.valueOf(dtVar.ww().cm()));
                    return jSONObject;
                } catch (Exception e10) {
                    nmd.wqx(e10.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    public static void jpo(dt dtVar, String str, final String str2) {
        jpo(System.currentTimeMillis(), dtVar, str, "show_error", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.32
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("error_msg", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, String str, String str2, final long j10, final JSONObject jSONObject) {
        if (dtVar == null || jSONObject == null) {
            return;
        }
        jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.34
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j10);
                    return jSONObject2;
                } catch (Exception e10) {
                    nmd.wqx("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                return jSONObject;
            }
        });
    }

    public static void jpo(dt dtVar, String str, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, str, jd.my, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.37
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                return jSONObject;
            }
        });
    }

    public static void jpo(String str, long j10) {
        com.bytedance.sdk.openadsdk.core.xyk.wqx.jpo(str, j10);
    }

    @DungeonFlag
    public static void jpo(final dt dtVar, final String str, final String str2, final String str3, final long j10, final long j11, final JSONObject jSONObject, final boolean z10) {
        if (dtVar == null || jpo(dtVar.xk(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        jpo(new com.bytedance.sdk.component.xyk.xyk("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.cm.wqx.39
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONArray jSONArrayOptJSONArray;
                String strOo = dtVar.oo();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(C3191e4.h.G, DeviceUtils.qk(com.bytedance.sdk.openadsdk.core.sq.jpo()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (rv.jd(dtVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (dtVar.cgk()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (dtVar.ndv()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.au.jpo.wqx(dtVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", dtVar.sbz() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && iOptInt == 2) {
                            strOo = jSONObject2.optString("app_log_url");
                        }
                        int i10 = 0;
                        if ("click".equals(str3)) {
                            hx.wqx(dtVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - dt.jd(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(Cif.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()))) {
                                if (z10 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(arrayList, true), 2, String.valueOf(j10));
                                    }
                                } else {
                                    dt dtVar2 = dtVar;
                                    if (dtVar2 != null) {
                                        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(dtVar2.mg(), true), 2, dtVar.fc());
                                    }
                                }
                            }
                        } else if (C3352n2.f37928v.equals(str3) && !TextUtils.isEmpty(Cif.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo())) && z10 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(arrayList2, true), 1, String.valueOf(j10));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new jpo.C0102jpo(jCurrentTimeMillis, dtVar).cm(str).jd(str2).wqx(str3).my(String.valueOf(j10)).jj(String.valueOf(j11)).jpo(strOo).jpo(jSONObject).xyk(dtVar.roc()).qk(dtVar.hbg()).jpo((com.bytedance.sdk.openadsdk.cm.jd.jpo) null);
            }
        });
    }

    public static void jpo(final dt dtVar, String str, final long j10, final JSONObject jSONObject) {
        jpo(System.currentTimeMillis(), dtVar, "open_ad", str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.40
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 == -1) {
                        return jSONObject2;
                    }
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j11);
                    return jSONObject2;
                } catch (Exception e10) {
                    nmd.wqx("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jSONObject2, dtVar.jp());
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    return jSONObject2 != null ? jSONObject2 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static void jpo(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (xykVar == null) {
            return;
        }
        if (duq.jj()) {
            com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.41
                @Override // java.lang.Runnable
                public void run() {
                    duq.jd(xykVar, 10);
                }
            });
        } else if (!duq.qk()) {
            duq.jd(xykVar, 10);
        } else {
            xykVar.run();
        }
    }

    public static void jpo(final com.bytedance.sdk.openadsdk.prr.jpo.jd jdVar) {
        if (jdVar == null || jdVar.jd() == null) {
            return;
        }
        final dt dtVarJd = jdVar.jd();
        final int iPzk = dtVarJd.pzk();
        if (iPzk == 2 || iPzk == 8 || (tic.cm(dtVarJd) && jd.jpo.f19526cm.equals(jdVar.jpo()))) {
            jpo(System.currentTimeMillis(), dtVarJd, jdVar.wqx(), "open_browser", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.42
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iCm = jdVar.cm();
                        jSONObject.put("count", tic.yd(com.bytedance.sdk.openadsdk.core.sq.jpo()));
                        jSONObject.put("interceptor", iCm);
                        jSONObject.put("success", jdVar.my());
                        jSONObject.put("link", jdVar.jpo());
                        jSONObject.put("interaction_type", iPzk);
                        jSONObject.put("real_interaction_type", jdVar.qk());
                        if (jdVar.cm() == 9) {
                            jSONObject.put("is_act_signals_api_available", jdVar.xyk());
                            jSONObject.put("is_act_signals_callback", jdVar.zz());
                        }
                        if (!TextUtils.isEmpty(jdVar.jj())) {
                            jSONObject.put("exception_msg", jdVar.jj());
                        }
                        if (iCm == 2 || iCm == 5) {
                            String strKfh = dtVarJd.kfh();
                            if (!TextUtils.isEmpty(strKfh) && (jSONArrayOptJSONArray = new JSONObject(strKfh).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put("meta", jSONArrayOptJSONArray.optJSONObject(dtVarJd.wqx()));
                            }
                        }
                        return jSONObject;
                    } catch (Throwable th2) {
                        nmd.wqx("TTAD.AdEvent", th2.getMessage());
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void jpo(JSONObject jSONObject, int i10, int i11) throws JSONException {
        try {
            jSONObject.put("skip_show_time", i10);
            jSONObject.put("skip_time", i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i11 - (i10 * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    public static void jpo(dt dtVar, String str, int i10, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        jd(dtVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void jpo(dt dtVar, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        jpo(System.currentTimeMillis(), dtVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.43
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z10);
                    jSONObject.put("force", z11);
                    jSONObject.put("isFromLandingPage", z12);
                    jSONObject.put("finishing", z13);
                    jSONObject.put("from", i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jpo(final dt dtVar, final boolean z10, String str, final String str2, final long j10, final String str3, final String str4, final int i10, final String str5) {
        jpo(System.currentTimeMillis(), dtVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.wqx.45
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                dt.jpo jpoVarVzb;
                kln klnVarJrx;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3") && (klnVarJrx = dtVar.jrx()) != null) {
                                jSONObject.putOpt("url", klnVarJrx.wqx());
                                jSONObject.putOpt("id", klnVarJrx.jpo());
                                jSONObject.putOpt("md5", klnVarJrx.jd());
                            }
                        } else if (str6.equals("ad") && (jpoVarVzb = dtVar.vzb()) != null) {
                            jSONObject.putOpt("url", jpoVarVzb.au());
                            jSONObject.putOpt("id", jpoVarVzb.cm());
                            jSONObject.putOpt("md5", jpoVarVzb.oya());
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        if (z10) {
                            com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVarUu = dtVar.uu();
                            if (jpoVarUu != null) {
                                jSONObject.putOpt("url", jpoVarUu.wqx());
                                jSONObject.putOpt("id", jpoVarUu.jpo());
                                jSONObject.putOpt("md5", jpoVarUu.jd());
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVarRv = dtVar.rv();
                            if (jpoVarRv != null) {
                                jSONObject.putOpt("url", jpoVarRv.wqx());
                                jSONObject.putOpt("id", jpoVarRv.jpo());
                                jSONObject.putOpt("md5", jpoVarRv.jd());
                            }
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put("from", str3);
                    jSONObject.put("ugen_scene", str4);
                    if (C3191e4.f.f36439e.equals(str2)) {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th2) {
                    try {
                        jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th2.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }
        });
    }

    private static boolean jpo(int i10, String str) {
        int iHx;
        try {
            Set<String> setZw = com.bytedance.sdk.openadsdk.core.settings.au.jrx().zw();
            if ((i10 == 1 && setZw != null && setZw.contains(str)) || (iHx = com.bytedance.sdk.openadsdk.core.settings.au.jrx().hx(str)) == 0) {
                return true;
            }
            if (iHx != 100) {
                if (((int) ((Math.random() * 100.0d) + 1.0d)) > iHx) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            nmd.wqx("TTAD.AdEvent", th2.getMessage());
            return false;
        }
    }

    public static JSONObject jpo(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i10);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
