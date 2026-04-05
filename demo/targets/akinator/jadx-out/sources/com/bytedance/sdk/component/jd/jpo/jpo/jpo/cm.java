package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.ju;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends ju {
    public jj xyk;
    public jpo zz;

    public cm(ju.jpo jpoVar) {
        super(jpoVar);
        jj jjVar = new jj();
        this.xyk = jjVar;
        this.zz = new jpo(jjVar.jd());
    }

    @Override // com.bytedance.sdk.component.jd.jpo.ju
    public com.bytedance.sdk.component.jd.jpo.cm jpo() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.ju
    public com.bytedance.sdk.component.jd.jpo.jd jpo(Cif cif) {
        cif.jpo(this);
        if (cif.jd() == null || cif.jd().jpo() == null || TextUtils.isEmpty(cif.jd().jpo().toString())) {
            return null;
        }
        if (jpo.jpo == null || !jpo.jpo.jd() || !this.zz.my() || "setting".equals(cif.jj())) {
            jd jdVar = new jd(cif, this.xyk);
            this.xyk.wqx().add(jdVar);
            return jdVar;
        }
        jd jdVar2 = new jd(cif, this.zz);
        this.zz.wqx().add(jdVar2);
        return jdVar2;
    }
}
