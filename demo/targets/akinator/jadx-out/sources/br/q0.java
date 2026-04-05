package br;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f9981a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f9982b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9983c;

    public q0(w0 type, t0 direction, List<Integer> colors) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        this.f9981a = type;
        this.f9982b = direction;
        this.f9983c = colors;
    }

    public final List<Integer> getColors() {
        return this.f9983c;
    }

    public final t0 getDirection() {
        return this.f9982b;
    }

    public final w0 getType() {
        return this.f9981a;
    }
}
