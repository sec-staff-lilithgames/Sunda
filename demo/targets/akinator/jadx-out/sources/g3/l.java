package g3;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l extends d {

    /* renamed from: f, reason: collision with root package name */
    public int f57063f;

    public abstract boolean intersects(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr);

    @Override // g3.d
    public final void getAttributeNames(HashSet hashSet) {
    }
}
