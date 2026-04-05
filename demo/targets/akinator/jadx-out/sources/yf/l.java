package yf;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i4.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final View f94395b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94396c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f94397e;

    public l(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f94397e = swipeDismissBehavior;
        this.f94395b = view;
        this.f94396c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        SwipeDismissBehavior swipeDismissBehavior = this.f94397e;
        m mVar = swipeDismissBehavior.f28939b;
        if (mVar != null && mVar.continueSettling(true)) {
            this.f94395b.postOnAnimation(this);
        } else if (this.f94396c) {
            swipeDismissBehavior.getClass();
        }
    }
}
