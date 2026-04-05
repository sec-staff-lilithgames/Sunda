package f6;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    public static Interpolator loadInterpolator(Context context, int i10) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i10);
    }
}
