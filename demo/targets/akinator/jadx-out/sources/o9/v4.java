package o9;

import com.airbnb.lottie.LottieAnimationView;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import java.util.concurrent.Callable;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78627c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78628e;

    public /* synthetic */ v4(Object obj, int i10, int i11) {
        this.f78626b = i11;
        this.f78628e = obj;
        this.f78627c = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f78626b;
        Object obj = this.f78628e;
        switch (i10) {
            case 0:
                e.g gVar = (e.g) obj;
                int i11 = PostProposeActivity.Z;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosPersosFound(gVar, this.f78627c, ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject())));
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                boolean z10 = lottieAnimationView.f12488l;
                int i12 = this.f78627c;
                return z10 ? r7.o.fromRawResSync(lottieAnimationView.getContext(), i12) : r7.o.fromRawResSync(lottieAnimationView.getContext(), i12, null);
        }
    }
}
