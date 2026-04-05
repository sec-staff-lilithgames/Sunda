package com.bytedance.adsdk.ugeno.cm;

import j1.o2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private List<jpo> f17695jd;
    private jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private String f17696cm;

        /* renamed from: jd, reason: collision with root package name */
        private String f17697jd;

        /* renamed from: jj, reason: collision with root package name */
        private Map<String, Object> f17698jj;
        private String jpo;
        private Map<String, String> my;
        private String wqx = "global";

        public String cm() {
            return this.jpo;
        }

        public String jd() {
            return this.f17696cm;
        }

        public String jpo() {
            return this.wqx;
        }

        public String my() {
            return this.f17697jd;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action{scheme='");
            sb2.append(this.wqx);
            sb2.append("', name='");
            sb2.append(this.f17696cm);
            sb2.append("', params=");
            sb2.append(this.my);
            sb2.append(", host='");
            sb2.append(this.f17697jd);
            sb2.append("', origin='");
            sb2.append(this.jpo);
            sb2.append("', extra=");
            return o2.q(sb2, this.f17698jj, AbstractJsonLexerKt.END_OBJ);
        }

        public Map<String, String> wqx() {
            return this.my;
        }

        public void cm(String str) {
            this.f17697jd = str;
        }

        public void jd(String str) {
            this.f17696cm = str;
        }

        public void jpo(String str) {
            this.wqx = str;
        }

        public void wqx(String str) {
            this.jpo = str;
        }

        public void jd(Map<String, Object> map) {
            this.f17698jj = map;
        }

        public void jpo(Map<String, String> map) {
            this.my = map;
        }
    }

    public List<jpo> jd() {
        return this.f17695jd;
    }

    public jpo jpo() {
        return this.jpo;
    }

    public static jj jpo(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        jj jjVar = new jj();
        String strOptString = jSONObject.optString(DebugKt.DEBUG_PROPERTY_VALUE_ON);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        jjVar.jpo = Cif.jpo(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            jpo jpoVarJpo = Cif.jpo(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (jpoVarJpo != null) {
                arrayList.add(jpoVarJpo);
            }
        }
        jjVar.f17695jd = arrayList;
        return jjVar;
    }
}
