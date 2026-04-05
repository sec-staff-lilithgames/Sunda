package n1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f75344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f75345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(v0 v0Var, Map map) {
        super(2);
        this.f75344e = v0Var;
        this.f75345f = map;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            i1.RenderVectorGroup(this.f75344e, this.f75345f, wVar, 64, 0);
        }
    }
}
