package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78716i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f78717j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(SelectLanguageActivity selectLanguageActivity, String str, zu.d dVar) {
        super(2, dVar);
        this.f78716i = selectLanguageActivity;
        this.f78717j = str;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new z6(this.f78716i, this.f78717j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return bv.b.boxInt(SelectLanguageActivity.access$handleLanguageSelection(this.f78716i, this.f78717j));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((z6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
