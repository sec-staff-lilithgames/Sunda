package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Kb extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ob f31955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kb(Ob ob2) {
        super(1);
        this.f31955a = ob2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        Hb result = (Hb) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        if (result instanceof Fb) {
            this.f31955a.a(new C3109zb(String.valueOf(((Fb) result).f31793a)), (C3092yb) null);
        } else {
            Ob ob2 = this.f31955a;
            ob2.a(new Jb(ob2));
        }
        return tu.x0.f87415a;
    }
}
