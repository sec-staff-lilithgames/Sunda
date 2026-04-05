package com.bytedance.sdk.component.adexpress.dynamic.my;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.my.jd;
import com.bytedance.sdk.component.adexpress.jd.au;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: cm, reason: collision with root package name */
    private jpo f18297cm;

    /* renamed from: jd, reason: collision with root package name */
    protected jd f18298jd;
    public com.bytedance.sdk.component.adexpress.dynamic.cm.jd jpo;
    private com.bytedance.sdk.component.adexpress.dynamic.cm.xyk wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        float f18299jd;
        float jpo;
        float wqx;
    }

    public my(double d10, int i10, double d11, String str, au auVar) {
        this.f18298jd = new jd(d10, i10, d11, str, auVar);
    }

    public void jpo(jpo jpoVar) {
        this.f18297cm = jpoVar;
    }

    public void jpo() {
        this.f18298jd.jpo();
    }

    public void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        if (xykVar != null) {
            this.wqx = xykVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2 = this.wqx;
        float fXyk = xykVar2.xyk();
        float fZz = xykVar2.zz();
        float f12 = TextUtils.equals(xykVar2.yd().my().hx(), "fixed") ? fZz : 65536.0f;
        this.f18298jd.jpo();
        this.f18298jd.wqx(xykVar2, fXyk, f12);
        jd.wqx wqxVarJpo = this.f18298jd.jpo(xykVar2);
        com.bytedance.sdk.component.adexpress.dynamic.cm.jd jdVar = new com.bytedance.sdk.component.adexpress.dynamic.cm.jd();
        jdVar.jpo = f10;
        jdVar.f18133jd = f11;
        if (wqxVarJpo != null) {
            fXyk = wqxVarJpo.jpo;
        }
        jdVar.wqx = fXyk;
        if (wqxVarJpo != null) {
            fZz = wqxVarJpo.f18290jd;
        }
        jdVar.f18132cm = fZz;
        jdVar.my = "root";
        jdVar.zz = 1280.0f;
        jdVar.f18134jj = xykVar2;
        xykVar2.wqx(f10);
        jdVar.f18134jj.cm(jdVar.f18133jd);
        jdVar.f18134jj.my(jdVar.wqx);
        jdVar.f18134jj.jj(jdVar.f18132cm);
        com.bytedance.sdk.component.adexpress.dynamic.cm.jd jdVarJpo = jpo(jdVar, 0.0f);
        this.jpo = jdVarJpo;
        jpo(jdVarJpo);
    }

    public void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jd jdVar) {
        if (jdVar == null) {
            return;
        }
        jdVar.f18134jj.yd().jd();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.jd>> list = jdVar.f18135qk;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.cm.jd> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.jd> it = list2.iterator();
                while (it.hasNext()) {
                    jpo(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.cm.jd jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jd r37, float r38) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.my.my.jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jd, float):com.bytedance.sdk.component.adexpress.dynamic.cm.jd");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.cm.zz jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVar, jd.wqx wqxVar, jd.wqx wqxVar2) {
        float fVk = jjVar.vk();
        float fUx = jjVar.ux();
        float fKb = jjVar.kb();
        float fWu = jjVar.wu();
        boolean zEt = jjVar.et();
        boolean zIi = jjVar.ii();
        boolean zCql = jjVar.cql();
        boolean zOta = jjVar.ota();
        if (!zEt) {
            if (zIi) {
                float f10 = this.f18297cm.jpo;
                fVk = ((f10 != 0.0f ? Math.min(f10, wqxVar.jpo) : wqxVar.jpo) - fKb) - wqxVar2.jpo;
            } else {
                fVk = 0.0f;
            }
        }
        if (!zCql) {
            if (zOta) {
                float f11 = this.f18297cm.f18299jd;
                if (f11 == 0.0f) {
                    f11 = wqxVar.f18290jd;
                }
                fUx = (f11 - fWu) - wqxVar2.f18290jd;
            } else {
                fUx = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.cm.zz(fVk, fUx);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.cm.zz jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jd jdVar, com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = jdVar.jpo;
        float f15 = jdVar.f18133jd;
        float fVk = jjVar.vk();
        float fUx = jjVar.ux();
        float fKb = jjVar.kb();
        float fWu = jjVar.wu();
        boolean zEt = jjVar.et();
        boolean zIi = jjVar.ii();
        boolean zCql = jjVar.cql();
        boolean zOta = jjVar.ota();
        String strRxq = jjVar.rxq();
        float f16 = jdVar.wqx;
        float f17 = jdVar.f18132cm;
        if (TextUtils.equals(strRxq, "0")) {
            if (zEt) {
                f14 = jdVar.jpo + fVk;
            } else if (zIi) {
                f14 = ((jdVar.jpo + f16) - fKb) - f10;
            }
            if (zCql) {
                f13 = jdVar.f18133jd;
                f15 = f13 + fUx;
            } else if (zOta) {
                f12 = jdVar.f18133jd;
                f15 = ((f12 + f17) - fWu) - f11;
            }
        } else if (TextUtils.equals(strRxq, "1")) {
            f14 = jdVar.jpo + ((f16 - f10) / 2.0f);
            if (zCql) {
                f13 = jdVar.f18133jd;
                f15 = f13 + fUx;
            } else if (zOta) {
                f12 = jdVar.f18133jd;
                f15 = ((f12 + f17) - fWu) - f11;
            }
        } else if (TextUtils.equals(strRxq, "2")) {
            f15 = jdVar.f18133jd + ((f17 - f11) / 2.0f);
            if (zEt) {
                f14 = jdVar.jpo + fVk;
            } else if (zIi) {
                f14 = ((jdVar.jpo + f16) - fKb) - f10;
            }
        } else if (TextUtils.equals(strRxq, "3")) {
            f14 = jdVar.jpo + ((f16 - f10) / 2.0f);
            f15 = ((f17 - f11) / 2.0f) + jdVar.f18133jd;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.cm.zz(f14, f15);
    }
}
