package fu;

import java.util.concurrent.ThreadFactory;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends mt.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final x f56103f = new x("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f56104e;

    public t() {
        this(f56103f);
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new u(this.f56104e);
    }

    public t(ThreadFactory threadFactory) {
        this.f56104e = threadFactory;
    }
}
