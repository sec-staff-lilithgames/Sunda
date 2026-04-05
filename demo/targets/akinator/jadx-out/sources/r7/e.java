package r7;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements e0 {
    @Override // r7.e0
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        e eVar = LottieAnimationView.f12478p;
        if (!e8.n.isNetworkException(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        e8.e.warning("Unable to load composition.", th2);
    }
}
