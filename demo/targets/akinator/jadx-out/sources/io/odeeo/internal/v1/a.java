package io.odeeo.internal.v1;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f67269a;

    public a() {
        this(false, 1, null);
    }

    public final boolean getValue(Object obj, KProperty<?> property) {
        e0.checkNotNullParameter(property, "property");
        return this.f67269a.get();
    }

    public final void setValue(Object obj, KProperty<?> property, boolean z10) {
        e0.checkNotNullParameter(property, "property");
        this.f67269a.set(z10);
    }

    public a(boolean z10) {
        this.f67269a = new AtomicBoolean(z10);
    }

    public /* synthetic */ a(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
