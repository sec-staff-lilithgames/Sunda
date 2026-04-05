package com.bytedance.sdk.component.my.cm.jd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.my.jr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo<T> implements jj {
    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, jr jrVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        Bitmap bitmapJpo;
        String strYd = wqxVar.yd();
        wqxVar.jpo();
        com.bytedance.sdk.component.my.jd jdVarOpi = wqxVar.opi();
        com.bytedance.sdk.component.my.cm.wqx.jj jjVarSq = wqxVar.sq();
        if (jdVarOpi == null || jjVarSq == null || !jdVarOpi.my() || !jpo(wqxVar) || (bitmapJpo = jjVarSq.jpo(jdVarOpi).jpo(strYd)) == null) {
            return true;
        }
        wqxVar.jpo();
        jpoVar.jpo(new com.bytedance.sdk.component.my.cm.wqx.cm().jpo(wqxVar, bitmapJpo, null, false));
        return false;
    }

    private boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar) {
        int iM418if = wqxVar.m418if();
        return iM418if == 1 || iM418if == 2;
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public String jpo() {
        return "bitmap_cache";
    }
}
