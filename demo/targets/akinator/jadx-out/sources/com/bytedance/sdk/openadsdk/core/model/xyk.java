package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: cm, reason: collision with root package name */
    private int f20806cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f20807jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f20808jj;
    private int jpo;
    private List<String> my;

    /* renamed from: qk, reason: collision with root package name */
    private int f20809qk;
    private List<Integer> wqx;

    public int cm() {
        return this.jpo;
    }

    public int jd() {
        int i10 = this.f20809qk;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public List<Integer> jj() {
        return this.wqx;
    }

    public boolean jpo() {
        return this.f20808jj == 1;
    }

    public int my() {
        return this.f20807jd;
    }

    public int qk() {
        return this.f20806cm;
    }

    public List<String> wqx() {
        return this.my;
    }

    public JSONObject xyk() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.jpo);
            jSONObject.put("interceptor_y", this.f20807jd);
            if (this.wqx != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.wqx.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.f20806cm);
            if (this.my != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.my.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.f20808jj);
            jSONObject.put("boc_index", this.f20809qk);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public void cm(int i10) {
        this.f20807jd = i10;
    }

    public void jd(int i10) {
        this.f20809qk = i10;
    }

    public void jpo(int i10) {
        this.f20808jj = i10;
    }

    public void my(int i10) {
        this.f20806cm = i10;
    }

    public void wqx(int i10) {
        this.jpo = i10;
    }

    public void jd(List<Integer> list) {
        this.wqx = list;
    }

    public void jpo(List<String> list) {
        this.my = list;
    }
}
