package z8;

import android.graphics.drawable.Drawable;
import n8.v;
import n8.x;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i implements x {
    @Override // n8.x
    public v0 decode(Drawable drawable, int i10, int i11, v vVar) {
        if (drawable != null) {
            return new g(drawable);
        }
        return null;
    }

    @Override // n8.x
    public boolean handles(Drawable drawable, v vVar) {
        return true;
    }
}
