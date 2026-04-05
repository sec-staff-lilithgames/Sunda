package dq;

import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f52532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar) {
        super(0);
        this.f52532e = qVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CoroutineDispatcher invoke() {
        return (CoroutineDispatcher) this.f52532e.f52515c.invoke();
    }
}
