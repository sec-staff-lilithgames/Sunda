package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.sdk.component.jd.jpo.cm {
    private ExecutorService jpo;

    /* renamed from: jd, reason: collision with root package name */
    private List<com.bytedance.sdk.component.jd.jpo.jd> f18578jd = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.jd.jpo.jd> wqx = new CopyOnWriteArrayList();

    /* renamed from: cm, reason: collision with root package name */
    private AtomicInteger f18577cm = new AtomicInteger(64);

    public jj() {
        if (this.jpo == null) {
            this.jpo = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.jd.jpo.jpo.jpo.jj.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public List<com.bytedance.sdk.component.jd.jpo.jd> cm() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public ExecutorService jd() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public void jpo(int i10) {
        this.f18577cm.set(i10);
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public List<com.bytedance.sdk.component.jd.jpo.jd> wqx() {
        return this.f18578jd;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.cm
    public int jpo() {
        return this.f18577cm.get();
    }
}
