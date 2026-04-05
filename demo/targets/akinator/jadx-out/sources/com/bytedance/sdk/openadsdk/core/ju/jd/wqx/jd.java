package com.bytedance.sdk.openadsdk.core.ju.jd.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.jd.wqx;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.jd.jpo<jpo> {
    private JSONArray ez;

    /* renamed from: gf, reason: collision with root package name */
    private int f20493gf;
    private int kgu;

    public jd(Context context) {
        super(context);
        this.f20493gf = 0;
        this.kgu = 0;
    }

    private void cm() throws JSONException {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.size(); i10++) {
            wqx<View> wqxVar = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.get(i10);
            if (wqxVar != null) {
                Cif cif = new Cif(this.f17811jd);
                cif.jpo(this.f17841yq);
                ((jpo) this.my).jpo(cif.jpo(wqxVar.uu(), this.f17797cm, (JSONObject) null));
            }
        }
    }

    private void wqx() {
        List<wqx<View>> list = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo;
        if (list == null || list.isEmpty()) {
            return;
        }
        wqx<View> wqxVar = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.get(0);
        if (this.ez == null) {
            return;
        }
        for (int i10 = 0; i10 < this.ez.length(); i10++) {
            Cif cif = new Cif(this.f17811jd);
            cif.jpo(this.f17841yq);
            try {
                JSONObject jSONObjectOptJSONObject = this.ez.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.f17797cm.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.f17797cm.put("$item", jSONObjectOptJSONObject);
                    }
                    ((jpo) this.my).jpo(cif.jpo(wqxVar.uu(), this.f17797cm, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        T t10 = this.my;
        if (t10 instanceof jpo) {
            ((jpo) t10).setOrientation(this.f20493gf);
            ((jpo) this.my).jpo(this);
            if (this.kgu == 1) {
                cm();
            } else {
                wqx();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public View jpo() {
        try {
            jpo jpoVar = new jpo(this.f17811jd);
            this.my = jpoVar;
            jpoVar.jpo((cm) this);
        } catch (Throwable unused) {
            this.my = new View(this.f17811jd);
        }
        return this.my;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.kgu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.f20493gf = 1;
                    break;
                } else {
                    this.f20493gf = 0;
                    break;
                }
            case "dataList":
                this.ez = com.bytedance.adsdk.ugeno.qk.jd.jpo(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(wqx wqxVar) {
        if (wqxVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.add(wqxVar);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(wqx wqxVar, ViewGroup.LayoutParams layoutParams) {
        if (wqxVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.add(wqxVar);
    }
}
