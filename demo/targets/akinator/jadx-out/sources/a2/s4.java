package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s4 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(String str) {
        super(1);
        this.f3797e = str;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        e2.r0.setTestTag(semantics, this.f3797e);
    }
}
