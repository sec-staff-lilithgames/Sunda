package com.bytedance.sdk.component.my.my;

import com.bytedance.sdk.component.my.hna;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private int f18885jd;
    private Throwable jpo;
    private String wqx;

    public xyk(int i10, String str, Throwable th2) {
        this.f18885jd = i10;
        this.wqx = str;
        this.jpo = th2;
    }

    private void jd(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        hna hnaVarXyk = wqxVar.xyk();
        if (hnaVarXyk != null) {
            hnaVarXyk.jpo(this.f18885jd, this.wqx, this.jpo);
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        wqxVar.jpo(new com.bytedance.sdk.component.my.wqx.jpo(this.f18885jd, this.wqx, this.jpo));
        String strTu = wqxVar.tu();
        Map<String, List<com.bytedance.sdk.component.my.wqx.wqx>> mapXyk = wqxVar.opi().xyk();
        List<com.bytedance.sdk.component.my.wqx.wqx> list = mapXyk.get(strTu);
        if (list == null) {
            jd(wqxVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.my.wqx.wqx> it = list.iterator();
                while (it.hasNext()) {
                    jd(it.next());
                }
                list.clear();
                mapXyk.remove(strTu);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return C3191e4.h.f36509t;
    }
}
