package oi;

import com.google.android.gms.tasks.TaskCompletionSource;
import ei.f;
import hi.c0;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79403b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f79404c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f79405e;

    public b(c cVar, c0 c0Var, TaskCompletionSource taskCompletionSource) {
        this.f79405e = cVar;
        this.f79403b = c0Var;
        this.f79404c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        TaskCompletionSource taskCompletionSource = this.f79404c;
        c cVar = this.f79405e;
        c0 c0Var = this.f79403b;
        cVar.b(c0Var, taskCompletionSource);
        cVar.f79414i.resetDroppedOnDemandExceptions();
        double dMin = Math.min(3600000.0d, Math.pow(cVar.f79407b, cVar.a()) * (60000.0d / cVar.f79406a));
        f.getLogger().d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c0Var.getSessionId());
        try {
            Thread.sleep((long) dMin);
        } catch (InterruptedException unused) {
        }
    }
}
