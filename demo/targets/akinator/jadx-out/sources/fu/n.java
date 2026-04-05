package fu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends mt.m0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n f56055e = new n();

    /* renamed from: f, reason: collision with root package name */
    public static final m f56056f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final pt.c f56057g;

    static {
        pt.c cVarEmpty = pt.d.empty();
        f56057g = cVarEmpty;
        cVarEmpty.dispose();
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return f56056f;
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable) {
        runnable.run();
        return f56057g;
    }

    @Override // mt.m0
    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
}
