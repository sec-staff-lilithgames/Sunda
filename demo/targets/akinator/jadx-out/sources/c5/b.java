package c5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements AutoCloseable, CoroutineScope {

    /* renamed from: b, reason: collision with root package name */
    public final m f11805b;

    public b(m coroutineContext) {
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f11805b = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.f11805b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(CoroutineScope coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
    }
}
