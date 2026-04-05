package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import pg.f;
import pg.g;
import pg.j;
import pg.k;
import pg.l;
import pg.m;
import qg.i;
import qg.j0;
import vf.h;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements androidx.coordinatorlayout.widget.a {

    /* renamed from: d0, reason: collision with root package name */
    public static final j f29243d0 = new j(Float.class, "width");

    /* renamed from: e0, reason: collision with root package name */
    public static final k f29244e0 = new k(Float.class, "height");

    /* renamed from: f0, reason: collision with root package name */
    public static final l f29245f0 = new l(Float.class, "paddingStart");

    /* renamed from: g0, reason: collision with root package name */
    public static final m f29246g0 = new m(Float.class, "paddingEnd");
    public int K;
    public boolean L;
    public final com.google.android.material.floatingactionbutton.b M;
    public final com.google.android.material.floatingactionbutton.b N;
    public final c O;
    public final a P;
    public final int Q;
    public int R;
    public int S;
    public final ExtendedFloatingActionButtonBehavior T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f29247a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f29248b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f29249c0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.a {

        /* renamed from: b, reason: collision with root package name */
        public Rect f29250b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f29251c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f29252e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f29251c = false;
            this.f29252e = true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f29251c && !this.f29252e) || bVar.getAnchorId() != appBarLayout.getId()) {
                return false;
            }
            if (this.f29250b == null) {
                this.f29250b = new Rect();
            }
            Rect rect = this.f29250b;
            i.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i10 = this.f29252e ? 2 : 1;
                j jVar = ExtendedFloatingActionButton.f29243d0;
                extendedFloatingActionButton.j(i10, null);
            } else {
                int i11 = this.f29252e ? 3 : 0;
                j jVar2 = ExtendedFloatingActionButton.f29243d0;
                extendedFloatingActionButton.j(i11, null);
            }
            return true;
        }

        public final boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f29251c && !this.f29252e) || bVar.getAnchorId() != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.b) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i10 = this.f29252e ? 2 : 1;
                j jVar = ExtendedFloatingActionButton.f29243d0;
                extendedFloatingActionButton.j(i10, null);
            } else {
                int i11 = this.f29252e ? 3 : 0;
                j jVar2 = ExtendedFloatingActionButton.f29243d0;
                extendedFloatingActionButton.j(i11, null);
            }
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.f29251c;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f29252e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
            if (bVar.f5614h == 0) {
                bVar.f5614h = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f29251c = z10;
        }

        public void setAutoShrinkEnabled(boolean z10) {
            this.f29252e = z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (View) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.b ? ((CoordinatorLayout.b) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    b(view, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = dependencies.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.b ? ((CoordinatorLayout.b) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i10);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88464l);
            this.f29251c = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f29252e = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends pg.c {

        /* renamed from: g, reason: collision with root package name */
        public boolean f29253g;

        public a(pg.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.f29253g = true;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.K = 0;
            if (this.f29253g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f29253g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.K = 1;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onChange(b bVar) {
            if (bVar != null) {
                bVar.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public boolean shouldCancel() {
            j jVar = ExtendedFloatingActionButton.f29243d0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.K != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.K == 2) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends pg.c {
        public c(pg.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.K = 0;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.K = 2;
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void onChange(b bVar) {
            if (bVar != null) {
                bVar.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public void performNow() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // pg.c, com.google.android.material.floatingactionbutton.d
        public boolean shouldCancel() {
            j jVar = ExtendedFloatingActionButton.f29243d0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.K != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.K == 1) {
                return false;
            }
            return true;
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.N.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.P.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.O.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.M.addAnimationListener(animatorListener);
    }

    public void extend() {
        j(3, null);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return this.T;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.Q;
        if (i10 >= 0) {
            return i10;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public h getExtendMotionSpec() {
        return this.N.getMotionSpec();
    }

    public h getHideMotionSpec() {
        return this.P.getMotionSpec();
    }

    public h getShowMotionSpec() {
        return this.O.getMotionSpec();
    }

    public h getShrinkMotionSpec() {
        return this.M.getMotionSpec();
    }

    public void hide() {
        j(1, null);
    }

    public boolean isAnimationEnabled() {
        return this.L;
    }

    public final boolean isExtended() {
        return this.U;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r5, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2
            if (r5 == 0) goto L20
            if (r5 == r0) goto L1d
            if (r5 == r1) goto L1a
            r2 = 3
            if (r5 != r2) goto Le
            com.google.android.material.floatingactionbutton.b r2 = r4.N
            goto L22
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r5 = a.b.e(r5, r0)
            r6.<init>(r5)
            throw r6
        L1a:
            com.google.android.material.floatingactionbutton.b r2 = r4.M
            goto L22
        L1d:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r2 = r4.P
            goto L22
        L20:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c r2 = r4.O
        L22:
            boolean r3 = r2.shouldCancel()
            if (r3 == 0) goto L29
            return
        L29:
            boolean r3 = r4.L
            if (r3 == 0) goto L96
            boolean r3 = r4.isLaidOut()
            if (r3 != 0) goto L47
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L3e
            int r0 = r4.K
            if (r0 != r1) goto L43
            goto L96
        L3e:
            int r3 = r4.K
            if (r3 == r0) goto L43
            goto L96
        L43:
            boolean r0 = r4.W
            if (r0 == 0) goto L96
        L47:
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L96
            if (r5 != r1) goto L6a
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            if (r5 == 0) goto L5e
            int r0 = r5.width
            r4.f29248b0 = r0
            int r5 = r5.height
            r4.f29249c0 = r5
            goto L6a
        L5e:
            int r5 = r4.getWidth()
            r4.f29248b0 = r5
            int r5 = r4.getHeight()
            r4.f29249c0 = r5
        L6a:
            r5 = 0
            r4.measure(r5, r5)
            android.animation.AnimatorSet r5 = r2.createAnimator()
            com.google.android.material.floatingactionbutton.a r0 = new com.google.android.material.floatingactionbutton.a
            r0.<init>(r2, r6)
            r5.addListener(r0)
            java.util.List r6 = r2.getListeners()
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r6.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r5.addListener(r0)
            goto L82
        L92:
            r5.start()
            return
        L96:
            r2.performNow()
            r2.onChange(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j(int, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b):void");
    }

    public final void k(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.U = false;
            this.M.performNow();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.N.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.P.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.O.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.M.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.W = z10;
    }

    public void setAnimationEnabled(boolean z10) {
        this.L = z10;
    }

    public void setExtendMotionSpec(h hVar) {
        this.N.setMotionSpec(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.createFromResource(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.U == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z10 ? this.N : this.M;
        if (bVar.shouldCancel()) {
            return;
        }
        bVar.performNow();
    }

    public void setHideMotionSpec(h hVar) {
        this.P.setMotionSpec(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.U || this.V) {
            return;
        }
        this.R = getPaddingStart();
        this.S = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.U || this.V) {
            return;
        }
        this.R = i10;
        this.S = i12;
    }

    public void setShowMotionSpec(h hVar) {
        this.O.setMotionSpec(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.createFromResource(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.M.setMotionSpec(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f29247a0 = getTextColors();
    }

    public void show() {
        j(0, null);
    }

    public void shrink() {
        j(2, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(b bVar) {
        j(3, bVar);
    }

    public void hide(b bVar) {
        j(1, bVar);
    }

    public void show(b bVar) {
        j(0, bVar);
    }

    public void shrink(b bVar) {
        j(2, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [pg.i] */
    /* JADX WARN: Type inference failed for: r9v1, types: [pg.h] */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i10);
        this.K = 0;
        this.L = true;
        pg.a aVar = new pg.a();
        c cVar = new c(aVar);
        this.O = cVar;
        a aVar2 = new a(aVar);
        this.P = aVar2;
        this.U = true;
        this.V = false;
        this.W = false;
        Context context2 = getContext();
        this.T = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88463k, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        h hVarCreateFromAttribute = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 5);
        h hVarCreateFromAttribute2 = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 4);
        h hVarCreateFromAttribute3 = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 2);
        h hVarCreateFromAttribute4 = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 6);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
        this.R = getPaddingStart();
        this.S = getPaddingEnd();
        pg.a aVar3 = new pg.a();
        g gVar = new g(this);
        ?? hVar = new pg.h(this, gVar);
        ?? iVar = new pg.i(this, hVar, gVar);
        boolean z10 = true;
        if (i11 != 1) {
            gVar = i11 != 2 ? iVar : hVar;
            z10 = true;
        }
        com.google.android.material.floatingactionbutton.b bVar = new com.google.android.material.floatingactionbutton.b(this, aVar3, gVar, z10);
        this.N = bVar;
        com.google.android.material.floatingactionbutton.b bVar2 = new com.google.android.material.floatingactionbutton.b(this, aVar3, new f(this), false);
        this.M = bVar2;
        cVar.setMotionSpec(hVarCreateFromAttribute);
        aVar2.setMotionSpec(hVarCreateFromAttribute2);
        bVar.setMotionSpec(hVarCreateFromAttribute3);
        bVar2.setMotionSpec(hVarCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(p.builder(context2, attributeSet, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, p.f94477m).build());
        this.f29247a0 = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f29247a0 = getTextColors();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
