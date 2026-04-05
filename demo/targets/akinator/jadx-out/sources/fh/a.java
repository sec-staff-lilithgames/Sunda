package fh;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f55707a = {R.attr.theme, com.digidust.elokence.akinator.freemium.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f55708b = {com.digidust.elokence.akinator.freemium.R.attr.materialThemeOverlay};

    public static Context wrap(Context context, AttributeSet attributeSet, int i10, int i11) {
        return wrap(context, attributeSet, i10, i11, new int[0]);
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i10, int i11, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55708b, i10, i11);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i12 = iArr2[0];
        boolean z10 = (context instanceof e) && ((e) context).getThemeResId() == i12;
        if (i12 == 0 || z10) {
            return context;
        }
        e eVar = new e(context, i12);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            for (int i13 = 0; i13 < iArr.length; i13++) {
                iArr3[i13] = typedArrayObtainStyledAttributes2.getResourceId(i13, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr3[i14];
            if (i15 != 0) {
                eVar.getTheme().applyStyle(i15, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f55707a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            eVar.getTheme().applyStyle(resourceId, true);
        }
        return eVar;
    }
}
