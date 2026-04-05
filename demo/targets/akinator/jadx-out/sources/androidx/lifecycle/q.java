package androidx.lifecycle;

import j$.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final <T> Object addDisposableSource(r1 r1Var, l1 l1Var, zu.d<? super x> dVar) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new o(r1Var, l1Var, null), dVar);
    }

    public static final <T> l1 liveData(Duration timeout, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return liveData$default(timeout, (zu.m) null, block, 2, (Object) null);
    }

    public static /* synthetic */ l1 liveData$default(zu.m mVar, long j10, kv.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return liveData(mVar, j10, pVar);
    }

    public static final <T> l1 liveData(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return liveData$default((zu.m) null, 0L, block, 3, (Object) null);
    }

    public static final <T> l1 liveData(zu.m context, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ l1 liveData$default(Duration duration, zu.m mVar, kv.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mVar = zu.n.f98854b;
        }
        return liveData(duration, mVar, pVar);
    }

    public static final <T> l1 liveData(zu.m context, long j10, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return new m(context, j10, block);
    }

    public static final <T> l1 liveData(Duration timeout, zu.m context, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return new m(context, b.f6514a.toMillis(timeout), block);
    }
}
