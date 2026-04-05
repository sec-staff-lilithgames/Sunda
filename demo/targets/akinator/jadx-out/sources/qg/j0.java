package qg;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.digidust.elokence.akinator.freemium.R;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f83192a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f83193b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.S, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.S, i10, i11);
        boolean z10 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            for (int i12 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i12, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z10 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z10 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, String str, int[] iArr) {
        if (!d(context, iArr)) {
            throw new IllegalArgumentException(a.b.l("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static void checkAppCompatTheme(Context context) {
        c(context, "Theme.AppCompat", f83192a);
    }

    public static void checkMaterialTheme(Context context) {
        c(context, "Theme.MaterialComponents", f83193b);
    }

    public static boolean d(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isAppCompatTheme(Context context) {
        return d(context, f83192a);
    }

    public static boolean isMaterial3Theme(Context context) {
        return ug.c.resolveBoolean(context, R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(Context context) {
        return d(context, f83193b);
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static n3 obtainTintedStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return n3.obtainStyledAttributes(context, attributeSet, iArr, i10, i11);
    }
}
