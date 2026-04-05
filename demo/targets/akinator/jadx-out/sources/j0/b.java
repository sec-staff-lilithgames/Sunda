package j0;

import e2.r0;
import e2.u0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f68745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10) {
        super(1);
        this.f68745e = z10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u0) obj);
        return x0.f87415a;
    }

    public final void invoke(u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setSelected(semantics, this.f68745e);
    }
}
