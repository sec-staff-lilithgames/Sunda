package com.bytedance.sdk.component.my.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends jpo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        com.bytedance.sdk.component.my.wqx.wqx wqxVar2;
        final com.bytedance.sdk.component.my.wqx.jj jjVarOpi = wqxVar.opi();
        com.bytedance.sdk.component.my.cm cmVarCm = jjVarOpi.cm();
        wqxVar.jpo(false);
        try {
            com.bytedance.sdk.component.my.jj jjVarJpo = cmVarCm.jpo(new com.bytedance.sdk.component.my.jd.jd(wqxVar.jpo(), wqxVar.au(), wqxVar.oya(), wqxVar.rq()));
            int iJd = jjVarJpo.jd();
            wqxVar.jpo(jjVarJpo.jpo());
            wqxVar2 = 200;
            try {
                if (jjVarJpo.jd() != 200) {
                    String.valueOf(jjVarJpo);
                    Object objWqx = jjVarJpo.wqx();
                    jpo(iJd, jjVarJpo.cm(), objWqx instanceof Throwable ? (Throwable) objWqx : null, wqxVar);
                    return;
                }
                final byte[] bArr = (byte[]) jjVarJpo.wqx();
                wqxVar.jpo(new jd(bArr, jjVarJpo));
                final String strZz = wqxVar.zz();
                final com.bytedance.sdk.component.my.jd jdVarJr = wqxVar.jr();
                if (jdVarJr.my()) {
                    jjVarOpi.jd(wqxVar.jr()).jpo(strZz, bArr);
                }
                final com.bytedance.sdk.component.my.wqx.wqx wqxVar3 = wqxVar;
                try {
                    jjVarOpi.qk().submit(new Runnable() { // from class: com.bytedance.sdk.component.my.my.ju.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (jdVarJr.qk()) {
                                jjVarOpi.wqx(wqxVar3.jr()).jpo(strZz, bArr);
                            }
                        }
                    });
                } catch (Throwable th2) {
                    th = th2;
                    wqxVar2 = wqxVar3;
                    jpo(1004, "net request failed!", th, wqxVar2);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            wqxVar2 = wqxVar;
        }
    }

    private void jpo(int i10, String str, Throwable th2, com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        wqxVar.jpo(new xyk(i10, str, th2));
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "net_request";
    }
}
