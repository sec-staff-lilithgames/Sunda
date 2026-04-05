package oa;

import com.airbnb.lottie.LottieAnimationView;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f78741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f78742c;

    public f(LottieAnimationView lottieAnimationView, g gVar) {
        this.f78741b = lottieAnimationView;
        this.f78742c = gVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        g gVar = this.f78742c;
        LottieAnimationView lottieAnimationView = this.f78741b;
        lottieAnimationView.removeAnimatorListener(gVar);
        lottieAnimationView.cancelAnimation();
    }
}
