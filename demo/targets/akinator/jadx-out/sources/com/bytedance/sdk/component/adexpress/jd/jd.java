package com.bytedance.sdk.component.adexpress.jd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.jd.yd;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements yd {

    /* renamed from: cm, reason: collision with root package name */
    private xyk f18398cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo f18399jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18400jj;
    private Context jpo;
    private au my;
    private ThemeStatusBroadcastReceiver wqx;

    public jd(Context context, au auVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.my.xyk xykVar, xyk xykVar2, com.bytedance.sdk.component.adexpress.dynamic.jj.jpo jpoVar, com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo jpoVar2) {
        this.jpo = context;
        this.my = auVar;
        this.wqx = themeStatusBroadcastReceiver;
        this.f18398cm = xykVar2;
        if (jpoVar2 != null) {
            this.f18399jd = jpoVar2;
        } else {
            this.f18399jd = new com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo(context, themeStatusBroadcastReceiver, z10, xykVar, auVar, jpoVar);
        }
        this.f18399jd.jpo(this.f18398cm);
        if (xykVar instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk) {
            this.f18400jj = 3;
        } else {
            this.f18400jj = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cm jd() {
        com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo jpoVar = this.f18399jd;
        if (jpoVar != null) {
            return jpoVar.cm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public boolean jpo(final yd.jpo jpoVar) {
        this.my.my().jpo(this.f18400jj);
        this.f18399jd.jpo(new qk() { // from class: com.bytedance.sdk.component.adexpress.jd.jd.1
            @Override // com.bytedance.sdk.component.adexpress.jd.qk
            public void jpo(View view, oya oyaVar) {
                if (jpoVar.wqx()) {
                    return;
                }
                jd.this.my.my().my(jd.this.f18400jj);
                jd.this.my.my().jj(jd.this.f18400jj);
                jd.this.my.my().yd();
                prr prrVarJd = jpoVar.jd();
                if (prrVarJd == null) {
                    return;
                }
                prrVarJd.jpo(jd.this.f18399jd, oyaVar);
                jpoVar.jpo(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.jd.qk
            public void jpo(int i10, String str) {
                jd.this.my.my().jpo(jd.this.f18400jj, i10, str, jpoVar.jd(jd.this));
                if (jpoVar.jd(jd.this)) {
                    jpoVar.jpo(jd.this);
                    return;
                }
                prr prrVarJd = jpoVar.jd();
                if (prrVarJd == null) {
                    return;
                }
                prrVarJd.a_(i10);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public void jpo() {
        com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo jpoVar = this.f18399jd;
        if (jpoVar != null) {
            jpoVar.jd();
        }
    }
}
