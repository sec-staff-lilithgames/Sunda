package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi extends sq {

    /* renamed from: cm, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f17663cm = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.jpo.jd.jd.jpo.opi.1
        @Override // java.lang.ThreadLocal
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public opi() {
        super(com.bytedance.adsdk.jpo.jd.cm.wqx.PLUS);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo;
        Object objJpo2 = this.jpo.jpo(map);
        if (objJpo2 == null || (objJpo = this.f17664jd.jpo(map)) == null) {
            return null;
        }
        if (!(objJpo2 instanceof String) && !(objJpo instanceof String)) {
            return com.bytedance.adsdk.jpo.jd.my.jpo.xyk.jpo((Number) objJpo2, (Number) objJpo);
        }
        StringBuilder sb2 = f17663cm.get();
        sb2.append(objJpo2);
        sb2.append(objJpo);
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }
}
