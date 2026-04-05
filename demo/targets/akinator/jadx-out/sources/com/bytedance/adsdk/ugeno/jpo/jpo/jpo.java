package com.bytedance.adsdk.ugeno.jpo.jpo;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo {

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.jd.wqx f17890jd;
    protected JSONObject jpo;
    private String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.jpo.jpo.jpo$jpo, reason: collision with other inner class name */
    public static class C0065jpo {
        public static jpo jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
            if (wqxVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new my(wqxVar, jSONObject);
                case "ripple":
                    return new jd(wqxVar, jSONObject);
                case "rub_in":
                    return new wqx(wqxVar, jSONObject);
                case "shine":
                    return new cm(wqxVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) {
        this.jpo = jSONObject;
        this.f17890jd = wqxVar;
        jpo();
    }

    public String cm() {
        return this.wqx;
    }

    public abstract void jd();

    public abstract void jd(Canvas canvas);

    public void jpo() {
        this.wqx = this.jpo.optString("type");
        jd();
    }

    public abstract void jpo(int i10, int i11);

    public abstract void jpo(Canvas canvas);

    public abstract List<PropertyValuesHolder> wqx();
}
