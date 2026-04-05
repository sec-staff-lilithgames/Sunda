package l2;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 implements z1, v5 {

    /* renamed from: b, reason: collision with root package name */
    public final m f72393b;

    public x1(m current) {
        kotlin.jvm.internal.e0.checkNotNullParameter(current, "current");
        this.f72393b = current;
    }

    @Override // l2.z1
    public boolean getCacheable() {
        return this.f72393b.getCacheable$ui_text_release();
    }

    public final m getCurrent$ui_text_release() {
        return this.f72393b;
    }

    @Override // l2.z1, p0.v5
    public Object getValue() {
        return this.f72393b.getValue();
    }
}
