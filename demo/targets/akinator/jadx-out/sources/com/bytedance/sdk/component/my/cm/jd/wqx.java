package com.bytedance.sdk.component.my.cm.jd;

import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.my.opi;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements jj {
    private void jd(final com.bytedance.sdk.component.my.jd jdVar, final com.bytedance.sdk.component.my.cm.wqx.jj jjVar, final String str, final byte[] bArr) {
        if (jdVar == null || !jdVar.qk()) {
            return;
        }
        jjVar.xyk().submit(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.jd.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                jjVar.wqx(jdVar).jpo(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, jr jrVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        com.bytedance.sdk.component.my.jd jdVarOpi = wqxVar.opi();
        com.bytedance.sdk.component.my.cm.wqx.jj jjVarSq = wqxVar.sq();
        if (jdVarOpi != null && jjVarSq != null) {
            if (jdVarOpi.jj()) {
                if (jrVar != null) {
                    jrVar.jpo("data_cache", wqxVar);
                }
                opi opiVarJd = jjVarSq.jd(jdVarOpi);
                bArrJpo = opiVarJd != null ? opiVarJd.jpo(wqxVar.zz()) : null;
                if (jrVar != null) {
                    jrVar.jd("data_cache", wqxVar);
                }
                wqxVar.zz();
                wqxVar.jpo();
            }
            if (jdVarOpi.qk() && bArrJpo == null) {
                if (jrVar != null) {
                    jrVar.jpo("disk_cache", wqxVar);
                }
                byte[] bArrJpo = jpo(jdVarOpi, jjVarSq, wqxVar.zz());
                if (bArrJpo != null) {
                    jpo(wqxVar.opi(), jjVarSq, wqxVar.zz(), bArrJpo);
                }
                if (jrVar != null) {
                    jrVar.jd("disk_cache", wqxVar);
                }
                wqxVar.zz();
                wqxVar.jpo();
                bArrJpo = bArrJpo;
            }
        }
        if (jjVarSq != null && bArrJpo == null) {
            if (jrVar != null) {
                jrVar.jpo("net_request", wqxVar);
            }
            bArrJpo = jpo(jjVarSq, wqxVar, jpoVar);
            wqxVar.zz();
            wqxVar.jpo();
            if (jrVar != null) {
                jrVar.jd("net_request", wqxVar);
            }
        }
        if (bArrJpo != null) {
            wqxVar.jpo(bArrJpo);
            return true;
        }
        wqxVar.zz();
        wqxVar.jpo();
        return false;
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public String jpo() {
        return "data_intercept";
    }

    private byte[] jpo(com.bytedance.sdk.component.my.cm.wqx.jj jjVar, com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        com.bytedance.sdk.component.my.cm cmVarCm = jjVar.cm();
        wqxVar.jpo(false);
        try {
            com.bytedance.sdk.component.my.jj jjVarJpo = cmVarCm.jpo(new com.bytedance.sdk.component.my.jd.jd(wqxVar.jpo(), false, false, wqxVar.jr()));
            if (jjVarJpo == null) {
                jpoVar.jpo(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iJd = jjVarJpo.jd();
            if (iJd == 200) {
                byte[] bArr = (byte[]) jjVarJpo.wqx();
                if (bArr == null) {
                    jpoVar.jpo(iJd, jjVarJpo.cm(), new Exception("net data is empty"));
                    return null;
                }
                jpo(wqxVar.opi(), jjVar, wqxVar.zz(), bArr);
                jd(wqxVar.opi(), jjVar, wqxVar.zz(), bArr);
                return bArr;
            }
            Object objWqx = jjVarJpo.wqx();
            jpoVar.jpo(iJd, jjVarJpo.cm(), objWqx instanceof Throwable ? (Throwable) objWqx : null);
            return null;
        } catch (Throwable th2) {
            jpoVar.jpo(1004, "net request failed!", th2);
            return null;
        }
    }

    private byte[] jpo(com.bytedance.sdk.component.my.jd jdVar, com.bytedance.sdk.component.my.cm.wqx.jj jjVar, String str) {
        jjVar.wqx(jdVar);
        Collection<com.bytedance.sdk.component.my.wqx> collectionWqx = jjVar.wqx();
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

    private void jpo(com.bytedance.sdk.component.my.jd jdVar, com.bytedance.sdk.component.my.cm.wqx.jj jjVar, String str, byte[] bArr) {
        if (jdVar == null || !jdVar.jj()) {
            return;
        }
        jjVar.jd(jdVar).jpo(str, bArr);
    }
}
