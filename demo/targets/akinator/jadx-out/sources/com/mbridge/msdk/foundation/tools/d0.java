package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f41099a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f41100b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f41101a;

        public a(Runnable runnable) {
            this.f41101a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41101a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                d0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f41099a == null) {
                this.f41099a = a(runnable);
                b0.a().execute(this.f41099a);
            } else if (this.f41100b == null) {
                this.f41100b = a(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f41100b;
        this.f41099a = runnable;
        this.f41100b = null;
        if (runnable != null) {
            b0.a().execute(this.f41099a);
        }
    }
}
