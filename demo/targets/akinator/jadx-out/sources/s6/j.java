package s6;

import android.os.Build;
import kotlin.jvm.internal.e0;
import n6.d0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f85485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t6.f tracker) {
        super(tracker);
        e0.checkNotNullParameter(tracker, "tracker");
        this.f85485b = 7;
    }

    @Override // s6.c
    public final int a() {
        return this.f85485b;
    }

    @Override // s6.c, s6.f
    public boolean hasConstraint(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        d0 requiredNetworkType = workSpec.f89062j.getRequiredNetworkType();
        if (requiredNetworkType != d0.f75707e) {
            return Build.VERSION.SDK_INT >= 30 && requiredNetworkType == d0.f75710h;
        }
        return true;
    }

    @Override // s6.c
    public boolean isConstrained(Object obj) {
        r6.i value = (r6.i) obj;
        e0.checkNotNullParameter(value, "value");
        return !value.isConnected() || value.isMetered();
    }
}
