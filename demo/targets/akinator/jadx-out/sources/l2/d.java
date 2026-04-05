package l2;

import android.content.Context;
import android.graphics.Typeface;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1 f72279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f72280j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p1 p1Var, Context context, zu.d dVar) {
        super(2, dVar);
        this.f72279i = p1Var;
        this.f72280j = context;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f72279i, this.f72280j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return e.access$load(this.f72279i, this.f72280j);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Typeface> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
