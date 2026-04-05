package s6;

import kotlin.jvm.internal.e0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f85480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t6.c tracker) {
        super(tracker);
        e0.checkNotNullParameter(tracker, "tracker");
        this.f85480b = 5;
    }

    @Override // s6.c
    public final int a() {
        return this.f85480b;
    }

    @Override // s6.c, s6.f
    public boolean hasConstraint(b0 workSpec) {
        e0.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f89062j.requiresBatteryNotLow();
    }

    @Override // s6.c
    public boolean isConstrained(Object obj) {
        return !((Boolean) obj).booleanValue();
    }
}
