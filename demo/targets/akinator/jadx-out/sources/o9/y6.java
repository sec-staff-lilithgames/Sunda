package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78691j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f78692k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f78693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f78694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(SelectLanguageActivity selectLanguageActivity, AtomicReference atomicReference, int i10, int i11, zu.d dVar) {
        super(2, dVar);
        this.f78691j = selectLanguageActivity;
        this.f78692k = atomicReference;
        this.f78693l = i10;
        this.f78694m = i11;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new y6(this.f78691j, this.f78692k, this.f78693l, this.f78694m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78690i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            AtomicReference atomicReference = this.f78692k;
            SelectLanguageActivity selectLanguageActivity = this.f78691j;
            SelectLanguageActivity.access$dismissLoadingDialog(selectLanguageActivity, atomicReference);
            selectLanguageActivity.majSeuilDePopu();
            this.f78690i = 1;
            if (SelectLanguageActivity.access$handleCheckLanguageResult(selectLanguageActivity, this.f78693l, this.f78694m, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((y6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
