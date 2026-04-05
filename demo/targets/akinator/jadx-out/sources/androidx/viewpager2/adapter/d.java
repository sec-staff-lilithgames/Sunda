package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f7367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f7368c;

    public d(Handler handler, c cVar) {
        this.f7367b = handler;
        this.f7368c = cVar;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 b1Var, i0 i0Var) {
        if (i0Var == i0.ON_DESTROY) {
            this.f7367b.removeCallbacks(this.f7368c);
            b1Var.getLifecycle().removeObserver(this);
        }
    }
}
