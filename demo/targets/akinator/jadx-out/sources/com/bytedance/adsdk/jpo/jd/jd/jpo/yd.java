package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd implements com.bytedance.adsdk.jpo.jd.jd.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private String f17665jd;
    private com.bytedance.adsdk.jpo.jd.jd.jpo[] jpo;
    private com.bytedance.adsdk.jpo.jd.jpo.jpo wqx;

    public yd(String str) {
        this.f17665jd = str;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17665jd);
        sb2.append("(");
        com.bytedance.adsdk.jpo.jd.jd.jpo[] jpoVarArr = this.jpo;
        if (jpoVarArr != null && jpoVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.jpo.jd.jd.jpo[] jpoVarArr2 = this.jpo;
                if (i10 >= jpoVarArr2.length) {
                    break;
                }
                sb2.append(jpoVarArr2[i10].jd());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void jpo(com.bytedance.adsdk.jpo.jd.jd.jpo[] jpoVarArr) {
        this.jpo = jpoVarArr;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        com.bytedance.adsdk.jpo.jd.jpo.jpo jpoVar = new com.bytedance.adsdk.jpo.jd.jpo.jpo();
        this.wqx = jpoVar;
        jpoVar.jpo(this.f17665jd);
        Object[] objArr = new Object[this.jpo.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.jpo.jd.jd.jpo[] jpoVarArr = this.jpo;
            if (i10 >= jpoVarArr.length) {
                this.wqx.jpo(objArr);
                return com.bytedance.adsdk.jpo.ju.jpo(this.f17665jd).jpo(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar2 = jpoVarArr[i10];
            if (jpoVar2 != null) {
                objArr[i10] = jpoVar2.jpo(map);
            }
            i10++;
        }
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jd.METHOD;
    }
}
