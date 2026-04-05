package ot;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f79842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79843f;

    public f(boolean z10, Handler handler) {
        this.f79842e = handler;
        this.f79843f = z10;
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new d(this.f79843f, this.f79842e);
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        Handler handler = this.f79842e;
        e eVar = new e(handler, runnableOnSchedule);
        Message messageObtain = Message.obtain(handler, eVar);
        if (this.f79843f) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return eVar;
    }
}
