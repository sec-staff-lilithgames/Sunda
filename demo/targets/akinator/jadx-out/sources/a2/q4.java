package a2;

import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final e2.c0 f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3782b;

    public q4(e2.c0 semanticsNode, Rect adjustedBounds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semanticsNode, "semanticsNode");
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.f3781a = semanticsNode;
        this.f3782b = adjustedBounds;
    }

    public final Rect getAdjustedBounds() {
        return this.f3782b;
    }

    public final e2.c0 getSemanticsNode() {
        return this.f3781a;
    }
}
