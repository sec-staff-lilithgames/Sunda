package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f6392c;

    public k(q2 q2Var, View view, Rect rect) {
        this.f6391b = view;
        this.f6392c = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        q2.b(this.f6392c, this.f6391b);
    }
}
