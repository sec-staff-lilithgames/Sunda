package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.xyk;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements xyk.jpo {

    /* renamed from: jd, reason: collision with root package name */
    Cif f18582jd;
    List<com.bytedance.sdk.component.jd.jpo.xyk> jpo;
    int wqx = 0;

    public wqx(List<com.bytedance.sdk.component.jd.jpo.xyk> list, Cif cif) {
        this.jpo = list;
        this.f18582jd = cif;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.xyk.jpo
    public Cif jpo() {
        return this.f18582jd;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.xyk.jpo
    public oya jpo(Cif cif) throws IOException {
        this.f18582jd = cif;
        int i10 = this.wqx + 1;
        this.wqx = i10;
        if (i10 >= this.jpo.size()) {
            return null;
        }
        return this.jpo.get(this.wqx).jpo(this);
    }
}
