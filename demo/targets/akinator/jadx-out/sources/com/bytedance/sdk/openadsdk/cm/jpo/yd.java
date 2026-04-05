package com.bytedance.sdk.openadsdk.cm.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.prr.wqx.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd implements com.bytedance.sdk.component.jj.jpo.jd.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final wqx f19571jd = wqx.jpo();
    public tu<com.bytedance.sdk.openadsdk.cm.jpo> jpo;

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.jj.jpo.cm.jpo>> cm(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        HashMap<String, List<com.bytedance.sdk.component.jj.jpo.cm.jpo>> map = new HashMap<>();
        new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar = list.get(i10);
            JSONObject jSONObjectQk = jpoVar.qk();
            if (jSONObjectQk != null) {
                String strOptString = jSONObjectQk.optString("app_log_url");
                List<com.bytedance.sdk.component.jj.jpo.cm.jpo> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(jpoVar);
            }
        }
        return map;
    }

    private boolean wqx(List<com.bytedance.sdk.openadsdk.cm.jpo> list) {
        JSONObject jSONObjectWqx;
        if (list == null || list.size() == 0 || (jSONObjectWqx = list.get(0).wqx()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectWqx.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.cm.my jd(List<cm.jpo> list) {
        if (this.jpo == null) {
            this.jpo = sq.wqx();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.zz.jpo()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<cm.jpo> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().f21465jd);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j10);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strCm = com.bytedance.sdk.openadsdk.core.zz.jd().cm();
                if (strCm == null) {
                    strCm = "";
                }
                StringBuilder sb2 = new StringBuilder(nq.jpo());
                sb2.append("-");
                sb2.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.my.jpo(strCm + j10 + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.my.jpo(sb2.toString()));
                return this.jpo.jd(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jd.wqx
    public void jpo(final List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, final com.bytedance.sdk.component.jj.jpo.jd.jd jdVar) {
        com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar;
        if (list == null || list.isEmpty() || !sq.cm().vzb() || (jpoVar = list.get(0)) == null) {
            return;
        }
        byte bCm = jpoVar.cm();
        final ArrayList arrayList = new ArrayList();
        if (bCm == 0) {
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.1
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("applog");
                }
            });
            duq.jpo(new com.bytedance.sdk.component.xyk.wqx.jd(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = yd.this.cm(list).entrySet().iterator();
                    } catch (Throwable th2) {
                        nmd.wqx("OverSeaEventUploadImp", th2.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.jj.jpo.jd.jd jdVar2 = jdVar;
                        if (jdVar2 != null) {
                            jdVar2.jpo(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            jpo.jpo(jpo.f19552cm);
                            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.cm.jpo(jpoVar2.wqx(), jpoVar2.qk()));
                            }
                            com.bytedance.sdk.openadsdk.cm.my myVarJpo = yd.this.jpo(arrayList2);
                            if (jdVar != null && myVarJpo != null) {
                                boolean z10 = yd.this.jpo(arrayList2, myVarJpo) ? true : myVarJpo.f19576cm;
                                arrayList.add(new com.bytedance.sdk.component.jj.jpo.jd.wqx.jpo(new com.bytedance.sdk.component.jj.jpo.jd.wqx.jd(myVarJpo.jpo, myVarJpo.f19577jd, myVarJpo.wqx, z10, ""), list2));
                                if (myVarJpo.f19577jd == 200) {
                                    jpo.jpo(jpo.f19552cm, true);
                                    com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.2.1
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return a.h("applog");
                                        }
                                    });
                                } else if (z10) {
                                    jpo.jpo(jpo.f19552cm, false);
                                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.2.2
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return a.h("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.2.3
                                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                            return a.h("applog");
                                        }
                                    });
                                }
                            }
                            if (jdVar != null && myVarJpo == null) {
                                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.2.4
                                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                        return a.h("applog");
                                    }
                                });
                            }
                        } catch (Throwable th3) {
                            nmd.wqx("OverSeaEventUploadImp", th3.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.jj.jpo.jd.jd jdVar3 = jdVar;
                    if (jdVar3 != null) {
                        jdVar3.jpo(arrayList);
                    }
                }
            });
            return;
        }
        if (bCm == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar2 : list) {
                arrayList2.add(new cm.jpo(jpoVar2.wqx(), jpoVar2.qk()));
            }
            jpo.jpo(jpo.my);
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.3
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        return a.h("stats");
                    }
                });
                duq.jpo(new com.bytedance.sdk.component.xyk.wqx.jd(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.cm.my myVarJd = yd.this.jd(arrayList2);
                        if (jdVar != null && myVarJd != null) {
                            arrayList.add(new com.bytedance.sdk.component.jj.jpo.jd.wqx.jpo(new com.bytedance.sdk.component.jj.jpo.jd.wqx.jd(myVarJd.jpo, myVarJd.f19577jd, myVarJd.wqx, myVarJd.f19576cm, ""), list));
                            jdVar.jpo(arrayList);
                            if (myVarJd.f19577jd == 200) {
                                jpo.jpo(jpo.my, true);
                                com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.4.1
                                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                        return a.h("stats");
                                    }
                                });
                            } else if (myVarJd.f19576cm) {
                                jpo.jpo(jpo.my, false);
                                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.4.2
                                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                        return a.h("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.4.3
                                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                        return a.h("stats");
                                    }
                                });
                            }
                        }
                        if (jdVar == null || myVarJd != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.cm.jpo.yd.4.4
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(List<com.bytedance.sdk.openadsdk.cm.jpo> list, com.bytedance.sdk.openadsdk.cm.my myVar) {
        int i10;
        return !wqx(list) && (i10 = myVar.f19577jd) >= 400 && i10 < 500;
    }

    public com.bytedance.sdk.openadsdk.cm.my jpo(List<com.bytedance.sdk.openadsdk.cm.jpo> list) {
        if (this.jpo == null) {
            this.jpo = sq.wqx();
        }
        if (this.jpo == null) {
            return null;
        }
        int iCgn = com.bytedance.sdk.openadsdk.core.settings.au.jrx().cgn();
        if (3 == iCgn) {
            return this.jpo.jpo(this.f19571jd.jpo(this.f19571jd.jpo(list, false), System.currentTimeMillis(), this.f19571jd.jd(), true), this.f19571jd.jpo(list), true);
        }
        if (2 == iCgn) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectJd = this.f19571jd.jd();
            this.jpo.jpo(this.f19571jd.jpo(this.f19571jd.jpo(list, true), jCurrentTimeMillis, jSONObjectJd, true), this.f19571jd.jpo(list), true);
            return this.jpo.jpo(this.f19571jd.jpo(this.f19571jd.jd(list), jCurrentTimeMillis, jSONObjectJd, false), this.f19571jd.jpo(list), false);
        }
        return this.jpo.jpo(this.f19571jd.jpo(list, System.currentTimeMillis(), this.f19571jd.jd(), false), this.f19571jd.jpo(list), false);
    }
}
