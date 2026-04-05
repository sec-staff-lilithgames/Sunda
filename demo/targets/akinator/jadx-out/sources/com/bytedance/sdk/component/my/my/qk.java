package com.bytedance.sdk.component.my.my;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends jpo {
    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        List<com.bytedance.sdk.component.my.wqx.wqx> linkedList;
        String strTu = wqxVar.tu();
        Map<String, List<com.bytedance.sdk.component.my.wqx.wqx>> mapXyk = wqxVar.opi().xyk();
        synchronized (mapXyk) {
            try {
                linkedList = mapXyk.get(strTu);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(wqxVar);
                mapXyk.put(strTu, linkedList);
                if (linkedList.size() <= 1) {
                    wqxVar.jpo(new cm());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "check_duplicate";
    }
}
