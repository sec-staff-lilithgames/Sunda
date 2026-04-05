package rq;

import br.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import rq.a;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends f0 implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.b f84963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.b bVar) {
        super(2);
        this.f84963e = bVar;
    }

    public final void a(a.C0777a algorithmTask, v vVar) {
        e0.checkNotNullParameter(algorithmTask, "algorithmTask");
        a.b.a(this.f84963e, algorithmTask, vVar);
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((a.C0777a) obj, (v) obj2);
        return x0.f87415a;
    }
}
