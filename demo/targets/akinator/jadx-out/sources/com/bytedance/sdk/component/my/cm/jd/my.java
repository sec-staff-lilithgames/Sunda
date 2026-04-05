package com.bytedance.sdk.component.my.cm.jd;

import com.bytedance.sdk.component.my.jr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements jj {
    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, jr jrVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        List<com.bytedance.sdk.component.my.cm.wqx.wqx> copyOnWriteArrayList;
        String strNmd = wqxVar.nmd();
        Map<String, List<com.bytedance.sdk.component.my.cm.wqx.wqx>> mapZz = wqxVar.sq().zz();
        wqxVar.m418if();
        wqxVar.jpo();
        synchronized (mapZz) {
            try {
                copyOnWriteArrayList = mapZz.get(strNmd);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapZz.put(strNmd, copyOnWriteArrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(wqxVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            wqxVar.m418if();
            wqxVar.jpo();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public String jpo() {
        return "check_duplicate";
    }
}
