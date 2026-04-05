package hj;

import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f58970q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WindowManager f58971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ij.c f58972s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view, l lVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ij.c cVar) {
        super(view, null, lVar);
        this.f58970q = layoutParams;
        this.f58971r = windowManager;
        this.f58972s = cVar;
    }

    @Override // hj.f0
    public final float b() {
        return this.f58970q.x;
    }

    @Override // hj.f0
    public final void c(float f10) {
        WindowManager.LayoutParams layoutParams = this.f58970q;
        layoutParams.x = (int) f10;
        this.f58971r.updateViewLayout(this.f58972s.getRootView(), layoutParams);
    }
}
