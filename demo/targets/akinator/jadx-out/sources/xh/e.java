package xh;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f91996b;

    public e(FirebaseAnalytics firebaseAnalytics) {
        this.f91996b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.f91996b.f29661a.zzH();
    }
}
