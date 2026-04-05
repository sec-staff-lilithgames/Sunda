package s9;

import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Throwable f85546i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f85547j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Throwable th2, g gVar, zu.d dVar) {
        super(2, dVar);
        this.f85546i = th2;
        this.f85547j = gVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new n(this.f85546i, this.f85547j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        Throwable th2 = this.f85546i;
        boolean z10 = th2 instanceof NullPointerException;
        g gVar = this.f85547j;
        if (z10) {
            Toast.makeText(gVar.getActivity(), th2.getMessage(), 0).show();
        } else {
            FragmentActivity fragmentActivityRequireActivity = gVar.requireActivity();
            e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            da.f fVar = new da.f(fragmentActivityRequireActivity);
            fVar.setTypeOk(th2.getMessage());
            fVar.setOkListener(new j(gVar, 1));
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
