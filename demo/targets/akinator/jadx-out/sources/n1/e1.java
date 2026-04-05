package n1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f75348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f75349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f75351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(v0 v0Var, Map map, int i10, int i11) {
        super(2);
        this.f75348e = v0Var;
        this.f75349f = map;
        this.f75350g = i10;
        this.f75351h = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        i1.RenderVectorGroup(this.f75348e, this.f75349f, wVar, this.f75350g | 1, this.f75351h);
    }
}
