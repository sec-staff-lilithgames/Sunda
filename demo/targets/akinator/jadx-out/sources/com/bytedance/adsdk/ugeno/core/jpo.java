package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private long f17734cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f17735jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f17736jj;
    private String jpo;
    private long my;
    private List<C0061jpo> wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.core.jpo$jpo, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0061jpo {

        /* renamed from: cm, reason: collision with root package name */
        private long f17737cm;

        /* renamed from: jd, reason: collision with root package name */
        private float f17738jd;

        /* renamed from: jj, reason: collision with root package name */
        private float f17739jj;
        private long jpo;
        private String my;

        /* renamed from: qk, reason: collision with root package name */
        private float f17740qk;
        private String wqx;
        private float[] xyk;

        /* renamed from: yd, reason: collision with root package name */
        private String f17741yd;
        private String zz;

        public long cm() {
            return this.f17737cm;
        }

        public float jd() {
            return this.f17738jd;
        }

        public float jj() {
            return this.f17739jj;
        }

        public long jpo() {
            return this.jpo;
        }

        public String my() {
            return this.my;
        }

        public float qk() {
            return this.f17740qk;
        }

        public String wqx() {
            return this.wqx;
        }

        public float[] xyk() {
            return this.xyk;
        }

        public String yd() {
            return this.f17741yd;
        }

        public String zz() {
            return this.zz;
        }

        public void cm(String str) {
            this.zz = str;
        }

        public void jd(long j10) {
            this.f17737cm = j10;
        }

        public void jpo(long j10) {
            this.jpo = j10;
        }

        public void wqx(float f10) {
            this.f17740qk = f10;
        }

        public void jd(String str) {
            this.my = str;
        }

        public void jpo(float f10) {
            this.f17738jd = f10;
        }

        public void wqx(String str) {
            this.f17741yd = str;
        }

        public void jd(float f10) {
            this.f17739jj = f10;
        }

        public void jpo(String str) {
            this.wqx = str;
        }

        public void jpo(float[] fArr) {
            this.xyk = fArr;
        }

        public static C0061jpo jpo(JSONObject jSONObject, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
            if (jSONObject == null) {
                return null;
            }
            C0061jpo c0061jpo = new C0061jpo();
            c0061jpo.jpo(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0061jpo.jpo(-1.0f);
            } else {
                try {
                    c0061jpo.jpo(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0061jpo.jpo(0.0f);
                }
            }
            c0061jpo.jpo(jSONObject.optString("loopMode"));
            c0061jpo.jd(jSONObject.optString("type"));
            if (TextUtils.equals(c0061jpo.my(), "ripple")) {
                c0061jpo.wqx(jSONObject.optString("rippleColor"));
            }
            View viewJu = wqxVar.ju();
            Context context = viewJu != null ? viewJu.getContext() : null;
            if (TextUtils.equals(c0061jpo.my(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("valueTo"), wqxVar.m389if());
                int iJpo = com.bytedance.adsdk.ugeno.qk.jpo.jpo(jSONObject.optString("valueFrom"));
                int iJpo2 = com.bytedance.adsdk.ugeno.qk.jpo.jpo(strJpo);
                c0061jpo.jd(iJpo);
                c0061jpo.wqx(iJpo2);
            } else if ((TextUtils.equals(c0061jpo.my(), "translateX") || TextUtils.equals(c0061jpo.my(), "translateY")) && context != null) {
                try {
                    float fJpo = com.bytedance.adsdk.ugeno.qk.xyk.jpo(context, (float) jSONObject.optDouble("valueFrom"));
                    float fJpo2 = com.bytedance.adsdk.ugeno.qk.xyk.jpo(context, (float) jSONObject.optDouble("valueTo"));
                    c0061jpo.jd(fJpo);
                    c0061jpo.wqx(fJpo2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0061jpo.jd((float) jSONObject.optDouble("valueFrom"));
                c0061jpo.wqx((float) jSONObject.optDouble("valueTo"));
            }
            c0061jpo.cm(jSONObject.optString("interpolator"));
            String strJpo2 = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("startDelay"), wqxVar.m389if());
            Log.d("TAG", "createAnimationModel: ");
            c0061jpo.jd(com.bytedance.adsdk.ugeno.qk.wqx.jpo(strJpo2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0061jpo.my(), "translateX") || TextUtils.equals(c0061jpo.my(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.qk.xyk.jpo(context, (float) jpo.jpo(jSONArrayOptJSONArray.optString(i10), wqxVar.m389if()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) jpo.jpo(jSONArrayOptJSONArray.optString(i10), wqxVar.m389if());
                        i10++;
                    }
                }
                c0061jpo.jpo(fArr);
            }
            return c0061jpo;
        }
    }

    public long cm() {
        return this.f17734cm;
    }

    public float jd() {
        return this.f17735jd;
    }

    public String jj() {
        return this.f17736jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public long my() {
        return this.my;
    }

    public List<C0061jpo> wqx() {
        return this.wqx;
    }

    public void jd(long j10) {
        this.my = j10;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jd(String str) {
        this.f17736jj = str;
    }

    public void jpo(float f10) {
        this.f17735jd = f10;
    }

    public void jpo(List<C0061jpo> list) {
        this.wqx = list;
    }

    public void jpo(long j10) {
        this.f17734cm = j10;
    }

    public static jpo jpo(String str, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return jpo(new JSONObject(str), wqxVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static jpo jpo(JSONObject jSONObject, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        return jpo(jSONObject, null, wqxVar);
    }

    public static jpo jpo(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        jpo jpoVar = new jpo();
        jpoVar.jpo(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals(UeklptUrP.CYhGtM, strOptString)) {
            jpoVar.jpo(-1.0f);
        } else {
            try {
                jpoVar.jpo(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                jpoVar.jpo(0.0f);
            }
        }
        jpoVar.jpo(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
        jpoVar.jd(com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("startDelay"), wqxVar.m389if()), 0L));
        jpoVar.jd(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.qk.jd.jpo(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0061jpo.jpo(jSONObjectOptJSONObject, wqxVar));
            }
            jpoVar.jpo(arrayList);
        }
        return jpoVar;
    }

    public static double jpo(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.qk.wqx.jpo(com.bytedance.adsdk.ugeno.wqx.jd.jpo((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
