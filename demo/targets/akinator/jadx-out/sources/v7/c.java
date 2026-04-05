package v7;

import android.content.Context;
import e8.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c implements b {
    @Override // v7.b
    public a getCurrentReducedMotionMode(Context context) {
        return (context == null || n.getAnimationScale(context) != 0.0f) ? a.f89166b : a.f89167c;
    }
}
