package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3411q9 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f38219a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.q9$a */
    public static final class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f38220b;

        public a(Runnable runnable) {
            this.f38220b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f38220b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3411q9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.ie] */
    private final void c(Runnable runnable) {
        a aVar = runnable instanceof AbstractRunnableC3273ie ? (AbstractRunnableC3273ie) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f38219a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final Handler a() {
        return this.f38219a;
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C3411q9(Handler handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        this.f38219a = handler;
    }

    public static /* synthetic */ void a(C3411q9 c3411q9, AbstractRunnableC3273ie abstractRunnableC3273ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3411q9.a(abstractRunnableC3273ie, j10);
    }

    public /* synthetic */ C3411q9(Handler handler, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(AbstractRunnableC3273ie task, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        this.f38219a.postDelayed(task, j10);
    }

    public final void a(AbstractRunnableC3273ie task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        this.f38219a.removeCallbacks(task);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
