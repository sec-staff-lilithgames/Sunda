package com.bytedance.sdk.component.my.my;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.my.sq;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends jpo {
    private Bitmap jd(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        Collection<sq> collectionJpo = wqxVar.opi().jpo();
        Bitmap bitmapJpo = null;
        if (collectionJpo == null) {
            return null;
        }
        Iterator<sq> it = collectionJpo.iterator();
        while (it.hasNext() && (bitmapJpo = it.next().jpo(wqxVar.yd())) == null) {
        }
        return bitmapJpo;
    }

    private Bitmap wqx(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        return wqxVar.opi().jpo(wqxVar.jr()).jpo(wqxVar.yd());
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        int iM420if = wqxVar.m420if();
        Bitmap bitmapJd = (iM420if == 2 || iM420if == 1) ? (wqxVar.nmd() || wqxVar.jr().zz()) ? jd(wqxVar) : wqx(wqxVar) : null;
        if (bitmapJd == null) {
            wqxVar.jpo(new Cif());
        } else {
            wqxVar.jpo(new au(bitmapJd, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "memory_cache";
    }
}
