package x6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import w6.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final z f91750a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f91751b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f91752c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final c f91753d = new c(this);

    public d(Executor executor) {
        z zVar = new z(executor);
        this.f91750a = zVar;
        this.f91751b = ExecutorsKt.from(zVar);
    }

    @Override // x6.b
    public /* bridge */ /* synthetic */ void executeOnTaskThread(Runnable runnable) {
        super.executeOnTaskThread(runnable);
    }

    @Override // x6.b
    public Executor getMainThreadExecutor() {
        return this.f91753d;
    }

    @Override // x6.b
    public CoroutineDispatcher getTaskCoroutineDispatcher() {
        return this.f91751b;
    }

    @Override // x6.b
    public z getSerialTaskExecutor() {
        return this.f91750a;
    }
}
