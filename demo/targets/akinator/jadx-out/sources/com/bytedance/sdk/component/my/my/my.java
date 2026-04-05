package com.bytedance.sdk.component.my.my;

import android.graphics.Bitmap;
import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jj f18884jd;
    private byte[] jpo;

    public my(byte[] bArr, com.bytedance.sdk.component.my.jj jjVar) {
        this.jpo = bArr;
        this.f18884jd = jjVar;
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        com.bytedance.sdk.component.my.wqx.jj jjVarOpi = wqxVar.opi();
        com.bytedance.sdk.component.my.wqx.jd.jpo jpoVarJpo = jjVarOpi.jpo(wqxVar);
        try {
            wqxVar.rq();
            Bitmap bitmapJpo = jpoVarJpo.jpo(this.jpo);
            if (bitmapJpo == null) {
                jpo(1002, "decode failed bitmap null", null, wqxVar);
                return;
            }
            wqxVar.jpo(new au(bitmapJpo, this.f18884jd, false));
            jjVarOpi.jpo(wqxVar.jr()).jpo(wqxVar.yd(), bitmapJpo);
        } catch (Throwable th2) {
            jpo(1002, e2.o(th2, new StringBuilder("decode failed:")), th2, wqxVar);
        }
    }

    private void jpo(int i10, String str, Throwable th2, com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        if (this.f18884jd == null) {
            wqxVar.jpo(new ju());
        } else {
            wqxVar.jpo(new xyk(i10, str, th2));
        }
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "decode";
    }
}
