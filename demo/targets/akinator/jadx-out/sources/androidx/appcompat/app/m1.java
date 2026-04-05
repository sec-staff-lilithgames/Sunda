package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import x3.m2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m1 extends androidx.appcompat.app.a implements q.k {
    public static final AccelerateInterpolator F = new AccelerateInterpolator();
    public static final DecelerateInterpolator G = new DecelerateInterpolator();
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public Context f4775a;

    /* renamed from: b, reason: collision with root package name */
    public Context f4776b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f4777c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f4778d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f4779e;

    /* renamed from: f, reason: collision with root package name */
    public q.i1 f4780f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f4781g;

    /* renamed from: h, reason: collision with root package name */
    public final View f4782h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.k f4783i;

    /* renamed from: k, reason: collision with root package name */
    public b f4785k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4787m;

    /* renamed from: n, reason: collision with root package name */
    public a f4788n;

    /* renamed from: o, reason: collision with root package name */
    public a f4789o;

    /* renamed from: p, reason: collision with root package name */
    public o.b f4790p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4791q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4793s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4796v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4797w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4798x;

    /* renamed from: z, reason: collision with root package name */
    public o.j f4800z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4784j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public int f4786l = -1;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4792r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f4794t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4795u = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4799y = true;
    public final j1 C = new j1(this);
    public final k1 D = new k1(this);
    public final l1 E = new l1(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends o.c implements p.k {

        /* renamed from: e, reason: collision with root package name */
        public final Context f4801e;

        /* renamed from: f, reason: collision with root package name */
        public final p.m f4802f;

        /* renamed from: g, reason: collision with root package name */
        public o.b f4803g;

        /* renamed from: h, reason: collision with root package name */
        public WeakReference f4804h;

        public a(Context context, o.b bVar) {
            this.f4801e = context;
            this.f4803g = bVar;
            p.m defaultShowAsAction = new p.m(context).setDefaultShowAsAction(1);
            this.f4802f = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        public boolean dispatchOnCreate() {
            p.m mVar = this.f4802f;
            mVar.stopDispatchingItemsChanged();
            try {
                return this.f4803g.onCreateActionMode(this, mVar);
            } finally {
                mVar.startDispatchingItemsChanged();
            }
        }

        @Override // o.c
        public void finish() {
            m1 m1Var = m1.this;
            if (m1Var.f4788n != this) {
                return;
            }
            boolean z10 = m1Var.f4796v;
            boolean z11 = m1Var.f4797w;
            if (z10 || z11) {
                m1Var.f4789o = this;
                m1Var.f4790p = this.f4803g;
            } else {
                this.f4803g.onDestroyActionMode(this);
            }
            this.f4803g = null;
            m1Var.animateToMode(false);
            m1Var.f4781g.closeMode();
            m1Var.f4778d.setHideOnContentScrollEnabled(m1Var.B);
            m1Var.f4788n = null;
        }

        @Override // o.c
        public View getCustomView() {
            WeakReference weakReference = this.f4804h;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // o.c
        public Menu getMenu() {
            return this.f4802f;
        }

        @Override // o.c
        public MenuInflater getMenuInflater() {
            return new o.h(this.f4801e);
        }

        @Override // o.c
        public CharSequence getSubtitle() {
            return m1.this.f4781g.getSubtitle();
        }

        @Override // o.c
        public CharSequence getTitle() {
            return m1.this.f4781g.getTitle();
        }

        @Override // o.c
        public void invalidate() {
            if (m1.this.f4788n != this) {
                return;
            }
            p.m mVar = this.f4802f;
            mVar.stopDispatchingItemsChanged();
            try {
                this.f4803g.onPrepareActionMode(this, mVar);
            } finally {
                mVar.startDispatchingItemsChanged();
            }
        }

        @Override // o.c
        public boolean isTitleOptional() {
            return m1.this.f4781g.isTitleOptional();
        }

        @Override // p.k
        public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
            o.b bVar = this.f4803g;
            if (bVar != null) {
                return bVar.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // p.k
        public void onMenuModeChange(p.m mVar) {
            if (this.f4803g == null) {
                return;
            }
            invalidate();
            m1.this.f4781g.showOverflowMenu();
        }

        public boolean onSubMenuSelected(p.i0 i0Var) {
            if (this.f4803g == null) {
                return false;
            }
            if (!i0Var.hasVisibleItems()) {
                return true;
            }
            new p.y(m1.this.getThemedContext(), i0Var).show();
            return true;
        }

        @Override // o.c
        public void setCustomView(View view) {
            m1.this.f4781g.setCustomView(view);
            this.f4804h = new WeakReference(view);
        }

        @Override // o.c
        public void setSubtitle(CharSequence charSequence) {
            m1.this.f4781g.setSubtitle(charSequence);
        }

        @Override // o.c
        public void setTitle(CharSequence charSequence) {
            m1.this.f4781g.setTitle(charSequence);
        }

        @Override // o.c
        public void setTitleOptionalHint(boolean z10) {
            super.setTitleOptionalHint(z10);
            m1.this.f4781g.setTitleOptional(z10);
        }

        @Override // o.c
        public void setSubtitle(int i10) {
            setSubtitle(m1.this.f4775a.getResources().getString(i10));
        }

        @Override // o.c
        public void setTitle(int i10) {
            setTitle(m1.this.f4775a.getResources().getString(i10));
        }

        public void onCloseSubMenu(p.i0 i0Var) {
        }

        public void onCloseMenu(p.m mVar, boolean z10) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends a.b {

        /* renamed from: a, reason: collision with root package name */
        public Object f4806a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f4807b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f4808c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f4809d;

        /* renamed from: e, reason: collision with root package name */
        public int f4810e = -1;

        /* renamed from: f, reason: collision with root package name */
        public View f4811f;

        public b() {
        }

        public d getCallback() {
            return null;
        }

        @Override // androidx.appcompat.app.a.b
        public CharSequence getContentDescription() {
            return this.f4809d;
        }

        @Override // androidx.appcompat.app.a.b
        public View getCustomView() {
            return this.f4811f;
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable getIcon() {
            return this.f4807b;
        }

        @Override // androidx.appcompat.app.a.b
        public int getPosition() {
            return this.f4810e;
        }

        @Override // androidx.appcompat.app.a.b
        public Object getTag() {
            return this.f4806a;
        }

        @Override // androidx.appcompat.app.a.b
        public CharSequence getText() {
            return this.f4808c;
        }

        @Override // androidx.appcompat.app.a.b
        public void select() {
            m1.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setContentDescription(int i10) {
            return setContentDescription(m1.this.f4775a.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setCustomView(View view) {
            this.f4811f = view;
            int i10 = this.f4810e;
            if (i10 >= 0) {
                m1.this.f4783i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setIcon(Drawable drawable) {
            this.f4807b = drawable;
            int i10 = this.f4810e;
            if (i10 >= 0) {
                m1.this.f4783i.updateTab(i10);
            }
            return this;
        }

        public void setPosition(int i10) {
            this.f4810e = i10;
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setTag(Object obj) {
            this.f4806a = obj;
            return this;
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setText(CharSequence charSequence) {
            this.f4808c = charSequence;
            int i10 = this.f4810e;
            if (i10 >= 0) {
                m1.this.f4783i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setContentDescription(CharSequence charSequence) {
            this.f4809d = charSequence;
            int i10 = this.f4810e;
            if (i10 >= 0) {
                m1.this.f4783i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setCustomView(int i10) {
            return setCustomView(LayoutInflater.from(m1.this.getThemedContext()).inflate(i10, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setIcon(int i10) {
            return setIcon(l.a.getDrawable(m1.this.f4775a, i10));
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setText(int i10) {
            return setText(m1.this.f4775a.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.a.b
        public a.b setTabListener(d dVar) {
            return this;
        }
    }

    public m1(Activity activity, boolean z10) {
        this.f4777c = activity;
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z10) {
            return;
        }
        this.f4782h = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.a
    public void addOnMenuVisibilityListener(androidx.appcompat.app.b bVar) {
        this.f4792r.add(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar) {
        addTab(bVar, this.f4784j.isEmpty());
    }

    public void animateToMode(boolean z10) {
        m2 m2Var;
        m2 m2Var2;
        if (z10) {
            if (!this.f4798x) {
                this.f4798x = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4778d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                e(false);
            }
        } else if (this.f4798x) {
            this.f4798x = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4778d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            e(false);
        }
        if (!this.f4779e.isLaidOut()) {
            if (z10) {
                this.f4780f.setVisibility(4);
                this.f4781g.setVisibility(0);
                return;
            } else {
                this.f4780f.setVisibility(0);
                this.f4781g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            m2Var2 = this.f4780f.setupAnimatorToVisibility(4, 100L);
            m2Var = this.f4781g.setupAnimatorToVisibility(0, 200L);
        } else {
            m2Var = this.f4780f.setupAnimatorToVisibility(0, 200L);
            m2Var2 = this.f4781g.setupAnimatorToVisibility(8, 100L);
        }
        o.j jVar = new o.j();
        jVar.playSequentially(m2Var2, m2Var);
        jVar.start();
    }

    public final void b() {
        if (this.f4783i != null) {
            return;
        }
        androidx.appcompat.widget.k kVar = new androidx.appcompat.widget.k(this.f4775a);
        if (this.f4793s) {
            kVar.setVisibility(0);
            this.f4780f.setEmbeddedTabView(kVar);
        } else {
            if (getNavigationMode() == 2) {
                kVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4778d;
                if (actionBarOverlayLayout != null) {
                    z1.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                kVar.setVisibility(8);
            }
            this.f4779e.setTabContainer(kVar);
        }
        this.f4783i = kVar;
    }

    public final void c(View view) {
        q.i1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.digidust.elokence.akinator.freemium.R.id.decor_content_parent);
        this.f4778d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.digidust.elokence.akinator.freemium.R.id.action_bar);
        if (callbackFindViewById instanceof q.i1) {
            wrapper = (q.i1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : AbstractJsonLexerKt.NULL));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f4780f = wrapper;
        this.f4781g = (ActionBarContextView) view.findViewById(com.digidust.elokence.akinator.freemium.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.digidust.elokence.akinator.freemium.R.id.action_bar_container);
        this.f4779e = actionBarContainer;
        q.i1 i1Var = this.f4780f;
        if (i1Var == null || this.f4781g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f4775a = i1Var.getContext();
        boolean z10 = (this.f4780f.getDisplayOptions() & 4) != 0;
        if (z10) {
            this.f4787m = true;
        }
        o.a aVar = o.a.get(this.f4775a);
        setHomeButtonEnabled(aVar.enableHomeButtonByDefault() || z10);
        d(aVar.hasEmbeddedTabs());
        TypedArray typedArrayObtainStyledAttributes = this.f4775a.obtainStyledAttributes(null, k.a.f69977a, com.digidust.elokence.akinator.freemium.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.a
    public boolean collapseActionView() {
        q.i1 i1Var = this.f4780f;
        if (i1Var == null || !i1Var.hasExpandedActionView()) {
            return false;
        }
        this.f4780f.collapseActionView();
        return true;
    }

    public final void d(boolean z10) {
        this.f4793s = z10;
        if (z10) {
            this.f4779e.setTabContainer(null);
            this.f4780f.setEmbeddedTabView(this.f4783i);
        } else {
            this.f4780f.setEmbeddedTabView(null);
            this.f4779e.setTabContainer(this.f4783i);
        }
        boolean z11 = getNavigationMode() == 2;
        androidx.appcompat.widget.k kVar = this.f4783i;
        if (kVar != null) {
            if (z11) {
                kVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4778d;
                if (actionBarOverlayLayout != null) {
                    z1.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                kVar.setVisibility(8);
            }
        }
        this.f4780f.setCollapsible(!this.f4793s && z11);
        this.f4778d.setHasNonEmbeddedTabs(!this.f4793s && z11);
    }

    @Override // androidx.appcompat.app.a
    public void dispatchMenuVisibilityChanged(boolean z10) {
        if (z10 == this.f4791q) {
            return;
        }
        this.f4791q = z10;
        ArrayList arrayList = this.f4792r;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public void doHide(boolean z10) {
        View view;
        o.j jVar = this.f4800z;
        if (jVar != null) {
            jVar.cancel();
        }
        int i10 = this.f4794t;
        j1 j1Var = this.C;
        if (i10 != 0 || (!this.A && !z10)) {
            j1Var.onAnimationEnd(null);
            return;
        }
        this.f4779e.setAlpha(1.0f);
        this.f4779e.setTransitioning(true);
        o.j jVar2 = new o.j();
        float f10 = -this.f4779e.getHeight();
        if (z10) {
            this.f4779e.getLocationInWindow(new int[]{0, 0});
            f10 -= r6[1];
        }
        m2 m2VarTranslationY = z1.animate(this.f4779e).translationY(f10);
        m2VarTranslationY.setUpdateListener(this.E);
        jVar2.play(m2VarTranslationY);
        if (this.f4795u && (view = this.f4782h) != null) {
            jVar2.play(z1.animate(view).translationY(f10));
        }
        jVar2.setInterpolator(F);
        jVar2.setDuration(250L);
        jVar2.setListener(j1Var);
        this.f4800z = jVar2;
        jVar2.start();
    }

    public void doShow(boolean z10) {
        o.j jVar = this.f4800z;
        if (jVar != null) {
            jVar.cancel();
        }
        this.f4779e.setVisibility(0);
        int i10 = this.f4794t;
        k1 k1Var = this.D;
        View view = this.f4782h;
        if (i10 == 0 && (this.A || z10)) {
            this.f4779e.setTranslationY(0.0f);
            float f10 = -this.f4779e.getHeight();
            if (z10) {
                this.f4779e.getLocationInWindow(new int[]{0, 0});
                f10 -= r7[1];
            }
            this.f4779e.setTranslationY(f10);
            o.j jVar2 = new o.j();
            m2 m2VarTranslationY = z1.animate(this.f4779e).translationY(0.0f);
            m2VarTranslationY.setUpdateListener(this.E);
            jVar2.play(m2VarTranslationY);
            if (this.f4795u && view != null) {
                view.setTranslationY(f10);
                jVar2.play(z1.animate(view).translationY(0.0f));
            }
            jVar2.setInterpolator(G);
            jVar2.setDuration(250L);
            jVar2.setListener(k1Var);
            this.f4800z = jVar2;
            jVar2.start();
        } else {
            this.f4779e.setAlpha(1.0f);
            this.f4779e.setTranslationY(0.0f);
            if (this.f4795u && view != null) {
                view.setTranslationY(0.0f);
            }
            k1Var.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4778d;
        if (actionBarOverlayLayout != null) {
            z1.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public final void e(boolean z10) {
        boolean z11 = this.f4796v;
        boolean z12 = this.f4797w;
        if (!this.f4798x && (z11 || z12)) {
            if (this.f4799y) {
                this.f4799y = false;
                doHide(z10);
                return;
            }
            return;
        }
        if (this.f4799y) {
            return;
        }
        this.f4799y = true;
        doShow(z10);
    }

    @Override // q.k
    public void enableContentAnimations(boolean z10) {
        this.f4795u = z10;
    }

    @Override // androidx.appcompat.app.a
    public View getCustomView() {
        return this.f4780f.getCustomView();
    }

    @Override // androidx.appcompat.app.a
    public int getDisplayOptions() {
        return this.f4780f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public float getElevation() {
        return z1.getElevation(this.f4779e);
    }

    @Override // androidx.appcompat.app.a
    public int getHeight() {
        return this.f4779e.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public int getHideOffset() {
        return this.f4778d.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationItemCount() {
        int navigationMode = this.f4780f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f4780f.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.f4784j.size();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationMode() {
        return this.f4780f.getNavigationMode();
    }

    @Override // androidx.appcompat.app.a
    public int getSelectedNavigationIndex() {
        b bVar;
        int navigationMode = this.f4780f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f4780f.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (bVar = this.f4785k) != null) {
            return bVar.getPosition();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public a.b getSelectedTab() {
        return this.f4785k;
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getSubtitle() {
        return this.f4780f.getSubtitle();
    }

    @Override // androidx.appcompat.app.a
    public a.b getTabAt(int i10) {
        return (a.b) this.f4784j.get(i10);
    }

    @Override // androidx.appcompat.app.a
    public int getTabCount() {
        return this.f4784j.size();
    }

    @Override // androidx.appcompat.app.a
    public Context getThemedContext() {
        if (this.f4776b == null) {
            TypedValue typedValue = new TypedValue();
            this.f4775a.getTheme().resolveAttribute(com.digidust.elokence.akinator.freemium.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f4776b = new ContextThemeWrapper(this.f4775a, i10);
            } else {
                this.f4776b = this.f4775a;
            }
        }
        return this.f4776b;
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getTitle() {
        return this.f4780f.getTitle();
    }

    public boolean hasIcon() {
        return this.f4780f.hasIcon();
    }

    public boolean hasLogo() {
        return this.f4780f.hasLogo();
    }

    @Override // androidx.appcompat.app.a
    public void hide() {
        if (this.f4796v) {
            return;
        }
        this.f4796v = true;
        e(false);
    }

    @Override // q.k
    public void hideForSystem() {
        if (this.f4797w) {
            return;
        }
        this.f4797w = true;
        e(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean isHideOnContentScrollEnabled() {
        return this.f4778d.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.a
    public boolean isShowing() {
        int height = getHeight();
        if (this.f4799y) {
            return height == 0 || getHideOffset() < height;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean isTitleTruncated() {
        q.i1 i1Var = this.f4780f;
        return i1Var != null && i1Var.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.a
    public a.b newTab() {
        return new b();
    }

    @Override // androidx.appcompat.app.a
    public void onConfigurationChanged(Configuration configuration) {
        d(o.a.get(this.f4775a).hasEmbeddedTabs());
    }

    @Override // q.k
    public void onContentScrollStarted() {
        o.j jVar = this.f4800z;
        if (jVar != null) {
            jVar.cancel();
            this.f4800z = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        Menu menu;
        a aVar = this.f4788n;
        if (aVar == null || (menu = aVar.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i10, keyEvent, 0);
    }

    @Override // q.k
    public void onWindowVisibilityChanged(int i10) {
        this.f4794t = i10;
    }

    @Override // androidx.appcompat.app.a
    public void removeAllTabs() {
        if (this.f4785k != null) {
            selectTab(null);
        }
        this.f4784j.clear();
        androidx.appcompat.widget.k kVar = this.f4783i;
        if (kVar != null) {
            kVar.removeAllTabs();
        }
        this.f4786l = -1;
    }

    @Override // androidx.appcompat.app.a
    public void removeOnMenuVisibilityListener(androidx.appcompat.app.b bVar) {
        this.f4792r.remove(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void removeTab(a.b bVar) {
        removeTabAt(bVar.getPosition());
    }

    @Override // androidx.appcompat.app.a
    public void removeTabAt(int i10) {
        if (this.f4783i == null) {
            return;
        }
        b bVar = this.f4785k;
        int position = bVar != null ? bVar.getPosition() : this.f4786l;
        this.f4783i.removeTabAt(i10);
        ArrayList arrayList = this.f4784j;
        b bVar2 = (b) arrayList.remove(i10);
        if (bVar2 != null) {
            bVar2.setPosition(-1);
        }
        int size = arrayList.size();
        for (int i11 = i10; i11 < size; i11++) {
            ((b) arrayList.get(i11)).setPosition(i11);
        }
        if (position == i10) {
            selectTab(arrayList.isEmpty() ? null : (a.b) arrayList.get(Math.max(0, i10 - 1)));
        }
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f4780f.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void selectTab(a.b bVar) {
        if (getNavigationMode() != 2) {
            this.f4786l = bVar != null ? bVar.getPosition() : -1;
            return;
        }
        Activity activity = this.f4777c;
        h2 h2VarDisallowAddToBackStack = (!(activity instanceof FragmentActivity) || this.f4780f.getViewGroup().isInEditMode()) ? null : ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        b bVar2 = this.f4785k;
        if (bVar2 != bVar) {
            this.f4783i.setTabSelected(bVar != null ? bVar.getPosition() : -1);
            b bVar3 = this.f4785k;
            if (bVar3 != null) {
                bVar3.getCallback();
                throw null;
            }
            b bVar4 = (b) bVar;
            this.f4785k = bVar4;
            if (bVar4 != null) {
                bVar4.getCallback();
                throw null;
            }
        } else if (bVar2 != null) {
            bVar2.getCallback();
            throw null;
        }
        if (h2VarDisallowAddToBackStack == null || h2VarDisallowAddToBackStack.isEmpty()) {
            return;
        }
        h2VarDisallowAddToBackStack.commit();
    }

    @Override // androidx.appcompat.app.a
    public void setBackgroundDrawable(Drawable drawable) {
        this.f4779e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(int i10) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i10, this.f4780f.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.a
    public void setDefaultDisplayHomeAsUpEnabled(boolean z10) {
        if (this.f4787m) {
            return;
        }
        setDisplayHomeAsUpEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayHomeAsUpEnabled(boolean z10) {
        setDisplayOptions(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i10) {
        if ((i10 & 4) != 0) {
            this.f4787m = true;
        }
        this.f4780f.setDisplayOptions(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowCustomEnabled(boolean z10) {
        setDisplayOptions(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowHomeEnabled(boolean z10) {
        setDisplayOptions(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowTitleEnabled(boolean z10) {
        setDisplayOptions(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayUseLogoEnabled(boolean z10) {
        setDisplayOptions(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void setElevation(float f10) {
        z1.setElevation(this.f4779e, f10);
    }

    @Override // androidx.appcompat.app.a
    public void setHideOffset(int i10) {
        if (i10 != 0 && !this.f4778d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f4778d.setActionBarHideOffset(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 && !this.f4778d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z10;
        this.f4778d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f4780f.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f4780f.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeButtonEnabled(boolean z10) {
        this.f4780f.setHomeButtonEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(int i10) {
        this.f4780f.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar) {
        this.f4780f.setDropdownParams(spinnerAdapter, new z0(cVar));
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(int i10) {
        this.f4780f.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setNavigationMode(int i10) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.f4780f.getNavigationMode();
        if (navigationMode == 2) {
            this.f4786l = getSelectedNavigationIndex();
            selectTab(null);
            this.f4783i.setVisibility(8);
        }
        if (navigationMode != i10 && !this.f4793s && (actionBarOverlayLayout = this.f4778d) != null) {
            z1.requestApplyInsets(actionBarOverlayLayout);
        }
        this.f4780f.setNavigationMode(i10);
        boolean z10 = false;
        if (i10 == 2) {
            b();
            this.f4783i.setVisibility(0);
            int i11 = this.f4786l;
            if (i11 != -1) {
                setSelectedNavigationItem(i11);
                this.f4786l = -1;
            }
        }
        this.f4780f.setCollapsible(i10 == 2 && !this.f4793s);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4778d;
        if (i10 == 2 && !this.f4793s) {
            z10 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    @Override // androidx.appcompat.app.a
    public void setSelectedNavigationItem(int i10) {
        int navigationMode = this.f4780f.getNavigationMode();
        if (navigationMode == 1) {
            this.f4780f.setDropdownSelectedPosition(i10);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab((a.b) this.f4784j.get(i10));
        }
    }

    @Override // androidx.appcompat.app.a
    public void setShowHideAnimationEnabled(boolean z10) {
        o.j jVar;
        this.A = z10;
        if (z10 || (jVar = this.f4800z) == null) {
            return;
        }
        jVar.cancel();
    }

    @Override // androidx.appcompat.app.a
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.f4779e.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(int i10) {
        setSubtitle(this.f4775a.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(int i10) {
        setTitle(this.f4775a.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public void setWindowTitle(CharSequence charSequence) {
        this.f4780f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void show() {
        if (this.f4796v) {
            this.f4796v = false;
            e(false);
        }
    }

    @Override // q.k
    public void showForSystem() {
        if (this.f4797w) {
            this.f4797w = false;
            e(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public o.c startActionMode(o.b bVar) {
        a aVar = this.f4788n;
        if (aVar != null) {
            aVar.finish();
        }
        this.f4778d.setHideOnContentScrollEnabled(false);
        this.f4781g.killMode();
        a aVar2 = new a(this.f4781g.getContext(), bVar);
        if (!aVar2.dispatchOnCreate()) {
            return null;
        }
        this.f4788n = aVar2;
        aVar2.invalidate();
        this.f4781g.initForMode(aVar2);
        animateToMode(true);
        return aVar2;
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, int i10) {
        addTab(bVar, i10, this.f4784j.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(int i10) {
        this.f4780f.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(int i10) {
        this.f4780f.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(Drawable drawable) {
        this.f4780f.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(Drawable drawable) {
        this.f4780f.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(CharSequence charSequence) {
        this.f4780f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(CharSequence charSequence) {
        this.f4780f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, boolean z10) {
        b();
        this.f4783i.addTab(bVar, z10);
        this.f4784j.size();
        ((b) bVar).getCallback();
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i10, int i11) {
        int displayOptions = this.f4780f.getDisplayOptions();
        if ((i11 & 4) != 0) {
            this.f4787m = true;
        }
        this.f4780f.setDisplayOptions((i10 & i11) | ((~i11) & displayOptions));
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view) {
        this.f4780f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view, a.C0002a c0002a) {
        view.setLayoutParams(c0002a);
        this.f4780f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.b bVar, int i10, boolean z10) {
        b();
        this.f4783i.addTab(bVar, i10, z10);
        ((b) bVar).getCallback();
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }

    public m1(Dialog dialog) {
        c(dialog.getWindow().getDecorView());
    }

    @Override // q.k
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.a
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    public m1(View view) {
        c(view);
    }
}
