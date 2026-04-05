package x3;

import android.animation.ValueAnimator;
import android.view.View;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f91690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f91691c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2.a f91692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f91693f;

    public v2(View view, s2 s2Var, s2.a aVar, ValueAnimator valueAnimator) {
        this.f91690b = view;
        this.f91691c = s2Var;
        this.f91692e = aVar;
        this.f91693f = valueAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        x2.d(this.f91690b, this.f91691c, this.f91692e);
        this.f91693f.start();
    }
}
