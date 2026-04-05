package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.digidust.elokence.akinator.freemium.R;
import q.n3;
import q.s2;
import q.t2;
import q.y3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: n, reason: collision with root package name */
    public static final DecelerateInterpolator f5151n = new DecelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public s2 f5152b;

    /* renamed from: c, reason: collision with root package name */
    public j f5153c;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayoutCompat f5154e;

    /* renamed from: f, reason: collision with root package name */
    public AppCompatSpinner f5155f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5156g;

    /* renamed from: h, reason: collision with root package name */
    public int f5157h;

    /* renamed from: i, reason: collision with root package name */
    public int f5158i;

    /* renamed from: j, reason: collision with root package name */
    public int f5159j;

    /* renamed from: k, reason: collision with root package name */
    public int f5160k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f5161l;

    /* renamed from: m, reason: collision with root package name */
    public final t2 f5162m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        public a.b f5163b;

        /* renamed from: c, reason: collision with root package name */
        public AppCompatTextView f5164c;

        /* renamed from: e, reason: collision with root package name */
        public AppCompatImageView f5165e;

        /* renamed from: f, reason: collision with root package name */
        public View f5166f;

        public a(Context context, a.b bVar, boolean z10) {
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.f5163b = bVar;
            n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (n3VarObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(n3VarObtainStyledAttributes.getDrawable(0));
            }
            n3VarObtainStyledAttributes.recycle();
            if (z10) {
                setGravity(8388627);
            }
            update();
        }

        public void bindTab(a.b bVar) {
            this.f5163b = bVar;
            update();
        }

        public a.b getTab() {
            return this.f5163b;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            k kVar = k.this;
            if (kVar.f5157h > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = kVar.f5157h;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }

        public void update() {
            a.b bVar = this.f5163b;
            View customView = bVar.getCustomView();
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f5166f = customView;
                AppCompatTextView appCompatTextView = this.f5164c;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f5165e;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f5165e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f5166f;
            if (view != null) {
                removeView(view);
                this.f5166f = null;
            }
            Drawable icon = bVar.getIcon();
            CharSequence text = bVar.getText();
            if (icon != null) {
                if (this.f5165e == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f5165e = appCompatImageView2;
                }
                this.f5165e.setImageDrawable(icon);
                this.f5165e.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f5165e;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f5165e.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(text);
            if (zIsEmpty) {
                AppCompatTextView appCompatTextView2 = this.f5164c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                    this.f5164c.setText((CharSequence) null);
                }
            } else {
                if (this.f5164c == null) {
                    AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView3.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView3.setLayoutParams(layoutParams2);
                    addView(appCompatTextView3);
                    this.f5164c = appCompatTextView3;
                }
                this.f5164c.setText(text);
                this.f5164c.setVisibility(0);
            }
            AppCompatImageView appCompatImageView4 = this.f5165e;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(bVar.getContentDescription());
            }
            y3.setTooltipText(this, zIsEmpty ? bVar.getContentDescription() : null);
        }
    }

    public k(Context context) {
        super(context);
        this.f5162m = new t2(this);
        setHorizontalScrollBarEnabled(false);
        o.a aVar = o.a.get(context);
        setContentHeight(aVar.getTabContainerHeight());
        this.f5158i = aVar.getStackedTabMaxWidth();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f5154e = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final a a(a.b bVar, boolean z10) {
        a aVar = new a(getContext(), bVar, z10);
        if (z10) {
            aVar.setBackgroundDrawable(null);
            aVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f5159j));
            return aVar;
        }
        aVar.setFocusable(true);
        if (this.f5153c == null) {
            this.f5153c = new j(this);
        }
        aVar.setOnClickListener(this.f5153c);
        return aVar;
    }

    public void addTab(a.b bVar, boolean z10) {
        a aVarA = a(bVar, false);
        this.f5154e.addView(aVarA, new LinearLayoutCompat.a(0, -1, 1.0f));
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner != null) {
            ((i) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            aVarA.setSelected(true);
        }
        if (this.f5156g) {
            requestLayout();
        }
    }

    public void animateToTab(int i10) {
        View childAt = this.f5154e.getChildAt(i10);
        Runnable runnable = this.f5152b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        s2 s2Var = new s2(this, childAt);
        this.f5152b = s2Var;
        post(s2Var);
    }

    public void animateToVisibility(int i10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f5161l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        t2 t2Var = this.f5162m;
        DecelerateInterpolator decelerateInterpolator = f5151n;
        if (i10 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(decelerateInterpolator);
            viewPropertyAnimatorAlpha.setListener(t2Var.withFinalVisibility(viewPropertyAnimatorAlpha, i10));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(decelerateInterpolator);
        viewPropertyAnimatorAlpha2.setListener(t2Var.withFinalVisibility(viewPropertyAnimatorAlpha2, i10));
        viewPropertyAnimatorAlpha2.start();
    }

    public final void b() {
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f5155f);
        addView(this.f5154e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5155f.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s2 s2Var = this.f5152b;
        if (s2Var != null) {
            post(s2Var);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o.a aVar = o.a.get(getContext());
        setContentHeight(aVar.getTabContainerHeight());
        this.f5158i = aVar.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s2 s2Var = this.f5152b;
        if (s2Var != null) {
            removeCallbacks(s2Var);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((a) view).getTab().select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        LinearLayoutCompat linearLayoutCompat = this.f5154e;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5157h = -1;
        } else {
            if (childCount > 2) {
                this.f5157h = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f5157h = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f5157h = Math.min(this.f5157h, this.f5158i);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5159j, 1073741824);
        if (z10 || !this.f5156g) {
            b();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                AppCompatSpinner appCompatSpinner = this.f5155f;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f5155f == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f5155f = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f5155f, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f5155f.getAdapter() == null) {
                        this.f5155f.setAdapter((SpinnerAdapter) new i(this));
                    }
                    Runnable runnable = this.f5152b;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f5152b = null;
                    }
                    this.f5155f.setSelection(this.f5160k);
                }
            } else {
                b();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f5160k);
    }

    public void removeAllTabs() {
        this.f5154e.removeAllViews();
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner != null) {
            ((i) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5156g) {
            requestLayout();
        }
    }

    public void removeTabAt(int i10) {
        this.f5154e.removeViewAt(i10);
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner != null) {
            ((i) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5156g) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z10) {
        this.f5156g = z10;
    }

    public void setContentHeight(int i10) {
        this.f5159j = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f5160k = i10;
        LinearLayoutCompat linearLayoutCompat = this.f5154e;
        int childCount = linearLayoutCompat.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                animateToTab(i10);
            }
            i11++;
        }
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner == null || i10 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i10);
    }

    public void updateTab(int i10) {
        ((a) this.f5154e.getChildAt(i10)).update();
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner != null) {
            ((i) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5156g) {
            requestLayout();
        }
    }

    public void addTab(a.b bVar, int i10, boolean z10) {
        a aVarA = a(bVar, false);
        this.f5154e.addView(aVarA, i10, new LinearLayoutCompat.a(0, -1, 1.0f));
        AppCompatSpinner appCompatSpinner = this.f5155f;
        if (appCompatSpinner != null) {
            ((i) appCompatSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            aVarA.setSelected(true);
        }
        if (this.f5156g) {
            requestLayout();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
