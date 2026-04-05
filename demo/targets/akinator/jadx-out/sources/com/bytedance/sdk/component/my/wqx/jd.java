package com.bytedance.sdk.component.my.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.my.au;
import com.bytedance.sdk.component.my.opi;
import com.bytedance.sdk.component.my.prr;
import com.bytedance.sdk.component.my.wqx.wqx;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.component.utils.hna;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements prr {
    private volatile jj jpo;

    private jd() {
    }

    private void jd(Context context, au auVar) {
        if (this.jpo != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (auVar == null) {
            auVar = my.jpo(context);
        }
        this.jpo = new jj(context, auVar);
    }

    public static prr jpo(Context context, au auVar) {
        jd jdVar = new jd();
        jdVar.jd(context, auVar);
        return jdVar;
    }

    @Override // com.bytedance.sdk.component.my.prr
    public yd jpo(String str) {
        return new wqx.jd(this.jpo).wqx(str);
    }

    @Override // com.bytedance.sdk.component.my.prr
    public InputStream jpo(String str, String str2) throws NoSuchAlgorithmException {
        if (this.jpo != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = hna.jpo(str);
            }
            Collection<opi> collectionJd = this.jpo.jd();
            if (collectionJd != null) {
                Iterator<opi> it = collectionJd.iterator();
                while (it.hasNext()) {
                    byte[] bArrJpo = it.next().jpo(str2);
                    if (bArrJpo != null) {
                        return new ByteArrayInputStream(bArrJpo);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.my.wqx> collectionWqx = this.jpo.wqx();
            if (collectionWqx != null) {
                Iterator<com.bytedance.sdk.component.my.wqx> it2 = collectionWqx.iterator();
                while (it2.hasNext()) {
                    InputStream inputStreamJpo = it2.next().jpo(str2);
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
