package dq;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public static final n f52503e = new n(0);

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CoroutineDispatcher invoke() {
        return Dispatchers.getMain().getImmediate();
    }
}
