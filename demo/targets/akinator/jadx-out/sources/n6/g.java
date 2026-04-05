package n6;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends CoroutineDispatcher {

    /* renamed from: e, reason: collision with root package name */
    public static final g f75740e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final CoroutineDispatcher f75741f = Dispatchers.getDefault();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(zu.m context, Runnable block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        f75741f.mo5197dispatch(context, block);
    }

    public final CoroutineDispatcher getDispatcher() {
        return f75741f;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(zu.m context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return f75741f.isDispatchNeeded(context);
    }
}
