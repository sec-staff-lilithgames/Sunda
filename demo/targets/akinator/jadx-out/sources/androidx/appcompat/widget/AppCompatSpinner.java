package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import q.f4;
import q.j2;
import q.k0;
import q.l0;
import q.n0;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements e1 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5028k = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final q.s f5029b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5030c;

    /* renamed from: e, reason: collision with root package name */
    public final d f5031e;

    /* renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f5032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5033g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f5034h;

    /* renamed from: i, reason: collision with root package name */
    public int f5035i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f5036j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new h();

        /* renamed from: b, reason: collision with root package name */
        public boolean f5037b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f5037b ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public final SpinnerAdapter f5038b;

        /* renamed from: c, reason: collision with root package name */
        public final ListAdapter f5039c;

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f5038b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f5039c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            l0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f5039c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f5039c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5038b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends j2 implements n0 {
        public CharSequence K;
        public ListAdapter L;
        public final Rect M;
        public int N;

        public b(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.M = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new e(this));
        }

        public final void c() {
            int i10;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f5036j);
                i10 = f4.isLayoutRtl(appCompatSpinner) ? appCompatSpinner.f5036j.right : -appCompatSpinner.f5036j.left;
            } else {
                Rect rect = appCompatSpinner.f5036j;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i11 = appCompatSpinner.f5035i;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.L, getBackground());
                int i12 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f5036j;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                setContentWidth(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i11);
            }
            setHorizontalOffset(f4.isLayoutRtl(appCompatSpinner) ? (((width - paddingRight) - getWidth()) - getHorizontalOriginalOffset()) + i10 : getHorizontalOriginalOffset() + paddingLeft + i10);
        }

        @Override // q.n0
        public CharSequence getHintText() {
            return this.K;
        }

        @Override // q.n0
        public int getHorizontalOriginalOffset() {
            return this.N;
        }

        @Override // q.j2, q.n0
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.L = listAdapter;
        }

        @Override // q.n0
        public void setHorizontalOriginalOffset(int i10) {
            this.N = i10;
        }

        @Override // q.n0
        public void setPromptText(CharSequence charSequence) {
            this.K = charSequence;
        }

        @Override // q.n0
        public void show(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            c();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            setSelection(appCompatSpinner.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            f fVar = new f(this);
            viewTreeObserver.addOnGlobalLayoutListener(fVar);
            setOnDismissListener(new g(this, fVar));
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f5036j;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.f5029b;
        if (sVar != null) {
            sVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        n0 n0Var = this.f5034h;
        return n0Var != null ? n0Var.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        n0 n0Var = this.f5034h;
        return n0Var != null ? n0Var.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f5034h != null ? this.f5035i : super.getDropDownWidth();
    }

    public final n0 getInternalPopup() {
        return this.f5034h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        n0 n0Var = this.f5034h;
        return n0Var != null ? n0Var.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f5030c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        n0 n0Var = this.f5034h;
        return n0Var != null ? n0Var.getHintText() : super.getPrompt();
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.f5029b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.f5029b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0 n0Var = this.f5034h;
        if (n0Var == null || !n0Var.isShowing()) {
            return;
        }
        n0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f5034h == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f5037b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k0(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        n0 n0Var = this.f5034h;
        savedState.f5037b = n0Var != null && n0Var.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f5031e;
        if (dVar == null || !dVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        n0 n0Var = this.f5034h;
        if (n0Var == null) {
            return super.performClick();
        }
        if (n0Var.isShowing()) {
            return true;
        }
        n0Var.show(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.f5029b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.f5029b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        n0 n0Var = this.f5034h;
        if (n0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            n0Var.setHorizontalOriginalOffset(i10);
            n0Var.setHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        n0 n0Var = this.f5034h;
        if (n0Var != null) {
            n0Var.setVerticalOffset(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f5034h != null) {
            this.f5035i = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        n0 n0Var = this.f5034h;
        if (n0Var != null) {
            n0Var.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(l.a.getDrawable(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        n0 n0Var = this.f5034h;
        if (n0Var != null) {
            n0Var.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.s sVar = this.f5029b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.f5029b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    public AppCompatSpinner(Context context, int i10) {
        this(context, null, com.digidust.elokence.akinator.freemium.R.attr.spinnerStyle, i10);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f5033g) {
            this.f5032f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        n0 n0Var = this.f5034h;
        if (n0Var != null) {
            Context context = this.f5030c;
            if (context == null) {
                context = getContext();
            }
            n0Var.setAdapter(new a(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f5036j = r0
            android.content.Context r0 = r7.getContext()
            q.i3.checkAppCompatTheme(r7, r0)
            int[] r0 = k.a.f69999w
            r1 = 0
            q.n3 r2 = q.n3.obtainStyledAttributes(r8, r9, r0, r10, r1)
            q.s r3 = new q.s
            r3.<init>(r7)
            r7.f5029b = r3
            if (r12 == 0) goto L29
            o.e r3 = new o.e
            r3.<init>(r8, r12)
            r7.f5030c = r3
            goto L3a
        L29:
            r12 = 4
            int r12 = r2.getResourceId(r12, r1)
            if (r12 == 0) goto L38
            o.e r3 = new o.e
            r3.<init>(r8, r12)
            r7.f5030c = r3
            goto L3a
        L38:
            r7.f5030c = r8
        L3a:
            r12 = -1
            r3 = 0
            if (r11 != r12) goto L6c
            int[] r12 = androidx.appcompat.widget.AppCompatSpinner.f5028k     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            boolean r4 = r12.hasValue(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            if (r4 == 0) goto L54
            int r11 = r12.getInt(r1, r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            goto L54
        L4f:
            r8 = move-exception
            r3 = r12
            goto L66
        L52:
            r4 = move-exception
            goto L5c
        L54:
            r12.recycle()
            goto L6c
        L58:
            r8 = move-exception
            goto L66
        L5a:
            r4 = move-exception
            r12 = r3
        L5c:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: java.lang.Throwable -> L4f
            if (r12 == 0) goto L6c
            goto L54
        L66:
            if (r3 == 0) goto L6b
            r3.recycle()
        L6b:
            throw r8
        L6c:
            r12 = 2
            r4 = 1
            if (r11 == 0) goto La3
            if (r11 == r4) goto L73
            goto Lb1
        L73:
            androidx.appcompat.widget.AppCompatSpinner$b r11 = new androidx.appcompat.widget.AppCompatSpinner$b
            android.content.Context r5 = r7.f5030c
            r11.<init>(r5, r9, r10)
            android.content.Context r5 = r7.f5030c
            q.n3 r0 = q.n3.obtainStyledAttributes(r5, r9, r0, r10, r1)
            r5 = 3
            r6 = -2
            int r5 = r0.getLayoutDimension(r5, r6)
            r7.f5035i = r5
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r4)
            r11.setBackgroundDrawable(r5)
            java.lang.String r12 = r2.getString(r12)
            r11.setPromptText(r12)
            r0.recycle()
            r7.f5034h = r11
            androidx.appcompat.widget.d r12 = new androidx.appcompat.widget.d
            r12.<init>(r7, r7, r11)
            r7.f5031e = r12
            goto Lb1
        La3:
            q.m0 r11 = new q.m0
            r11.<init>(r7)
            r7.f5034h = r11
            java.lang.String r12 = r2.getString(r12)
            r11.setPromptText(r12)
        Lb1:
            java.lang.CharSequence[] r11 = r2.getTextArray(r1)
            if (r11 == 0) goto Lc8
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r0, r11)
            r8 = 2131624372(0x7f0e01b4, float:1.8875922E38)
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc8:
            r2.recycle()
            r7.f5033g = r4
            android.widget.SpinnerAdapter r8 = r7.f5032f
            if (r8 == 0) goto Ld6
            r7.setAdapter(r8)
            r7.f5032f = r3
        Ld6:
            q.s r8 = r7.f5029b
            r8.d(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
