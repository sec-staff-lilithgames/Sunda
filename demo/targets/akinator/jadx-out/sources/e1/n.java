package e1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.w f53482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p0.w wVar) {
        super(2);
        this.f53482e = wVar;
    }

    @Override // kv.p
    public final v invoke(v acc, u element) {
        e0.checkNotNullParameter(acc, "acc");
        e0.checkNotNullParameter(element, "element");
        boolean z10 = element instanceof h;
        v vVarMaterialize = element;
        if (z10) {
            kv.q qVar = (kv.q) h1.beforeCheckcastToFunctionOfArity(((h) element).getFactory(), 3);
            t tVar = t.f53496b;
            p0.w wVar = this.f53482e;
            vVarMaterialize = o.materialize(wVar, (v) qVar.invoke(tVar, wVar, 0));
        }
        return acc.then(vVarMaterialize);
    }
}
