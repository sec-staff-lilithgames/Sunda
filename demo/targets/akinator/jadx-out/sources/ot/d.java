package ot;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f79836b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79837c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f79838e;

    public d(boolean z10, Handler handler) {
        this.f79836b = handler;
        this.f79837c = z10;
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        this.f79838e = true;
        this.f79836b.removeCallbacksAndMessages(this);
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f79838e;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f79838e) {
            return pt.d.disposed();
        }
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        Handler handler = this.f79836b;
        e eVar = new e(handler, runnableOnSchedule);
        Message messageObtain = Message.obtain(handler, eVar);
        messageObtain.obj = this;
        if (this.f79837c) {
            messageObtain.setAsynchronous(true);
        }
        this.f79836b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        if (!this.f79838e) {
            return eVar;
        }
        this.f79836b.removeCallbacks(eVar);
        return pt.d.disposed();
    }
}
