package rq;

import br.v;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f84965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(1);
        this.f84965e = aVar;
    }

    public final void a(List<v> it) {
        e0.checkNotNullParameter(it, "it");
        a.a(this.f84965e, it);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return x0.f87415a;
    }
}
