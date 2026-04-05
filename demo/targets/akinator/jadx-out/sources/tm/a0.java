package tm;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f86973a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f86974b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f86975c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f86976d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f86977e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f86978f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final Rect f86979g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    public final Rect f86980h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    public final Rect f86981i = new Rect();

    public a0(Context context) {
        this.f86973a = context.getResources().getDisplayMetrics().density;
    }

    public final void a(Rect rect, Rect rect2) {
        float f10 = rect.left;
        float f11 = this.f86973a;
        rect2.set(um.h0.pixelsToIntDips(f10, f11), um.h0.pixelsToIntDips(rect.top, f11), um.h0.pixelsToIntDips(rect.right, f11), um.h0.pixelsToIntDips(rect.bottom, f11));
    }

    public final boolean b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, rect2);
        return true;
    }

    public float getDensity() {
        return this.f86973a;
    }
}
