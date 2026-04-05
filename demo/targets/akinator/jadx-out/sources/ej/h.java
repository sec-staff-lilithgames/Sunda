package ej;

import android.app.Activity;
import android.view.ViewTreeObserver;
import hj.j;
import hj.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h extends j.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ij.c f54419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f54420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f54421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f54422j;

    public h(j jVar, ij.c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f54422j = jVar;
        this.f54419g = cVar;
        this.f54420h = activity;
        this.f54421i = onGlobalLayoutListener;
    }

    @Override // hj.j.a
    public void onError(Exception exc) {
        t.loge("Image download failure ");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f54421i;
        if (onGlobalLayoutListener != null) {
            this.f54419g.getImageView().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
        j jVar = this.f54422j;
        jVar.f54427f.cancel();
        jVar.f54428g.cancel();
        jVar.f54434m = null;
        jVar.f54435n = null;
    }

    @Override // hj.j.a
    public void onSuccess() {
        ij.c cVar = this.f54419g;
        if (!cVar.getConfig().backgroundEnabled().booleanValue()) {
            cVar.getRootView().setOnTouchListener(new d(this));
        }
        j jVar = this.f54422j;
        jVar.f54427f.start(new e(this), 5000L, 1000L);
        if (cVar.getConfig().autoDismiss().booleanValue()) {
            jVar.f54428g.start(new f(this), 20000L, 1000L);
        }
        this.f54420h.runOnUiThread(new g(this));
    }
}
