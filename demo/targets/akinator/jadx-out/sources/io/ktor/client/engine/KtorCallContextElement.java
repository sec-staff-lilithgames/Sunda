package io.ktor.client.engine;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;
import zu.j;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class KtorCallContextElement implements k {
    public static final Companion Companion = new Companion(null);
    private final m callContext;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements l {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public KtorCallContextElement(m callContext) {
        e0.checkNotNullParameter(callContext, "callContext");
        this.callContext = callContext;
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, p pVar) {
        return (R) j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends k> E get(l lVar) {
        return (E) j.get(this, lVar);
    }

    public final m getCallContext() {
        return this.callContext;
    }

    @Override // zu.k
    public l getKey() {
        return Companion;
    }

    @Override // zu.k, zu.m
    public m minusKey(l lVar) {
        return j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public m plus(m mVar) {
        return j.plus(this, mVar);
    }
}
