package com.bytedance.sdk.component.adexpress.dynamic.my;

import a.b;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jj, reason: collision with root package name */
    private int f18285jj;
    private double my;

    /* renamed from: qk, reason: collision with root package name */
    private double f18286qk;
    private String xyk;
    private au zz;
    public Map<String, wqx> jpo = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    public Map<String, wqx> f18284jd = new HashMap();
    public Map<String, wqx> wqx = new HashMap();

    /* renamed from: cm, reason: collision with root package name */
    private double f18283cm = Math.random();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.my.jd$jd, reason: collision with other inner class name */
    public static class C0074jd {

        /* renamed from: cm, reason: collision with root package name */
        double f18287cm;

        /* renamed from: jd, reason: collision with root package name */
        int f18288jd;
        float jpo;
        float my;
        int wqx;

        public static JSONObject jpo(C0074jd c0074jd) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0074jd.jpo);
                jSONObject.put("letterSpacing", c0074jd.f18288jd);
                jSONObject.put("lineHeight", c0074jd.f18287cm);
                jSONObject.put("maxWidth", c0074jd.my);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0074jd.wqx);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements Cloneable {

        /* renamed from: jd, reason: collision with root package name */
        boolean f18289jd;
        float jpo;
        float wqx;

        public Object clone() {
            try {
                return (jpo) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx {

        /* renamed from: jd, reason: collision with root package name */
        float f18290jd;
        float jpo;

        public wqx() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UnitSize{width=");
            sb2.append(this.jpo);
            sb2.append(", height=");
            return b.n(sb2, this.f18290jd, AbstractJsonLexerKt.END_OBJ);
        }

        public wqx(float f10, float f11) {
            this.jpo = f10;
            this.f18290jd = f11;
        }
    }

    public jd(double d10, int i10, double d11, String str, au auVar) {
        this.my = d10;
        this.f18285jj = i10;
        this.f18286qk = d11;
        this.xyk = str;
        this.zz = auVar;
    }

    private wqx jj(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        new wqx();
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = xykVar.yd().my();
        xykVar.yd().wqx();
        jjVarMy.sbx();
        float fOpi = jjVarMy.opi();
        int iDn = jjVarMy.dn();
        double dWcn = jjVarMy.wcn();
        int iJkt = jjVarMy.jkt();
        boolean zPe = jjVarMy.pe();
        boolean zCgn = jjVarMy.cgn();
        int iXk = jjVarMy.xk();
        C0074jd c0074jd = new C0074jd();
        c0074jd.jpo = fOpi;
        c0074jd.f18288jd = iDn;
        c0074jd.wqx = iJkt;
        c0074jd.f18287cm = dWcn;
        c0074jd.my = f10;
        return jpo(xykVar.yd().wqx(), c0074jd, zPe, zCgn, iXk, xykVar);
    }

    private wqx my(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        String str = xykVar.wqx() + "_" + f10 + "_" + f11;
        if (this.wqx.containsKey(str)) {
            return this.wqx.get(str);
        }
        wqx wqxVarJj = jj(xykVar, f10, f11);
        this.wqx.put(str, wqxVarJj);
        return wqxVarJj;
    }

    public wqx cm(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        wqx wqxVar = new wqx();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            wqxVar.jpo = 0.0f;
            wqxVar.f18290jd = 0.0f;
            return wqxVar;
        }
        if (xykVar.opi()) {
            return jpo(xykVar, f10, f11);
        }
        float fXyk = xykVar.xyk();
        float fZz = xykVar.zz();
        float fPrr = xykVar.prr();
        float fHna = xykVar.hna();
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = xykVar.yd().my();
        String strPdm = jjVarMy.pdm();
        String strHx = jjVarMy.hx();
        float fMin2 = ((TextUtils.equals(strPdm, "flex") || TextUtils.equals(strPdm, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) ? f10 : Math.min(fXyk, f10)) - fPrr;
        if (TextUtils.equals(strHx, "scale")) {
            fMin = Math.round(fMin2 / fZz) + fHna;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fHna) * fZz);
            }
        } else {
            fMin = (TextUtils.equals(strHx, DebugKt.DEBUG_PROPERTY_VALUE_AUTO) || TextUtils.equals(strHx, "flex")) ? f11 : Math.min(fZz, f11);
        }
        float f15 = fMin - fHna;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> listSq = xykVar.sq();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list : listSq) {
            float f16 = f14;
            float f17 = fPrr;
            wqx wqxVarJd = jd(list, fMin2, f15);
            if (jd(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, wqxVarJd.jpo);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = xykVar.yd().jd().equals("carousel") ? Math.max(xykVar.zz(), wqxVarJd.f18290jd) : fMax2 + wqxVarJd.f18290jd;
            fPrr = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fPrr;
        if (!TextUtils.equals(strPdm, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            f12 = f21;
        } else if (f20 == listSq.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list2 : listSq) {
                wqx(list2);
                jd(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strHx, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                jpo(listSq, f12, f15);
            }
        } else if ((TextUtils.equals(strHx, "fixed") || TextUtils.equals(strHx, "flex")) && f15 < fMax2) {
            jpo(listSq, f12, f15);
        }
        wqxVar.jpo = Math.min(f12 + f22, f10);
        wqxVar.f18290jd = Math.min(f15 + fHna, f11);
        return wqxVar;
    }

    public wqx jd(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        wqx wqxVar = new wqx();
        if (xykVar.yd().my() == null) {
            return wqxVar;
        }
        wqx wqxVarMy = my(xykVar, f10, f11);
        float f12 = wqxVarMy.jpo;
        float f13 = wqxVarMy.f18290jd;
        wqxVar.jpo = Math.min(f12, f10);
        wqxVar.f18290jd = Math.min(f13, f11);
        return wqxVar;
    }

    public wqx jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(xykVar.yd().wqx()) && xykVar.yd().my().wad() == null) {
            return new wqx(0.0f, 0.0f);
        }
        if (a.v(xykVar, "creative-playable-bait")) {
            return new wqx(0.0f, 0.0f);
        }
        float fXyk = xykVar.xyk();
        float fZz = xykVar.zz();
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = xykVar.yd().my();
        String strPdm = jjVarMy.pdm();
        String strHx = jjVarMy.hx();
        float fAu = xykVar.au();
        float fOya = xykVar.oya();
        float fPrr = xykVar.prr();
        float fHna = xykVar.hna();
        if (TextUtils.equals(strPdm, "fixed")) {
            f10 = Math.min(fXyk, f10);
            if (TextUtils.equals(strHx, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                f12 = jd(xykVar, f10 - fPrr, f11 - fHna).f18290jd;
                fZz = f12 + fHna;
            }
        } else if (TextUtils.equals(strPdm, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            wqx wqxVarJd = jd(xykVar, f10 - fPrr, f11 - fHna);
            f10 = wqxVarJd.jpo + fPrr;
            if (TextUtils.equals(strHx, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                f12 = wqxVarJd.f18290jd;
                fZz = f12 + fHna;
            }
        } else if (!TextUtils.equals(strPdm, "flex")) {
            f10 = fXyk;
        } else if (TextUtils.equals(strHx, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            f12 = jd(xykVar, f10 - fPrr, f11 - fHna).f18290jd;
            fZz = f12 + fHna;
        }
        if (TextUtils.equals(strHx, "scale")) {
            float fRound = Math.round((f10 - fAu) / fZz) + fOya;
            if (fRound > f11) {
                f10 = Math.round((f11 - fOya) * fZz) + fAu;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strHx, "fixed")) {
            f11 = Math.min(fZz + fOya, f11);
        } else if (!TextUtils.equals(strHx, "flex")) {
            f11 = fZz;
        }
        wqx wqxVar = new wqx();
        wqxVar.jpo = f10;
        wqxVar.f18290jd = f11;
        return wqxVar;
    }

    public wqx wqx(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, float f10, float f11) {
        if (xykVar == null) {
            return null;
        }
        wqx wqxVarJpo = jpo(xykVar);
        if (wqxVarJpo != null && (wqxVarJpo.jpo != 0.0f || wqxVarJpo.f18290jd != 0.0f)) {
            return wqxVarJpo;
        }
        wqx wqxVarCm = cm(xykVar, f10, f11);
        jpo(xykVar, wqxVarCm);
        return wqxVarCm;
    }

    private wqx wqx(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list, float f10, float f11) {
        float fMax;
        cm(list);
        wqx wqxVar = new wqx();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = xykVar.yd().my();
            if (jjVarMy.hks() == 1 || jjVarMy.hks() == 2) {
                arrayList.add(xykVar);
            }
            if (jjVarMy.hks() != 1 && jjVarMy.hks() != 2) {
                arrayList2.add(xykVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wqx((com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return wqxVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(wqx((com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) it2.next(), f10, f11).jpo));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2 = (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) arrayList2.get(i10);
            String strPdm = xykVar2.yd().my().pdm();
            float fXyk = xykVar2.xyk();
            boolean zEquals = TextUtils.equals(strPdm, "flex");
            if (TextUtils.equals(strPdm, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> listSq = xykVar2.sq();
                if (listSq == null || listSq.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> it3 = listSq.iterator();
                    while (it3.hasNext()) {
                        if (jd(it3.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            jpo jpoVar = new jpo();
            if (!zEquals) {
                fXyk = ((Float) arrayList3.get(i10)).floatValue();
            }
            jpoVar.jpo = fXyk;
            jpoVar.f18289jd = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i10)).floatValue();
            }
            jpoVar.wqx = fMax;
            arrayList4.add(jpoVar);
            i10++;
        }
        jpo(arrayList4, f10, arrayList2);
        List<jpo> listJpo = yd.jpo(f10, arrayList4);
        float f12 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f12 += listJpo.get(i11).jpo;
            if (((Float) arrayList3.get(i11)).floatValue() != listJpo.get(i11).jpo) {
                cm((com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) arrayList2.get(i11));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i12++;
            if (!jd((com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) it4.next())) {
                z10 = false;
                break;
            }
            if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar3 = (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) arrayList2.get(i13);
            wqx wqxVarWqx = wqx(xykVar3, listJpo.get(i13).jpo, f11);
            if (!jd(xykVar3)) {
                fMax = Math.max(fMax, wqxVarWqx.f18290jd);
            }
            arrayList5.add(wqxVarWqx);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((wqx) it5.next()).f18290jd));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar4 = (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) arrayList2.get(i14);
                if (jd(xykVar4) && ((Float) arrayList6.get(i14)).floatValue() != fMax) {
                    cm(xykVar4);
                    wqx(xykVar4, listJpo.get(i14).jpo, fMax);
                }
            }
        }
        wqxVar.jpo = f12;
        wqxVar.f18290jd = fMax;
        return wqxVar;
    }

    private boolean jd(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> listSq;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().yd().my().pdm(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar : list) {
                if (TextUtils.equals(xykVar.yd().my().pdm(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (listSq = xykVar.sq()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list2 : listSq) {
                        i10++;
                        if (!jd(list2)) {
                            break;
                        }
                        if (i10 == list2.size()) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String my(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        return xykVar.wqx();
    }

    private wqx jd(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list, float f10, float f11) {
        wqx wqxVarJpo = jpo(list);
        if (wqxVarJpo != null && (wqxVarJpo.jpo != 0.0f || wqxVarJpo.f18290jd != 0.0f)) {
            return wqxVarJpo;
        }
        wqx wqxVarWqx = wqx(list, f10, f11);
        jpo(list, wqxVarWqx);
        return wqxVarWqx;
    }

    private boolean jd(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        if (xykVar == null) {
            return false;
        }
        if (TextUtils.equals(xykVar.yd().my().hx(), "flex")) {
            return true;
        }
        return wqx(xykVar);
    }

    private wqx jpo(String str, C0074jd c0074jd, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) throws JSONException {
        return ju.jpo(str, xykVar.yd().jd(), C0074jd.jpo(c0074jd).toString(), z10, z11, i10, xykVar, this.my, this.f18285jj, this.f18286qk, this.xyk, this.zz);
    }

    private void cm(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        this.jpo.remove(my(xykVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> listSq = xykVar.sq();
        if (listSq == null || listSq.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> it = listSq.iterator();
        while (it.hasNext()) {
            wqx(it.next());
        }
    }

    private void jpo(List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (jpo(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list2 : list) {
            jpo jpoVar = new jpo();
            boolean zJpo = jpo(list2, !z10);
            jpoVar.jpo = zJpo ? 1.0f : jd(list2, f10, f11).f18290jd;
            jpoVar.f18289jd = !zJpo;
            arrayList.add(jpoVar);
        }
        List<jpo> listJpo = yd.jpo(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((jpo) arrayList.get(i10)).jpo != listJpo.get(i10).jpo) {
                List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list3 = list.get(i10);
                wqx(list3);
                jd(list3, f10, listJpo.get(i10).jpo);
            }
        }
    }

    private String cm(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strWqx = list.get(i10).wqx();
            if (i10 < list.size() - 1) {
                sb2.append(strWqx);
                sb2.append("-");
            } else {
                sb2.append(strWqx);
            }
        }
        return sb2.toString();
    }

    private boolean jpo(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = xykVar.yd().my();
            String strHx = jjVarMy.hx();
            if (TextUtils.equals(strHx, "flex") || (z10 && ((TextUtils.equals(jjVarMy.pdm(), "flex") && TextUtils.equals(jjVarMy.hx(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.cm.my.jpo.get(xykVar.yd().jd()).intValue() == 7) || TextUtils.equals(strHx, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = list.iterator();
        while (it.hasNext()) {
            if (wqx(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean wqx(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> listSq;
        if (!xykVar.opi() && TextUtils.equals(xykVar.yd().my().hx(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && (listSq = xykVar.sq()) != null && listSq.size() > 0) {
            if (listSq.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = listSq.get(0).iterator();
                while (it.hasNext()) {
                    if (!jd(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>> it2 = listSq.iterator();
            while (it2.hasNext()) {
                if (jpo(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void jpo(List<jpo> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list2) {
        float f11 = 0.0f;
        for (jpo jpoVar : list) {
            if (jpoVar.f18289jd) {
                f11 += jpoVar.jpo;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).f18289jd && list2.get(i11).tu()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    jpo jpoVar2 = list.get(i12);
                    if (jpoVar2.f18289jd && list2.get(i12).tu()) {
                        jpoVar2.jpo -= fCeil;
                    }
                }
            }
        }
    }

    private void wqx(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f18284jd.remove(cm(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = list.iterator();
        while (it.hasNext()) {
            cm(it.next());
        }
    }

    public void jpo() {
        this.wqx.clear();
        this.jpo.clear();
        this.f18284jd.clear();
    }

    public wqx jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        return this.jpo.get(my(xykVar));
    }

    public wqx jpo(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list) {
        return this.f18284jd.get(cm(list));
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, wqx wqxVar) {
        this.jpo.put(my(xykVar), wqxVar);
    }

    private void jpo(List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> list, wqx wqxVar) {
        this.f18284jd.put(cm(list), wqxVar);
    }
}
