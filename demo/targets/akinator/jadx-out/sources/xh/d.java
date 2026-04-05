package xh;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f91995b;

    public d(FirebaseAnalytics firebaseAnalytics) {
        this.f91995b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.f91995b.f29661a.zzG();
    }
}
