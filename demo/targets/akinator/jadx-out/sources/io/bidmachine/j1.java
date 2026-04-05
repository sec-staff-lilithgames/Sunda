package io.bidmachine;

import android.app.Application;
import android.content.Context;
import io.bidmachine.analytics.BidMachineAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class j1 implements pr.o, rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f60569c;

    public /* synthetic */ j1(Context context, int i10) {
        this.f60568b = i10;
        this.f60569c = context;
    }

    @Override // rr.b
    public Object get() {
        return BuildInfo.lambda$new$0(this.f60569c);
    }

    @Override // pr.o
    public void run() {
        switch (this.f60568b) {
            case 0:
                Context context = this.f60569c;
                if (o0.f61965a.compareAndSet(false, true)) {
                    try {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext instanceof Application) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n0());
                            break;
                        }
                    } catch (Throwable th2) {
                        nm.a.w(th2);
                        return;
                    }
                }
                break;
            default:
                try {
                    BidMachineAnalytics.initialize(this.f60569c);
                    break;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
