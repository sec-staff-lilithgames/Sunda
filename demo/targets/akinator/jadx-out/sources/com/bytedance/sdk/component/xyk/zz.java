package com.bytedance.sdk.component.xyk;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    public static volatile boolean sCrashHappened;

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicInteger f19057cm;

    /* renamed from: jd, reason: collision with root package name */
    protected final String f19058jd;
    protected final ThreadGroup jpo;
    protected int wqx;

    public zz(String str) {
        this(5, str);
    }

    public Thread jpo(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (sCrashHappened) {
            return null;
        }
        Thread threadJpo = jpo(this.jpo, runnable, this.f19058jd + this.f19057cm.getAndIncrement());
        if (threadJpo.isDaemon()) {
            threadJpo.setDaemon(false);
        }
        int i10 = this.wqx;
        if (i10 > 10 || i10 <= 0) {
            this.wqx = 5;
        }
        threadJpo.setPriority(this.wqx);
        return threadJpo;
    }

    public zz(int i10, String str) {
        this.f19057cm = new AtomicInteger(1);
        this.wqx = i10;
        this.jpo = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.f19058jd = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
