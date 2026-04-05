package o6;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f77866i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f77867j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, zu.d dVar) {
        super(2, dVar);
        this.f77867j = context;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        b0 b0Var = new b0(this.f77867j, dVar);
        b0Var.f77866i = ((Boolean) obj).booleanValue();
        return b0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (zu.d<? super tu.x0>) obj2);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        w6.t.setComponentEnabled(this.f77867j, RescheduleReceiver.class, this.f77866i);
        return tu.x0.f87415a;
    }

    public final Object invoke(boolean z10, zu.d<? super tu.x0> dVar) {
        return ((b0) create(Boolean.valueOf(z10), dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
