package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f implements w {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f43956a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f43957a;

        public a(Handler handler) {
            this.f43957a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f43957a.post(runnable);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final t f43959a;

        /* renamed from: b, reason: collision with root package name */
        private final v f43960b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f43961c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f43959a = tVar;
            this.f43960b = vVar;
            this.f43961c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43959a.v()) {
                this.f43959a.c("canceled-at-delivery");
                return;
            }
            if (this.f43960b.a()) {
                this.f43959a.a((t) this.f43960b.f44077a);
            } else {
                this.f43959a.b(this.f43960b.f44079c);
            }
            if (this.f43960b.f44080d) {
                this.f43959a.a("intermediate-response");
            } else {
                this.f43959a.c("done");
            }
            Runnable runnable = this.f43961c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f43956a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f43956a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f43956a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f43956a.execute(new b(tVar, v.a(b0Var), null));
    }
}
