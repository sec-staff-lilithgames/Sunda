package t5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements y5.f {

    /* renamed from: a, reason: collision with root package name */
    public final y5.f f86374a;

    /* renamed from: b, reason: collision with root package name */
    public final a f86375b;

    public t(y5.f delegate, a autoCloser) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(autoCloser, "autoCloser");
        this.f86374a = delegate;
        this.f86375b = autoCloser;
    }

    @Override // y5.f
    public r create(y5.e configuration) {
        e0.checkNotNullParameter(configuration, "configuration");
        return new r(this.f86374a.create(configuration), this.f86375b);
    }
}
