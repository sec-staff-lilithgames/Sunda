package j0;

import e2.r0;
import e2.u0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2.m f68804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2.a f68805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f68806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.a f68807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f2.a aVar, boolean z10, e2.m mVar, kv.a aVar2) {
        super(1);
        this.f68804e = mVar;
        this.f68805f = aVar;
        this.f68806g = z10;
        this.f68807h = aVar2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u0) obj);
        return x0.f87415a;
    }

    public final void invoke(u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        e2.m mVar = this.f68804e;
        if (mVar != null) {
            r0.m3830setRolekuIjeqM(semantics, mVar.m3827unboximpl());
        }
        r0.setToggleableState(semantics, this.f68805f);
        r0.onClick$default(semantics, null, new m(this.f68807h), 1, null);
        if (this.f68806g) {
            return;
        }
        r0.disabled(semantics);
    }
}
