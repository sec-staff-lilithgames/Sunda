package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.sdk.component.jd.jpo.cm {
    public static volatile yd jpo;

    /* renamed from: cm, reason: collision with root package name */
    private ExecutorService f18579cm;

    /* renamed from: jd, reason: collision with root package name */
    private List<com.bytedance.sdk.component.jd.jpo.jd> f18580jd = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.jd.jpo.jd> wqx = new CopyOnWriteArrayList();

    public jpo(ExecutorService executorService) {
        this.f18579cm = executorService;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public List<com.bytedance.sdk.component.jd.jpo.jd> cm() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public ExecutorService jd() {
        ExecutorService executorServiceJpo = jpo != null ? jpo.jpo() : null;
        return executorServiceJpo != null ? executorServiceJpo : this.f18579cm;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public int jpo() {
        return 0;
    }

    public boolean my() {
        return (jpo == null || jpo.jpo() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public List<com.bytedance.sdk.component.jd.jpo.jd> wqx() {
        return this.f18580jd;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public void jpo(int i10) {
    }

    public static void jpo(yd ydVar) {
        jpo = ydVar;
    }
}
