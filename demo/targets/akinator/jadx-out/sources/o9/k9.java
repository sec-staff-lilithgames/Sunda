package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f78307k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(SplashscreenActivity splashscreenActivity, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f78306j = splashscreenActivity;
        this.f78307k = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k9(this.f78306j, this.f78307k, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.k9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((k9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
