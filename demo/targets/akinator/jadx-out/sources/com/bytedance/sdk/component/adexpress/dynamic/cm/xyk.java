package com.bytedance.sdk.component.adexpress.dynamic.cm;

import android.text.TextUtils;
import j1.o2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: au, reason: collision with root package name */
    private String f18200au;

    /* renamed from: cm, reason: collision with root package name */
    private float f18201cm;

    /* renamed from: if, reason: not valid java name */
    private List<List<xyk>> f50if;

    /* renamed from: jd, reason: collision with root package name */
    private float f18202jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f18203jj;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private xyk f18204ju;
    private float my;
    private boolean oya;

    /* renamed from: qk, reason: collision with root package name */
    private float f18205qk;
    private float wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private List<xyk> f18206yd;
    private my zz;
    private Map<String, String> prr = new HashMap();
    private Map<Integer, String> hna = new HashMap();

    public int au() {
        jj jjVarMy = this.zz.my();
        return jjVarMy.ya() + jjVarMy.huv();
    }

    public float cm() {
        return this.f18201cm;
    }

    public String dt() {
        return this.zz.my().dt();
    }

    public boolean hmu() {
        return this.zz.my().ux() < 0 || this.zz.my().wu() < 0 || this.zz.my().vk() < 0 || this.zz.my().kb() < 0;
    }

    public float hna() {
        jj jjVarMy = this.zz.my();
        return (jjVarMy.m400if() * 2.0f) + jjVarMy.oya() + jjVarMy.sq() + oya();
    }

    /* renamed from: if, reason: not valid java name */
    public xyk m406if() {
        return this.f18204ju;
    }

    public Map<Integer, String> jd() {
        return this.hna;
    }

    public float jj() {
        return this.f18202jd;
    }

    public String jpo() {
        return this.f18200au;
    }

    public boolean jr() {
        return this.oya;
    }

    public List<xyk> ju() {
        return this.f18206yd;
    }

    public float my() {
        return this.my;
    }

    public Map<String, String> nmd() {
        return this.prr;
    }

    public boolean opi() {
        List<xyk> list = this.f18206yd;
        return list == null || list.size() <= 0;
    }

    public int oya() {
        jj jjVarMy = this.zz.my();
        return jjVarMy.fy() + jjVarMy.ic();
    }

    public float prr() {
        jj jjVarMy = this.zz.my();
        return (jjVarMy.m400if() * 2.0f) + jjVarMy.hna() + jjVarMy.prr() + au();
    }

    public float qk() {
        return this.wqx;
    }

    public void rq() {
        List<List<xyk>> list = this.f50if;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<xyk> list2 : this.f50if) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.f50if = arrayList;
    }

    public List<List<xyk>> sq() {
        return this.f50if;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutUnit{id='");
        sb2.append(this.jpo);
        sb2.append("', x=");
        sb2.append(this.f18202jd);
        sb2.append(", y=");
        sb2.append(this.wqx);
        sb2.append(", width=");
        sb2.append(this.f18203jj);
        sb2.append(", height=");
        sb2.append(this.f18205qk);
        sb2.append(", remainWidth=");
        sb2.append(this.xyk);
        sb2.append(", rootBrick=");
        sb2.append(this.zz);
        sb2.append(", childrenBrickUnits=");
        return o2.p(sb2, this.f18206yd, AbstractJsonLexerKt.END_OBJ);
    }

    public boolean tu() {
        return TextUtils.equals(this.zz.my().pdm(), "flex");
    }

    public String wqx() {
        return this.jpo;
    }

    public float xyk() {
        return this.f18203jj;
    }

    public my yd() {
        return this.zz;
    }

    public float zz() {
        return this.f18205qk;
    }

    public void cm(float f10) {
        this.wqx = f10;
    }

    public void jd(String str) {
        this.jpo = str;
    }

    public void jj(float f10) {
        this.f18205qk = f10;
    }

    public void jpo(String str) {
        this.f18200au = str;
    }

    public void my(float f10) {
        this.f18203jj = f10;
    }

    public void qk(float f10) {
        this.xyk = f10;
    }

    public void wqx(float f10) {
        this.f18202jd = f10;
    }

    public void jd(float f10) {
        this.my = f10;
    }

    public void jpo(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.hna.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void wqx(String str) {
        this.zz.my().jj(str);
    }

    public void jd(List<List<xyk>> list) {
        this.f50if = list;
    }

    public void jpo(float f10) {
        this.f18201cm = f10;
    }

    public void jpo(my myVar) {
        this.zz = myVar;
    }

    public void jpo(List<xyk> list) {
        this.f18206yd = list;
    }

    public void jpo(xyk xykVar) {
        this.f18204ju = xykVar;
    }

    public void jpo(boolean z10) {
        this.oya = z10;
    }

    public void jpo(String str, String str2) {
        this.prr.put(str, str2);
    }

    public String jpo(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zz.jd());
        sb2.append(":");
        sb2.append(this.jpo);
        if (this.zz.my() != null) {
            sb2.append(":");
            sb2.append(this.zz.my().uhu());
        }
        return p0.o2.l(i10, ":", sb2);
    }
}
