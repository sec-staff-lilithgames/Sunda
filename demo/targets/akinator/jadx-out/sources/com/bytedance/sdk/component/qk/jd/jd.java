package com.bytedance.sdk.component.qk.jd;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.jj;
import com.bytedance.sdk.component.jd.jpo.jpo;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.prr;
import com.bytedance.sdk.component.jd.jpo.qk;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx {

    /* renamed from: if, reason: not valid java name */
    private Map<String, String> f79if;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f18983ju;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.jd.jpo.jpo f18984yd;
    public static final com.bytedance.sdk.component.jd.jpo.jpo jpo = new jpo.C0081jpo().jpo().jd();

    /* renamed from: jd, reason: collision with root package name */
    public static final com.bytedance.sdk.component.jd.jpo.jpo f18982jd = new jpo.C0081jpo().jd();

    public jd(ju juVar) {
        super(juVar);
        this.f18984yd = jpo;
        this.f18983ju = false;
        this.f79if = new HashMap();
    }

    public void jpo(boolean z10) {
        this.f18983ju = z10;
    }

    public void jpo(final com.bytedance.sdk.component.qk.jpo.jpo jpoVar) {
        try {
            Cif.jpo jpoVar2 = new Cif.jpo();
            if (this.f18983ju) {
                jpoVar2.jd(this.xyk);
            } else {
                qk.jpo jpoVar3 = new qk.jpo();
                Uri uri = Uri.parse(this.xyk);
                jpoVar3.jpo(uri.getScheme());
                jpoVar3.jd(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    jpoVar3.wqx(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f79if.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f79if.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        jpoVar3.jpo(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                jpoVar2.jpo(jpoVar3.jd());
            }
            jpo(jpoVar2);
            jpoVar2.jpo(this.f18984yd);
            jpoVar2.jpo((Object) wqx());
            if (!TextUtils.isEmpty(this.my)) {
                jpoVar2.jpo(this.my);
            }
            int i10 = this.f18990jj;
            if (i10 > 0) {
                jpoVar2.jpo(i10);
            }
            this.wqx.jpo(jpoVar2.jpo().jd()).jpo(new com.bytedance.sdk.component.jd.jpo.wqx() { // from class: com.bytedance.sdk.component.qk.jd.jd.1
                @Override // com.bytedance.sdk.component.jd.jpo.wqx
                public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, IOException iOException) {
                    com.bytedance.sdk.component.qk.jpo.jpo jpoVar4 = jpoVar;
                    if (jpoVar4 != null) {
                        jpoVar4.jpo(jd.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.jd.jpo.wqx
                public void jpo(com.bytedance.sdk.component.jd.jpo.jd jdVar, oya oyaVar) throws IOException {
                    String strJd;
                    if (jpoVar != null) {
                        HashMap map = new HashMap();
                        if (oyaVar != null) {
                            jj jjVarQk = oyaVar.qk();
                            if (jjVarQk != null) {
                                for (int i11 = 0; i11 < jjVarQk.jpo(); i11++) {
                                    map.put(jjVarQk.jpo(i11), jjVarQk.jd(i11));
                                }
                            }
                            prr prrVarJj = oyaVar.jj();
                            if (prrVarJj == null) {
                                strJd = "";
                            } else {
                                strJd = prrVarJj.jd();
                            }
                            jpoVar.jpo(jd.this, new com.bytedance.sdk.component.qk.jd(oyaVar.cm(), oyaVar.wqx(), oyaVar.my(), map, strJd, oyaVar.jd(), oyaVar.jpo()));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (jpoVar != null) {
                jpoVar.jpo(this, new IOException(th2.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.qk.jd jpo() {
        try {
            Cif.jpo jpoVar = new Cif.jpo();
            if (this.f18983ju) {
                jpoVar.jd(this.xyk);
            } else {
                qk.jpo jpoVar2 = new qk.jpo();
                Uri uri = Uri.parse(this.xyk);
                jpoVar2.jpo(uri.getScheme());
                jpoVar2.jd(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    jpoVar2.wqx(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f79if.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f79if.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        jpoVar2.jpo(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                jpoVar.jpo(jpoVar2.jd());
            }
            jpo(jpoVar);
            jpoVar.jpo(this.f18984yd);
            jpoVar.jpo((Object) wqx());
            oya oyaVarJd = this.wqx.jpo(jpoVar.jpo().jd()).jd();
            if (oyaVarJd == null) {
                return null;
            }
            HashMap map = new HashMap();
            jj jjVarQk = oyaVarJd.qk();
            if (jjVarQk != null) {
                for (int i10 = 0; i10 < jjVarQk.jpo(); i10++) {
                    map.put(jjVarQk.jpo(i10), jjVarQk.jd(i10));
                }
            }
            prr prrVarJj = oyaVarJd.jj();
            return new com.bytedance.sdk.component.qk.jd(oyaVarJd.cm(), oyaVarJd.wqx(), oyaVarJd.my(), map, prrVarJj != null ? prrVarJj.jd() : "", oyaVarJd.jd(), oyaVarJd.jpo());
        } catch (Throwable unused) {
            return null;
        }
    }
}
