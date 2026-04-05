package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private final List<rq> jpo = new ArrayList();

    public void jpo(rq rqVar) {
        this.jpo.add(rqVar);
    }

    public void jpo(Path path) {
        for (int size = this.jpo.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.jd.jj.jj.jpo(path, this.jpo.get(size));
        }
    }
}
