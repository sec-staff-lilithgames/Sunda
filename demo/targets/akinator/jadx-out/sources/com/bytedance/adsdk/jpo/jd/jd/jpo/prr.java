package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements com.bytedance.adsdk.jpo.jd.jd.jpo {
    private Number jpo;

    public prr(String str) throws NumberFormatException {
        if (str.indexOf(46) < 0) {
            try {
                this.jpo = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.jpo = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.jpo = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.jpo = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return this.jpo.toString();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        return this.jpo;
    }

    public String toString() {
        return jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.NUMBER;
    }
}
