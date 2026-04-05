package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4932b;

    /* renamed from: c, reason: collision with root package name */
    public k f4933c;

    /* renamed from: e, reason: collision with root package name */
    public View f4934e;

    /* renamed from: f, reason: collision with root package name */
    public View f4935f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4936g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4937h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f4938i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4939j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4940k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4941l;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4936g;
        if (drawable != null && drawable.isStateful()) {
            this.f4936g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4937h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4937h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4938i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4938i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4933c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4936g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4937h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4938i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4934e = findViewById(R.id.action_bar);
        this.f4935f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4932b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            androidx.appcompat.widget.k r8 = r6.f4933c
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f4939j
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f4938i
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f4936g
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f4934e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f4936g
            android.view.View r9 = r6.f4934e
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f4934e
            int r10 = r10.getTop()
            android.view.View r1 = r6.f4934e
            int r1 = r1.getRight()
            android.view.View r3 = r6.f4934e
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f4935f
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f4936g
            android.view.View r9 = r6.f4935f
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f4935f
            int r10 = r10.getTop()
            android.view.View r1 = r6.f4935f
            int r1 = r1.getRight()
            android.view.View r3 = r6.f4935f
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f4936g
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f4940k = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f4937h
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f4934e == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f4941l) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f4934e == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        k kVar = this.f4933c;
        if (kVar == null || kVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f4934e;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f4935f;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f4935f);
        } else {
            iA = a(this.f4934e);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f4933c) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4936g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4936g);
        }
        this.f4936g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4934e;
            if (view != null) {
                this.f4936g.setBounds(view.getLeft(), this.f4934e.getTop(), this.f4934e.getRight(), this.f4934e.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f4939j ? !(this.f4936g != null || this.f4937h != null) : this.f4938i == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        q.f.invalidateOutline(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4938i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4938i);
        }
        this.f4938i = drawable;
        boolean z10 = this.f4939j;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f4938i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f4936g != null || this.f4937h != null) : this.f4938i == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        q.f.invalidateOutline(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4937h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4937h);
        }
        this.f4937h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4940k && (drawable2 = this.f4937h) != null) {
                drawable2.setBounds(this.f4933c.getLeft(), this.f4933c.getTop(), this.f4933c.getRight(), this.f4933c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f4939j ? !(this.f4936g != null || this.f4937h != null) : this.f4938i == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        q.f.invalidateOutline(this);
    }

    public void setTabContainer(k kVar) {
        k kVar2 = this.f4933c;
        if (kVar2 != null) {
            removeView(kVar2);
        }
        this.f4933c = kVar;
        if (kVar != null) {
            addView(kVar);
            ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            kVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f4932b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f4936g;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f4937h;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f4938i;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4936g;
        boolean z10 = this.f4939j;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f4937h && this.f4940k) {
            return true;
        }
        return (drawable == this.f4938i && z10) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new q.e(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f69977a);
        boolean z10 = false;
        this.f4936g = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4937h = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f4941l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4939j = true;
            this.f4938i = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4939j ? !(this.f4936g != null || this.f4937h != null) : this.f4938i == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
