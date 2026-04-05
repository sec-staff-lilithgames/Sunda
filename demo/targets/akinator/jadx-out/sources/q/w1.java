package q;

import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f82289b;

    public w1(y1 y1Var) {
        this.f82289b = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.f82289b.f82308f.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
