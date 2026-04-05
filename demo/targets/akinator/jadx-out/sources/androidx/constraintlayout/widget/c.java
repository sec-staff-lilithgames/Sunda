package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f5380b;

    /* renamed from: c, reason: collision with root package name */
    public int f5381c;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5382e;

    /* renamed from: f, reason: collision with root package name */
    public d3.m f5383f;

    /* renamed from: g, reason: collision with root package name */
    public String f5384g;

    /* renamed from: h, reason: collision with root package name */
    public String f5385h;

    /* renamed from: i, reason: collision with root package name */
    public View[] f5386i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5387j;

    public c(Context context) {
        super(context);
        this.f5380b = new int[32];
        this.f5386i = null;
        this.f5387j = new HashMap();
        this.f5382e = context;
        h(null);
    }

    public static boolean isChildOfHelper(View view) {
        return "CONSTRAINT_LAYOUT_HELPER_CHILD" == view.getTag();
    }

    public final void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f5382e == null) {
            return;
        }
        String strTrim = str.trim();
        int iG = g(strTrim);
        if (iG != 0) {
            this.f5387j.put(Integer.valueOf(iG), strTrim);
            b(iG);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public void addView(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f5384g = null;
            b(view.getId());
            requestLayout();
        }
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f5381c + 1;
        int[] iArr = this.f5380b;
        if (i11 > iArr.length) {
            this.f5380b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5380b;
        int i12 = this.f5381c;
        iArr2[i12] = i10;
        this.f5381c = i12 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f5382e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && strTrim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public boolean containsId(int i10) {
        for (int i11 : this.f5380b) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f5381c; i10++) {
            View viewById = constraintLayout.getViewById(this.f5380b[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f5382e.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final int g(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iF = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iF = ((Integer) designInformation).intValue();
            }
        }
        if (iF == 0 && constraintLayout != null) {
            iF = f(constraintLayout, str);
        }
        if (iF == 0) {
            try {
                iF = q.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iF != 0) {
            return iF;
        }
        Context context = this.f5382e;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5380b, this.f5381c);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5543b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5384g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f5385h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int indexFromId(int i10) {
        int i11 = -1;
        for (int i12 : this.f5380b) {
            i11++;
            if (i12 == i10) {
                return i11;
            }
        }
        return i11;
    }

    public void loadParameters(k.a aVar, d3.m mVar, ConstraintLayout.a aVar2, SparseArray<d3.g> sparseArray) {
        k.b bVar = aVar.f5440e;
        k.b bVar2 = aVar.f5440e;
        int[] iArr = bVar.f5464j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f5466k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = bVar2.f5466k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i11 = 0;
                    for (String str2 : strArrSplit) {
                        int iG = g(str2.trim());
                        if (iG != 0) {
                            iArrCopyOf[i11] = iG;
                            i11++;
                        }
                    }
                    if (i11 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                    }
                    bVar2.f5464j0 = iArrCopyOf;
                } else {
                    bVar2.f5464j0 = null;
                }
            }
        }
        if (mVar == null) {
            return;
        }
        mVar.removeAllIds();
        if (bVar2.f5464j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = bVar2.f5464j0;
            if (i10 >= iArr2.length) {
                return;
            }
            d3.g gVar = sparseArray.get(iArr2[i10]);
            if (gVar != null) {
                mVar.add(gVar);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f5384g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5385h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public int removeView(View view) {
        int i10;
        int id2 = view.getId();
        int i11 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.f5384g = null;
        int i12 = 0;
        while (true) {
            if (i12 >= this.f5381c) {
                break;
            }
            if (this.f5380b[i12] == id2) {
                int i13 = i12;
                while (true) {
                    i10 = this.f5381c;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = this.f5380b;
                    int i14 = i13 + 1;
                    iArr[i13] = iArr[i14];
                    i13 = i14;
                }
                this.f5380b[i10 - 1] = 0;
                this.f5381c = i10 - 1;
                i11 = i12;
            } else {
                i12++;
            }
        }
        requestLayout();
        return i11;
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f5384g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f5381c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5385h = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f5381c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5384g = null;
        this.f5381c = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f5384g == null) {
            b(i10);
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f5384g);
        }
        d3.m mVar = this.f5383f;
        if (mVar == null) {
            return;
        }
        mVar.removeAllIds();
        for (int i10 = 0; i10 < this.f5381c; i10++) {
            int i11 = this.f5380b[i10];
            View viewById = constraintLayout.getViewById(i11);
            if (viewById == null) {
                Integer numValueOf = Integer.valueOf(i11);
                HashMap map = this.f5387j;
                String str = (String) map.get(numValueOf);
                int iF = f(constraintLayout, str);
                if (iF != 0) {
                    this.f5380b[i10] = iF;
                    map.put(Integer.valueOf(iF), str);
                    viewById = constraintLayout.getViewById(iF);
                }
            }
            if (viewById != null) {
                this.f5383f.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f5383f.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void validateParams() {
        if (this.f5383f == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f5352q0 = this.f5383f;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5380b = new int[32];
        this.f5386i = null;
        this.f5387j = new HashMap();
        this.f5382e = context;
        h(attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5380b = new int[32];
        this.f5386i = null;
        this.f5387j = new HashMap();
        this.f5382e = context;
        h(attributeSet);
    }

    public void updatePreLayout(d3.h hVar, d3.l lVar, SparseArray<d3.g> sparseArray) {
        lVar.removeAllIds();
        for (int i10 = 0; i10 < this.f5381c; i10++) {
            lVar.add(sparseArray.get(this.f5380b[i10]));
        }
    }

    public void applyHelperParams() {
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void resolveRtl(d3.g gVar, boolean z10) {
    }
}
