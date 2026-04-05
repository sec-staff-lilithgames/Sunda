package com.bytedance.sdk.component.my.my;

import com.bytedance.sdk.component.my.hna;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au<T> extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jj f18879jd;
    private T jpo;
    private boolean wqx;

    public au(T t10, com.bytedance.sdk.component.my.jj jjVar, boolean z10) {
        this.jpo = t10;
        this.f18879jd = jjVar;
        this.wqx = z10;
    }

    private Map<String, String> jd() {
        com.bytedance.sdk.component.my.jj jjVar = this.f18879jd;
        if (jjVar != null) {
            return jjVar.my();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
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

    private void jd(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        hna hnaVarXyk = wqxVar.xyk();
        if (hnaVarXyk != null) {
            hnaVarXyk.jpo(new com.bytedance.sdk.component.my.wqx.cm().jpo(wqxVar, this.jpo, jd(), this.wqx));
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "success";
    }
}
