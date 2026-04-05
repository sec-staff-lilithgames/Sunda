package o5;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f77584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Job f77585c;

    public h(CancellationSignal cancellationSignal, Job job) {
        this.f77584b = cancellationSignal;
        this.f77585c = job;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        CancellationSignal cancellationSignal = this.f77584b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        Job.DefaultImpls.cancel$default(this.f77585c, (CancellationException) null, 1, (Object) null);
    }
}
