package d0;

import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f51361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(MutableSharedFlow mutableSharedFlow) {
        super(1);
        this.f51361e = mutableSharedFlow;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.i) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.i drawBehind) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBehind, "$this$drawBehind");
        this.f51361e.tryEmit(tu.x0.f87415a);
    }
}
