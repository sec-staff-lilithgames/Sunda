package bg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.TreeMap;
import qg.j0;
import qg.t0;
import yg.a0;
import yg.b0;
import yg.e0;
import yg.p;
import yg.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9498m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9499b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9500c;

    /* renamed from: e, reason: collision with root package name */
    public final e f9501e;

    /* renamed from: f, reason: collision with root package name */
    public final d f9502f;

    /* renamed from: g, reason: collision with root package name */
    public Integer[] f9503g;

    /* renamed from: h, reason: collision with root package name */
    public z f9504h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f9505i;

    /* renamed from: j, reason: collision with root package name */
    public int f9506j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f9507k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9508l;

    public f(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
            if (this.f9506j <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f9506j - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f9506j - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f9508l = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f9501e);
        this.f9499b.add(materialButton.getShapeAppearanceModel());
        this.f9500c.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f9507k == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (c(i10)) {
                if (c(i10) && this.f9507k != null) {
                    int iMax = Math.max(0, this.f9507k.getMaxWidthChange(((MaterialButton) getChildAt(i10)).getWidth()));
                    int i11 = i10 - 1;
                    while (true) {
                        materialButton = null;
                        if (i11 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i11)) {
                                materialButton2 = (MaterialButton) getChildAt(i11);
                                break;
                            }
                            i11--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i12 = i10 + 1;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        if (c(i12)) {
                            materialButton = (MaterialButton) getChildAt(i12);
                            break;
                        }
                        i12++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i13 = firstVisibleChildIndex;
        while (i13 <= lastVisibleChildIndex) {
            if (c(i13)) {
                ((MaterialButton) getChildAt(i13)).setSizeChange(this.f9507k);
                ((MaterialButton) getChildAt(i13)).setWidthChangeMax((i13 == firstVisibleChildIndex || i13 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i13++;
        }
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = materialButton.f29057x;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f29057x = null;
                materialButton.f29054u = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9502f);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f9503g = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int iSwapCornerPositionRtl;
        if (!(this.f9504h == null && this.f9505i == null) && this.f9508l) {
            this.f9508l = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    boolean z10 = i10 == firstVisibleChildIndex;
                    boolean z11 = i10 == lastVisibleChildIndex;
                    b0 b0Var = this.f9505i;
                    if (b0Var == null || (!z10 && !z11)) {
                        b0Var = (b0) this.f9500c.get(i10);
                    }
                    a0 a0Var = b0Var == null ? new a0((p) this.f9499b.get(i10)) : b0Var.toBuilder();
                    boolean z12 = getOrientation() == 0;
                    boolean zIsLayoutRtl = t0.isLayoutRtl(this);
                    if (z12) {
                        iSwapCornerPositionRtl = z10 ? 5 : 0;
                        if (z11) {
                            iSwapCornerPositionRtl |= 10;
                        }
                        if (zIsLayoutRtl) {
                            iSwapCornerPositionRtl = b0.swapCornerPositionRtl(iSwapCornerPositionRtl);
                        }
                    } else {
                        iSwapCornerPositionRtl = z10 ? 3 : 0;
                        if (z11) {
                            iSwapCornerPositionRtl |= 12;
                        }
                    }
                    b0 b0VarBuild = a0Var.setCornerSizeOverride(this.f9504h, ~iSwapCornerPositionRtl).build();
                    if (b0VarBuild.isStateful()) {
                        materialButton.setStateListShapeAppearanceModel(b0VarBuild);
                    } else {
                        materialButton.setShapeAppearanceModel(b0VarBuild.getDefaultShape(true));
                    }
                }
                i10++;
            }
        }
    }

    public e0 getButtonSizeChange() {
        return this.f9507k;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f9503g;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public yg.d getInnerCornerSize() {
        return this.f9504h.getDefaultCornerSize();
    }

    public z getInnerCornerSizeStateList() {
        return this.f9504h;
    }

    public p getShapeAppearance() {
        b0 b0Var = this.f9505i;
        if (b0Var == null) {
            return null;
        }
        return b0Var.getDefaultShape(true);
    }

    public int getSpacing() {
        return this.f9506j;
    }

    public b0 getStateListShapeAppearance() {
        return this.f9505i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f9499b.remove(iIndexOfChild);
            this.f9500c.remove(iIndexOfChild);
        }
        this.f9508l = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(e0 e0Var) {
        if (this.f9507k != e0Var) {
            this.f9507k = e0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(yg.d dVar) {
        this.f9504h = z.create(dVar);
        this.f9508l = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.f9504h = zVar;
        this.f9508l = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f9508l = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(p pVar) {
        this.f9505i = new a0(pVar).build();
        this.f9508l = true;
        e();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.f9506j = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.f9505i = b0Var;
        this.f9508l = true;
        e();
        invalidate();
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i10);
        this.f9499b = new ArrayList();
        this.f9500c = new ArrayList();
        this.f9501e = new e(this);
        this.f9502f = new d(this, 0);
        this.f9508l = true;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88472t, i10, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f9507k = e0.create(context2, typedArrayObtainStyledAttributes, 2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            b0 b0VarCreate = b0.create(context2, typedArrayObtainStyledAttributes, 4);
            this.f9505i = b0VarCreate;
            if (b0VarCreate == null) {
                this.f9505i = new a0(p.builder(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), typedArrayObtainStyledAttributes.getResourceId(5, 0)).build()).build();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f9504h = z.create(context2, typedArrayObtainStyledAttributes, 3, new yg.a(0.0f));
        }
        this.f9506j = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
