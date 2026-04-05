package ho;

import io.bidmachine.media3.common.util.k;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f59088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f59089c;

    public a(Executor executor, k kVar) {
        this.f59088b = executor;
        this.f59089c = kVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f59088b.execute(runnable);
    }

    @Override // ho.b
    public void release() {
        this.f59089c.accept(this.f59088b);
    }
}
