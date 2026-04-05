package s6;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n6.c0;
import n6.d0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f85484b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        e0.checkNotNullExpressionValue(c0.tagWithPrefix("NetworkNotRoamingCtrlr"), "tagWithPrefix(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t6.f tracker) {
        super(tracker);
        e0.checkNotNullParameter(tracker, "tracker");
        this.f85484b = 7;
    }

    @Override // s6.c
    public final int a() {
        return this.f85484b;
    }

    @Override // s6.c, s6.f
    public boolean hasConstraint(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f89062j.getRequiredNetworkType() == d0.f75708f;
    }

    @Override // s6.c
    public boolean isConstrained(Object obj) {
        r6.i value = (r6.i) obj;
        e0.checkNotNullParameter(value, "value");
        return (value.isConnected() && value.isNotRoaming()) ? false : true;
    }
}
