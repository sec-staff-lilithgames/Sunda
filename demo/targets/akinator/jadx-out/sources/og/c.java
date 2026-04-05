package og;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.device.ads.DTBAdActivity;
import com.moloco.sdk.BKC.KerkSviMAy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final View f79381a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f79382b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f79383c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f79381a = (View) bVar;
    }

    public int getExpandedComponentIdHint() {
        return this.f79383c;
    }

    public boolean isExpanded() {
        return this.f79382b;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.f79382b = bundle.getBoolean(DTBAdActivity.EXPANDED, false);
        this.f79383c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f79382b) {
            View view = this.f79381a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    public boolean setExpanded(boolean z10) {
        if (this.f79382b == z10) {
            return false;
        }
        this.f79382b = z10;
        View view = this.f79381a;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return true;
        }
        ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
        return true;
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f79383c = i10;
    }

    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(KerkSviMAy.qpKdLAuwzw, this.f79382b);
        bundle.putInt("expandedComponentIdHint", this.f79383c);
        return bundle;
    }
}
