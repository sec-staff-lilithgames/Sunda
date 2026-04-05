package p0;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f80200a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f80201b = new Object();

    public static final <R> Object withRunningRecomposer(kv.q qVar, zu.d<? super R> dVar) {
        return CoroutineScopeKt.coroutineScope(new d4(qVar, null), dVar);
    }
}
