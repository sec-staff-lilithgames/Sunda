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
public final class p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f57462b;

    public p(q qVar) {
        this.f57462b = new WeakReference(qVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() throws Throwable {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        q qVar = (q) this.f57462b.get();
        if (qVar == null) {
            return true;
        }
        ArrayList arrayList = qVar.f57465b;
        View view = qVar.f57464a;
        if (arrayList.isEmpty()) {
            return true;
        }
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = qVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = qVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
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
            viewTreeObserver.removeOnPreDrawListener(qVar.f57467d);
        }
        qVar.f57467d = null;
        arrayList.clear();
        return true;
    }
}
