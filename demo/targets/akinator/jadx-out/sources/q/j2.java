package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j2 implements p.e0 {
    public static final Method I;
    public static final Method J;
    public final g2 A;
    public final e2 B;
    public a2 C;
    public final Handler D;
    public final Rect E;
    public Rect F;
    public boolean G;
    public final c0 H;

    /* renamed from: b, reason: collision with root package name */
    public final Context f82137b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f82138c;

    /* renamed from: e, reason: collision with root package name */
    public s1 f82139e;

    /* renamed from: f, reason: collision with root package name */
    public int f82140f;

    /* renamed from: g, reason: collision with root package name */
    public int f82141g;

    /* renamed from: h, reason: collision with root package name */
    public int f82142h;

    /* renamed from: i, reason: collision with root package name */
    public int f82143i;

    /* renamed from: j, reason: collision with root package name */
    public int f82144j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f82145k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f82146l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f82147m;

    /* renamed from: n, reason: collision with root package name */
    public int f82148n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f82149o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f82150p;

    /* renamed from: q, reason: collision with root package name */
    public final int f82151q;

    /* renamed from: r, reason: collision with root package name */
    public View f82152r;

    /* renamed from: s, reason: collision with root package name */
    public int f82153s;

    /* renamed from: t, reason: collision with root package name */
    public f2 f82154t;

    /* renamed from: u, reason: collision with root package name */
    public View f82155u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f82156v;

    /* renamed from: w, reason: collision with root package name */
    public AdapterView.OnItemClickListener f82157w;

    /* renamed from: x, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f82158x;

    /* renamed from: y, reason: collision with root package name */
    public final i2 f82159y;

    /* renamed from: z, reason: collision with root package name */
    public final h2 f82160z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public j2(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public s1 a(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public void clearListSelection() {
        s1 s1Var = this.f82139e;
        if (s1Var != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new z1(this, view);
    }

    @Override // p.e0
    public void dismiss() {
        c0 c0Var = this.H;
        c0Var.dismiss();
        View view = this.f82152r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f82152r);
            }
        }
        c0Var.setContentView(null);
        this.f82139e = null;
        this.D.removeCallbacks(this.f82159y);
    }

    public View getAnchorView() {
        return this.f82155u;
    }

    public int getAnimationStyle() {
        return this.H.getAnimationStyle();
    }

    public Drawable getBackground() {
        return this.H.getBackground();
    }

    public Rect getEpicenterBounds() {
        if (this.F != null) {
            return new Rect(this.F);
        }
        return null;
    }

    public int getHeight() {
        return this.f82140f;
    }

    public int getHorizontalOffset() {
        return this.f82142h;
    }

    public int getInputMethodMode() {
        return this.H.getInputMethodMode();
    }

    @Override // p.e0
    public ListView getListView() {
        return this.f82139e;
    }

    public int getPromptPosition() {
        return this.f82153s;
    }

    public Object getSelectedItem() {
        if (isShowing()) {
            return this.f82139e.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.f82139e.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.f82139e.getSelectedItemPosition();
        }
        return -1;
    }

    public View getSelectedView() {
        if (isShowing()) {
            return this.f82139e.getSelectedView();
        }
        return null;
    }

    public int getSoftInputMode() {
        return this.H.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (this.f82145k) {
            return this.f82143i;
        }
        return 0;
    }

    public int getWidth() {
        return this.f82141g;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.f82149o;
    }

    public boolean isInputMethodNotNeeded() {
        return this.H.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.G;
    }

    @Override // p.e0
    public boolean isShowing() {
        return this.H.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r12.isShowing()
            r1 = 0
            if (r0 == 0) goto L9e
            r0 = 62
            if (r13 == r0) goto L9e
            q.s1 r0 = r12.f82139e
            int r0 = r0.getSelectedItemPosition()
            r2 = 23
            r3 = 66
            if (r0 >= 0) goto L1c
            if (r13 == r3) goto L1b
            if (r13 != r2) goto L1c
        L1b:
            return r1
        L1c:
            q.s1 r0 = r12.f82139e
            int r0 = r0.getSelectedItemPosition()
            q.c0 r4 = r12.H
            boolean r5 = r4.isAboveAnchor()
            android.widget.ListAdapter r6 = r12.f82138c
            r7 = 1
            if (r6 == 0) goto L4f
            boolean r8 = r6.areAllItemsEnabled()
            if (r8 == 0) goto L35
            r9 = r1
            goto L3b
        L35:
            q.s1 r9 = r12.f82139e
            int r9 = r9.lookForSelectablePosition(r1, r7)
        L3b:
            if (r8 == 0) goto L43
            int r6 = r6.getCount()
            int r6 = r6 - r7
            goto L54
        L43:
            q.s1 r8 = r12.f82139e
            int r6 = r6.getCount()
            int r6 = r6 - r7
            int r6 = r8.lookForSelectablePosition(r6, r1)
            goto L54
        L4f:
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L54:
            r8 = 19
            if (r5 != 0) goto L5c
            if (r13 != r8) goto L5c
            if (r0 <= r9) goto L64
        L5c:
            r10 = 20
            if (r5 == 0) goto L6e
            if (r13 != r10) goto L6e
            if (r0 < r6) goto L6e
        L64:
            r12.clearListSelection()
            r4.setInputMethodMode(r7)
            r12.show()
            return r7
        L6e:
            q.s1 r11 = r12.f82139e
            r11.setListSelectionHidden(r1)
            q.s1 r11 = r12.f82139e
            boolean r14 = r11.onKeyDown(r13, r14)
            if (r14 == 0) goto L90
            r14 = 2
            r4.setInputMethodMode(r14)
            q.s1 r14 = r12.f82139e
            r14.requestFocusFromTouch()
            r12.show()
            if (r13 == r8) goto L9d
            if (r13 == r10) goto L9d
            if (r13 == r2) goto L9d
            if (r13 == r3) goto L9d
            goto L9e
        L90:
            if (r5 != 0) goto L97
            if (r13 != r10) goto L97
            if (r0 != r6) goto L9e
            goto L9d
        L97:
            if (r5 == 0) goto L9e
            if (r13 != r8) goto L9e
            if (r0 != r9) goto L9e
        L9d:
            return r7
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j2.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !isShowing()) {
            return false;
        }
        View view = this.f82155u;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!isShowing() || this.f82139e.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f82139e.onKeyUp(i10, keyEvent);
        if (!zOnKeyUp || (i10 != 66 && i10 != 23)) {
            return zOnKeyUp;
        }
        dismiss();
        return zOnKeyUp;
    }

    public boolean performItemClick(int i10) {
        if (!isShowing()) {
            return false;
        }
        if (this.f82157w == null) {
            return true;
        }
        s1 s1Var = this.f82139e;
        this.f82157w.onItemClick(s1Var, s1Var.getChildAt(i10 - s1Var.getFirstVisiblePosition()), i10, s1Var.getAdapter().getItemId(i10));
        return true;
    }

    public void postShow() {
        this.D.post(this.C);
    }

    public void setAdapter(ListAdapter listAdapter) {
        f2 f2Var = this.f82154t;
        if (f2Var == null) {
            this.f82154t = new f2(this);
        } else {
            ListAdapter listAdapter2 = this.f82138c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(f2Var);
            }
        }
        this.f82138c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f82154t);
        }
        s1 s1Var = this.f82139e;
        if (s1Var != null) {
            s1Var.setAdapter(this.f82138c);
        }
    }

    public void setAnchorView(View view) {
        this.f82155u = view;
    }

    public void setAnimationStyle(int i10) {
        this.H.setAnimationStyle(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i10) {
        Drawable background = this.H.getBackground();
        if (background == null) {
            setWidth(i10);
            return;
        }
        Rect rect = this.E;
        background.getPadding(rect);
        this.f82141g = rect.left + rect.right + i10;
    }

    public void setDropDownAlwaysVisible(boolean z10) {
        this.f82149o = z10;
    }

    public void setDropDownGravity(int i10) {
        this.f82148n = i10;
    }

    public void setEpicenterBounds(Rect rect) {
        this.F = rect != null ? new Rect(rect) : null;
    }

    public void setForceIgnoreOutsideTouch(boolean z10) {
        this.f82150p = z10;
    }

    public void setHeight(int i10) {
        if (i10 < 0 && -2 != i10 && -1 != i10) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f82140f = i10;
    }

    public void setHorizontalOffset(int i10) {
        this.f82142h = i10;
    }

    public void setInputMethodMode(int i10) {
        this.H.setInputMethodMode(i10);
    }

    public void setListSelector(Drawable drawable) {
        this.f82156v = drawable;
    }

    public void setModal(boolean z10) {
        this.G = z10;
        this.H.setFocusable(z10);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.H.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f82157w = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f82158x = onItemSelectedListener;
    }

    public void setOverlapAnchor(boolean z10) {
        this.f82147m = true;
        this.f82146l = z10;
    }

    public void setPromptPosition(int i10) {
        this.f82153s = i10;
    }

    public void setPromptView(View view) {
        View view2;
        boolean zIsShowing = isShowing();
        if (zIsShowing && (view2 = this.f82152r) != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f82152r);
            }
        }
        this.f82152r = view;
        if (zIsShowing) {
            show();
        }
    }

    public void setSelection(int i10) {
        s1 s1Var = this.f82139e;
        if (!isShowing() || s1Var == null) {
            return;
        }
        s1Var.setListSelectionHidden(false);
        s1Var.setSelection(i10);
        if (s1Var.getChoiceMode() != 0) {
            s1Var.setItemChecked(i10, true);
        }
    }

    public void setSoftInputMode(int i10) {
        this.H.setSoftInputMode(i10);
    }

    public void setVerticalOffset(int i10) {
        this.f82143i = i10;
        this.f82145k = true;
    }

    public void setWidth(int i10) {
        this.f82141g = i10;
    }

    public void setWindowLayoutType(int i10) {
        this.f82144j = i10;
    }

    @Override // p.e0
    public void show() {
        int measuredHeight;
        int i10;
        int i11;
        int i12;
        s1 s1Var = this.f82139e;
        Context context = this.f82137b;
        c0 c0Var = this.H;
        if (s1Var == null) {
            this.C = new a2(this);
            s1 s1VarA = a(context, !this.G);
            this.f82139e = s1VarA;
            Drawable drawable = this.f82156v;
            if (drawable != null) {
                s1VarA.setSelector(drawable);
            }
            this.f82139e.setAdapter(this.f82138c);
            this.f82139e.setOnItemClickListener(this.f82157w);
            this.f82139e.setFocusable(true);
            this.f82139e.setFocusableInTouchMode(true);
            this.f82139e.setOnItemSelectedListener(new b2(this));
            this.f82139e.setOnScrollListener(this.A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f82158x;
            if (onItemSelectedListener != null) {
                this.f82139e.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f82139e;
            View view2 = this.f82152r;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f82153s;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f82153s);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f82141g;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            c0Var.setContentView(view);
        } else {
            View view3 = this.f82152r;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + view3.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = c0Var.getBackground();
        Rect rect = this.E;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i10 = rect.bottom + i15;
            if (!this.f82145k) {
                this.f82143i = -i15;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = c2.a(c0Var, getAnchorView(), this.f82143i, c0Var.getInputMethodMode() == 2);
        if (this.f82149o || this.f82140f == -1) {
            i11 = iA + i10;
        } else {
            int i16 = this.f82141g;
            int iMeasureHeightOfChildrenCompat = this.f82139e.measureHeightOfChildrenCompat(i16 != -2 ? i16 != -1 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), 0, -1, iA - measuredHeight, -1);
            if (iMeasureHeightOfChildrenCompat > 0) {
                measuredHeight += this.f82139e.getPaddingBottom() + this.f82139e.getPaddingTop() + i10;
            }
            i11 = iMeasureHeightOfChildrenCompat + measuredHeight;
        }
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        e4.p.setWindowLayoutType(c0Var, this.f82144j);
        if (c0Var.isShowing()) {
            if (getAnchorView().isAttachedToWindow()) {
                int width = this.f82141g;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i17 = this.f82140f;
                if (i17 == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        i11 = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        c0Var.setWidth(this.f82141g == -1 ? -1 : 0);
                        c0Var.setHeight(0);
                    } else {
                        c0Var.setWidth(this.f82141g == -1 ? -1 : 0);
                        c0Var.setHeight(-1);
                    }
                } else if (i17 != -2) {
                    i11 = i17;
                }
                c0Var.setOutsideTouchable((this.f82150p || this.f82149o) ? false : true);
                c0Var.update(getAnchorView(), this.f82142h, this.f82143i, width < 0 ? -1 : width, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int width2 = this.f82141g;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i18 = this.f82140f;
        if (i18 == -1) {
            i11 = -1;
        } else if (i18 != -2) {
            i11 = i18;
        }
        c0Var.setWidth(width2);
        c0Var.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(c0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            d2.b(c0Var, true);
        }
        c0Var.setOutsideTouchable((this.f82150p || this.f82149o) ? false : true);
        c0Var.setTouchInterceptor(this.f82160z);
        if (this.f82147m) {
            e4.p.setOverlapAnchor(c0Var, this.f82146l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = J;
            if (method2 != null) {
                try {
                    method2.invoke(c0Var, this.F);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d2.a(c0Var, this.F);
        }
        e4.p.showAsDropDown(c0Var, getAnchorView(), this.f82142h, this.f82143i, this.f82148n);
        this.f82139e.setSelection(-1);
        if (!this.G || this.f82139e.isInTouchMode()) {
            clearListSelection();
        }
        if (this.G) {
            return;
        }
        this.D.post(this.B);
    }

    public j2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public j2(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public j2(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f82140f = -2;
        this.f82141g = -2;
        this.f82144j = 1002;
        this.f82148n = 0;
        this.f82149o = false;
        this.f82150p = false;
        this.f82151q = Integer.MAX_VALUE;
        this.f82153s = 0;
        this.f82159y = new i2(this);
        this.f82160z = new h2(this);
        this.A = new g2(this);
        this.B = new e2(this);
        this.E = new Rect();
        this.f82137b = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f69992p, i10, i11);
        this.f82142h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f82143i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f82145k = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        c0 c0Var = new c0(context, attributeSet, i10, i11);
        this.H = c0Var;
        c0Var.setInputMethodMode(1);
    }
}
