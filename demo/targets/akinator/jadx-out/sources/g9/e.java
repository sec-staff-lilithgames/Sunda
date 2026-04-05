package g9;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f57447b;

    public e(f fVar) {
        this.f57447b = new WeakReference(fVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() throws Throwable {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        f fVar = (f) this.f57447b.get();
        if (fVar == null) {
            return true;
        }
        ArrayList arrayList = fVar.f57450b;
        View view = fVar.f57449a;
        if (arrayList.isEmpty()) {
            return true;
        }
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = fVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if (iA <= 0 && iA != Integer.MIN_VALUE) {
            return true;
        }
        if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
            return true;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ((f9.k) ((m) it.next())).onSizeReady(iA, iA2);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f57452d);
        }
        fVar.f57452d = null;
        arrayList.clear();
        return true;
    }
}
