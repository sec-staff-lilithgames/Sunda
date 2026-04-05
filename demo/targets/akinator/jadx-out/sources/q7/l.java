package q7;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l7.c f82543a = new l7.c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public static final boolean getAllowInexactSize(l7.i iVar) {
        int i10 = k.$EnumSwitchMapping$0[iVar.getPrecision().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3) {
            throw new tu.t();
        }
        if (iVar.getDefined().getSizeResolver() == null && (iVar.getSizeResolver() instanceof m7.e)) {
            return true;
        }
        return (iVar.getTarget() instanceof n7.e) && (iVar.getSizeResolver() instanceof m7.p) && (((n7.e) iVar.getTarget()).getView() instanceof ImageView) && ((n7.e) iVar.getTarget()).getView() == ((m7.p) iVar.getSizeResolver()).getView();
    }

    public static final l7.c getDEFAULT_REQUEST_OPTIONS() {
        return f82543a;
    }

    public static final Drawable getDrawableCompat(l7.i iVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.getDrawableCompat(iVar.getContext(), num.intValue());
    }
}
