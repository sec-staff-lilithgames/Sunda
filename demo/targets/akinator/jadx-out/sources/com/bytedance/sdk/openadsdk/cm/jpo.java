package com.bytedance.sdk.openadsdk.cm;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo implements com.bytedance.sdk.component.jj.jpo.cm.jpo.jd {

    /* renamed from: au, reason: collision with root package name */
    private JSONObject f19530au;

    /* renamed from: cm, reason: collision with root package name */
    private long f19531cm;

    /* renamed from: dt, reason: collision with root package name */
    private int f19532dt;
    private String hmu;
    private String hna;

    /* renamed from: if, reason: not valid java name */
    private final AtomicBoolean f98if;

    /* renamed from: jd, reason: collision with root package name */
    protected final JSONObject f19533jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f19534jj;
    public final String jpo;

    /* renamed from: jr, reason: collision with root package name */
    private String f19535jr;
    private long my;
    private com.bytedance.sdk.openadsdk.cm.jd.jpo nmd;
    private String opi;
    private String oya;
    private String prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f19536qk;

    /* renamed from: rq, reason: collision with root package name */
    private String f19537rq;

    /* renamed from: sq, reason: collision with root package name */
    private String f19538sq;

    /* renamed from: tu, reason: collision with root package name */
    private String f19539tu;
    private boolean wqx;
    private int xyk;
    private int zz;

    /* renamed from: yd, reason: collision with root package name */
    private static final Set<String> f19529yd = new HashSet(Arrays.asList("insight_log"));

    /* renamed from: ju, reason: collision with root package name */
    private static final Map<String, String> f19528ju = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.cm.jpo$jpo, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0102jpo {

        /* renamed from: au, reason: collision with root package name */
        private String f19555au;

        /* renamed from: cm, reason: collision with root package name */
        private String f19556cm;
        private final long hna;

        /* renamed from: if, reason: not valid java name */
        private final int f99if;

        /* renamed from: jd, reason: collision with root package name */
        private String f19557jd;

        /* renamed from: jj, reason: collision with root package name */
        private String f19558jj;
        public int jpo;

        /* renamed from: jr, reason: collision with root package name */
        private boolean f19559jr;

        /* renamed from: ju, reason: collision with root package name */
        private String f19560ju;
        private String my;
        private String nmd;
        private int opi;
        private com.bytedance.sdk.openadsdk.cm.jd.jd oya;
        private com.bytedance.sdk.openadsdk.cm.jd.jpo prr;

        /* renamed from: qk, reason: collision with root package name */
        private String f19561qk;

        /* renamed from: sq, reason: collision with root package name */
        private int f19562sq;
        private String wqx;
        private String xyk;

        /* renamed from: yd, reason: collision with root package name */
        private JSONObject f19563yd;
        private String zz;

        public C0102jpo(long j10, dt dtVar) {
            this.f19562sq = -1;
            this.opi = -1;
            this.jpo = -1;
            if (dtVar != null) {
                this.f19559jr = rv.jd(dtVar);
                this.f19562sq = dtVar.cgn();
                this.opi = dtVar.jkt();
                this.jpo = dtVar.iqh();
            }
            this.hna = j10;
            this.f99if = com.bytedance.sdk.component.utils.opi.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo());
        }

        public C0102jpo cm(String str) {
            this.my = str;
            return this;
        }

        public C0102jpo jd(String str) {
            this.wqx = str;
            return this;
        }

        public C0102jpo jj(String str) {
            this.zz = str;
            return this;
        }

        public C0102jpo my(String str) {
            this.xyk = str;
            return this;
        }

        public C0102jpo qk(String str) {
            this.f19561qk = str;
            return this;
        }

        public C0102jpo wqx(String str) {
            this.f19556cm = str;
            return this;
        }

        public C0102jpo xyk(String str) {
            this.nmd = str;
            return this;
        }

        public C0102jpo jpo(String str) {
            this.f19555au = str;
            return this;
        }

        public C0102jpo jpo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f19563yd = jSONObject;
            return this;
        }

        public void jpo(com.bytedance.sdk.openadsdk.cm.jd.jpo jpoVar) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo(this.f19556cm, this.nmd, this.f19561qk, this.wqx);
            this.prr = jpoVar;
            final jpo jpoVar2 = new jpo(this);
            try {
                com.bytedance.sdk.openadsdk.cm.jd.jd jdVar = this.oya;
                if (jdVar != null) {
                    jdVar.jpo(jpoVar2.f19533jd, this.hna);
                } else {
                    new com.bytedance.sdk.openadsdk.cm.jd.wqx().jpo(jpoVar2.f19533jd, this.hna);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                duq.wqx(new com.bytedance.sdk.component.xyk.xyk("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.cm.jpo.jpo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(jpoVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(jpoVar2);
            }
        }
    }

    public jpo(String str, JSONObject jSONObject) {
        this.f19534jj = "adiff";
        this.f98if = new AtomicBoolean(false);
        this.f19530au = new JSONObject();
        this.jpo = str;
        this.f19533jd = jSONObject;
    }

    private boolean jd(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean jpo(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    private void qk() throws JSONException {
        this.f19533jd.putOpt("app_log_url", this.hmu);
        this.f19533jd.putOpt("tag", this.oya);
        this.f19533jd.putOpt("label", this.prr);
        this.f19533jd.putOpt("category", this.hna);
        if (!TextUtils.isEmpty(this.f19538sq)) {
            try {
                this.f19533jd.putOpt("value", Long.valueOf(Long.parseLong(this.f19538sq)));
            } catch (NumberFormatException unused) {
                this.f19533jd.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f19535jr)) {
            try {
                this.f19533jd.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f19535jr)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f19539tu)) {
            this.f19533jd.putOpt("log_extra", this.f19539tu);
        }
        if (!TextUtils.isEmpty(this.f19537rq)) {
            try {
                this.f19533jd.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f19537rq)));
            } catch (NumberFormatException unused3) {
            }
        }
        jpo(this.f19533jd, this.prr);
        try {
            this.f19533jd.putOpt("nt", Integer.valueOf(this.f19532dt));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.f19530au.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f19533jd.putOpt(next, this.f19530au.opt(next));
        }
    }

    public String cm() {
        return this.jpo;
    }

    public boolean my() {
        Set<String> setJu;
        if (this.f19533jd == null || (setJu = com.bytedance.sdk.openadsdk.core.sq.cm().ju()) == null) {
            return false;
        }
        String strOptString = this.f19533jd.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setJu.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.prr)) {
            return false;
        }
        return setJu.contains(this.prr);
    }

    public JSONObject wqx() {
        if (this.f98if.get()) {
            return this.f19533jd;
        }
        try {
            qk();
            if (this.f19533jd.has("ad_extra_data")) {
                Object objOpt = this.f19533jd.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f19533jd.put("ad_extra_data", jpo((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f19533jd.put("ad_extra_data", jpo(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        nmd.wqx("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.jpo);
                    if (this.wqx) {
                        jSONObject.put("interaction_method", this.f19536qk);
                        jSONObject.put("real_interaction_method", this.xyk);
                        jSONObject.put("image_mode", this.zz);
                    }
                    this.f19533jd.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    nmd.wqx("AdEvent", "json error", e11.getMessage());
                }
            }
            this.f98if.set(true);
        } catch (Throwable unused) {
        }
        return this.f19533jd;
    }

    private void jd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : f19528ju.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(f19528ju.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void jj() {
        JSONObject jSONObject = this.f19530au;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.f19530au.optString(duhsDlGWdBkekB.UaieaMSyV);
            String strOptString3 = this.f19530au.optString("log_extra");
            if (jpo(this.f19538sq, this.hna, this.f19539tu)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !jd(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.f19538sq) || TextUtils.equals(this.f19538sq, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.hna) || !jd(this.hna)) && (TextUtils.isEmpty(strOptString2) || !jd(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.f19539tu) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!jpo(this.f19538sq, this.hna, this.f19539tu)) {
            return;
        }
        this.f19531cm = com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo.incrementAndGet();
    }

    private JSONObject jpo(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.jpo);
            }
            if (this.wqx) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f19536qk);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.xyk);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.zz);
                }
            }
            if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("replace_log_extra_key", false)) {
                jd(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.jpo + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            nmd.wqx("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public jpo(C0102jpo c0102jpo) throws JSONException {
        this.f19534jj = "adiff";
        this.f98if = new AtomicBoolean(false);
        this.f19530au = new JSONObject();
        if (!TextUtils.isEmpty(c0102jpo.f19557jd)) {
            this.jpo = c0102jpo.f19557jd;
        } else {
            this.jpo = nq.jpo();
        }
        this.nmd = c0102jpo.prr;
        this.f19539tu = c0102jpo.f19558jj;
        this.oya = c0102jpo.wqx;
        this.prr = c0102jpo.f19556cm;
        if (!TextUtils.isEmpty(c0102jpo.my)) {
            this.hna = c0102jpo.my;
        } else {
            this.hna = "app_union";
        }
        this.f19537rq = c0102jpo.f19560ju;
        this.f19538sq = c0102jpo.xyk;
        this.f19535jr = c0102jpo.zz;
        this.opi = c0102jpo.f19561qk;
        this.f19532dt = c0102jpo.f99if;
        this.hmu = c0102jpo.f19555au;
        this.f19530au = c0102jpo.f19563yd = c0102jpo.f19563yd != null ? c0102jpo.f19563yd : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f19533jd = jSONObject;
        if (!TextUtils.isEmpty(c0102jpo.f19555au)) {
            try {
                jSONObject.put("app_log_url", c0102jpo.f19555au);
            } catch (JSONException e10) {
                nmd.wqx("AdEvent", e10.getMessage());
            }
        }
        this.f19536qk = c0102jpo.f19562sq;
        this.xyk = c0102jpo.opi;
        this.zz = c0102jpo.jpo;
        this.wqx = c0102jpo.f19559jr;
        this.my = System.currentTimeMillis();
        jj();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo.jd
    public long jd() {
        return this.f19531cm;
    }

    public JSONObject jpo(boolean z10) {
        JSONObject jSONObjectWqx = wqx();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(jSONObjectWqx.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectWqx.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            nmd.wqx("AdEvent", e10.getMessage());
            return jSONObjectWqx;
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo.jd
    public JSONObject jpo(String str) {
        return wqx();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.cm.jpo.jd
    public long jpo() {
        return this.my;
    }

    private static void jpo(JSONObject jSONObject, String str) {
        try {
            Set<String> set = f19529yd;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            nmd.wqx("AdEvent", th2);
        }
    }
}
