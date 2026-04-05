package com.bytedance.adsdk.ugeno.cm;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.cm.cm.Cif;
import com.bytedance.adsdk.ugeno.cm.cm.wqx;
import com.bytedance.adsdk.ugeno.cm.jd.jpo;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements ju {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.my f17699cm;

    /* renamed from: jd, reason: collision with root package name */
    private Map<String, List<com.bytedance.adsdk.ugeno.cm.cm.wqx>> f17700jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f17701jj;
    private jpo jpo;
    private au my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f17702qk;
    private com.bytedance.adsdk.ugeno.jd.wqx wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public Map<String, com.bytedance.adsdk.ugeno.cm.cm.wqx> f17703jd;
        public Map<String, List<com.bytedance.adsdk.ugeno.cm.cm.wqx>> jpo;

        public jpo(Map<String, List<com.bytedance.adsdk.ugeno.cm.cm.wqx>> map, Map<String, com.bytedance.adsdk.ugeno.cm.cm.wqx> map2) {
            this.jpo = map;
            this.f17703jd = map2;
        }
    }

    public zz(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, jpo jpoVar) {
        this.wqx = wqxVar;
        this.jpo = jpoVar;
        if (jpoVar != null) {
            this.f17700jd = jpoVar.jpo;
        }
    }

    public void cm() {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo = jpo("animateState");
        if (listJpo == null || listJpo.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listJpo) {
            if (wqxVar != null) {
                wqxVar.jpo(this);
                wqxVar.jpo(new Object[0]);
            }
        }
    }

    public void jd() {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo = jpo("twist");
        if (listJpo == null || listJpo.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listJpo) {
            if (wqxVar != null) {
                wqxVar.jpo(this);
                wqxVar.jpo(new Object[0]);
            }
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.core.my myVar) {
        this.f17699cm = myVar;
    }

    public void my() {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo = jpo("timer");
        if (listJpo == null || listJpo.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listJpo) {
            if (wqxVar != null) {
                wqxVar.jpo(this);
                wqxVar.jpo(new Object[0]);
            }
        }
    }

    public void wqx() {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> value;
        jpo jpoVar = this.jpo;
        if (jpoVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.cm.cm.wqx>> entry : jpoVar.jpo.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : value) {
                    if (wqxVar instanceof com.bytedance.adsdk.ugeno.cm.cm.cm) {
                        wqxVar.jpo(this);
                        wqxVar.jpo(new Object[0]);
                    }
                }
            }
        }
    }

    public void jpo(au auVar) {
        this.my = auVar;
    }

    public void jpo() {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo = jpo("shake");
        if (listJpo == null || listJpo.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listJpo) {
            if (wqxVar != null) {
                wqxVar.jpo(this);
                wqxVar.jpo(new Object[0]);
            }
        }
    }

    public com.bytedance.adsdk.ugeno.cm.cm.wqx jd(String str) {
        Map<String, com.bytedance.adsdk.ugeno.cm.cm.wqx> map;
        if (this.jpo == null || TextUtils.isEmpty(str) || (map = this.jpo.f17703jd) == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean jpo(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo = jpo("touchStart");
        if (listJpo != null && !listJpo.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listJpo) {
                if (wqxVar instanceof Cif) {
                    wqxVar.jpo(this);
                    wqxVar.jpo(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo2 = jpo("touchEnd");
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo3 = jpo("tap");
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listJpo4 = jpo("slide");
        if (listJpo != null && !listJpo.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar2 : listJpo2) {
                if (wqxVar2 instanceof com.bytedance.adsdk.ugeno.cm.cm.ju) {
                    wqxVar2.jpo(this);
                    this.f17702qk = wqxVar2.jpo(motionEvent);
                }
            }
        }
        if ((listJpo3 != null && !listJpo3.isEmpty()) || (listJpo4 != null && !listJpo4.isEmpty())) {
            if (this.f17702qk && motionEvent.getAction() == 1) {
                return true;
            }
            if (listJpo3 != null && !listJpo3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar3 : listJpo3) {
                    if (wqxVar3 instanceof com.bytedance.adsdk.ugeno.cm.cm.zz) {
                        ((com.bytedance.adsdk.ugeno.cm.cm.zz) wqxVar3).jpo(this.my);
                        wqxVar3.jpo(this);
                        this.f17701jj = wqxVar3.jpo(motionEvent);
                    }
                }
            }
            if (this.f17701jj) {
                return true;
            }
            if (listJpo4 != null && !listJpo4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar4 : listJpo4) {
                    if (wqxVar4 instanceof com.bytedance.adsdk.ugeno.cm.cm.my) {
                        wqxVar4.jpo(this);
                        return wqxVar4.jpo(motionEvent);
                    }
                }
            }
            return this.f17701jj;
        }
        return this.f17702qk;
    }

    private void jpo(String str, List<jj.jpo> list) {
        com.bytedance.adsdk.ugeno.cm.jd.jpo jpoVarJpo;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jj.jpo jpoVar : list) {
            if (jpoVar != null && (jpoVarJpo = jpo.C0060jpo.jpo(this.wqx, str, jpoVar)) != null) {
                jpoVarJpo.jpo();
                jpoVarJpo.jd();
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.cm.cm.wqx> jpo(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.cm.cm.wqx>> map = this.f17700jd;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f17700jd.get(str);
    }

    public void jpo(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVarJd = jd(str);
        if (wqxVarJd != null) {
            wqxVarJd.jpo(this);
            wqxVarJd.jpo(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm.ju
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, List<jj.jpo> list) {
        com.bytedance.adsdk.ugeno.core.my myVar = this.f17699cm;
        if (myVar != null) {
            myVar.jpo(wqxVar, str, list);
        }
        jpo(str, list);
    }

    public static zz jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str) {
        com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVarJpo;
        if (wqxVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                jpo jpoVar = new jpo(new HashMap(), new HashMap());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (wqxVarJpo = wqx.jpo.jpo(wqxVar.ju().getContext(), wqxVar, jSONObjectOptJSONObject, wqxVar.m389if())) != null) {
                        if (jpoVar.jpo.containsKey(wqxVarJpo.cm())) {
                            List<com.bytedance.adsdk.ugeno.cm.cm.wqx> list = jpoVar.jpo.get(wqxVarJpo.cm());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(wqxVarJpo);
                                jpoVar.jpo.put(wqxVarJpo.cm(), arrayList);
                            } else {
                                list.add(wqxVarJpo);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(wqxVarJpo);
                            jpoVar.jpo.put(wqxVarJpo.cm(), arrayList2);
                        }
                        jpoVar.f17703jd.put(wqxVarJpo.my(), wqxVarJpo);
                    }
                }
                return new zz(wqxVar, jpoVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
