package zu;

import kotlin.jvm.internal.e0;
import kv.p;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {
    public static final <T> d<x0> createCoroutine(kv.l lVar, d<? super T> completion) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        return new o(av.b.intercepted(av.b.createCoroutineUnintercepted(lVar, completion)), av.e.getCOROUTINE_SUSPENDED());
    }

    public static final <T> void startCoroutine(kv.l lVar, d<? super T> completion) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        av.b.intercepted(av.b.createCoroutineUnintercepted(lVar, completion)).resumeWith(z.m7131constructorimpl(x0.f87415a));
    }

    public static final <R, T> d<x0> createCoroutine(p pVar, R r10, d<? super T> completion) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        return new o(av.b.intercepted(av.b.createCoroutineUnintercepted(pVar, r10, completion)), av.e.getCOROUTINE_SUSPENDED());
    }

    public static final <R, T> void startCoroutine(p pVar, R r10, d<? super T> completion) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        av.b.intercepted(av.b.createCoroutineUnintercepted(pVar, r10, completion)).resumeWith(z.m7131constructorimpl(x0.f87415a));
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
