package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cm.jpo.oya;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.settings.Cif;
import com.bytedance.sdk.openadsdk.core.settings.ju;
import com.bytedance.sdk.openadsdk.core.settings.my;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3352n2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.sfbx.appconsent.core.IABConstants;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au implements jj, ju.jpo {

    /* renamed from: cm, reason: collision with root package name */
    public static String f20838cm;

    /* renamed from: if, reason: not valid java name */
    private static boolean f139if;

    /* renamed from: jd, reason: collision with root package name */
    public static final String f20839jd;

    /* renamed from: jj, reason: collision with root package name */
    static final ConcurrentHashMap<String, Integer> f20840jj;
    public static final String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private static final com.bytedance.sdk.component.xyk.xyk f20841ju;
    public static String my;
    private static final ConcurrentLinkedQueue<Cif.jpo> nmd;
    private static String pdm;

    /* renamed from: rq, reason: collision with root package name */
    private static final xyk f20842rq;
    public static final String wqx;
    private static final String zz;

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.settings.jpo f20843au;

    /* renamed from: dt, reason: collision with root package name */
    private final Runnable f20844dt;
    private final my.jd<Map<String, Integer>> hmu;
    private volatile boolean hna;

    /* renamed from: hx, reason: collision with root package name */
    private my.jd<JSONObject> f20845hx;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f20846jr;

    /* renamed from: nq, reason: collision with root package name */
    private final Set<String> f20847nq;
    private int opi;
    private final yd oya;
    private final AtomicBoolean prr;

    /* renamed from: qk, reason: collision with root package name */
    final my.jd<ConcurrentHashMap<String, Integer>> f20848qk;

    /* renamed from: se, reason: collision with root package name */
    private final my.jd<Set<String>> f20849se;

    /* renamed from: sq, reason: collision with root package name */
    private int f20850sq;

    /* renamed from: tu, reason: collision with root package name */
    private final BroadcastReceiver f20851tu;
    my.jd<oya> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Set<String> f20852yd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.au$9, reason: invalid class name */
    public class AnonymousClass9 extends BroadcastReceiver {

        /* renamed from: jd, reason: collision with root package name */
        private final Runnable f20854jd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.9.1
            @Override // java.lang.Runnable
            public void run() {
                duq.jd(new com.bytedance.sdk.component.xyk.xyk("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.au.9.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            au.this.jd();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass9() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            duq.jd(new com.bytedance.sdk.component.xyk.xyk("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.au.9.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        au.this.jpo(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.zz.jpo().removeCallbacks(AnonymousClass9.this.f20854jd);
                        com.bytedance.sdk.component.utils.zz.jpo().postDelayed(AnonymousClass9.this.f20854jd, 10000L);
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {
        static final au jpo = new au();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", tic.rv()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) "_");
        sb2.append(charSequenceArr[1]);
        jpo = sb2.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", tic.rv(), tic.pdm(), "timeout"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i10 = 1; i10 < 4; i10++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[i10]);
        }
        f20839jd = sb3.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", tic.rv(), tic.pdm(), "alpha"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        for (int i11 = 1; i11 < 4; i11++) {
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[i11]);
        }
        wqx = sb4.toString();
        zz = tic.tu();
        f20841ju = new com.bytedance.sdk.component.xyk.xyk("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.au.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.jpo.jd.my.jd().zz();
                com.bytedance.sdk.component.adexpress.jpo.jd.my.jd().jd(false);
                com.bytedance.sdk.component.adexpress.jpo.jd.jd.jd();
                com.bytedance.sdk.component.adexpress.jpo.jd.my.jd().wqx();
            }
        };
        f20838cm = "";
        my = "IABTCF_TCString";
        f139if = false;
        nmd = new ConcurrentLinkedQueue<>();
        f20842rq = new xyk();
        f20840jj = new ConcurrentHashMap<>();
    }

    public static boolean as() {
        return f139if;
    }

    private static SharedPreferences cm(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String czp() {
        if (pdm == null) {
            String strJd = com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("settings_host_from_meta", "");
            pdm = strJd;
            if (strJd == null) {
                pdm = "";
            }
        }
        return pdm;
    }

    private String fgt() {
        return this.oya.jpo("force_language", "");
    }

    public static jj jrx() {
        if (sq.jpo() != null) {
            return jpo.jpo;
        }
        IllegalStateException illegalStateException = new IllegalStateException("context is null");
        Log.e("TTAD.SdkSettings", "context is null", illegalStateException);
        ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
        return f20842rq;
    }

    public static void kgu() {
        Context contextJpo;
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx() && (contextJpo = sq.jpo()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextJpo.getPackageName());
                intent.setAction("_dataChanged");
                contextJpo.sendBroadcast(intent);
            } catch (Throwable th2) {
                nmd.jpo("TTAD.SdkSettings", "", th2);
            }
        }
    }

    public static String wqx(Context context) {
        SharedPreferences sharedPreferencesCm;
        return (context == null || (sharedPreferencesCm = cm(context)) == null) ? "" : sharedPreferencesCm.getString(my, "");
    }

    private Set<String> zrw() {
        return (Set) this.oya.jpo("perf_con_applog_send", this.f20847nq, this.f20849se);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean aix() {
        return this.oya.jpo("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int au() {
        zrw();
        return this.f20850sq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int cgn() {
        return this.oya.jpo("bus_con_send_log_type", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean cql() {
        return this.oya.jpo("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String cz() {
        return this.oya.jpo("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean dm() {
        int iJpo = this.oya.jpo("privacy_ad_enable", Integer.MAX_VALUE);
        if (iJpo == 1) {
            return true;
        }
        if (iJpo == 0) {
            return false;
        }
        int iHmu = tic.hmu();
        return iHmu == 1 || iHmu == 2 || iHmu == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int dn() {
        return this.oya.jpo("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int dt() {
        int iJpo = this.oya.jpo("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iJpo <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int duq() {
        return this.oya.jpo("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String ef() {
        return this.oya.jpo("dc", "TX");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void eq() {
        my.jpo jpoVarJpo = this.oya.jpo();
        jpoVarJpo.jpo("settings_url", "");
        jpoVarJpo.jpo();
        rv("");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int erj() {
        int iJpo = this.oya.jpo("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iJpo <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean et() {
        return this.oya.jpo("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String ez() {
        return this.oya.jpo("target_region", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean fy() {
        return this.oya.jpo("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean gf() {
        return this.oya.jpo("token_enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public float gmx() {
        return this.oya.jpo(wqx, 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean hks() {
        return this.oya.jpo("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int hmu() {
        int iJpo = this.oya.jpo("fetch_tpl_second", 0);
        if (iJpo <= 0) {
            return 0;
        }
        return iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean hna() {
        return this.oya.jpo("ad_revenue_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int huv() {
        int iJpo = this.oya.jpo("perf_con_webview_cache_count", 0);
        if (iJpo < 0) {
            return 0;
        }
        return iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int hx(String str) {
        Integer num;
        Map map = (Map) this.oya.jpo("perf_con_applog_rate", null, this.hmu);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean ic() {
        return this.oya.jpo("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    /* renamed from: if, reason: not valid java name */
    public int mo478if() {
        zrw();
        return this.opi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public long ii() {
        return this.oya.jpo("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public long jj() {
        return this.oya.jpo("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean jkt() {
        if (com.bytedance.sdk.component.adexpress.cm.jd.jpo(sq.jpo())) {
            return this.oya.jpo("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean jr() {
        return this.oya.jpo("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public Set<String> ju() {
        return zrw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int kb() {
        return this.oya.jpo("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String kln() {
        return this.oya.jpo("dyn_draw_engine_url", zz);
    }

    public long lq() {
        long jJpo = this.oya.jpo("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jJpo < 0 || jJpo > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public JSONObject my() {
        return (JSONObject) this.oya.jpo("digest", null, my.jpo);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public long nmd() {
        return this.oya.jpo(IronSourceConstants.EVENTS_DURATION, 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public Set<String> np() {
        return (Set) this.oya.jpo("privacy_fields_allowed", Collections.EMPTY_SET, my.f20881jd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void nq() {
        String strFgt = fgt();
        if (TextUtils.isEmpty(strFgt)) {
            return;
        }
        if (strFgt.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.Cif.jpo(sq.jpo(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.Cif.jpo(sq.jpo(), strFgt, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th2) {
            nmd.wqx("TTAD.SdkSettings", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int nzb() {
        return this.oya.jpo("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String opi() {
        return this.oya.jpo("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean ota() {
        return this.oya.jpo("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean oya() {
        return this.oya.jpo("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String pdm() {
        return this.oya.jpo("settings_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean pe() {
        return this.oya.jpo("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean prr() {
        return this.oya.jpo("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void qk() {
        this.oya.jpo().jpo("tt_sdk_settings").jpo("ab_test_param").jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String ree() {
        return this.oya.jpo("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean roc() {
        return this.oya.jpo("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int rq() {
        return this.oya.jpo("max", 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String rv() {
        return this.oya.jpo("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int rxq() {
        return this.oya.jpo("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean rzi() {
        return this.oya.jpo("bus_con_video_keep_screen_on", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public JSONObject sbx() {
        return (JSONObject) this.oya.jpo("video_cache_config", null, my.jpo);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean se() {
        return this.oya.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int sg() {
        return this.oya.jpo(f20839jd, 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int sq() {
        return this.oya.jpo("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int sz() {
        return this.oya.jpo("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int tic() {
        int iJpo = this.oya.jpo("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iJpo != Integer.MAX_VALUE) {
            return iJpo;
        }
        int iHmu = tic.hmu();
        if (iHmu == 1 || iHmu == 2) {
            return 2;
        }
        return iHmu != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String tl() {
        return this.oya.jpo("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public qk tu() {
        return (qk) this.oya.jpo("insert_js_config", qk.jpo, new my.jd<qk>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public qk jd(String str) {
                return new qk(str);
            }
        });
    }

    public long uhu() {
        return this.oya.jpo("last_req_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean umr() {
        return this.oya.jpo("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String uu() {
        return this.oya.jpo("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public JSONObject ux() {
        return (JSONObject) this.oya.jpo("perf_con_thread_pool_config", new JSONObject(), this.f20845hx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean va() {
        int iJpo = this.f20843au.jpo("perf_con_apm", 100);
        if (iJpo == 0) {
            return false;
        }
        return iJpo < 0 || iJpo >= 100 || iJpo > ((int) (Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public oya vk() {
        return (oya) this.oya.jpo("perf_con_track_url_strategy", oya.jpo, this.xyk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int voc() {
        return this.oya.jpo("bus_con_behavior_count", 300);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean vrc() {
        return this.oya.jpo("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean vzb() {
        return this.oya.jpo("privacy_app_reg", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int wad() {
        int iJpo = this.oya.jpo("bus_con_token_thread_count", 4);
        if (iJpo <= 0 || iJpo > 30) {
            return 4;
        }
        return iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String[] wcn() {
        Set<String> set;
        try {
            set = this.f20852yd;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.oya.jpo("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f20852yd.add(jSONArray.getString(i10));
                }
            }
            Set<String> setJpo = yd.jpo(this.f20852yd);
            this.f20852yd = setJpo;
            if (setJpo != null) {
                if (setJpo.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.f20852yd.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean wu() {
        return this.oya.jpo(jpo, false);
    }

    public void ww() {
        if (ju.jpo()) {
            com.bytedance.sdk.openadsdk.core.oya.jd().removeCallbacks(this.f20844dt);
            com.bytedance.sdk.openadsdk.core.oya.jd().postDelayed(this.f20844dt, lq());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean xk() {
        return this.hna;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean xyk() {
        return this.oya.jpo("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int ya() {
        int iJpo = this.oya.jpo("perf_con_webview_cache_count_v3", 0);
        if (iJpo < 0) {
            return 0;
        }
        return iJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int yd() {
        return this.oya.jpo("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean ykp() {
        return this.oya.jpo("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int yq() {
        return this.oya.jpo("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public Set<String> zw() {
        return (Set) this.oya.jpo("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, my.f20881jd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String zz() {
        return this.oya.jpo("ab_test_version", "");
    }

    private au() {
        this.f20852yd = Collections.synchronizedSet(new HashSet());
        this.f20843au = new com.bytedance.sdk.openadsdk.core.settings.jpo();
        this.oya = new yd(new Cif.jpo() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jd() {
                if (au.nmd == null || au.nmd.isEmpty()) {
                    return;
                }
                Iterator it = au.nmd.iterator();
                while (it.hasNext()) {
                    ((Cif.jpo) it.next()).jd();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jpo() {
                Cif.jpo[] jpoVarArr;
                boolean unused = au.f139if = true;
                if (au.nmd == null || au.nmd.size() == 0 || (jpoVarArr = (Cif.jpo[]) au.nmd.toArray()) == null) {
                    return;
                }
                for (Cif.jpo jpoVar : jpoVarArr) {
                    jpoVar.jpo();
                }
            }
        });
        this.prr = new AtomicBoolean(false);
        this.hna = false;
        this.f20850sq = 5000;
        this.opi = 10;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        this.f20851tu = anonymousClass9;
        this.f20844dt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.10
            @Override // java.lang.Runnable
            public void run() {
                au.this.cm(2);
                au.this.ww();
            }
        };
        this.f20848qk = new my.jd<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.11
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> jd(String str) {
                if (TextUtils.isEmpty(str)) {
                    return au.f20840jj;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                    return concurrentHashMap;
                } catch (JSONException e10) {
                    Log.i("TTAD.SdkSettings", e10.getMessage());
                    return concurrentHashMap;
                }
            }
        };
        this.hmu = new my.jd<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.12
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> jd(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e10) {
                    nmd.wqx(e2.l(e10, new StringBuilder("get applog rate from sp failed:")), new Object[0]);
                    return null;
                }
            }
        };
        this.f20847nq = new HashSet();
        this.f20849se = new my.jd<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Set<String> jd(String str) throws JSONException {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            au.this.opi = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            au.this.f20850sq = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        Log.i("TTAD.SdkSettings", e10.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", C3352n2.f37928v, "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.f20845hx = new my.jd<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public JSONObject jd(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.SdkSettings", th2.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.xyk = new my.jd<oya>() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public oya jd(String str) {
                oya oyaVar = new oya();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    oyaVar.jpo(jSONObject.optInt("enable_strategy", 0) == 1);
                    oyaVar.jpo(jpo(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            oyaVar.jpo(next, jpo(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return oyaVar;
            }

            private oya.jpo jpo(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new oya.jpo(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextJpo = sq.jpo();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextJpo.registerReceiver(anonymousClass9, intentFilter, 4);
            } else {
                contextJpo.registerReceiver(anonymousClass9, intentFilter);
            }
        } catch (Exception e10) {
            nmd.jpo("TTAD.SdkSettings", "", e10);
        }
    }

    public static void rv(String str) {
        if (str == null) {
            str = "";
        }
        String strCzp = czp();
        if (strCzp == null || !strCzp.equals(str)) {
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("settings_host_from_meta", str);
            pdm = str;
            jrx().jpo(8, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int cm() {
        return this.oya.jpo("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean dt(String str) {
        return nq(str).f20878uu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean hmu(String str) {
        return sq.cm().nq(str).prr == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean hna(String str) {
        return str == null || DeviceUtils.yd(sq.jpo()) == 0 || nq(str).f20863au == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int jj(String str) {
        return nq(str).opi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean jr(String str) {
        return nq(str).f20873rq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean ju(String str) {
        try {
            return nq(str).f20865dt != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean my(String str) {
        return nq(str).f20872qk == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int nmd(String str) {
        return nq(str).f20871nq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int opi(String str) {
        return nq(str).nmd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int oya(String str) {
        return nq(str).f20879yd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean pdm(String str) {
        Set set;
        if (TextUtils.isEmpty(str) || (set = (Set) this.oya.jpo("token_adx_ids", Collections.EMPTY_SET, my.f20881jd)) == null || set.size() == 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean prr(String str) {
        return nq(str).f20877tu == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean qk(String str) {
        return str == null || nq(str).oya == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int rq(String str) {
        return nq(str).f20875se;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean se(String str) {
        Set set = (Set) this.oya.jpo("privacy_fields_allowed", Collections.EMPTY_SET, my.f20881jd);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iHmu = tic.hmu();
        if (iHmu != 1) {
            if (iHmu != 2 && iHmu != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public JSONObject sq(String str) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.oya.jpo("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", nq(str).kln);
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                nmd.wqx("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int tu(String str) {
        return nq(str).f20866hx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int xyk(String str) {
        if (str == null) {
            return 1500;
        }
        return nq(str).hna;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int yd(String str) {
        return nq(str).f140if;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int zz(String str) {
        return nq(str).f20870ju;
    }

    private static void jd(int i10, boolean z10) {
        Context contextJpo = sq.jpo();
        if (contextJpo != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextJpo.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z10);
                intent.putExtra("_source", i10);
                contextJpo.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean au(String str) {
        return mo479if(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean cm(String str) {
        int i10 = nq(str).my;
        if (i10 != 1) {
            return i10 == 2 && opi.wqx(sq.jpo()) != 0;
        }
        return opi.cm(sq.jpo());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    /* renamed from: if, reason: not valid java name */
    public int mo479if(String str) {
        return nq(String.valueOf(str)).xyk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jpo() {
        try {
            wqx.jpo();
            this.oya.wqx();
            this.f20843au.wqx();
            Context contextJpo = sq.jpo();
            File file = new File(new File(contextJpo.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextJpo.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String wqx() {
        return this.oya.jpo("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public String hx() {
        return this.oya.jpo("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean wqx(String str) {
        return nq(str).pdm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void cm(int i10) {
        jpo(i10, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int wqx(int i10) {
        return nq(String.valueOf(i10)).zz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public jd nq(String str) {
        return wqx.jpo(str);
    }

    public static int jd(Context context) {
        SharedPreferences sharedPreferencesCm;
        if (context == null || (sharedPreferencesCm = cm(context)) == null) {
            return -2;
        }
        int i10 = sharedPreferencesCm.getInt(IABConstants.CMP_SDK_ID, Integer.MIN_VALUE);
        int i11 = sharedPreferencesCm.getInt(IABConstants.CMP_SDK_VERSION, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesCm.getInt("IABTCF_gdprApplies", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jpo(JSONObject jSONObject, my.jpo jpoVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        yd ydVar = this.oya;
        String str = zz;
        String strJpo = ydVar.jpo("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strJpo) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strJpo)) {
            com.bytedance.sdk.openadsdk.core.oya.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(au.this.oya.jpo("dyn_draw_engine_url", au.zz), strOptString)) {
                        com.bytedance.sdk.component.adexpress.jpo.jd.my.jd().wqx();
                    }
                }
            }, 5000L);
        }
        jpoVar.jpo("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public synchronized void jd() {
        SystemClock.elapsedRealtime();
        boolean z10 = this.hna;
        this.f20843au.jpo(this.hna);
        this.oya.jpo(this.hna);
        wqx.jpo(!z10);
        this.hna = true;
        SystemClock.elapsedRealtime();
        if (!z10) {
            com.bytedance.sdk.openadsdk.core.oya.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.au.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!ju.jpo()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jd();
                    } else {
                        au.this.cm(1);
                        au.this.ww();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int jpo(String str) {
        if (str == null) {
            return 0;
        }
        return sq.cm().nq(str).f20869jr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int jpo(String str, int i10) {
        Integer num;
        Map map = (Map) this.oya.jpo("perf_con_stats_rate", f20840jj, this.f20848qk);
        return (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? i10 : num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jd(JSONObject jSONObject, my.jpo jpoVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            jpoVar.jpo("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int jpo(int i10) {
        return nq(String.valueOf(i10)).sz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean jd(String str) {
        return nq(str).wqx == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jpo(long j10) {
        this.oya.jpo().jpo("last_req_time", j10).jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public int jd(int i10) {
        return nq(String.valueOf(i10)).f20867jd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jpo(int i10, boolean z10) {
        if (!com.bytedance.sdk.openadsdk.core.oya.my() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.f20846jr = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.zz.jd().cm())) {
                return;
            }
            if (this.f20846jr) {
                this.f20846jr = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long jUhu = uhu();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLq = lq();
            long j10 = jCurrentTimeMillis - jUhu;
            if (z10 || j10 >= jLq) {
                if (!ju.jpo()) {
                    jd(i10, z10);
                } else if (this.prr.compareAndSet(false, true)) {
                    duq.jd((com.bytedance.sdk.component.xyk.xyk) new ju(this, this.oya, this.f20843au));
                    com.bytedance.sdk.openadsdk.core.oya.jd().removeCallbacks(this.f20844dt);
                }
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("settings request error", "settings", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ju.jpo
    public void jpo(boolean z10) {
        this.prr.set(false);
        ww();
        if (z10) {
            HashMap map = new HashMap();
            Set<String> setNp = np();
            if (setNp != null && !setNp.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setNp);
            }
            String strOpi = tic.opi();
            if (!TextUtils.isEmpty(strOpi)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strOpi);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, ez());
            com.bytedance.sdk.openadsdk.core.yd.jd.jd().jpo(map);
            kgu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public void jpo(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.f20851tu, intentFilter, 4);
            } else {
                context.registerReceiver(this.f20851tu, intentFilter);
            }
        } catch (Exception e10) {
            nmd.jpo("TTAD.SdkSettings", "", e10);
        }
        if (xk()) {
            cm(1);
            ww();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jj
    public boolean jpo(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.oya.jpo("perf_con_crypt_V4_applog", false);
            }
            return this.oya.jpo("perf_con_crypt_V4", false);
        }
        return this.oya.jpo("perf_con_crypt_V4_get_ad", false);
    }

    public static void jpo(Cif.jpo jpoVar) {
        ConcurrentLinkedQueue<Cif.jpo> concurrentLinkedQueue = nmd;
        if (concurrentLinkedQueue.contains(jpoVar)) {
            return;
        }
        concurrentLinkedQueue.add(jpoVar);
    }
}
