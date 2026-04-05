package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l3 extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f82173b;

    public l3(Context context, Resources resources) {
        super(resources);
        this.f82173b = new WeakReference(context);
    }

    @Override // q.q2, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        p2 p2Var;
        Drawable drawableA = a(i10);
        Context context = (Context) this.f82173b.get();
        if (drawableA != null && context != null && (p2Var = o2.get().f82197e) != null) {
            ((v) p2Var).tintDrawableUsingColorFilter(context, i10, drawableA);
        }
        return drawableA;
    }
}
