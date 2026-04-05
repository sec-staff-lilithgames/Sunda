package v2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f88926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f88927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88928g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, kv.p pVar, int i10) {
        super(2);
        this.f88926e = str;
        this.f88927f = pVar;
        this.f88928g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        t.PopupTestTag(this.f88926e, this.f88927f, wVar, this.f88928g | 1);
    }
}
