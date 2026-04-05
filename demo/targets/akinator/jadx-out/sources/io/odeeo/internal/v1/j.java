package io.odeeo.internal.v1;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends MainCoroutineDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67279a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f67280b;

    /* renamed from: c, reason: collision with root package name */
    public volatile j f67281c;

    /* renamed from: d, reason: collision with root package name */
    public final j f67282d;

    public /* synthetic */ j(boolean z10, Handler handler, int i10, u uVar) {
        this(z10, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(zu.m context, Runnable block) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(block, "block");
        if (this.f67280b.post(block)) {
            return;
        }
        JobKt.cancel(context, new CancellationException("The task was rejected '" + this + "' was closed"));
        Dispatchers.getDefault().mo5197dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(zu.m context) {
        e0.checkNotNullParameter(context, "context");
        return (this.f67279a && e0.areEqual(Looper.myLooper(), this.f67280b.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public j getImmediate() {
        return this.f67282d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(boolean z10, Handler handler) {
        e0.checkNotNullParameter(handler, PtLatqAYjEFT.nweORAzydzIfs);
        this.f67279a = z10;
        this.f67280b = handler;
        Handler handler2 = null;
        Object[] objArr = 0;
        this.f67281c = z10 ? this : null;
        j jVar = this.f67281c;
        if (jVar == null) {
            jVar = new j(true, handler2, 2, objArr == true ? 1 : 0);
            this.f67281c = jVar;
        }
        this.f67282d = jVar;
    }
}
