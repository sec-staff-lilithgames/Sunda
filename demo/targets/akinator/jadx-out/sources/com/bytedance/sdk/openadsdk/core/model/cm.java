package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private com.bytedance.sdk.openadsdk.core.p000if.cm jpo = new com.bytedance.sdk.openadsdk.core.p000if.cm();

    /* renamed from: jd, reason: collision with root package name */
    private Set<com.bytedance.sdk.openadsdk.core.p000if.yd> f20574jd = new HashSet();

    public Set<com.bytedance.sdk.openadsdk.core.p000if.yd> jd() {
        return this.f20574jd;
    }

    public com.bytedance.sdk.openadsdk.core.p000if.cm jpo() {
        return this.jpo;
    }

    public void jd(Set<com.bytedance.sdk.openadsdk.core.p000if.yd> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.f20574jd.addAll(set);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.p000if.cm cmVar) {
        if (cmVar == null) {
            cmVar = new com.bytedance.sdk.openadsdk.core.p000if.cm();
        }
        this.jpo = cmVar;
    }

    public void jpo(Set<com.bytedance.sdk.openadsdk.core.p000if.yd> set) {
        this.f20574jd = set;
    }

    public void jpo(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jpo(dtVar);
        }
    }
}
