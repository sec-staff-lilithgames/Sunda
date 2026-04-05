package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.b f5146b;

    public f(AppCompatSpinner.b bVar) {
        this.f5146b = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        AppCompatSpinner.b bVar = this.f5146b;
        AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
        if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(bVar.M)) {
            bVar.dismiss();
        } else {
            bVar.c();
            super/*q.j2*/.show();
        }
    }
}
