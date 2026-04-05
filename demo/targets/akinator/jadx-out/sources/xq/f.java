package xq;

import dq.q;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends h {

    /* renamed from: n, reason: collision with root package name */
    public final q f92205n;

    /* renamed from: o, reason: collision with root package name */
    public final o f92206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String parent, q coroutineDispatchers) {
        super(parent);
        e0.checkNotNullParameter(parent, "parent");
        e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f92205n = coroutineDispatchers;
        this.f92206o = tu.q.lazy(s.f87404c, (kv.a) new e(this));
    }

    public final q n() {
        return this.f92205n;
    }

    public final d o() {
        return (d) this.f92206o.getValue();
    }
}
