package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends b.n {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5225b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f5226c;

    public g0(o0 o0Var) {
        this.f5226c = o0Var;
    }

    @Override // b.n, b.o
    public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        this.f5225b.post(new f0(this.f5226c, i10, bundle, 0));
    }

    @Override // b.n, b.o
    public void onSessionEnded(boolean z10, Bundle bundle) {
        this.f5225b.post(new e0(this.f5226c, z10, bundle, 0));
    }

    @Override // b.n, b.o
    public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        this.f5225b.post(new e0(this.f5226c, z10, bundle, 1));
    }
}
