package com.bytedance.sdk.openadsdk.core.au.wqx;

import com.bytedance.sdk.component.utils.qk;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.sdk.openadsdk.jd.jd {
    public wqx(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.jd.jd, com.bytedance.sdk.openadsdk.jd.jpo
    public void jpo(List<File> list) {
        int size = list.size();
        if (jpo(0L, size)) {
            return;
        }
        for (File file : list) {
            qk.wqx(file);
            size--;
            if (jpo(file, 0L, size)) {
                return;
            }
        }
    }

    public wqx(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.jpo = z10;
    }
}
