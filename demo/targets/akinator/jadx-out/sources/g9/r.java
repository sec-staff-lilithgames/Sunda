package g9;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class r extends a {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f57468i = false;

    /* renamed from: j, reason: collision with root package name */
    public static int f57469j = 2131427946;

    /* renamed from: c, reason: collision with root package name */
    public final View f57470c;

    /* renamed from: e, reason: collision with root package name */
    public final q f57471e;

    /* renamed from: f, reason: collision with root package name */
    public o f57472f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f57474h;

    public r(View view) {
        this.f57470c = (View) j9.q.checkNotNull(view);
        this.f57471e = new q(view);
    }

    @Deprecated
    public static void setTagId(int i10) {
        if (f57468i) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f57469j = i10;
    }

    public final r clearOnDetach() {
        if (this.f57472f == null) {
            o oVar = new o(this);
            this.f57472f = oVar;
            if (!this.f57474h) {
                this.f57470c.addOnAttachStateChangeListener(oVar);
                this.f57474h = true;
                return this;
            }
        }
        return this;
    }

    @Override // g9.a, g9.n
    public f9.e getRequest() {
        Object tag = this.f57470c.getTag(f57469j);
        if (tag == null) {
            return null;
        }
        if (tag instanceof f9.e) {
            return (f9.e) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // g9.a, g9.n
    public void getSize(m mVar) throws Throwable {
        q qVar = this.f57471e;
        ArrayList arrayList = qVar.f57465b;
        View view = qVar.f57464a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = qVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = qVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((f9.k) mVar).onSizeReady(iA, iA2);
            return;
        }
        if (!arrayList.contains(mVar)) {
            arrayList.add(mVar);
        }
        if (qVar.f57467d == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            p pVar = new p(qVar);
            qVar.f57467d = pVar;
            viewTreeObserver.addOnPreDrawListener(pVar);
        }
    }

    public View getView() {
        return this.f57470c;
    }

    @Override // g9.a, g9.n
    public void onLoadCleared(Drawable drawable) {
        o oVar;
        super.onLoadCleared(drawable);
        q qVar = this.f57471e;
        ViewTreeObserver viewTreeObserver = qVar.f57464a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(qVar.f57467d);
        }
        qVar.f57467d = null;
        qVar.f57465b.clear();
        if (this.f57473g || (oVar = this.f57472f) == null || !this.f57474h) {
            return;
        }
        this.f57470c.removeOnAttachStateChangeListener(oVar);
        this.f57474h = false;
    }

    @Override // g9.a, g9.n
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        o oVar = this.f57472f;
        if (oVar == null || this.f57474h) {
            return;
        }
        this.f57470c.addOnAttachStateChangeListener(oVar);
        this.f57474h = true;
    }

    @Override // g9.a, g9.n
    public abstract /* synthetic */ void onResourceReady(Object obj, h9.c cVar);

    @Override // g9.a, g9.n
    public void removeCallback(m mVar) {
        this.f57471e.f57465b.remove(mVar);
    }

    @Override // g9.a, g9.n
    public void setRequest(f9.e eVar) {
        f57468i = true;
        this.f57470c.setTag(f57469j, eVar);
    }

    public String toString() {
        return "Target for: " + this.f57470c;
    }

    public final r waitForLayout() {
        this.f57471e.f57466c = true;
        return this;
    }

    @Deprecated
    public r(View view, boolean z10) {
        this(view);
        if (z10) {
            waitForLayout();
        }
    }
}
