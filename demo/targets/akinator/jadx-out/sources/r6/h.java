package r6;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements s6.f {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f83820a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83821b;

    public h(ConnectivityManager connManager, long j10) {
        e0.checkNotNullParameter(connManager, "connManager");
        this.f83820a = connManager;
        this.f83821b = j10;
    }

    @Override // s6.f
    public boolean hasConstraint(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f89062j.getRequiredNetworkRequest() != null;
    }

    @Override // s6.f
    public boolean isCurrentlyConstrained(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // s6.f
    public Flow<c> track(n6.f constraints) {
        e0.checkNotNullParameter(constraints, "constraints");
        return FlowKt.callbackFlow(new g(constraints, this, null));
    }

    public /* synthetic */ h(ConnectivityManager connectivityManager, long j10, int i10, u uVar) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
