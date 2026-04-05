package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.qk;
import com.bytedance.adsdk.ugeno.jd.jpo;
import com.ironsource.C3352n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.ugeno.core.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: cm, reason: collision with root package name */
    private xyk f17707cm;
    private List<String> hna;

    /* renamed from: jd, reason: collision with root package name */
    private JSONObject f17708jd;

    /* renamed from: jj, reason: collision with root package name */
    private opi f17709jj;
    private Context jpo;

    /* renamed from: jr, reason: collision with root package name */
    private float f17710jr;

    /* renamed from: ju, reason: collision with root package name */
    private ju f17711ju;
    private prr my;
    private zz nmd;
    private float opi;
    private com.bytedance.adsdk.ugeno.cm.jpo.jpo oya;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private hna f17712qk;

    /* renamed from: sq, reason: collision with root package name */
    private my f17713sq;
    private com.bytedance.adsdk.ugeno.jd.wqx<View> wqx;
    private com.bytedance.adsdk.ugeno.cm.au xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f17714yd;
    private qk zz;

    /* renamed from: if, reason: not valid java name */
    private boolean f32if = true;

    /* renamed from: au, reason: collision with root package name */
    private boolean f17706au = false;

    public Cif(Context context) {
        this.jpo = context;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx<View> jd(qk.jpo jpoVar, com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
        List<qk.jpo> listWqx;
        jpo.C0062jpo c0062jpoYd = null;
        if (!qk.cm(jpoVar)) {
            return null;
        }
        String strWqx = jpoVar.wqx();
        jd jdVarJpo = cm.jpo(strWqx);
        if (jdVarJpo == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strWqx)));
            this.prr = true;
            if (this.hna == null) {
                this.hna = new ArrayList();
            }
            this.hna.add(strWqx);
            return null;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJpo = jdVarJpo.jpo(this.jpo);
        if (wqxVarJpo == null) {
            return null;
        }
        wqxVarJpo.qk(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jpoVar.jpo(), this.f17708jd));
        wqxVarJpo.xyk(strWqx);
        wqxVarJpo.wqx(jpoVar.cm());
        wqxVarJpo.jpo(jpoVar);
        wqxVarJpo.jpo(this.f17711ju);
        if (wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) {
            com.bytedance.adsdk.ugeno.jd.jpo jpoVar2 = (com.bytedance.adsdk.ugeno.jd.jpo) wqxVar;
            wqxVarJpo.jpo(jpoVar2);
            c0062jpoYd = jpoVar2.yd();
        }
        Iterator<String> itKeys = jpoVar.cm().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jpoVar.cm().optString(next), this.f17708jd);
            wqxVarJpo.jpo(next, strJpo);
            if (c0062jpoYd != null) {
                c0062jpoYd.jpo(this.jpo, next, strJpo);
            }
        }
        if (wqxVarJpo instanceof com.bytedance.adsdk.ugeno.jd.jpo) {
            List<qk.jpo> listMy = jpoVar.my();
            if (listMy == null || listMy.size() <= 0) {
                if (TextUtils.equals(wqxVarJpo.nzb(), "RecyclerLayout") && (listWqx = this.zz.wqx()) != null && listWqx.size() > 0) {
                    Iterator<qk.jpo> it = listWqx.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJd = jd(it.next(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) wqxVarJpo);
                        if (wqxVarJd != null && wqxVarJd.tic()) {
                            ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVarJpo).jpo(wqxVarJd);
                        }
                    }
                }
                return wqxVarJpo;
            }
            if (TextUtils.equals(wqxVarJpo.nzb(), "Swiper") && listMy.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<qk.jpo> it2 = listMy.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJd2 = jd(it2.next(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) wqxVarJpo);
                if (wqxVarJd2 != null && wqxVarJd2.tic()) {
                    ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVarJpo).jpo(wqxVarJd2);
                }
            }
        }
        if (c0062jpoYd != null) {
            wqxVarJpo.jpo(c0062jpoYd.jpo());
        }
        this.wqx = wqxVarJpo;
        return wqxVarJpo;
    }

    public void jpo(String str, ju juVar) {
        this.f17711ju = juVar;
        this.f17714yd = str;
        if (juVar != null) {
            this.f17708jd = juVar.jpo();
        }
    }

    public com.bytedance.adsdk.ugeno.jd.wqx<View> jpo(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        this.f17708jd = jSONObject2;
        opi opiVar = this.f17709jj;
        if (opiVar != null) {
            opiVar.jpo();
        }
        qk qkVar = new qk(jSONObject, jSONObject2, jSONObject3);
        this.zz = qkVar;
        qkVar.jpo(this.opi, this.f17710jr);
        this.oya = new com.bytedance.adsdk.ugeno.cm.jpo.jpo();
        if (!(this.my instanceof com.bytedance.adsdk.ugeno.core.jpo.jd)) {
            this.wqx = jpo(this.zz.jpo(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) null);
            if (this.nmd == null) {
                opi opiVar2 = this.f17709jj;
                if (opiVar2 != null) {
                    opiVar2.jd();
                    this.wqx.jpo(this.f17709jj);
                    this.f17709jj.wqx();
                }
                jpo(this.wqx);
                if (this.f17709jj != null) {
                    sq sqVar = new sq();
                    sqVar.jpo(0);
                    sqVar.jpo(this.wqx);
                    this.f17709jj.jpo(sqVar);
                }
                return this.wqx;
            }
            throw null;
        }
        this.zz.jd();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx<View> jpo(qk.jpo jpoVar, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.f17708jd = jSONObject;
        opi opiVar = this.f17709jj;
        if (opiVar != null) {
            opiVar.jpo();
        }
        this.oya = new com.bytedance.adsdk.ugeno.cm.jpo.jpo();
        if (!(this.my instanceof com.bytedance.adsdk.ugeno.core.jpo.jd)) {
            this.wqx = jpo(jpoVar, (com.bytedance.adsdk.ugeno.jd.wqx<View>) null);
            opi opiVar2 = this.f17709jj;
            if (opiVar2 != null) {
                opiVar2.jd();
                this.wqx.jpo(this.f17709jj);
            }
            jpo(this.wqx);
            return this.wqx;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx<View> jpo(qk.jpo jpoVar, com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
        jpo.C0062jpo c0062jpoYd;
        List<qk.jpo> listWqx;
        if (!qk.cm(jpoVar)) {
            return null;
        }
        String strWqx = jpoVar.wqx();
        jd jdVarJpo = cm.jpo(strWqx);
        jd jdVar = jdVarJpo;
        if (jdVarJpo == null) {
            this.prr = true;
            if (this.hna == null) {
                this.hna = new ArrayList();
            }
            this.hna.add(strWqx);
            strWqx = "View";
            jpoVar.jpo("View");
            jd jdVarJpo2 = cm.jpo("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            jdVar = jdVarJpo2;
            if (jdVarJpo2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJpo = jdVar.jpo(this.jpo);
        if (wqxVarJpo == null) {
            return null;
        }
        JSONObject jSONObjectCm = jpoVar.cm();
        wqxVarJpo.qk(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jpoVar.jpo(), this.f17708jd));
        wqxVarJpo.xyk(strWqx);
        wqxVarJpo.wqx(jSONObjectCm);
        wqxVarJpo.jpo(jpoVar);
        wqxVarJpo.jd(this.f17708jd);
        qk qkVar = this.zz;
        if (qkVar == null) {
            wqxVarJpo.jpo(true);
        } else {
            wqxVarJpo.jpo(qkVar.cm());
        }
        wqxVarJpo.jpo(this.f17711ju);
        wqxVarJpo.jpo(this.oya);
        Iterator<String> itKeys = jSONObjectCm.keys();
        if (wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) {
            com.bytedance.adsdk.ugeno.jd.jpo jpoVar2 = (com.bytedance.adsdk.ugeno.jd.jpo) wqxVar;
            c0062jpoYd = jpoVar2.yd();
            wqxVarJpo.jpo(jpoVar2);
        } else {
            c0062jpoYd = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectCm.optString(next), this.f17708jd);
            wqxVarJpo.jpo(next, strJpo);
            if (this.nmd != null) {
                throw null;
            }
            if (c0062jpoYd != null) {
                c0062jpoYd.jpo(this.jpo, next, strJpo);
            }
        }
        if (c0062jpoYd != null) {
            wqxVarJpo.jpo(c0062jpoYd.jpo());
        }
        if (wqxVarJpo instanceof com.bytedance.adsdk.ugeno.jd.jpo) {
            List<qk.jpo> listMy = jpoVar.my();
            if (listMy != null && listMy.size() > 0) {
                if (TextUtils.equals(wqxVarJpo.nzb(), "Swiper") && listMy.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                try {
                    Collections.sort(listMy, new Comparator<qk.jpo>() { // from class: com.bytedance.adsdk.ugeno.core.if.1
                        @Override // java.util.Comparator
                        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
                        public int compare(qk.jpo jpoVar3, qk.jpo jpoVar4) {
                            return jpoVar3.cm().optInt(C3352n2.f37927u, 0) - jpoVar4.cm().optInt(C3352n2.f37927u, 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<qk.jpo> it = listMy.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJpo2 = jpo(it.next(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) wqxVarJpo);
                    if (wqxVarJpo2 != null && !wqxVarJpo2.wcn()) {
                        ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVarJpo).jpo(wqxVarJpo2, wqxVarJpo2.rv());
                    }
                }
            } else {
                if (TextUtils.equals(wqxVarJpo.nzb(), "RecyclerLayout") && (listWqx = this.zz.wqx()) != null && listWqx.size() > 0) {
                    Iterator<qk.jpo> it2 = listWqx.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJpo3 = jpo(it2.next(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) wqxVarJpo);
                        if (wqxVarJpo3 != null && wqxVarJpo3.tic()) {
                            ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVarJpo).jpo(wqxVarJpo3);
                        }
                    }
                }
                return wqxVarJpo;
            }
        }
        this.wqx = wqxVarJpo;
        return wqxVarJpo;
    }

    public void jd(JSONObject jSONObject) throws JSONException {
        opi opiVar = this.f17709jj;
        if (opiVar != null) {
            opiVar.wqx();
        }
        this.f17708jd = jSONObject;
        jpo(this.wqx, jSONObject);
        jpo(this.wqx);
        if (this.f17709jj != null) {
            sq sqVar = new sq();
            sqVar.jpo(0);
            sqVar.jpo(this.wqx);
            this.f17709jj.jpo(sqVar);
        }
    }

    private void jd(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) throws JSONException {
        try {
            if (!wqxVar.sz() || wqxVar.uu() == null || wqxVar.uu().jj() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", wqxVar.uu().jj());
            this.f17708jd.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public List<String> jd() {
        return this.hna;
    }

    private void jd(JSONObject jSONObject, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        List<com.bytedance.adsdk.ugeno.jd.wqx<View>> listZz;
        if (wqxVar == null) {
            return;
        }
        this.f17708jd = jSONObject;
        wqxVar.jd(jSONObject);
        wqxVar.jpo(this.f17711ju);
        jpo.C0062jpo c0062jpoYd = wqxVar.kln() != null ? wqxVar.kln().yd() : null;
        Iterator<String> itKeys = wqxVar.se().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(wqxVar.se().optString(next), jSONObject);
            wqxVar.jpo(next, strJpo);
            if (c0062jpoYd != null) {
                c0062jpoYd.jpo(this.jpo, next, strJpo);
            }
        }
        if ((wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) && (listZz = ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVar).zz()) != null && !listZz.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.jd.wqx<View>> it = listZz.iterator();
            while (it.hasNext()) {
                jd(jSONObject, it.next());
            }
        }
        if (c0062jpoYd != null) {
            wqxVar.jpo(c0062jpoYd.jpo());
        }
    }

    public com.bytedance.adsdk.ugeno.jd.wqx<View> jpo(JSONObject jSONObject) {
        opi opiVar = this.f17709jj;
        if (opiVar != null) {
            opiVar.jpo();
        }
        qk qkVar = new qk(jSONObject, this.f17708jd);
        this.zz = qkVar;
        if (!(this.my instanceof com.bytedance.adsdk.ugeno.core.jpo.jd)) {
            this.wqx = jd(qkVar.jpo(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) null);
            opi opiVar2 = this.f17709jj;
            if (opiVar2 != null) {
                opiVar2.jd();
                this.wqx.jpo(this.f17709jj);
            }
            return this.wqx;
        }
        qkVar.jd();
        throw null;
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject) throws JSONException {
        if (wqxVar == null) {
            return;
        }
        if (wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) {
            wqxVar.jpo(jSONObject);
            List<com.bytedance.adsdk.ugeno.jd.wqx<View>> listZz = ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVar).zz();
            if (listZz == null || listZz.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.jd.wqx<View>> it = listZz.iterator();
            while (it.hasNext()) {
                jpo(it.next(), jSONObject);
            }
            return;
        }
        wqxVar.jpo(jSONObject);
    }

    private void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) throws JSONException {
        List<com.bytedance.adsdk.ugeno.jd.wqx<View>> listZz;
        if (wqxVar == null) {
            return;
        }
        JSONObject jSONObjectSe = wqxVar.se();
        Iterator<String> itKeys = jSONObjectSe.keys();
        com.bytedance.adsdk.ugeno.jd.jpo jpoVarKln = wqxVar.kln();
        jpo.C0062jpo c0062jpoYd = jpoVarKln != null ? jpoVarKln.yd() : null;
        jd(wqxVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectSe.optString(next), this.f17708jd);
            wqxVar.jpo(next, strJpo);
            if (c0062jpoYd != null) {
                c0062jpoYd.jpo(this.jpo, next, strJpo);
            }
        }
        wqxVar.jpo(this.f17707cm);
        wqxVar.jpo(this.my);
        wqxVar.jpo(this.f17712qk);
        zz zzVar = this.nmd;
        if (zzVar != null) {
            wqxVar.jpo(zzVar);
        }
        my myVar = this.f17713sq;
        if (myVar != null) {
            wqxVar.jpo(myVar);
        }
        com.bytedance.adsdk.ugeno.cm.au auVar = this.xyk;
        if (auVar != null) {
            wqxVar.jpo(auVar);
        }
        if ((wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) && (listZz = ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVar).zz()) != null && listZz.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.jd.wqx<View>> it = listZz.iterator();
            while (it.hasNext()) {
                jpo(it.next());
            }
        }
        if (c0062jpoYd != null) {
            wqxVar.jpo(c0062jpoYd.jpo());
        }
        wqxVar.jd();
    }

    public void jpo(prr prrVar) {
        com.bytedance.adsdk.ugeno.core.jpo.jpo jpoVarMy = com.bytedance.adsdk.ugeno.my.jpo().my();
        if (jpoVarMy == null) {
            this.my = prrVar;
        } else {
            if (jpoVarMy.jpo(prrVar) == null) {
                this.my = prrVar;
                return;
            }
            throw null;
        }
    }

    public void jpo(hna hnaVar) {
        this.f17712qk = hnaVar;
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.jd.wqx<View>> listZz;
        if (wqxVar == null) {
            return;
        }
        wqxVar.jpo(str, objArr);
        if (!(wqxVar instanceof com.bytedance.adsdk.ugeno.jd.jpo) || (listZz = ((com.bytedance.adsdk.ugeno.jd.jpo) wqxVar).zz()) == null || listZz.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.jd.wqx<View>> it = listZz.iterator();
        while (it.hasNext()) {
            jpo(it.next(), str, objArr);
        }
    }

    public boolean jpo() {
        return this.prr;
    }

    public void jpo(my myVar) {
        this.f17713sq = myVar;
    }

    public void jpo(JSONObject jSONObject, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) throws JSONException {
        jd(jSONObject, wqxVar);
        jpo((com.bytedance.adsdk.ugeno.jd.wqx<View>) wqxVar);
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.au auVar) {
        this.xyk = auVar;
    }
}
