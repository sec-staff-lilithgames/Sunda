package com.bytedance.sdk.component.my.my;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends jpo {
    private byte[] jd(com.bytedance.sdk.component.my.wqx.wqx wqxVar, String str) {
        com.bytedance.sdk.component.my.wqx wqxVarWqx = wqxVar.opi().wqx(wqxVar.jr());
        if (wqxVarWqx == null) {
            return null;
        }
        return wqxVarWqx.jpo((com.bytedance.sdk.component.my.wqx) str);
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        String strZz = wqxVar.zz();
        byte[] bArrJpo = (wqxVar.nmd() || wqxVar.jr().zz()) ? jpo(wqxVar, strZz) : jd(wqxVar, strZz);
        if (bArrJpo == null) {
            wqxVar.jpo(new ju());
        } else {
            wqxVar.jpo(new jd(bArrJpo, null));
            wqxVar.opi().jd(wqxVar.jr()).jpo(strZz, bArrJpo);
        }
    }

    private byte[] jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar, String str) {
        wqxVar.opi().wqx(wqxVar.jr());
        Collection<com.bytedance.sdk.component.my.wqx> collectionWqx = wqxVar.opi().wqx();
        if (collectionWqx == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.my.wqx> it = collectionWqx.iterator();
        while (it.hasNext()) {
            byte[] bArrJpo = it.next().jpo((com.bytedance.sdk.component.my.wqx) str);
            if (bArrJpo != null) {
                return bArrJpo;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "disk_cache";
    }
}
