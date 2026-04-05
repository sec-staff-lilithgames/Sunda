package m7;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.e0;
import m7.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: b, reason: collision with root package name */
    public final Context f74054b;

    public e(Context context) {
        this.f74054b = context;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return e0.areEqual(this.f74054b, ((e) obj).f74054b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74054b.hashCode();
    }

    @Override // m7.k
    public Object size(zu.d<? super j> dVar) {
        DisplayMetrics displayMetrics = this.f74054b.getResources().getDisplayMetrics();
        c.a aVarDimension = a.Dimension(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new j(aVarDimension, aVarDimension);
    }
}
