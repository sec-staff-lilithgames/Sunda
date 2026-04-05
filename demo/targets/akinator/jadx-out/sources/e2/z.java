package e2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f53638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str) {
        super(1);
        this.f53638e = str;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u0) obj);
        return x0.f87415a;
    }

    public final void invoke(u0 fakeSemanticsNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
        r0.setContentDescription(fakeSemanticsNode, this.f53638e);
    }
}
