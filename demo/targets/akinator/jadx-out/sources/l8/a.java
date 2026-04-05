package l8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72669b;

    public a(f fVar) {
        this.f72669b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        synchronized (this.f72669b) {
            try {
                f fVar = this.f72669b;
                if (fVar.f72695k == null) {
                    return null;
                }
                fVar.p();
                if (this.f72669b.h()) {
                    this.f72669b.n();
                    this.f72669b.f72697m = 0;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
