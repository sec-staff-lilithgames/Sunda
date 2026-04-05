package dh;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import q.j2;
import qg.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class x extends q.r {

    /* renamed from: g, reason: collision with root package name */
    public final j2 f52316g;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f52317h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f52318i;

    /* renamed from: j, reason: collision with root package name */
    public final int f52319j;

    /* renamed from: k, reason: collision with root package name */
    public final float f52320k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f52321l;

    /* renamed from: m, reason: collision with root package name */
    public int f52322m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f52323n;

    public x(Context context) {
        this(context, null);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f52317h;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (c()) {
            this.f52316g.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f52321l;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.isProvidingHint()) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f52320k;
    }

    public int getSimpleItemSelectedColor() {
        return this.f52322m;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f52323n;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.isProvidingHint() && super.getHint() == null && qg.t.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52316g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                j2 j2Var = this.f52316g;
                int iMin = Math.min(adapter.getCount(), Math.max(0, j2Var.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = j2Var.getBackground();
                if (background != null) {
                    Rect rect = this.f52318i;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f52316g.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        j2 j2Var = this.f52316g;
        if (j2Var != null) {
            j2Var.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f52321l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof yg.j) {
            ((yg.j) dropDownBackground).setFillColor(this.f52321l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f52316g.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f52322m = i10;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f52323n = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (c()) {
            this.f52316g.show();
        } else {
            super.showDropDown();
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.f52319j, strArr));
    }

    public x(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        this.f52318i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88470r, i10, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f52319j = typedArrayObtainStyledAttributes.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f52320k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f52321l = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0));
        }
        this.f52322m = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.f52323n = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 5);
        this.f52317h = (AccessibilityManager) context2.getSystemService("accessibility");
        j2 j2Var = new j2(context2);
        this.f52316g = j2Var;
        j2Var.setModal(true);
        j2Var.setAnchorView(this);
        j2Var.setInputMethodMode(2);
        j2Var.setAdapter(getAdapter());
        j2Var.setOnItemClickListener(new v(this));
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
