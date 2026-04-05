package g9;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class g implements n {

    /* renamed from: b, reason: collision with root package name */
    public final f f57453b;

    /* renamed from: c, reason: collision with root package name */
    public final View f57454c;

    /* renamed from: e, reason: collision with root package name */
    public d f57455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57456f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57457g;

    public g(View view) {
        this.f57454c = (View) j9.q.checkNotNull(view);
        this.f57453b = new f(view);
    }

    public final g clearOnDetach() {
        if (this.f57455e == null) {
            d dVar = new d(this);
            this.f57455e = dVar;
            if (!this.f57457g) {
                this.f57454c.addOnAttachStateChangeListener(dVar);
                this.f57457g = true;
                return this;
            }
        }
        return this;
    }

    @Override // g9.n
    public final f9.e getRequest() {
        Object tag = this.f57454c.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof f9.e) {
            return (f9.e) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // g9.n
    public final void getSize(m mVar) throws Throwable {
        f fVar = this.f57453b;
        ArrayList arrayList = fVar.f57450b;
        View view = fVar.f57449a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = fVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((f9.k) mVar).onSizeReady(iA, iA2);
            return;
        }
        if (!arrayList.contains(mVar)) {
            arrayList.add(mVar);
        }
        if (fVar.f57452d == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            e eVar = new e(fVar);
            fVar.f57452d = eVar;
            viewTreeObserver.addOnPreDrawListener(eVar);
        }
    }

    public final View getView() {
        return this.f57454c;
    }

    @Override // g9.n
    public final void onLoadCleared(Drawable drawable) {
        d dVar;
        f fVar = this.f57453b;
        ViewTreeObserver viewTreeObserver = fVar.f57449a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f57452d);
        }
        fVar.f57452d = null;
        fVar.f57450b.clear();
        if (this.f57456f || (dVar = this.f57455e) == null || !this.f57457g) {
            return;
        }
        this.f57454c.removeOnAttachStateChangeListener(dVar);
        this.f57457g = false;
    }

    @Override // g9.n
    public abstract /* synthetic */ void onLoadFailed(Drawable drawable);

    @Override // g9.n
    public final void onLoadStarted(Drawable drawable) {
        d dVar = this.f57455e;
        if (dVar == null || this.f57457g) {
            return;
        }
        this.f57454c.addOnAttachStateChangeListener(dVar);
        this.f57457g = true;
    }

    @Override // g9.n
    public abstract /* synthetic */ void onResourceReady(Object obj, h9.c cVar);

    @Override // g9.n
    public final void removeCallback(m mVar) {
        this.f57453b.f57450b.remove(mVar);
    }

    @Override // g9.n
    public final void setRequest(f9.e eVar) {
        this.f57454c.setTag(R.id.glide_custom_view_target_tag, eVar);
    }

    public String toString() {
        return "Target for: " + this.f57454c;
    }

    public final g waitForLayout() {
        this.f57453b.f57451c = true;
        return this;
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onDestroy() {
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onStart() {
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onStop() {
    }

    @Deprecated
    public final g useTagId(int i10) {
        return this;
    }
}
