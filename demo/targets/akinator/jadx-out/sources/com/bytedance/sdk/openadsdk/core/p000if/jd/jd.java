package com.bytedance.sdk.openadsdk.core.p000if.jd;

import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx implements Comparable<jd> {
    private final float jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final float f20375jd;
        private final String jpo;
        private wqx.EnumC0117wqx wqx = wqx.EnumC0117wqx.TRACKING_URL;

        /* renamed from: cm, reason: collision with root package name */
        private boolean f20374cm = false;

        public jpo(String str, float f10) {
            this.jpo = str;
            this.f20375jd = f10;
        }

        public jd jpo() {
            return new jd(this.f20375jd, this.jpo, this.wqx, Boolean.valueOf(this.f20374cm));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.jd.wqx
    public void j_() {
        super.j_();
    }

    public JSONObject jd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", wqx());
        jSONObject.put("trackingFraction", this.jpo);
        return jSONObject;
    }

    public boolean jpo(float f10) {
        return this.jpo <= f10 && !my();
    }

    public String toString() {
        return super.toString();
    }

    private jd(float f10, String str, wqx.EnumC0117wqx enumC0117wqx, Boolean bool) {
        super(str, enumC0117wqx, bool);
        this.jpo = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(jd jdVar) {
        if (jdVar == null) {
            return 1;
        }
        float f10 = this.jpo;
        float f11 = jdVar.jpo;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
