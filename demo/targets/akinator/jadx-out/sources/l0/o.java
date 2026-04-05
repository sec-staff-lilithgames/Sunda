package l0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.b f72133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f72134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f72135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g2.b bVar, List list, int i10) {
        super(2);
        this.f72133e = bVar;
        this.f72134f = list;
        this.f72135g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        p.InlineChildren(this.f72133e, this.f72134f, wVar, this.f72135g | 1);
    }
}
