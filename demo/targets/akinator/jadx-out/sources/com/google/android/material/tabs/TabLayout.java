package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.i;
import e4.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p0.o2;
import qg.j0;
import qg.t0;
import sg.o;
import x3.u0;
import x3.z1;
import y3.c;
import y3.j;
import y3.k;
import yg.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@androidx.viewpager.widget.e
/* loaded from: classes6.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: c0, reason: collision with root package name */
    public static final w3.h f29395c0 = new w3.h(16);
    public final int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public com.google.android.material.tabs.a L;
    public final TimeInterpolator M;
    public com.google.android.material.tabs.b N;
    public final ArrayList O;
    public d P;
    public ValueAnimator Q;
    public ViewPager R;
    public PagerAdapter S;
    public ch.e T;
    public b U;
    public ch.d V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public int f29396a0;

    /* renamed from: b, reason: collision with root package name */
    public int f29397b;

    /* renamed from: b0, reason: collision with root package name */
    public final w3.g f29398b0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f29399c;

    /* renamed from: e, reason: collision with root package name */
    public a f29400e;

    /* renamed from: f, reason: collision with root package name */
    public final ch.g f29401f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29402g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29403h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29404i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29405j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29406k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29407l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29408m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f29409n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f29410o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f29411p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f29412q;

    /* renamed from: r, reason: collision with root package name */
    public int f29413r;

    /* renamed from: s, reason: collision with root package name */
    public final PorterDuff.Mode f29414s;

    /* renamed from: t, reason: collision with root package name */
    public final float f29415t;

    /* renamed from: u, reason: collision with root package name */
    public final float f29416u;

    /* renamed from: v, reason: collision with root package name */
    public final float f29417v;

    /* renamed from: w, reason: collision with root package name */
    public final int f29418w;

    /* renamed from: x, reason: collision with root package name */
    public int f29419x;

    /* renamed from: y, reason: collision with root package name */
    public final int f29420y;

    /* renamed from: z, reason: collision with root package name */
    public final int f29421z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements i {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f29432b;

        /* renamed from: c, reason: collision with root package name */
        public int f29433c;

        /* renamed from: e, reason: collision with root package name */
        public int f29434e;

        public b(TabLayout tabLayout) {
            this.f29432b = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.i
        public void onPageScrollStateChanged(int i10) {
            this.f29433c = this.f29434e;
            this.f29434e = i10;
            TabLayout tabLayout = (TabLayout) this.f29432b.get();
            if (tabLayout != null) {
                tabLayout.f29396a0 = this.f29434e;
            }
        }

        @Override // androidx.viewpager.widget.i
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = (TabLayout) this.f29432b.get();
            if (tabLayout != null) {
                int i12 = this.f29434e;
                boolean z11 = true;
                if (i12 != 2 || this.f29433c == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f29433c == 0) {
                    z10 = false;
                }
                tabLayout.j(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.i
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f29432b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f29434e;
            tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f29433c == 0));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c extends LinearLayout {

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f29435n = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f29436b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f29437c;

        /* renamed from: e, reason: collision with root package name */
        public ImageView f29438e;

        /* renamed from: f, reason: collision with root package name */
        public View f29439f;

        /* renamed from: g, reason: collision with root package name */
        public xf.a f29440g;

        /* renamed from: h, reason: collision with root package name */
        public View f29441h;

        /* renamed from: i, reason: collision with root package name */
        public TextView f29442i;

        /* renamed from: j, reason: collision with root package name */
        public ImageView f29443j;

        /* renamed from: k, reason: collision with root package name */
        public Drawable f29444k;

        /* renamed from: l, reason: collision with root package name */
        public int f29445l;

        public c(Context context) {
            super(context);
            this.f29445l = 2;
            f(context);
            setPaddingRelative(TabLayout.this.f29402g, TabLayout.this.f29403h, TabLayout.this.f29404i, TabLayout.this.f29405j);
            setGravity(17);
            setOrientation(!TabLayout.this.G ? 1 : 0);
            setClickable(true);
            z1.setPointerIcon(this, u0.getSystemIcon(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public xf.a getBadge() {
            return this.f29440g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public xf.a getOrCreateBadge() {
            if (this.f29440g == null) {
                this.f29440g = xf.a.create(getContext());
            }
            d();
            xf.a aVar = this.f29440g;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void c() {
            if (this.f29440g != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f29439f;
                if (view != null) {
                    xf.h.detachBadgeDrawable(this.f29440g, view);
                    this.f29439f = null;
                }
            }
        }

        public final void d() {
            a aVar;
            a aVar2;
            if (this.f29440g != null) {
                if (this.f29441h != null) {
                    c();
                    return;
                }
                if (this.f29438e != null && (aVar2 = this.f29436b) != null && aVar2.getIcon() != null) {
                    View view = this.f29439f;
                    ImageView imageView = this.f29438e;
                    if (view == imageView) {
                        e(imageView);
                        return;
                    }
                    c();
                    ImageView imageView2 = this.f29438e;
                    if (this.f29440g == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    xf.h.attachBadgeDrawable(this.f29440g, imageView2, (FrameLayout) null);
                    this.f29439f = imageView2;
                    return;
                }
                if (this.f29437c == null || (aVar = this.f29436b) == null || aVar.getTabLabelVisibility() != 1) {
                    c();
                    return;
                }
                View view2 = this.f29439f;
                TextView textView = this.f29437c;
                if (view2 == textView) {
                    e(textView);
                    return;
                }
                c();
                TextView textView2 = this.f29437c;
                if (this.f29440g == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                xf.h.attachBadgeDrawable(this.f29440g, textView2, (FrameLayout) null);
                this.f29439f = textView2;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f29444k;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f29444k.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(View view) {
            xf.a aVar = this.f29440g;
            if (aVar == null || view != this.f29439f) {
                return;
            }
            xf.h.setBadgeDrawableBounds(aVar, view, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$c] */
        public final void f(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.f29418w;
            if (i10 != 0) {
                Drawable drawable = l.a.getDrawable(context, i10);
                this.f29444k = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f29444k.setState(getDrawableState());
                }
            } else {
                this.f29444k = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.f29411p != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = vg.b.convertToRippleDrawableColor(tabLayout.f29411p);
                boolean z10 = tabLayout.K;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public final void g() {
            int i10;
            ViewParent parent;
            a aVar = this.f29436b;
            View customView = aVar != null ? aVar.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view = this.f29441h;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f29441h);
                    }
                    addView(customView);
                }
                this.f29441h = customView;
                TextView textView = this.f29437c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f29438e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f29438e.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(R.id.text1);
                this.f29442i = textView2;
                if (textView2 != null) {
                    this.f29445l = textView2.getMaxLines();
                }
                this.f29443j = (ImageView) customView.findViewById(R.id.icon);
            } else {
                View view2 = this.f29441h;
                if (view2 != null) {
                    removeView(view2);
                    this.f29441h = null;
                }
                this.f29442i = null;
                this.f29443j = null;
            }
            if (this.f29441h == null) {
                if (this.f29438e == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.digidust.elokence.akinator.freemium.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f29438e = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f29437c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.digidust.elokence.akinator.freemium.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f29437c = textView3;
                    addView(textView3);
                    this.f29445l = this.f29437c.getMaxLines();
                }
                TextView textView4 = this.f29437c;
                TabLayout tabLayout = TabLayout.this;
                t.setTextAppearance(textView4, tabLayout.f29406k);
                if (!isSelected() || (i10 = tabLayout.f29408m) == -1) {
                    t.setTextAppearance(this.f29437c, tabLayout.f29407l);
                } else {
                    t.setTextAppearance(this.f29437c, i10);
                }
                ColorStateList colorStateList = tabLayout.f29409n;
                if (colorStateList != null) {
                    this.f29437c.setTextColor(colorStateList);
                }
                h(this.f29437c, this.f29438e, true);
                d();
                ImageView imageView3 = this.f29438e;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.d(this, imageView3));
                }
                TextView textView5 = this.f29437c;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.d(this, textView5));
                }
            } else {
                TextView textView6 = this.f29442i;
                if (textView6 != null || this.f29443j != null) {
                    h(textView6, this.f29443j, false);
                }
            }
            if (aVar == null || TextUtils.isEmpty(aVar.f29425d)) {
                return;
            }
            setContentDescription(aVar.f29425d);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f29437c, this.f29438e, this.f29441h};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f29437c, this.f29438e, this.f29441h};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public a getTab() {
            return this.f29436b;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.widget.TextView r9, android.widget.ImageView r10, boolean r11) {
            /*
                r8 = this;
                com.google.android.material.tabs.TabLayout$a r0 = r8.f29436b
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$a r0 = r8.f29436b
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                android.graphics.drawable.Drawable r0 = p3.a.wrap(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                if (r0 == 0) goto L2b
                android.content.res.ColorStateList r3 = r2.f29410o
                r0.setTintList(r3)
                android.graphics.PorterDuff$Mode r3 = r2.f29414s
                if (r3 == 0) goto L2b
                r0.setTintMode(r3)
            L2b:
                com.google.android.material.tabs.TabLayout$a r3 = r8.f29436b
                if (r3 == 0) goto L34
                java.lang.CharSequence r3 = r3.getText()
                goto L35
            L34:
                r3 = r1
            L35:
                r4 = 8
                r5 = 0
                if (r10 == 0) goto L4c
                if (r0 == 0) goto L46
                r10.setImageDrawable(r0)
                r10.setVisibility(r5)
                r8.setVisibility(r5)
                goto L4c
            L46:
                r10.setVisibility(r4)
                r10.setImageDrawable(r1)
            L4c:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r9 == 0) goto L73
                if (r0 != 0) goto L5c
                com.google.android.material.tabs.TabLayout$a r6 = r8.f29436b
                int r6 = r6.f29428g
                r7 = 1
                if (r6 != r7) goto L5c
                goto L5d
            L5c:
                r7 = r5
            L5d:
                if (r0 != 0) goto L61
                r6 = r3
                goto L62
            L61:
                r6 = r1
            L62:
                r9.setText(r6)
                if (r7 == 0) goto L69
                r6 = r5
                goto L6a
            L69:
                r6 = r4
            L6a:
                r9.setVisibility(r6)
                if (r0 != 0) goto L74
                r8.setVisibility(r5)
                goto L74
            L73:
                r7 = r5
            L74:
                if (r11 == 0) goto Lb6
                if (r10 == 0) goto Lb6
                android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
                if (r7 == 0) goto L90
                int r11 = r10.getVisibility()
                if (r11 != 0) goto L90
                android.content.Context r11 = r8.getContext()
                float r11 = qg.t0.dpToPx(r11, r4)
                int r11 = (int) r11
                goto L91
            L90:
                r11 = r5
            L91:
                boolean r2 = r2.G
                if (r2 == 0) goto La7
                int r2 = r9.getMarginEnd()
                if (r11 == r2) goto Lb6
                r9.setMarginEnd(r11)
                r9.bottomMargin = r5
                r10.setLayoutParams(r9)
                r10.requestLayout()
                goto Lb6
            La7:
                int r2 = r9.bottomMargin
                if (r11 == r2) goto Lb6
                r9.bottomMargin = r11
                r9.setMarginEnd(r5)
                r10.setLayoutParams(r9)
                r10.requestLayout()
            Lb6:
                com.google.android.material.tabs.TabLayout$a r9 = r8.f29436b
                if (r9 == 0) goto Lbc
                java.lang.CharSequence r1 = r9.f29425d
            Lbc:
                if (r0 != 0) goto Lbf
                goto Lc0
            Lbf:
                r3 = r1
            Lc0:
                q.y3.setTooltipText(r8, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.c.h(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            y3.c cVarWrap = y3.c.wrap(accessibilityNodeInfo);
            xf.a aVar = this.f29440g;
            if (aVar != null && aVar.isVisible()) {
                cVarWrap.setContentDescription(this.f29440g.getContentDescription());
            }
            cVarWrap.setCollectionItemInfo(k.obtain(0, 1, this.f29436b.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                cVarWrap.setClickable(false);
                cVarWrap.removeAction(c.a.f94039g);
            }
            cVarWrap.setRoleDescription(getResources().getString(com.digidust.elokence.akinator.freemium.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f29419x, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f29437c != null) {
                float f10 = tabLayout.f29415t;
                if (isSelected() && tabLayout.f29408m != -1) {
                    f10 = tabLayout.f29416u;
                }
                int i12 = this.f29445l;
                ImageView imageView = this.f29438e;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f29437c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = tabLayout.f29417v;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f29437c.getTextSize();
                int lineCount = this.f29437c.getLineCount();
                int maxLines = this.f29437c.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (tabLayout.F == 1 && f10 > textSize && lineCount == 1) {
                        Layout layout = this.f29437c.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f29437c.setTextSize(0, f10);
                    this.f29437c.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f29436b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f29436b.select();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f29437c;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f29438e;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f29441h;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(a aVar) {
            if (aVar != this.f29436b) {
                this.f29436b = aVar;
                g();
                a aVar2 = this.f29436b;
                setSelected(aVar2 != null && aVar2.isSelected());
            }
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public static ColorStateList e(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f29399c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar != null && aVar.getIcon() != null && !TextUtils.isEmpty(aVar.getText())) {
                return !this.G ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f29420y;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.F;
        if (i11 == 0 || i11 == 2) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f29401f.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        ch.g gVar = this.f29401f;
        int childCount = gVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = gVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof c) {
                        ((c) childAt).g();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(View view) {
        if (!(view instanceof ch.b)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        ch.b bVar = (ch.b) view;
        a aVarNewTab = newTab();
        CharSequence charSequence = bVar.f12302b;
        if (charSequence != null) {
            aVarNewTab.setText(charSequence);
        }
        Drawable drawable = bVar.f12303c;
        if (drawable != null) {
            aVarNewTab.setIcon(drawable);
        }
        int i10 = bVar.f12304e;
        if (i10 != 0) {
            aVarNewTab.setCustomView(i10);
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            aVarNewTab.setContentDescription(bVar.getContentDescription());
        }
        addTab(aVarNewTab);
    }

    public void addOnTabSelectedListener(com.google.android.material.tabs.c cVar) {
        addOnTabSelectedListener((com.google.android.material.tabs.b) cVar);
    }

    public void addTab(a aVar) {
        addTab(aVar, this.f29399c.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        a(view);
    }

    public final void b(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            ch.g gVar = this.f29401f;
            int childCount = gVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (gVar.getChildAt(i11).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iD = d(0.0f, i10);
            if (scrollX != iD) {
                f();
                this.Q.setIntValues(scrollX, iD);
                this.Q.start();
            }
            ValueAnimator valueAnimator = gVar.f12313b;
            if (valueAnimator != null && valueAnimator.isRunning() && gVar.f12314c.f29397b != i10) {
                gVar.f12313b.cancel();
            }
            gVar.d(i10, this.D, true);
            return;
        }
        setScrollPosition(i10, 0.0f, true);
    }

    public final void c() {
        int i10 = this.F;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.B - this.f29402g) : 0;
        ch.g gVar = this.f29401f;
        gVar.setPaddingRelative(iMax, 0, 0, 0);
        int i11 = this.F;
        if (i11 == 0) {
            int i12 = this.C;
            if (i12 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                gVar.setGravity(1);
            } else if (i12 == 2) {
            }
            gVar.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            if (this.C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            gVar.setGravity(1);
        }
        l(true);
    }

    public void clearOnTabSelectedListeners() {
        this.O.clear();
    }

    public final int d(float f10, int i10) {
        ch.g gVar;
        View childAt;
        int i11 = this.F;
        if ((i11 != 0 && i11 != 2) || (childAt = (gVar = this.f29401f).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < gVar.getChildCount() ? gVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void f() {
        if (this.Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Q = valueAnimator;
            valueAnimator.setInterpolator(this.M);
            this.Q.setDuration(this.D);
            this.Q.addUpdateListener(new ch.c(this));
        }
    }

    public final void g() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.S;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                addTab(newTab().setText(this.S.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.R;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public int getSelectedTabPosition() {
        a aVar = this.f29400e;
        if (aVar != null) {
            return aVar.getPosition();
        }
        return -1;
    }

    public a getTabAt(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (a) this.f29399c.get(i10);
    }

    public int getTabCount() {
        return this.f29399c.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    public ColorStateList getTabIconTint() {
        return this.f29410o;
    }

    public int getTabIndicatorAnimationMode() {
        return this.J;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    public int getTabMaxWidth() {
        return this.f29419x;
    }

    public int getTabMode() {
        return this.F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f29411p;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f29412q;
    }

    public ColorStateList getTabTextColors() {
        return this.f29409n;
    }

    public final void h(int i10) {
        ch.g gVar = this.f29401f;
        c cVar = (c) gVar.getChildAt(i10);
        gVar.removeViewAt(i10);
        if (cVar != null) {
            cVar.setTab(null);
            cVar.setSelected(false);
            this.f29398b0.release(cVar);
        }
        requestLayout();
    }

    public boolean hasUnboundedRipple() {
        return this.K;
    }

    public final void i(PagerAdapter pagerAdapter, boolean z10) {
        ch.e eVar;
        PagerAdapter pagerAdapter2 = this.S;
        if (pagerAdapter2 != null && (eVar = this.T) != null) {
            pagerAdapter2.unregisterDataSetObserver(eVar);
        }
        this.S = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.T == null) {
                this.T = new ch.e(this);
            }
            pagerAdapter.registerDataSetObserver(this.T);
        }
        g();
    }

    public boolean isInlineLabel() {
        return this.G;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.H;
    }

    public final void j(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            ch.g gVar = this.f29401f;
            if (iRound >= gVar.getChildCount()) {
                return;
            }
            if (z11) {
                gVar.f12314c.f29397b = Math.round(f11);
                ValueAnimator valueAnimator = gVar.f12313b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    gVar.f12313b.cancel();
                }
                gVar.c(gVar.getChildAt(i10), gVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            int iD = d(f10, i10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iD >= scrollX) || (i10 > getSelectedTabPosition() && iD <= scrollX) || i10 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z13 = (i10 < getSelectedTabPosition() && iD <= scrollX) || (i10 > getSelectedTabPosition() && iD >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.f29396a0 == 1 || z12) {
                if (i10 < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void k(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.R;
        if (viewPager2 != null) {
            b bVar = this.U;
            if (bVar != null) {
                viewPager2.removeOnPageChangeListener(bVar);
            }
            ch.d dVar = this.V;
            if (dVar != null) {
                this.R.removeOnAdapterChangeListener(dVar);
            }
        }
        com.google.android.material.tabs.b bVar2 = this.P;
        if (bVar2 != null) {
            removeOnTabSelectedListener(bVar2);
            this.P = null;
        }
        if (viewPager != null) {
            this.R = viewPager;
            if (this.U == null) {
                this.U = new b(this);
            }
            b bVar3 = this.U;
            bVar3.f29434e = 0;
            bVar3.f29433c = 0;
            viewPager.addOnPageChangeListener(bVar3);
            d dVar2 = new d(viewPager);
            this.P = dVar2;
            addOnTabSelectedListener((com.google.android.material.tabs.b) dVar2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                i(adapter, z10);
            }
            if (this.V == null) {
                this.V = new ch.d(this);
            }
            ch.d dVar3 = this.V;
            dVar3.f12306a = z10;
            viewPager.addOnAdapterChangeListener(dVar3);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.R = null;
            i(null, false);
        }
        this.W = z11;
    }

    public final void l(boolean z10) {
        int i10 = 0;
        while (true) {
            ch.g gVar = this.f29401f;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    public a newTab() {
        a aVar = (a) f29395c0.acquire();
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f29429h = this;
        w3.g gVar = this.f29398b0;
        c cVar = gVar != null ? (c) gVar.acquire() : null;
        if (cVar == null) {
            cVar = new c(getContext());
        }
        cVar.setTab(aVar);
        cVar.setFocusable(true);
        cVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(aVar.f29425d)) {
            cVar.setContentDescription(aVar.f29424c);
        } else {
            cVar.setContentDescription(aVar.f29425d);
        }
        aVar.f29430i = cVar;
        int i10 = aVar.f29431j;
        if (i10 != -1) {
            cVar.setId(i10);
        }
        return aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this);
        if (this.R == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                k((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            setupWithViewPager(null);
            this.W = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        c cVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            ch.g gVar = this.f29401f;
            if (i10 >= gVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if ((childAt instanceof c) && (drawable = (cVar = (c) childAt).f29444k) != null) {
                drawable.setBounds(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
                cVar.f29444k.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y3.c.wrap(accessibilityNodeInfo).setCollectionInfo(j.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = qg.t0.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f29421z
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = qg.t0.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f29419x = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.F
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void removeAllTabs() {
        for (int childCount = this.f29401f.getChildCount() - 1; childCount >= 0; childCount--) {
            h(childCount);
        }
        Iterator it = this.f29399c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            it.remove();
            aVar.f29429h = null;
            aVar.f29430i = null;
            aVar.f29422a = null;
            aVar.f29423b = null;
            aVar.f29431j = -1;
            aVar.f29424c = null;
            aVar.f29425d = null;
            aVar.f29426e = -1;
            aVar.f29427f = null;
            f29395c0.release(aVar);
        }
        this.f29400e = null;
    }

    public void removeOnTabSelectedListener(com.google.android.material.tabs.c cVar) {
        removeOnTabSelectedListener((com.google.android.material.tabs.b) cVar);
    }

    public void removeTab(a aVar) {
        if (aVar.f29429h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(aVar.getPosition());
    }

    public void removeTabAt(int i10) {
        a aVar = this.f29400e;
        int position = aVar != null ? aVar.getPosition() : 0;
        h(i10);
        ArrayList arrayList = this.f29399c;
        a aVar2 = (a) arrayList.remove(i10);
        int i11 = -1;
        if (aVar2 != null) {
            aVar2.f29429h = null;
            aVar2.f29430i = null;
            aVar2.f29422a = null;
            aVar2.f29423b = null;
            aVar2.f29431j = -1;
            aVar2.f29424c = null;
            aVar2.f29425d = null;
            aVar2.f29426e = -1;
            aVar2.f29427f = null;
            f29395c0.release(aVar2);
        }
        int size = arrayList.size();
        for (int i12 = i10; i12 < size; i12++) {
            if (((a) arrayList.get(i12)).getPosition() == this.f29397b) {
                i11 = i12;
            }
            ((a) arrayList.get(i12)).f29426e = i12;
        }
        this.f29397b = i11;
        if (position == i10) {
            selectTab(arrayList.isEmpty() ? null : (a) arrayList.get(Math.max(0, i10 - 1)));
        }
    }

    public void selectTab(a aVar) {
        selectTab(aVar, true);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m.setElevation(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        int i10 = 0;
        while (true) {
            ch.g gVar = this.f29401f;
            if (i10 >= gVar.getChildCount()) {
                c();
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof c) {
                c cVar = (c) childAt;
                cVar.setOrientation(!TabLayout.this.G ? 1 : 0);
                TextView textView = cVar.f29442i;
                if (textView == null && cVar.f29443j == null) {
                    cVar.h(cVar.f29437c, cVar.f29438e, true);
                } else {
                    cVar.h(textView, cVar.f29443j, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.c cVar) {
        setOnTabSelectedListener((com.google.android.material.tabs.b) cVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.Q.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        setScrollPosition(i10, f10, z10, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = p3.a.wrap(drawable).mutate();
        this.f29412q = drawableMutate;
        mg.c.setTint(drawableMutate, this.f29413r);
        int intrinsicHeight = this.I;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f29412q.getIntrinsicHeight();
        }
        this.f29401f.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f29413r = i10;
        mg.c.setTint(this.f29412q, i10);
        l(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.E != i10) {
            this.E = i10;
            this.f29401f.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.I = i10;
        this.f29401f.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.C != i10) {
            this.C = i10;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f29410o != colorStateList) {
            this.f29410o = colorStateList;
            ArrayList arrayList = this.f29399c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) arrayList.get(i10)).a();
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(l.a.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.J = i10;
        if (i10 == 0) {
            this.L = new com.google.android.material.tabs.a();
        } else if (i10 == 1) {
            this.L = new ch.a(0);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(o2.j(i10, " is not a valid TabIndicatorAnimationMode"));
            }
            this.L = new ch.a(1);
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.H = z10;
        int i10 = ch.g.f12312e;
        ch.g gVar = this.f29401f;
        gVar.a(gVar.f12314c.getSelectedTabPosition());
        gVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.F) {
            this.F = i10;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f29411p == colorStateList) {
            return;
        }
        this.f29411p = colorStateList;
        int i10 = 0;
        while (true) {
            ch.g gVar = this.f29401f;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof c) {
                Context context = getContext();
                int i11 = c.f29435n;
                ((c) childAt).f(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(l.a.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f29409n != colorStateList) {
            this.f29409n = colorStateList;
            ArrayList arrayList = this.f29399c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) arrayList.get(i10)).a();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        i(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.K == z10) {
            return;
        }
        this.K = z10;
        int i10 = 0;
        while (true) {
            ch.g gVar = this.f29401f;
            if (i10 >= gVar.getChildCount()) {
                return;
            }
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof c) {
                Context context = getContext();
                int i11 = c.f29435n;
                ((c) childAt).f(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f29422a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f29423b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f29424c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f29425d;

        /* renamed from: f, reason: collision with root package name */
        public View f29427f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f29429h;

        /* renamed from: i, reason: collision with root package name */
        public c f29430i;

        /* renamed from: e, reason: collision with root package name */
        public int f29426e = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f29428g = 1;

        /* renamed from: j, reason: collision with root package name */
        public int f29431j = -1;

        public final void a() {
            c cVar = this.f29430i;
            if (cVar != null) {
                cVar.g();
                a aVar = cVar.f29436b;
                cVar.setSelected(aVar != null && aVar.isSelected());
            }
        }

        public xf.a getBadge() {
            return this.f29430i.getBadge();
        }

        public CharSequence getContentDescription() {
            c cVar = this.f29430i;
            if (cVar == null) {
                return null;
            }
            return cVar.getContentDescription();
        }

        public View getCustomView() {
            return this.f29427f;
        }

        public Drawable getIcon() {
            return this.f29423b;
        }

        public int getId() {
            return this.f29431j;
        }

        public xf.a getOrCreateBadge() {
            return this.f29430i.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f29426e;
        }

        public int getTabLabelVisibility() {
            return this.f29428g;
        }

        public Object getTag() {
            return this.f29422a;
        }

        public CharSequence getText() {
            return this.f29424c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.f29429h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f29426e;
        }

        public void removeBadge() {
            c cVar = this.f29430i;
            if (cVar.f29439f != null) {
                cVar.c();
            }
            cVar.f29440g = null;
        }

        public void select() {
            TabLayout tabLayout = this.f29429h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        public a setContentDescription(int i10) {
            TabLayout tabLayout = this.f29429h;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public a setCustomView(View view) {
            this.f29427f = view;
            a();
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.f29423b = drawable;
            TabLayout tabLayout = this.f29429h;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                tabLayout.l(true);
            }
            a();
            return this;
        }

        public a setId(int i10) {
            this.f29431j = i10;
            c cVar = this.f29430i;
            if (cVar != null) {
                cVar.setId(i10);
            }
            return this;
        }

        public a setTabLabelVisibility(int i10) {
            this.f29428g = i10;
            TabLayout tabLayout = this.f29429h;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                tabLayout.l(true);
            }
            a();
            return this;
        }

        public a setTag(Object obj) {
            this.f29422a = obj;
            return this;
        }

        public a setText(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f29425d) && !TextUtils.isEmpty(charSequence)) {
                this.f29430i.setContentDescription(charSequence);
            }
            this.f29424c = charSequence;
            a();
            return this;
        }

        public a setCustomView(int i10) {
            return setCustomView(LayoutInflater.from(this.f29430i.getContext()).inflate(i10, (ViewGroup) this.f29430i, false));
        }

        public a setContentDescription(CharSequence charSequence) {
            this.f29425d = charSequence;
            a();
            return this;
        }

        public a setIcon(int i10) {
            TabLayout tabLayout = this.f29429h;
            if (tabLayout != null) {
                return setIcon(l.a.getDrawable(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public a setText(int i10) {
            TabLayout tabLayout = this.f29429h;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(com.google.android.material.tabs.b bVar) {
        ArrayList arrayList = this.O;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public void addTab(a aVar, int i10) {
        addTab(aVar, i10, this.f29399c.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        a(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(com.google.android.material.tabs.b bVar) {
        this.O.remove(bVar);
    }

    public void selectTab(a aVar, boolean z10) {
        a aVar2 = this.f29400e;
        ArrayList arrayList = this.O;
        if (aVar2 == aVar) {
            if (aVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((com.google.android.material.tabs.b) arrayList.get(size)).onTabReselected(aVar);
                }
                b(aVar.getPosition());
                return;
            }
            return;
        }
        int position = aVar != null ? aVar.getPosition() : -1;
        if (z10) {
            if ((aVar2 == null || aVar2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                b(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f29400e = aVar;
        if (aVar2 != null && aVar2.f29429h != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((com.google.android.material.tabs.b) arrayList.get(size2)).onTabUnselected(aVar2);
            }
        }
        if (aVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((com.google.android.material.tabs.b) arrayList.get(size3)).onTabSelected(aVar);
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.b bVar) {
        com.google.android.material.tabs.b bVar2 = this.N;
        if (bVar2 != null) {
            removeOnTabSelectedListener(bVar2);
        }
        this.N = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        j(i10, f10, z10, z11, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z10) {
        k(viewPager, z10, false);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(fh.a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_Design_TabLayout), attributeSet, i10);
        this.f29397b = -1;
        this.f29399c = new ArrayList();
        this.f29408m = -1;
        this.f29413r = 0;
        this.f29419x = Integer.MAX_VALUE;
        this.I = -1;
        this.O = new ArrayList();
        this.f29398b0 = new w3.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        ch.g gVar = new ch.g(this, context2);
        this.f29401f = gVar;
        super.addView(gVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.P, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListOrNull = mg.c.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            yg.j jVar = new yg.j();
            jVar.setFillColor(colorStateListOrNull);
            jVar.initializeElevationOverlay(context2);
            jVar.setElevation(getElevation());
            setBackground(jVar);
        }
        setSelectedTabIndicator(ug.d.getDrawable(context2, typedArrayObtainStyledAttributes, 5));
        setSelectedTabIndicatorColor(typedArrayObtainStyledAttributes.getColor(8, 0));
        gVar.b(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayObtainStyledAttributes.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(9, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f29405j = dimensionPixelSize;
        this.f29404i = dimensionPixelSize;
        this.f29403h = dimensionPixelSize;
        this.f29402g = dimensionPixelSize;
        this.f29402g = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.f29403h = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize);
        this.f29404i = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.f29405j = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        if (j0.isMaterial3Theme(context2)) {
            this.f29406k = com.digidust.elokence.akinator.freemium.R.attr.textAppearanceTitleSmall;
        } else {
            this.f29406k = com.digidust.elokence.akinator.freemium.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(24, com.digidust.elokence.akinator.freemium.R.style.TextAppearance_Design_Tab);
        this.f29407l = resourceId;
        int[] iArr = k.a.f70001y;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f29415t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f29409n = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes2, 3);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(22)) {
                this.f29408m = typedArrayObtainStyledAttributes.getResourceId(22, resourceId);
            }
            int i11 = this.f29408m;
            if (i11 != -1) {
                typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i11, iArr);
                try {
                    this.f29416u = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) r6);
                    ColorStateList colorStateList = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateList != null) {
                        this.f29409n = e(this.f29409n.getDefaultColor(), colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(25)) {
                this.f29409n = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 25);
            }
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                this.f29409n = e(this.f29409n.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(23, 0));
            }
            this.f29410o = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 3);
            this.f29414s = t0.parseTintMode(typedArrayObtainStyledAttributes.getInt(4, -1), null);
            this.f29411p = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 21);
            this.D = typedArrayObtainStyledAttributes.getInt(6, 300);
            this.M = o.resolveThemeInterpolator(context2, com.digidust.elokence.akinator.freemium.R.attr.motionEasingEmphasizedInterpolator, vf.a.f89241b);
            this.f29420y = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.f29421z = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f29418w = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.F = typedArrayObtainStyledAttributes.getInt(15, 1);
            this.C = typedArrayObtainStyledAttributes.getInt(2, 0);
            this.G = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.K = typedArrayObtainStyledAttributes.getBoolean(26, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f29417v = resources.getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.design_tab_text_size_2line);
            this.A = resources.getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.design_tab_scrollable_min_width);
            c();
        } finally {
        }
    }

    public void addTab(a aVar, boolean z10) {
        addTab(aVar, this.f29399c.size(), z10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void addTab(a aVar, int i10, boolean z10) {
        if (aVar.f29429h == this) {
            aVar.f29426e = i10;
            ArrayList arrayList = this.f29399c;
            arrayList.add(i10, aVar);
            int size = arrayList.size();
            int i11 = -1;
            for (int i12 = i10 + 1; i12 < size; i12++) {
                if (((a) arrayList.get(i12)).getPosition() == this.f29397b) {
                    i11 = i12;
                }
                ((a) arrayList.get(i12)).f29426e = i12;
            }
            this.f29397b = i11;
            c cVar = aVar.f29430i;
            cVar.setSelected(false);
            cVar.setActivated(false);
            int position = aVar.getPosition();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f29401f.addView(cVar, position, layoutParams);
            if (z10) {
                aVar.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(e(i10, i11));
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(l.a.getDrawable(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d implements com.google.android.material.tabs.c {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f29447a;

        public d(ViewPager viewPager) {
            this.f29447a = viewPager;
        }

        @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
        public void onTabSelected(a aVar) {
            this.f29447a.setCurrentItem(aVar.getPosition());
        }

        @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
        public void onTabReselected(a aVar) {
        }

        @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
        public void onTabUnselected(a aVar) {
        }
    }
}
