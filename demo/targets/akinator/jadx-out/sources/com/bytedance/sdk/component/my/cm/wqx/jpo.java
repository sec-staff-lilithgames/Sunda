package com.bytedance.sdk.component.my.cm.wqx;

import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.my.ju;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo<T> {

    /* renamed from: jd, reason: collision with root package name */
    private jr f18816jd;
    private wqx jpo;

    public jpo(wqx wqxVar, jr jrVar) {
        this.jpo = wqxVar;
        this.f18816jd = jrVar;
    }

    public void jpo(ju<T> juVar) {
        try {
            jr jrVar = this.f18816jd;
            if (jrVar != null) {
                jrVar.jpo("success", this.jpo);
            }
            String strNmd = this.jpo.nmd();
            Map<String, List<wqx>> mapZz = this.jpo.sq().zz();
            List<wqx> list = mapZz.get(strNmd);
            if (list == null) {
                hna hnaVarXyk = this.jpo.xyk();
                if (hnaVarXyk != null) {
                    hnaVarXyk.toString();
                    this.jpo.yd();
                    hnaVarXyk.jpo(juVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (wqx wqxVar : list) {
                            hna hnaVarXyk2 = wqxVar.xyk();
                            if (hnaVarXyk2 != null) {
                                hnaVarXyk2.toString();
                                wqxVar.yd();
                                hnaVarXyk2.jpo(juVar);
                            }
                        }
                        list.clear();
                        mapZz.remove(strNmd);
                    } finally {
                    }
                }
            }
            jr jrVar2 = this.f18816jd;
            if (jrVar2 != null) {
                jrVar2.jd("success", this.jpo);
            }
        } catch (Throwable unused) {
        }
    }

    public void jpo(int i10, String str, Throwable th2) {
        try {
            jr jrVar = this.f18816jd;
            if (jrVar != null) {
                jrVar.jpo(C3191e4.h.f36509t, this.jpo);
            }
            String strNmd = this.jpo.nmd();
            Map<String, List<wqx>> mapZz = this.jpo.sq().zz();
            List<wqx> list = mapZz.get(strNmd);
            if (list == null) {
                hna hnaVarXyk = this.jpo.xyk();
                if (hnaVarXyk != null) {
                    hnaVarXyk.jpo(i10, str, th2);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<wqx> it = list.iterator();
                        while (it.hasNext()) {
                            hna hnaVarXyk2 = it.next().xyk();
                            if (hnaVarXyk2 != null) {
                                hnaVarXyk2.toString();
                                hnaVarXyk2.jpo(i10, str, th2);
                            }
                        }
                        list.clear();
                        mapZz.remove(strNmd);
                    } finally {
                    }
                }
            }
            jr jrVar2 = this.f18816jd;
            if (jrVar2 != null) {
                jrVar2.jd(C3191e4.h.f36509t, this.jpo);
            }
        } catch (Throwable unused) {
        }
    }
}
