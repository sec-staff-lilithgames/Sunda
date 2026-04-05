package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static t sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<c> mConstraintHelpers;
    protected i mConstraintLayoutSpec;
    private k mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected d3.h mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    e mMeasurer;
    private x2.g mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<f> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<d3.g> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d3.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static t getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new t();
        }
        return sSharedValues;
    }

    public final void a(AttributeSet attributeSet, int i10, int i11) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5543b, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        k kVar = new k();
                        this.mConstraintSet = kVar;
                        kVar.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    public void addValueModifier(f fVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r19, android.view.View r20, d3.g r21, androidx.constraintlayout.widget.ConstraintLayout.a r22, android.util.SparseArray<d3.g> r23) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, d3.g, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    public final void b(d3.g gVar, a aVar, SparseArray sparseArray, int i10, d3.d dVar) {
        View view = this.mChildrenByIds.get(i10);
        d3.g gVar2 = (d3.g) sparseArray.get(i10);
        if (gVar2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f5324c0 = true;
        d3.d dVar2 = d3.d.f51752g;
        if (dVar == dVar2) {
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f5324c0 = true;
            aVar2.f5352q0.setHasBaseline(true);
        }
        gVar.getAnchor(dVar2).connect(gVar2.getAnchor(dVar), aVar.D, aVar.C, true);
        gVar.setHasBaseline(true);
        gVar.getAnchor(d3.d.f51749c).reset();
        gVar.getAnchor(d3.d.f51751f).reset();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i10, int i11) {
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        Iterator<f> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator<d3.g> it2 = this.mLayoutWidget.getChildren().iterator();
            if (it2.hasNext()) {
                View view = (View) it2.next().getCompanionWidget();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    public void fillMetrics(x2.g gVar) {
        this.mMetrics = gVar;
        this.mLayoutWidget.fillMetrics(gVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f51793l == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f51793l = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f51793l = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            d3.h hVar = this.mLayoutWidget;
            hVar.setDebugName(hVar.f51793l);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.getDebugName());
        }
        Iterator<d3.g> it = this.mLayoutWidget.getChildren().iterator();
        while (it.hasNext()) {
            d3.g next = it.next();
            View view = (View) next.getCompanionWidget();
            if (view != null) {
                if (next.f51793l == null && (id2 = view.getId()) != -1) {
                    next.f51793l = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.getDebugName() == null) {
                    next.setDebugName(next.f51793l);
                    Log.v(TAG, " setDebugName " + next.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb2);
        return sb2.toString();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final d3.g getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f5352q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f5352q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i10) {
        if (i10 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new i(getContext(), this, i10);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            d3.g gVar = aVar.f5352q0;
            if ((childAt.getVisibility() != 8 || aVar.f5326d0 || aVar.f5328e0 || zIsInEditMode) && !aVar.f5330f0) {
                int x10 = gVar.getX();
                int y10 = gVar.getY();
                int width = gVar.getWidth() + x10;
                int height = gVar.getHeight() + y10;
                childAt.layout(x10, y10, width, height);
                if ((childAt instanceof p) && (content = ((p) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x10, y10, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.mConstraintHelpers.get(i15).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        boolean z10;
        d3.g gVar;
        if (this.mMetrics != null) {
            System.nanoTime();
            x2.g gVar2 = this.mMetrics;
            getChildCount();
            gVar2.getClass();
            this.mMetrics.getClass();
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i10, i11);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i12++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i10;
        this.mOnMeasureHeightMeasureSpec = i11;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z10 = false;
                    break;
                } else {
                    if (getChildAt(i13).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z10) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    d3.g viewWidget = getViewWidget(getChildAt(i14));
                    if (viewWidget != null) {
                        viewWidget.reset();
                    }
                }
                if (zIsInEditMode) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt = getChildAt(i15);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                gVar = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                gVar = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).f5352q0;
                            }
                            gVar.setDebugName(resourceName);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = getChildAt(i16);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof n)) {
                            this.mConstraintSet = ((n) childAt2).getConstraintSet();
                        }
                    }
                }
                k kVar = this.mConstraintSet;
                if (kVar != null) {
                    kVar.b(this, true);
                }
                this.mLayoutWidget.removeAllChildren();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    for (int i17 = 0; i17 < size; i17++) {
                        this.mConstraintHelpers.get(i17).updatePreLayout(this);
                    }
                }
                for (int i18 = 0; i18 < childCount3; i18++) {
                    View childAt3 = getChildAt(i18);
                    if (childAt3 instanceof p) {
                        ((p) childAt3).updatePreLayout(this);
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i19 = 0; i19 < childCount3; i19++) {
                    View childAt4 = getChildAt(i19);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt5 = getChildAt(i20);
                    d3.g viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        a aVar = (a) childAt5.getLayoutParams();
                        this.mLayoutWidget.add(viewWidget2);
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, aVar, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z10) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        this.mLayoutWidget.fillMetrics(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i10, i11);
        resolveMeasuredDimension(i10, i11, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
        if (this.mMetrics != null) {
            System.nanoTime();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d3.g viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof d3.k)) {
            a aVar = (a) view.getLayoutParams();
            d3.k kVar = new d3.k();
            aVar.f5352q0 = kVar;
            aVar.f5326d0 = true;
            kVar.setOrientation(aVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.validateParams();
            ((a) view.getLayoutParams()).f5328e0 = true;
            if (!this.mConstraintHelpers.contains(cVar)) {
                this.mConstraintHelpers.add(cVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = new i(getContext(), this, i10);
    }

    public void removeValueModifier(f fVar) {
        if (fVar == null) {
            return;
        }
        this.mModifiers.remove(fVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        e eVar = this.mMeasurer;
        int i14 = eVar.f5393e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + eVar.f5392d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(d3.h hVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfo(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            setSelfDimensionBehaviour(hVar, mode, i15, mode2, i16);
            hVar.measure(i10, mode, i15, mode2, i16, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        setSelfDimensionBehaviour(hVar, mode, i152, mode2, i162);
        hVar.measure(i10, mode, i152, mode2, i162, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
    }

    public void setConstraintSet(k kVar) {
        this.mConstraintSet = kVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.setOnConstraintsChanged(oVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.mOptimizationLevel = i10;
        this.mLayoutWidget.setOptimizationLevel(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(d3.h r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.e r0 = r8.mMeasurer
            int r1 = r0.f5393e
            int r0 = r0.f5392d
            int r2 = r8.getChildCount()
            r3 = 1073741824(0x40000000, float:2.0)
            d3.f r4 = d3.f.f51767c
            d3.f r5 = d3.f.f51766b
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L31
            if (r10 == 0) goto L25
            if (r10 == r3) goto L1c
            r10 = r5
        L1a:
            r11 = r6
            goto L3a
        L1c:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r0
            int r11 = java.lang.Math.min(r10, r11)
            r10 = r5
            goto L3a
        L25:
            if (r2 != 0) goto L2f
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r6, r10)
        L2d:
            r10 = r4
            goto L3a
        L2f:
            r10 = r4
            goto L1a
        L31:
            if (r2 != 0) goto L2d
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r6, r10)
            goto L2d
        L3a:
            if (r12 == r7) goto L55
            if (r12 == 0) goto L4c
            if (r12 == r3) goto L43
            r4 = r5
        L41:
            r13 = r6
            goto L5d
        L43:
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            int r13 = java.lang.Math.min(r12, r13)
            r4 = r5
            goto L5d
        L4c:
            if (r2 != 0) goto L41
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r6, r12)
            goto L5d
        L55:
            if (r2 != 0) goto L5d
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r6, r12)
        L5d:
            int r12 = r9.getWidth()
            if (r11 != r12) goto L69
            int r12 = r9.getHeight()
            if (r13 == r12) goto L6c
        L69:
            r9.invalidateMeasures()
        L6c:
            r9.setX(r6)
            r9.setY(r6)
            int r12 = r8.mMaxWidth
            int r12 = r12 - r0
            r9.setMaxWidth(r12)
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            r9.setMaxHeight(r12)
            r9.setMinWidth(r6)
            r9.setMinHeight(r6)
            r9.setHorizontalDimensionBehaviour(r10)
            r9.setWidth(r11)
            r9.setVerticalDimensionBehaviour(r4)
            r9.setHeight(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r0
            r9.setMinWidth(r10)
            int r10 = r8.mMinHeight
            int r10 = r10 - r1
            r9.setMinHeight(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(d3.h, int, int, int, int):void");
    }

    public void setState(int i10, int i11, int i12) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.updateConstraints(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d3.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d3.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i10, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d3.h();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i10, i11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f5319a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f5320a0;

        /* renamed from: b, reason: collision with root package name */
        public int f5321b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f5322b0;

        /* renamed from: c, reason: collision with root package name */
        public float f5323c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f5324c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f5325d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f5326d0;

        /* renamed from: e, reason: collision with root package name */
        public int f5327e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f5328e0;

        /* renamed from: f, reason: collision with root package name */
        public int f5329f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f5330f0;

        /* renamed from: g, reason: collision with root package name */
        public int f5331g;

        /* renamed from: g0, reason: collision with root package name */
        public int f5332g0;

        /* renamed from: h, reason: collision with root package name */
        public int f5333h;

        /* renamed from: h0, reason: collision with root package name */
        public int f5334h0;

        /* renamed from: i, reason: collision with root package name */
        public int f5335i;

        /* renamed from: i0, reason: collision with root package name */
        public int f5336i0;

        /* renamed from: j, reason: collision with root package name */
        public int f5337j;

        /* renamed from: j0, reason: collision with root package name */
        public int f5338j0;

        /* renamed from: k, reason: collision with root package name */
        public int f5339k;

        /* renamed from: k0, reason: collision with root package name */
        public int f5340k0;

        /* renamed from: l, reason: collision with root package name */
        public int f5341l;

        /* renamed from: l0, reason: collision with root package name */
        public int f5342l0;

        /* renamed from: m, reason: collision with root package name */
        public int f5343m;

        /* renamed from: m0, reason: collision with root package name */
        public float f5344m0;

        /* renamed from: n, reason: collision with root package name */
        public int f5345n;

        /* renamed from: n0, reason: collision with root package name */
        public int f5346n0;

        /* renamed from: o, reason: collision with root package name */
        public int f5347o;

        /* renamed from: o0, reason: collision with root package name */
        public int f5348o0;

        /* renamed from: p, reason: collision with root package name */
        public int f5349p;

        /* renamed from: p0, reason: collision with root package name */
        public float f5350p0;

        /* renamed from: q, reason: collision with root package name */
        public int f5351q;

        /* renamed from: q0, reason: collision with root package name */
        public d3.g f5352q0;

        /* renamed from: r, reason: collision with root package name */
        public float f5353r;

        /* renamed from: s, reason: collision with root package name */
        public int f5354s;

        /* renamed from: t, reason: collision with root package name */
        public int f5355t;

        /* renamed from: u, reason: collision with root package name */
        public int f5356u;

        /* renamed from: v, reason: collision with root package name */
        public int f5357v;

        /* renamed from: w, reason: collision with root package name */
        public final int f5358w;

        /* renamed from: x, reason: collision with root package name */
        public int f5359x;

        /* renamed from: y, reason: collision with root package name */
        public final int f5360y;

        /* renamed from: z, reason: collision with root package name */
        public int f5361z;

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5319a = -1;
            this.f5321b = -1;
            this.f5323c = -1.0f;
            this.f5325d = true;
            this.f5327e = -1;
            this.f5329f = -1;
            this.f5331g = -1;
            this.f5333h = -1;
            this.f5335i = -1;
            this.f5337j = -1;
            this.f5339k = -1;
            this.f5341l = -1;
            this.f5343m = -1;
            this.f5345n = -1;
            this.f5347o = -1;
            this.f5349p = -1;
            this.f5351q = 0;
            this.f5353r = 0.0f;
            this.f5354s = -1;
            this.f5355t = -1;
            this.f5356u = -1;
            this.f5357v = -1;
            this.f5358w = Integer.MIN_VALUE;
            this.f5359x = Integer.MIN_VALUE;
            this.f5360y = Integer.MIN_VALUE;
            this.f5361z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f5320a0 = true;
            this.f5322b0 = true;
            this.f5324c0 = false;
            this.f5326d0 = false;
            this.f5328e0 = false;
            this.f5330f0 = false;
            this.f5332g0 = -1;
            this.f5334h0 = -1;
            this.f5336i0 = -1;
            this.f5338j0 = -1;
            this.f5340k0 = Integer.MIN_VALUE;
            this.f5342l0 = Integer.MIN_VALUE;
            this.f5344m0 = 0.5f;
            this.f5352q0 = new d3.g();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.f5319a = aVar.f5319a;
                this.f5321b = aVar.f5321b;
                this.f5323c = aVar.f5323c;
                this.f5325d = aVar.f5325d;
                this.f5327e = aVar.f5327e;
                this.f5329f = aVar.f5329f;
                this.f5331g = aVar.f5331g;
                this.f5333h = aVar.f5333h;
                this.f5335i = aVar.f5335i;
                this.f5337j = aVar.f5337j;
                this.f5339k = aVar.f5339k;
                this.f5341l = aVar.f5341l;
                this.f5343m = aVar.f5343m;
                this.f5345n = aVar.f5345n;
                this.f5347o = aVar.f5347o;
                this.f5349p = aVar.f5349p;
                this.f5351q = aVar.f5351q;
                this.f5353r = aVar.f5353r;
                this.f5354s = aVar.f5354s;
                this.f5355t = aVar.f5355t;
                this.f5356u = aVar.f5356u;
                this.f5357v = aVar.f5357v;
                this.f5358w = aVar.f5358w;
                this.f5359x = aVar.f5359x;
                this.f5360y = aVar.f5360y;
                this.f5361z = aVar.f5361z;
                this.A = aVar.A;
                this.B = aVar.B;
                this.C = aVar.C;
                this.D = aVar.D;
                this.E = aVar.E;
                this.F = aVar.F;
                this.G = aVar.G;
                this.H = aVar.H;
                this.I = aVar.I;
                this.J = aVar.J;
                this.K = aVar.K;
                this.W = aVar.W;
                this.X = aVar.X;
                this.L = aVar.L;
                this.M = aVar.M;
                this.N = aVar.N;
                this.P = aVar.P;
                this.O = aVar.O;
                this.Q = aVar.Q;
                this.R = aVar.R;
                this.S = aVar.S;
                this.T = aVar.T;
                this.U = aVar.U;
                this.V = aVar.V;
                this.f5320a0 = aVar.f5320a0;
                this.f5322b0 = aVar.f5322b0;
                this.f5324c0 = aVar.f5324c0;
                this.f5326d0 = aVar.f5326d0;
                this.f5332g0 = aVar.f5332g0;
                this.f5334h0 = aVar.f5334h0;
                this.f5336i0 = aVar.f5336i0;
                this.f5338j0 = aVar.f5338j0;
                this.f5340k0 = aVar.f5340k0;
                this.f5342l0 = aVar.f5342l0;
                this.f5344m0 = aVar.f5344m0;
                this.Y = aVar.Y;
                this.Z = aVar.Z;
                this.f5352q0 = aVar.f5352q0;
            }
        }

        public String getConstraintTag() {
            return this.Y;
        }

        public d3.g getConstraintWidget() {
            return this.f5352q0;
        }

        public void reset() {
            d3.g gVar = this.f5352q0;
            if (gVar != null) {
                gVar.reset();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public void setWidgetDebugName(String str) {
            this.f5352q0.setDebugName(str);
        }

        public void validate() {
            this.f5326d0 = false;
            this.f5320a0 = true;
            this.f5322b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f5320a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f5322b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f5320a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f5322b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f5323c == -1.0f && this.f5319a == -1 && this.f5321b == -1) {
                return;
            }
            this.f5326d0 = true;
            this.f5320a0 = true;
            this.f5322b0 = true;
            if (!(this.f5352q0 instanceof d3.k)) {
                this.f5352q0 = new d3.k();
            }
            ((d3.k) this.f5352q0).setOrientation(this.V);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5319a = -1;
            this.f5321b = -1;
            this.f5323c = -1.0f;
            this.f5325d = true;
            this.f5327e = -1;
            this.f5329f = -1;
            this.f5331g = -1;
            this.f5333h = -1;
            this.f5335i = -1;
            this.f5337j = -1;
            this.f5339k = -1;
            this.f5341l = -1;
            this.f5343m = -1;
            this.f5345n = -1;
            this.f5347o = -1;
            this.f5349p = -1;
            this.f5351q = 0;
            this.f5353r = 0.0f;
            this.f5354s = -1;
            this.f5355t = -1;
            this.f5356u = -1;
            this.f5357v = -1;
            this.f5358w = Integer.MIN_VALUE;
            this.f5359x = Integer.MIN_VALUE;
            this.f5360y = Integer.MIN_VALUE;
            this.f5361z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f5320a0 = true;
            this.f5322b0 = true;
            this.f5324c0 = false;
            this.f5326d0 = false;
            this.f5328e0 = false;
            this.f5330f0 = false;
            this.f5332g0 = -1;
            this.f5334h0 = -1;
            this.f5336i0 = -1;
            this.f5338j0 = -1;
            this.f5340k0 = Integer.MIN_VALUE;
            this.f5342l0 = Integer.MIN_VALUE;
            this.f5344m0 = 0.5f;
            this.f5352q0 = new d3.g();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5543b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = d.f5388a.get(index);
                switch (i11) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5349p);
                        this.f5349p = resourceId;
                        if (resourceId == -1) {
                            this.f5349p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f5351q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5351q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f5353r) % 360.0f;
                        this.f5353r = f10;
                        if (f10 < 0.0f) {
                            this.f5353r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f5319a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5319a);
                        break;
                    case 6:
                        this.f5321b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5321b);
                        break;
                    case 7:
                        this.f5323c = typedArrayObtainStyledAttributes.getFloat(index, this.f5323c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5327e);
                        this.f5327e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f5327e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5329f);
                        this.f5329f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f5329f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5331g);
                        this.f5331g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f5331g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5333h);
                        this.f5333h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f5333h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5335i);
                        this.f5335i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f5335i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5337j);
                        this.f5337j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f5337j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5339k);
                        this.f5339k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f5339k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5341l);
                        this.f5341l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f5341l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5343m);
                        this.f5343m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f5343m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5354s);
                        this.f5354s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f5354s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5355t);
                        this.f5355t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f5355t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5356u);
                        this.f5356u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f5356u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5357v);
                        this.f5357v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f5357v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f5358w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5358w);
                        break;
                    case 22:
                        this.f5359x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5359x);
                        break;
                    case 23:
                        this.f5360y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5360y);
                        break;
                    case 24:
                        this.f5361z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5361z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                k.i(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5345n);
                                this.f5345n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f5345n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5347o);
                                this.f5347o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f5347o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        k.h(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                                        k.h(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                                        this.f5325d = typedArrayObtainStyledAttributes.getBoolean(index, this.f5325d);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f5319a = -1;
            this.f5321b = -1;
            this.f5323c = -1.0f;
            this.f5325d = true;
            this.f5327e = -1;
            this.f5329f = -1;
            this.f5331g = -1;
            this.f5333h = -1;
            this.f5335i = -1;
            this.f5337j = -1;
            this.f5339k = -1;
            this.f5341l = -1;
            this.f5343m = -1;
            this.f5345n = -1;
            this.f5347o = -1;
            this.f5349p = -1;
            this.f5351q = 0;
            this.f5353r = 0.0f;
            this.f5354s = -1;
            this.f5355t = -1;
            this.f5356u = -1;
            this.f5357v = -1;
            this.f5358w = Integer.MIN_VALUE;
            this.f5359x = Integer.MIN_VALUE;
            this.f5360y = Integer.MIN_VALUE;
            this.f5361z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f5320a0 = true;
            this.f5322b0 = true;
            this.f5324c0 = false;
            this.f5326d0 = false;
            this.f5328e0 = false;
            this.f5330f0 = false;
            this.f5332g0 = -1;
            this.f5334h0 = -1;
            this.f5336i0 = -1;
            this.f5338j0 = -1;
            this.f5340k0 = Integer.MIN_VALUE;
            this.f5342l0 = Integer.MIN_VALUE;
            this.f5344m0 = 0.5f;
            this.f5352q0 = new d3.g();
        }
    }
}
