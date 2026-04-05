package com.bytedance.sdk.component.adexpress.jd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.jd.yd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements yd {

    /* renamed from: jd, reason: collision with root package name */
    private jpo f18402jd;
    private Context jpo;
    private au wqx;

    public jj(Context context, au auVar, jpo jpoVar) {
        this.jpo = context;
        this.f18402jd = jpoVar;
        this.wqx = auVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public void jpo() {
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public boolean jpo(final yd.jpo jpoVar) {
        this.wqx.my().jj();
        this.f18402jd.jpo(new qk() { // from class: com.bytedance.sdk.component.adexpress.jd.jj.1
            @Override // com.bytedance.sdk.component.adexpress.jd.qk
            public void jpo(View view, oya oyaVar) {
                if (jpoVar.wqx()) {
                    return;
                }
                prr prrVarJd = jpoVar.jd();
                if (prrVarJd != null) {
                    prrVarJd.jpo(jj.this.f18402jd, oyaVar);
                }
                jpoVar.jpo(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.jd.qk
            public void jpo(int i10, String str) {
                prr prrVarJd = jpoVar.jd();
                if (prrVarJd != null) {
                    prrVarJd.a_(i10);
                }
            }
        });
        return true;
    }

    public void jpo(wqx wqxVar) {
        this.f18402jd.jpo(wqxVar);
    }
}
