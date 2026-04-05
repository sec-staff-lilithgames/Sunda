package l2;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f72348i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f72349j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h1 f72350k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(w wVar, h1 h1Var, zu.d dVar) {
        super(1, dVar);
        this.f72349j = wVar;
        this.f72350k = h1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new p0(this.f72349j, this.f72350k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72348i;
        w wVar = this.f72349j;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                o0 o0Var = new o0(wVar, this.f72350k, null);
                this.f72348i = 1;
                obj = TimeoutKt.withTimeout(MBInterstitialActivity.WEB_LOAD_TIME, o0Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            if (obj != null) {
                return obj;
            }
            throw new IllegalStateException("Unable to load font " + wVar);
        } catch (Exception e10) {
            throw new IllegalStateException("Unable to load font " + wVar, e10);
        }
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((p0) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
