package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.applovin.impl.adview.r;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import q.u3;
import qg.h;
import qg.j0;
import qg.l0;
import qg.p;
import qg.t0;
import sg.g;
import wg.i;
import wg.j;
import wg.k;
import wg.l;
import wg.m;
import wg.t;
import x3.e3;
import x3.t3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SearchView extends FrameLayout implements androidx.coordinatorlayout.widget.a, sg.b {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public m E;
    public HashMap F;

    /* renamed from: b, reason: collision with root package name */
    public final View f29328b;

    /* renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f29329c;

    /* renamed from: e, reason: collision with root package name */
    public final View f29330e;

    /* renamed from: f, reason: collision with root package name */
    public final View f29331f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f29332g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f29333h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialToolbar f29334i;

    /* renamed from: j, reason: collision with root package name */
    public final Toolbar f29335j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f29336k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f29337l;

    /* renamed from: m, reason: collision with root package name */
    public final EditText f29338m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageButton f29339n;

    /* renamed from: o, reason: collision with root package name */
    public final View f29340o;

    /* renamed from: p, reason: collision with root package name */
    public final TouchObserverFrameLayout f29341p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29342q;

    /* renamed from: r, reason: collision with root package name */
    public final t f29343r;

    /* renamed from: s, reason: collision with root package name */
    public final g f29344s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f29345t;

    /* renamed from: u, reason: collision with root package name */
    public final ng.a f29346u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f29347v;

    /* renamed from: w, reason: collision with root package name */
    public SearchBar f29348w;

    /* renamed from: x, reason: collision with root package name */
    public int f29349x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29350y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29351z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Behavior extends CoordinatorLayout.a {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* renamed from: e, reason: collision with root package name */
        public String f29352e;

        /* renamed from: f, reason: collision with root package name */
        public int f29353f;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f29352e);
            parcel.writeInt(this.f29353f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29352e = parcel.readString();
            this.f29353f = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(SearchView searchView, e3 e3Var) {
        int i10 = e3Var.getInsets(t3.systemBars() | t3.displayCutout()).f77433b;
        searchView.setUpStatusBarSpacer(i10);
        if (searchView.D) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(i10 > 0);
    }

    private Window getActivityWindow() {
        Activity activity = h.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f29348w;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f29331f.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        View view;
        ng.a aVar = this.f29346u;
        if (aVar == null || (view = this.f29330e) == null) {
            return;
        }
        view.setBackgroundColor(aVar.compositeOverlayIfNeeded(this.B, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f29332g, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        View view = this.f29331f;
        if (view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            view.requestLayout();
        }
    }

    public void addHeaderView(View view) {
        FrameLayout frameLayout = this.f29332g;
        frameLayout.addView(view);
        frameLayout.setVisibility(0);
    }

    public void addTransitionListener(l lVar) {
        this.f29347v.add(lVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f29342q) {
            this.f29341p.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final boolean b() {
        return this.f29349x == 48;
    }

    public final boolean c() {
        return this.E.equals(m.f90594c) || this.E.equals(m.f90593b);
    }

    @Override // sg.b
    public void cancelBackProgress() {
        if (c() || this.f29348w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f29343r.cancelBackProgress();
    }

    public void clearFocusAndHideKeyboard() {
        this.f29338m.post(new i(this, 2));
    }

    public void clearText() {
        this.f29338m.setText("");
    }

    public final void d(m mVar, boolean z10) {
        if (this.E.equals(mVar)) {
            return;
        }
        m mVar2 = m.f90594c;
        if (z10) {
            if (mVar == m.f90596f) {
                setModalForAccessibility(true);
            } else if (mVar == mVar2) {
                setModalForAccessibility(false);
            }
        }
        this.E = mVar;
        Iterator it = new LinkedHashSet(this.f29347v).iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        f(mVar);
        SearchBar searchBar = this.f29348w;
        if (searchBar == null || mVar != mVar2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public final void e(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f29329c.getId()) != null) {
                    e((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.F.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.F;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.F.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void f(m mVar) {
        if (this.f29348w == null || !this.f29345t) {
            return;
        }
        boolean zEquals = mVar.equals(m.f90596f);
        g gVar = this.f29344s;
        if (zEquals) {
            gVar.startListeningForBackCallbacks();
        } else if (mVar.equals(m.f90594c)) {
            gVar.stopListeningForBackCallbacks();
        }
    }

    public final void g() {
        ImageButton navigationIconButton = l0.getNavigationIconButton(this.f29334i);
        if (navigationIconButton == null) {
            return;
        }
        int i10 = this.f29329c.getVisibility() == 0 ? 1 : 0;
        Drawable drawableUnwrap = p3.a.unwrap(navigationIconButton.getDrawable());
        if (drawableUnwrap instanceof m.b) {
            ((m.b) drawableUnwrap).setProgress(i10);
        }
        if (drawableUnwrap instanceof p) {
            ((p) drawableUnwrap).setProgress(i10);
        }
    }

    public sg.l getBackHelper() {
        return this.f29343r.f90621n;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new Behavior();
    }

    public m getCurrentTransitionState() {
        return this.E;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.f29338m;
    }

    public CharSequence getHint() {
        return this.f29338m.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f29336k;
    }

    public CharSequence getSearchPrefixText() {
        return this.f29336k.getText();
    }

    public int getSoftInputMode() {
        return this.f29349x;
    }

    public Editable getText() {
        return this.f29338m.getText();
    }

    public Toolbar getToolbar() {
        return this.f29334i;
    }

    @Override // sg.b
    public void handleBackInvoked() {
        if (c()) {
            return;
        }
        t tVar = this.f29343r;
        f.c cVarOnHandleBackInvoked = tVar.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT < 34 || this.f29348w == null || cVarOnHandleBackInvoked == null) {
            hide();
        } else {
            tVar.finishBackProgress();
        }
    }

    public void hide() {
        if (this.E.equals(m.f90594c) || this.E.equals(m.f90593b)) {
            return;
        }
        SearchBar searchBar = this.f29348w;
        t tVar = this.f29343r;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            tVar.l();
            return;
        }
        this.f29348w.setPlaceholderText(this.f29338m.getText().toString());
        SearchBar searchBar2 = this.f29348w;
        Objects.requireNonNull(tVar);
        searchBar2.post(new wg.g(tVar, 0));
    }

    public void inflateMenu(int i10) {
        this.f29334i.inflateMenu(i10);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.f29350y;
    }

    public boolean isAutoShowKeyboard() {
        return this.A;
    }

    public boolean isMenuItemsAnimated() {
        return this.f29351z;
    }

    public boolean isSetupWithSearchBar() {
        return this.f29348w != null;
    }

    public boolean isShowing() {
        return this.E.equals(m.f90596f) || this.E.equals(m.f90595e);
    }

    public boolean isUseWindowInsetsController() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yg.m.setParentAbsoluteElevation(this);
        m currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == m.f90596f) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == m.f90594c) {
            setModalForAccessibility(false);
        }
        f(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.f29344s.stopListeningForBackCallbacks();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f29352e);
        setVisible(savedState.f29353f == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f29352e = text == null ? null : text.toString();
        savedState.f29353f = this.f29329c.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        FrameLayout frameLayout = this.f29332g;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
    }

    public void removeHeaderView(View view) {
        FrameLayout frameLayout = this.f29332g;
        frameLayout.removeView(view);
        if (frameLayout.getChildCount() == 0) {
            frameLayout.setVisibility(8);
        }
    }

    public void removeTransitionListener(l lVar) {
        this.f29347v.remove(lVar);
    }

    public void requestFocusAndShowKeyboard() {
        this.f29338m.postDelayed(new i(this, 0), 100L);
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f29350y = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.A = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f29338m.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f29351z = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.F = new HashMap(viewGroup.getChildCount());
        }
        e(viewGroup, z10);
        if (z10) {
            return;
        }
        this.F = null;
    }

    public void setOnMenuItemClickListener(u3 u3Var) {
        this.f29334i.setOnMenuItemClickListener(u3Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.f29336k;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.D = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(CharSequence charSequence) {
        this.f29338m.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f29334i.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(m mVar) {
        d(mVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.C = z10;
    }

    public void setVisible(boolean z10) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f29329c;
        boolean z11 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z10 ? 0 : 8);
        g();
        d(z10 ? m.f90596f : m.f90594c, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f29348w = searchBar;
        this.f29343r.f90623p = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new wg.h(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new i(this, 1));
                    this.f29338m.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f29334i;
        if (materialToolbar != null && !(p3.a.unwrap(materialToolbar.getNavigationIcon()) instanceof m.b)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.f29348w == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableWrap = p3.a.wrap(l.a.getDrawable(getContext(), defaultNavigationIconResource).mutate());
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableWrap.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                p3.a.setLayoutDirection(drawableWrap, getLayoutDirection());
                materialToolbar.setNavigationIcon(new p(this.f29348w.getNavigationIcon(), drawableWrap));
                g();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        f(getCurrentTransitionState());
    }

    public void show() {
        if (this.E.equals(m.f90596f)) {
            return;
        }
        m mVar = this.E;
        m mVar2 = m.f90595e;
        if (mVar.equals(mVar2)) {
            return;
        }
        t tVar = this.f29343r;
        SearchView searchView = tVar.f90608a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = tVar.f90610c;
        if (tVar.f90623p == null) {
            if (searchView.b()) {
                searchView.postDelayed(new i(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new wg.g(tVar, 2));
            return;
        }
        EditText editText = tVar.f90617j;
        if (searchView.b() && searchView.A) {
            searchView.requestFocusAndShowKeyboard();
        }
        searchView.setTransitionState(mVar2);
        Toolbar toolbar = tVar.f90614g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (tVar.f90623p.getMenuResId() == -1 || !searchView.isMenuItemsAnimated()) {
            toolbar.setVisibility(8);
        } else {
            toolbar.inflateMenu(tVar.f90623p.getMenuResId());
            ActionMenuView actionMenuView = l0.getActionMenuView(toolbar);
            if (actionMenuView != null) {
                for (int i10 = 0; i10 < actionMenuView.getChildCount(); i10++) {
                    View childAt = actionMenuView.getChildAt(i10);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(tVar.f90623p.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new wg.g(tVar, 1));
    }

    @Override // sg.b
    public void startBackProgress(f.c cVar) {
        SearchBar searchBar;
        if (c() || (searchBar = this.f29348w) == null) {
            return;
        }
        if (searchBar != null) {
            searchBar.setPlaceholderText(this.f29338m.getText().toString());
        }
        t tVar = this.f29343r;
        tVar.f90621n.startBackProgress(cVar, tVar.f90623p);
    }

    @Override // sg.b
    public void updateBackProgress(f.c cVar) {
        if (c() || this.f29348w == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f29343r.updateBackProgress(cVar);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f29349x = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(int i10) {
        this.f29338m.setHint(i10);
    }

    public void setText(int i10) {
        this.f29338m.setText(i10);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_Material3_SearchView), attributeSet, i10);
        this.f29344s = new g(this);
        this.f29347v = new LinkedHashSet();
        this.f29349x = 16;
        this.E = m.f90594c;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.J, i10, R.style.Widget_Material3_SearchView, new int[0]);
        this.B = typedArrayObtainStyledAttributes.getColor(11, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        String string = typedArrayObtainStyledAttributes.getString(3);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        String string3 = typedArrayObtainStyledAttributes.getString(24);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(27, false);
        this.f29350y = typedArrayObtainStyledAttributes.getBoolean(8, true);
        this.f29351z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(9, true);
        this.f29345t = typedArrayObtainStyledAttributes.getBoolean(10, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f29342q = true;
        this.f29328b = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f29329c = clippableRoundedCornerLayout;
        this.f29330e = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f29331f = viewFindViewById;
        this.f29332g = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f29333h = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f29334i = materialToolbar;
        this.f29335j = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f29336k = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.f29337l = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f29338m = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.f29339n = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.f29340o = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.f29341p = touchObserverFrameLayout;
        this.f29343r = new t(this);
        this.f29346u = new ng.a(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new r(2));
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            e4.t.setTextAppearance(editText, resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z11) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new wg.h(this, 2));
            if (z10) {
                m.b bVar = new m.b(getContext());
                bVar.setColor(jg.b.getColor(this, R.attr.colorOnSurface));
                materialToolbar.setNavigationIcon(bVar);
            }
        }
        imageButton.setOnClickListener(new wg.h(this, 0));
        editText.addTextChangedListener(new k(this));
        touchObserverFrameLayout.setOnTouchListener(new com.amazon.aps.ads.util.adview.b(this, 4));
        t0.doOnApplyWindowInsets(materialToolbar, new j(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        z1.setOnApplyWindowInsetsListener(viewFindViewById2, new ks.g(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, 2, marginLayoutParams));
        setUpStatusBarSpacer(getStatusBarHeight());
        z1.setOnApplyWindowInsetsListener(viewFindViewById, new j(this));
    }
}
