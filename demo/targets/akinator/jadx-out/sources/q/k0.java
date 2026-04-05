package q;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f82165b;

    public k0(AppCompatSpinner appCompatSpinner) {
        this.f82165b = appCompatSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner = this.f82165b;
        if (!appCompatSpinner.getInternalPopup().isShowing()) {
            appCompatSpinner.f5034h.show(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        }
        ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
