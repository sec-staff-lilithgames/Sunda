package xr;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f92938b;

    public r(ab abVar) {
        this.f92938b = abVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92938b.close();
    }
}
