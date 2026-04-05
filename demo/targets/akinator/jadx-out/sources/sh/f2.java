package sh;

import com.ironsource.C3191e4;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f2 extends o0 {

    /* renamed from: j, reason: collision with root package name */
    public n1 f85806j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledFuture f85807k;

    @Override // sh.k
    public final void d() {
        k(this.f85806j);
        ScheduledFuture scheduledFuture = this.f85807k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f85806j = null;
        this.f85807k = null;
    }

    @Override // sh.k
    public final String l() {
        n1 n1Var = this.f85806j;
        ScheduledFuture scheduledFuture = this.f85807k;
        if (n1Var == null) {
            return null;
        }
        String str = "inputFuture=[" + n1Var + C3191e4.i.f36531e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
