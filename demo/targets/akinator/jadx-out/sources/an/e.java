package an;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import um.l;
import um.m;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final d f4455b;

    /* renamed from: c, reason: collision with root package name */
    public l f4456c;

    /* renamed from: e, reason: collision with root package name */
    public m f4457e;

    /* renamed from: f, reason: collision with root package name */
    public c f4458f;

    /* renamed from: g, reason: collision with root package name */
    public a f4459g;

    /* renamed from: h, reason: collision with root package name */
    public p f4460h;

    /* renamed from: i, reason: collision with root package name */
    public p f4461i;

    public e(Context context) {
        super(context);
        d dVar = new d();
        dVar.f4449a = false;
        dVar.f4450b = 0.0f;
        dVar.f4451c = 0L;
        dVar.f4452d = 0L;
        dVar.f4453e = 0L;
        dVar.f4454f = 0L;
        this.f4455b = dVar;
    }

    public final void a() {
        if (!this.f4455b.c()) {
            Runnable runnable = this.f4458f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f4458f = null;
            }
            if (this.f4456c == null) {
                this.f4456c = new l(new b(this));
            }
            this.f4456c.attach(getContext(), this, this.f4460h);
            m mVar = this.f4457e;
            if (mVar != null) {
                mVar.detach();
                return;
            }
            return;
        }
        l lVar = this.f4456c;
        if (lVar != null) {
            lVar.detach();
        }
        if (this.f4457e == null) {
            this.f4457e = new m(null);
        }
        this.f4457e.attach(getContext(), this, this.f4461i);
        if (isShown()) {
            Runnable runnable2 = this.f4458f;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
                this.f4458f = null;
            }
            c cVar = new c(this);
            this.f4458f = cVar;
            postDelayed(cVar, 50L);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        l lVar = this.f4456c;
        if (lVar != null) {
            lVar.bringToFront();
        }
        m mVar = this.f4457e;
        if (mVar != null) {
            mVar.bringToFront();
        }
    }

    public boolean canBeClosed() {
        return this.f4455b.a();
    }

    public long getOnScreenTimeMs() {
        return this.f4455b.b();
    }

    public boolean isVisible() {
        return this.f4455b.d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d dVar = this.f4455b;
        if (i10 != 0) {
            Runnable runnable = this.f4458f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f4458f = null;
            }
        } else if (dVar.c() && dVar.d() && isShown()) {
            Runnable runnable2 = this.f4458f;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
                this.f4458f = null;
            }
            c cVar = new c(this);
            this.f4458f = cVar;
            postDelayed(cVar, 50L);
        }
        boolean z10 = i10 == 0;
        if (dVar.f4453e > 0) {
            dVar.f4454f = (System.currentTimeMillis() - dVar.f4453e) + dVar.f4454f;
        }
        if (z10) {
            dVar.f4453e = System.currentTimeMillis();
        } else {
            dVar.f4453e = 0L;
        }
    }

    public void setCloseClickListener(a aVar) {
        this.f4459g = aVar;
    }

    public void setCloseStyle(p pVar) {
        this.f4460h = pVar;
        l lVar = this.f4456c;
        if (lVar == null || !lVar.isAttached()) {
            return;
        }
        this.f4456c.attach(getContext(), this, pVar);
    }

    public void setCloseVisibility(boolean z10, float f10) {
        d dVar = this.f4455b;
        if (dVar.f4449a == z10 && dVar.f4450b == f10) {
            return;
        }
        dVar.a(z10, f10);
        if (z10) {
            a();
            return;
        }
        l lVar = this.f4456c;
        if (lVar != null) {
            lVar.detach();
        }
        m mVar = this.f4457e;
        if (mVar != null) {
            mVar.detach();
        }
        c cVar = this.f4458f;
        if (cVar != null) {
            removeCallbacks(cVar);
            this.f4458f = null;
        }
    }

    public void setCountDownStyle(p pVar) {
        this.f4461i = pVar;
        m mVar = this.f4457e;
        if (mVar == null || !mVar.isAttached()) {
            return;
        }
        this.f4457e.attach(getContext(), this, pVar);
    }
}
