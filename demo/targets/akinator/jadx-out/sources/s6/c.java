package s6;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final t6.f f85478a;

    public c(t6.f tracker) {
        e0.checkNotNullParameter(tracker, "tracker");
        this.f85478a = tracker;
    }

    public abstract int a();

    @Override // s6.f
    public abstract /* synthetic */ boolean hasConstraint(b0 b0Var);

    public boolean isConstrained(Object obj) {
        return false;
    }

    @Override // s6.f
    public boolean isCurrentlyConstrained(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.f85478a.readSystemState());
    }

    @Override // s6.f
    public Flow<r6.c> track(n6.f constraints) {
        e0.checkNotNullParameter(constraints, "constraints");
        return FlowKt.callbackFlow(new b(this, null));
    }
}
