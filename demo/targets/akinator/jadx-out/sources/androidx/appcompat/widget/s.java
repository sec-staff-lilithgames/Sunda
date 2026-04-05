package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import com.digidust.elokence.akinator.freemium.R;
import p.z;
import q.i1;
import q.n3;
import q.v3;
import q.w3;
import x3.m2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f5174a;

    /* renamed from: b, reason: collision with root package name */
    public int f5175b;

    /* renamed from: c, reason: collision with root package name */
    public k f5176c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatSpinner f5177d;

    /* renamed from: e, reason: collision with root package name */
    public View f5178e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f5179f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f5180g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f5181h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5182i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f5183j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5184k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5185l;

    /* renamed from: m, reason: collision with root package name */
    public Window.Callback f5186m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5187n;

    /* renamed from: o, reason: collision with root package name */
    public ActionMenuPresenter f5188o;

    /* renamed from: p, reason: collision with root package name */
    public int f5189p;

    /* renamed from: q, reason: collision with root package name */
    public int f5190q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f5191r;

    public s(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    public final void a() {
        if (this.f5177d == null) {
            this.f5177d = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
            this.f5177d.setLayoutParams(new Toolbar.a(-2, -2, 8388627));
        }
    }

    @Override // q.i1
    public void animateToVisibility(int i10) {
        m2 m2Var = setupAnimatorToVisibility(i10, 200L);
        if (m2Var != null) {
            m2Var.start();
        }
    }

    public final void b() {
        if ((this.f5175b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5185l);
            Toolbar toolbar = this.f5174a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f5190q);
            } else {
                toolbar.setNavigationContentDescription(this.f5185l);
            }
        }
    }

    public final void c() {
        int i10 = this.f5175b & 4;
        Toolbar toolbar = this.f5174a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        Drawable drawable = this.f5181h;
        if (drawable == null) {
            drawable = this.f5191r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // q.i1
    public boolean canShowOverflowMenu() {
        return this.f5174a.canShowOverflowMenu();
    }

    @Override // q.i1
    public void collapseActionView() {
        this.f5174a.collapseActionView();
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f5175b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f5180g) == null) {
            drawable = this.f5179f;
        }
        this.f5174a.setLogo(drawable);
    }

    @Override // q.i1
    public void dismissPopupMenus() {
        this.f5174a.dismissPopupMenus();
    }

    @Override // q.i1
    public Context getContext() {
        return this.f5174a.getContext();
    }

    @Override // q.i1
    public View getCustomView() {
        return this.f5178e;
    }

    @Override // q.i1
    public int getDisplayOptions() {
        return this.f5175b;
    }

    @Override // q.i1
    public int getDropdownItemCount() {
        AppCompatSpinner appCompatSpinner = this.f5177d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getCount();
        }
        return 0;
    }

    @Override // q.i1
    public int getDropdownSelectedPosition() {
        AppCompatSpinner appCompatSpinner = this.f5177d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // q.i1
    public int getHeight() {
        return this.f5174a.getHeight();
    }

    @Override // q.i1
    public Menu getMenu() {
        return this.f5174a.getMenu();
    }

    @Override // q.i1
    public int getNavigationMode() {
        return this.f5189p;
    }

    @Override // q.i1
    public CharSequence getSubtitle() {
        return this.f5174a.getSubtitle();
    }

    @Override // q.i1
    public CharSequence getTitle() {
        return this.f5174a.getTitle();
    }

    @Override // q.i1
    public ViewGroup getViewGroup() {
        return this.f5174a;
    }

    @Override // q.i1
    public int getVisibility() {
        return this.f5174a.getVisibility();
    }

    @Override // q.i1
    public boolean hasEmbeddedTabs() {
        return this.f5176c != null;
    }

    @Override // q.i1
    public boolean hasExpandedActionView() {
        return this.f5174a.hasExpandedActionView();
    }

    @Override // q.i1
    public boolean hasIcon() {
        return this.f5179f != null;
    }

    @Override // q.i1
    public boolean hasLogo() {
        return this.f5180g != null;
    }

    @Override // q.i1
    public boolean hideOverflowMenu() {
        return this.f5174a.hideOverflowMenu();
    }

    @Override // q.i1
    public void initIndeterminateProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // q.i1
    public void initProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // q.i1
    public boolean isOverflowMenuShowPending() {
        return this.f5174a.isOverflowMenuShowPending();
    }

    @Override // q.i1
    public boolean isOverflowMenuShowing() {
        return this.f5174a.isOverflowMenuShowing();
    }

    @Override // q.i1
    public boolean isTitleTruncated() {
        return this.f5174a.isTitleTruncated();
    }

    @Override // q.i1
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f5174a.restoreHierarchyState(sparseArray);
    }

    @Override // q.i1
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f5174a.saveHierarchyState(sparseArray);
    }

    @Override // q.i1
    public void setBackgroundDrawable(Drawable drawable) {
        this.f5174a.setBackground(drawable);
    }

    @Override // q.i1
    public void setCollapsible(boolean z10) {
        this.f5174a.setCollapsible(z10);
    }

    @Override // q.i1
    public void setCustomView(View view) {
        View view2 = this.f5178e;
        Toolbar toolbar = this.f5174a;
        if (view2 != null && (this.f5175b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f5178e = view;
        if (view == null || (this.f5175b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    @Override // q.i1
    public void setDefaultNavigationContentDescription(int i10) {
        if (i10 == this.f5190q) {
            return;
        }
        this.f5190q = i10;
        if (TextUtils.isEmpty(this.f5174a.getNavigationContentDescription())) {
            setNavigationContentDescription(this.f5190q);
        }
    }

    @Override // q.i1
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f5191r != drawable) {
            this.f5191r = drawable;
            c();
        }
    }

    @Override // q.i1
    public void setDisplayOptions(int i10) {
        View view;
        int i11 = this.f5175b ^ i10;
        this.f5175b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                c();
            }
            if ((i11 & 3) != 0) {
                d();
            }
            int i12 = i11 & 8;
            Toolbar toolbar = this.f5174a;
            if (i12 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f5183j);
                    toolbar.setSubtitle(this.f5184k);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f5178e) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // q.i1
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        a();
        this.f5177d.setAdapter(spinnerAdapter);
        this.f5177d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // q.i1
    public void setDropdownSelectedPosition(int i10) {
        AppCompatSpinner appCompatSpinner = this.f5177d;
        if (appCompatSpinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        appCompatSpinner.setSelection(i10);
    }

    @Override // q.i1
    public void setEmbeddedTabView(k kVar) {
        k kVar2 = this.f5176c;
        Toolbar toolbar = this.f5174a;
        if (kVar2 != null && kVar2.getParent() == toolbar) {
            toolbar.removeView(this.f5176c);
        }
        this.f5176c = kVar;
        if (kVar == null || this.f5189p != 2) {
            return;
        }
        toolbar.addView(kVar, 0);
        Toolbar.a aVar = (Toolbar.a) this.f5176c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) aVar).width = -2;
        ((ViewGroup.MarginLayoutParams) aVar).height = -2;
        aVar.f4717a = 8388691;
        kVar.setAllowCollapse(true);
    }

    @Override // q.i1
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    @Override // q.i1
    public void setLogo(int i10) {
        setLogo(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    @Override // q.i1
    public void setMenu(Menu menu, z zVar) {
        ActionMenuPresenter actionMenuPresenter = this.f5188o;
        Toolbar toolbar = this.f5174a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f5188o = actionMenuPresenter2;
            actionMenuPresenter2.setId(R.id.action_menu_presenter);
        }
        this.f5188o.setCallback(zVar);
        toolbar.setMenu((p.m) menu, this.f5188o);
    }

    @Override // q.i1
    public void setMenuCallbacks(z zVar, p.k kVar) {
        this.f5174a.setMenuCallbacks(zVar, kVar);
    }

    @Override // q.i1
    public void setMenuPrepared() {
        this.f5187n = true;
    }

    @Override // q.i1
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.f5185l = charSequence;
        b();
    }

    @Override // q.i1
    public void setNavigationIcon(Drawable drawable) {
        this.f5181h = drawable;
        c();
    }

    @Override // q.i1
    public void setNavigationMode(int i10) {
        k kVar;
        int i11 = this.f5189p;
        if (i10 != i11) {
            Toolbar toolbar = this.f5174a;
            if (i11 == 1) {
                AppCompatSpinner appCompatSpinner = this.f5177d;
                if (appCompatSpinner != null && appCompatSpinner.getParent() == toolbar) {
                    toolbar.removeView(this.f5177d);
                }
            } else if (i11 == 2 && (kVar = this.f5176c) != null && kVar.getParent() == toolbar) {
                toolbar.removeView(this.f5176c);
            }
            this.f5189p = i10;
            if (i10 != 0) {
                if (i10 == 1) {
                    a();
                    toolbar.addView(this.f5177d, 0);
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(a.b.e(i10, "Invalid navigation mode "));
                    }
                    k kVar2 = this.f5176c;
                    if (kVar2 != null) {
                        toolbar.addView(kVar2, 0);
                        Toolbar.a aVar = (Toolbar.a) this.f5176c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                        ((ViewGroup.MarginLayoutParams) aVar).height = -2;
                        aVar.f4717a = 8388691;
                    }
                }
            }
        }
    }

    @Override // q.i1
    public void setSubtitle(CharSequence charSequence) {
        this.f5184k = charSequence;
        if ((this.f5175b & 8) != 0) {
            this.f5174a.setSubtitle(charSequence);
        }
    }

    @Override // q.i1
    public void setTitle(CharSequence charSequence) {
        this.f5182i = true;
        this.f5183j = charSequence;
        if ((this.f5175b & 8) != 0) {
            Toolbar toolbar = this.f5174a;
            toolbar.setTitle(charSequence);
            if (this.f5182i) {
                z1.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // q.i1
    public void setVisibility(int i10) {
        this.f5174a.setVisibility(i10);
    }

    @Override // q.i1
    public void setWindowCallback(Window.Callback callback) {
        this.f5186m = callback;
    }

    @Override // q.i1
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f5182i) {
            return;
        }
        this.f5183j = charSequence;
        if ((this.f5175b & 8) != 0) {
            Toolbar toolbar = this.f5174a;
            toolbar.setTitle(charSequence);
            if (this.f5182i) {
                z1.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // q.i1
    public m2 setupAnimatorToVisibility(int i10, long j10) {
        return z1.animate(this.f5174a).alpha(i10 == 0 ? 1.0f : 0.0f).setDuration(j10).setListener(new w3(this, i10));
    }

    @Override // q.i1
    public boolean showOverflowMenu() {
        return this.f5174a.showOverflowMenu();
    }

    public s(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f5189p = 0;
        this.f5190q = 0;
        this.f5174a = toolbar;
        this.f5183j = toolbar.getTitle();
        this.f5184k = toolbar.getSubtitle();
        this.f5182i = this.f5183j != null;
        this.f5181h = toolbar.getNavigationIcon();
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(toolbar.getContext(), null, k.a.f69977a, R.attr.actionBarStyle, 0);
        int i12 = 15;
        this.f5191r = n3VarObtainStyledAttributes.getDrawable(15);
        if (z10) {
            CharSequence text = n3VarObtainStyledAttributes.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = n3VarObtainStyledAttributes.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = n3VarObtainStyledAttributes.getDrawable(20);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = n3VarObtainStyledAttributes.getDrawable(17);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.f5181h == null && (drawable = this.f5191r) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(n3VarObtainStyledAttributes.getInt(10, 0));
            int resourceId = n3VarObtainStyledAttributes.getResourceId(9, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false));
                setDisplayOptions(this.f5175b | 16);
            }
            int layoutDimension = n3VarObtainStyledAttributes.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = n3VarObtainStyledAttributes.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = n3VarObtainStyledAttributes.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = n3VarObtainStyledAttributes.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = n3VarObtainStyledAttributes.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = n3VarObtainStyledAttributes.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f5191r = toolbar.getNavigationIcon();
            } else {
                i12 = 11;
            }
            this.f5175b = i12;
        }
        n3VarObtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i10);
        this.f5185l = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new v3(this));
    }

    @Override // q.i1
    public void setIcon(Drawable drawable) {
        this.f5179f = drawable;
        d();
    }

    @Override // q.i1
    public void setLogo(Drawable drawable) {
        this.f5180g = drawable;
        d();
    }

    @Override // q.i1
    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // q.i1
    public void setNavigationIcon(int i10) {
        setNavigationIcon(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    @Override // q.i1
    public void setHomeButtonEnabled(boolean z10) {
    }
}
