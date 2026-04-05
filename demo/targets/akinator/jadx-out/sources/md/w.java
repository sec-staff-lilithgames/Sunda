package md;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements pd.b {
    public static w create() {
        return v.f74339a;
    }

    public static Executor executor() {
        return (Executor) pd.d.checkNotNullFromProvides(new a0(Executors.newSingleThreadExecutor()));
    }

    @Override // pd.b, ru.a
    public Executor get() {
        return executor();
    }
}
