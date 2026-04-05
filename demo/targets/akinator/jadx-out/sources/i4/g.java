package i4;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f59399b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f59400c = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59401e;

    /* renamed from: f, reason: collision with root package name */
    public final e f59402f;

    public g(boolean z10, e eVar) {
        this.f59401e = z10;
        this.f59402f = eVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        e eVar = this.f59402f;
        Rect rect = this.f59399b;
        ((a) eVar).obtainBounds(obj, rect);
        Rect rect2 = this.f59400c;
        ((a) eVar).obtainBounds(obj2, rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f59401e;
        if (i12 < i13) {
            return z10 ? 1 : -1;
        }
        if (i12 > i13) {
            return z10 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z10 ? 1 : -1;
        }
        if (i16 > i17) {
            return z10 ? -1 : 1;
        }
        return 0;
    }
}
