package com.bytedance.sdk.component.qk.jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.au;
import com.bytedance.sdk.component.jd.jpo.jj;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.prr;
import com.bytedance.sdk.component.jd.jpo.zz;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends wqx {
    au jpo;

    public cm(ju juVar) {
        super(juVar);
        this.jpo = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|(4:53|8|51|9)|(4:55|10|45|11)|12|49|13|33) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] my(java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4c
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L4c
        La:
            r1 = 0
            byte[] r1 = new byte[r1]
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L42
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L43
            java.lang.String r0 = "utf-8"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.write(r5)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.close()     // Catch: java.io.IOException -> L23
        L23:
            byte[] r1 = r2.toByteArray()
            r2.close()     // Catch: java.io.IOException -> L4b
            goto L4b
        L2b:
            r5 = move-exception
            r0 = r3
            goto L34
        L2e:
            r0 = r3
            goto L43
        L30:
            r5 = move-exception
            goto L34
        L32:
            r5 = move-exception
            r2 = r0
        L34:
            if (r0 == 0) goto L39
            r0.close()     // Catch: java.io.IOException -> L39
        L39:
            if (r2 == 0) goto L41
            r2.toByteArray()
            r2.close()     // Catch: java.io.IOException -> L41
        L41:
            throw r5
        L42:
            r2 = r0
        L43:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L48
        L48:
            if (r2 == 0) goto L4b
            goto L23
        L4b:
            return r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qk.jd.cm.my(java.lang.String):byte[]");
    }

    public void cm(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.jpo = au.jpo(zz.jpo("application/json; charset=utf-8"), str);
    }

    public void jpo(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = "{}";
        }
        this.jpo = au.jpo(zz.jpo("application/json; charset=utf-8"), string);
    }

    public void jpo(String str, byte[] bArr) {
        this.jpo = au.jpo(zz.jpo(str), bArr);
    }

    public void jpo(final com.bytedance.sdk.component.qk.jpo.jpo jpoVar) {
        try {
            Cif.jpo jpoVar2 = new Cif.jpo();
            if (TextUtils.isEmpty(this.xyk)) {
                jpoVar.jpo(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.my)) {
                jpoVar2.jpo(this.my);
            }
            int i10 = this.f18990jj;
            if (i10 > 0) {
                jpoVar2.jpo(i10);
            }
            jpoVar2.jd(this.xyk);
            if (this.jpo == null) {
                if (jpoVar != null) {
                    jpoVar.jpo(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                jpo(jpoVar2);
                jpoVar2.jpo((Object) wqx());
                this.wqx.jpo(jpoVar2.jpo(this.jpo).jd()).jpo(new com.bytedance.sdk.component.jd.jpo.wqx() { // from class: com.bytedance.sdk.component.qk.jd.cm.1
                    @Override // com.bytedance.sdk.component.jd.jpo.wqx
                    public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, IOException iOException) {
                        com.bytedance.sdk.component.qk.jpo.jpo jpoVar3 = jpoVar;
                        if (jpoVar3 != null) {
                            jpoVar3.jpo(cm.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.jd.jpo.jj] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.qk.jpo.jpo] */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.qk.jd] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.qk.jd] */
                    @Override // com.bytedance.sdk.component.jd.jpo.wqx
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void jpo(com.bytedance.sdk.component.jd.jpo.jd r13, com.bytedance.sdk.component.jd.jpo.oya r14) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 307
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qk.jd.cm.AnonymousClass1.jpo(com.bytedance.sdk.component.jd.jpo.jd, com.bytedance.sdk.component.jd.jpo.oya):void");
                    }
                });
            }
        } catch (Throwable th2) {
            jpoVar.jpo(this, new IOException(th2.getMessage()));
        }
    }

    public com.bytedance.sdk.component.qk.jd jpo() {
        com.bytedance.sdk.component.qk.jd jdVar;
        try {
            Cif.jpo jpoVar = new Cif.jpo();
            if (TextUtils.isEmpty(this.xyk)) {
                return new com.bytedance.sdk.component.qk.jd(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            jpoVar.jd(this.xyk);
            if (this.jpo == null) {
                return new com.bytedance.sdk.component.qk.jd(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            jpo(jpoVar);
            jpoVar.jpo((Object) wqx());
            oya oyaVarJd = this.wqx.jpo(jpoVar.jpo(this.jpo).jd()).jd();
            if (oyaVarJd == null) {
                return null;
            }
            HashMap map = new HashMap();
            jj jjVarQk = oyaVarJd.qk();
            if (jjVarQk != null) {
                for (int i10 = 0; i10 < jjVarQk.jpo(); i10++) {
                    String strJpo = jjVarQk.jpo(i10);
                    String strJd = jjVarQk.jd(i10);
                    map.put(strJpo, strJd);
                    if (strJpo != null && strJpo.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strJd == null ? "" : strJd.toLowerCase());
                    }
                }
            }
            prr prrVarJj = oyaVarJd.jj();
            if (com.bytedance.sdk.component.qk.wqx.jpo.jpo(map)) {
                byte[] bArrCm = prrVarJj.cm();
                jdVar = new com.bytedance.sdk.component.qk.jd(oyaVarJd.cm(), oyaVarJd.wqx(), oyaVarJd.my(), map, null, oyaVarJd.jd(), oyaVarJd.jpo());
                jdVar.jpo(bArrCm);
            } else if (this.zz) {
                byte[] bArrCm2 = prrVarJj.cm();
                jdVar = new com.bytedance.sdk.component.qk.jd(oyaVarJd.cm(), oyaVarJd.wqx(), oyaVarJd.my(), map, new String(bArrCm2, jpo(jpo(prrVarJj))), oyaVarJd.jd(), oyaVarJd.jpo());
                jdVar.jpo(bArrCm2);
            } else if (prrVarJj != null) {
                jdVar = new com.bytedance.sdk.component.qk.jd(oyaVarJd.cm(), oyaVarJd.wqx(), oyaVarJd.my(), map, prrVarJj.jd(), oyaVarJd.jd(), oyaVarJd.jpo());
            } else {
                throw new IOException(oyaVarJd.my());
            }
            jpo(jdVar, oyaVarJd);
            return jdVar;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.qk.jd(false, IronSourceConstants.errorCode_biddingDataException, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void jpo(String str, boolean z10) {
        if (z10) {
            jpo("application/json; charset=utf-8", my(str));
            jd("Content-Encoding", "gzip");
        } else {
            cm(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset jpo(zz zzVar) {
        try {
            return zzVar != null ? zzVar.jpo(com.bytedance.sdk.component.jd.jpo.jd.zz.jpo) : com.bytedance.sdk.component.jd.jpo.jd.zz.jpo;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.jd.jpo.jd.zz.jpo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz jpo(prr prrVar) {
        try {
            return prrVar.my();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.qk.jd jdVar, oya oyaVar) {
        if (jdVar == null || oyaVar == null) {
            return;
        }
        jdVar.jpo(oyaVar.xyk());
    }
}
