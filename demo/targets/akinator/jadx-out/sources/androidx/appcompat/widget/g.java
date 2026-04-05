package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.b f5148c;

    public g(AppCompatSpinner.b bVar, f fVar) {
        this.f5148c = bVar;
        this.f5147b = fVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5147b);
        }
    }
}
