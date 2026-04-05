package dh;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f52233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52234f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f52235g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f52236h;

    /* renamed from: i, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.a f52237i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f52238j;

    /* renamed from: k, reason: collision with root package name */
    public final j f52239k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52240l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52241m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52242n;

    /* renamed from: o, reason: collision with root package name */
    public long f52243o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f52244p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f52245q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f52246r;

    /* JADX WARN: Type inference failed for: r0v2, types: [dh.j] */
    public l(q qVar) {
        super(qVar);
        this.f52237i = new com.applovin.mediation.nativeAds.a(this, 18);
        this.f52238j = new com.google.android.material.datepicker.c(this, 2);
        this.f52239k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: dh.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                l lVar = this.f52231a;
                AutoCompleteTextView autoCompleteTextView = lVar.f52236h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                lVar.f52279d.setImportantForAccessibility(z10 ? 2 : 1);
            }
        };
        this.f52243o = Long.MAX_VALUE;
        this.f52234f = sg.o.resolveThemeDuration(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f52233e = sg.o.resolveThemeDuration(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f52235g = sg.o.resolveThemeInterpolator(qVar.getContext(), R.attr.motionEasingLinearInterpolator, vf.a.f89240a);
    }

    @Override // dh.r
    public void afterEditTextChanged(Editable editable) {
        if (this.f52244p.isTouchExplorationEnabled() && this.f52236h.getInputType() != 0 && !this.f52279d.hasFocus()) {
            this.f52236h.dismissDropDown();
        }
        this.f52236h.post(new com.unity3d.services.banners.view.a(this, 8));
    }

    @Override // dh.r
    public final int b() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // dh.r
    public final int c() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // dh.r
    public final View.OnFocusChangeListener d() {
        return this.f52238j;
    }

    @Override // dh.r
    public final View.OnClickListener e() {
        return this.f52237i;
    }

    @Override // dh.r
    public final boolean g(int i10) {
        return i10 != 0;
    }

    @Override // dh.r
    public AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.f52239k;
    }

    @Override // dh.r
    public final boolean i() {
        return this.f52242n;
    }

    @Override // dh.r
    public final void l() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f52235g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f52234f);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.exoplayer2.ui.g(this, 2));
        this.f52246r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f52233e);
        valueAnimatorOfFloat2.addUpdateListener(new com.google.android.exoplayer2.ui.g(this, 2));
        this.f52245q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new k(this));
        this.f52244p = (AccessibilityManager) this.f52278c.getSystemService("accessibility");
    }

    @Override // dh.r
    public final void m() {
        AutoCompleteTextView autoCompleteTextView = this.f52236h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f52236h.setOnDismissListener(null);
        }
    }

    public final void n(boolean z10) {
        if (this.f52242n != z10) {
            this.f52242n = z10;
            this.f52246r.cancel();
            this.f52245q.start();
        }
    }

    public final void o() {
        if (this.f52236h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f52243o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f52241m = false;
        }
        if (this.f52241m) {
            this.f52241m = false;
            return;
        }
        n(!this.f52242n);
        if (!this.f52242n) {
            this.f52236h.dismissDropDown();
        } else {
            this.f52236h.requestFocus();
            this.f52236h.showDropDown();
        }
    }

    @Override // dh.r
    public void onEditTextAttached(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f52236h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new com.amazon.aps.ads.util.adview.b(this, 2));
        this.f52236h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: dh.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f52230a;
                lVar.f52241m = true;
                lVar.f52243o = SystemClock.uptimeMillis();
                lVar.n(false);
            }
        });
        this.f52236h.setThreshold(0);
        TextInputLayout textInputLayout = this.f52276a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f52244p.isTouchExplorationEnabled()) {
            this.f52279d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // dh.r
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        if (this.f52236h.getInputType() == 0) {
            cVar.setClassName(Spinner.class.getName());
        }
        if (cVar.isShowingHintText()) {
            cVar.setHintText(null);
        }
    }

    @Override // dh.r
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f52244p.isEnabled() && this.f52236h.getInputType() == 0) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f52242n && !this.f52236h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                o();
                this.f52241m = true;
                this.f52243o = SystemClock.uptimeMillis();
            }
        }
    }
}
