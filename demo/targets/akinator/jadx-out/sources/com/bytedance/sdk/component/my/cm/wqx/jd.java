package com.bytedance.sdk.component.my.cm.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.my.au;
import com.bytedance.sdk.component.my.cm.wqx.wqx;
import com.bytedance.sdk.component.my.opi;
import com.bytedance.sdk.component.my.prr;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.component.utils.hna;
import cv.BLca.YsiBvdpw;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd implements prr {
    private volatile jj jpo;

    private jd() {
    }

    public static prr jpo(Context context, au auVar) {
        jd jdVar = new jd();
        jdVar.jd(context, auVar);
        return jdVar;
    }

    private void jd(Context context, au auVar) {
        if (this.jpo != null) {
            Log.w(YsiBvdpw.dOR, "already init!");
        }
        if (auVar == null) {
            auVar = my.jpo(context);
        }
        this.jpo = new jj(context, auVar);
    }

    @Override // com.bytedance.sdk.component.my.prr
    public yd jpo(String str) {
        return new wqx.jd(this.jpo).wqx(str);
    }

    @Override // com.bytedance.sdk.component.my.prr
    public InputStream jpo(String str, String str2) throws NoSuchAlgorithmException {
        byte[] bArrJpo;
        if (this.jpo != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = hna.jpo(str);
            }
            opi opiVarJd = this.jpo.jd();
            if (opiVarJd != null && (bArrJpo = opiVarJd.jpo(str2)) != null) {
                return new ByteArrayInputStream(bArrJpo);
            }
            Collection<com.bytedance.sdk.component.my.wqx> collectionWqx = this.jpo.wqx();
            if (collectionWqx != null) {
                Iterator<com.bytedance.sdk.component.my.wqx> it = collectionWqx.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamJpo = it.next().jpo(str2);
                    if (inputStreamJpo != null) {
                        return inputStreamJpo;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.my.prr
    public boolean jpo(String str, String str2, String str3) throws NoSuchAlgorithmException {
        if (this.jpo == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = hna.jpo(str);
        }
        com.bytedance.sdk.component.my.wqx wqxVarJpo = this.jpo.jpo(str3);
        if (wqxVarJpo != null) {
            return wqxVarJpo.jd(str2);
        }
        return false;
    }
}
