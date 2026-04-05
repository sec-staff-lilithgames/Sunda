package eh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.digidust.elokence.akinator.freemium.R;
import ug.c;
import ug.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a extends AppCompatTextView {
    public a(Context context) {
        this(context, null);
    }

    public final void a(AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        Context context = getContext();
        if (c.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = uf.a.E;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int[] iArr2 = {1, 2};
            int dimensionPixelSize = -1;
            for (int i12 = 0; i12 < 2 && dimensionPixelSize < 0; i12++) {
                dimensionPixelSize = d.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, iArr2[i12], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, uf.a.D);
                Context context2 = getContext();
                int[] iArr3 = {2, 4};
                int dimensionPixelSize2 = -1;
                for (int i13 = 0; i13 < 2 && dimensionPixelSize2 < 0; i13++) {
                    dimensionPixelSize2 = d.getDimensionPixelSize(context2, typedArrayObtainStyledAttributes3, iArr3[i13], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (dimensionPixelSize2 >= 0) {
                    setLineHeight(dimensionPixelSize2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        if (c.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, uf.a.D);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int dimensionPixelSize = -1;
            for (int i11 = 0; i11 < 2 && dimensionPixelSize < 0; i11++) {
                dimensionPixelSize = d.getDimensionPixelSize(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (dimensionPixelSize >= 0) {
                setLineHeight(dimensionPixelSize);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(fh.a.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        a(attributeSet, i10, 0);
    }

    @Deprecated
    public a(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        super(fh.a.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        a(attributeSet, i10, i11);
    }
}
