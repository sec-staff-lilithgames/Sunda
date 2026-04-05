package r8;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f84038a;

    public q(DisplayMetrics displayMetrics) {
        this.f84038a = displayMetrics;
    }

    @Override // r8.r
    public int getHeightPixels() {
        return this.f84038a.heightPixels;
    }

    @Override // r8.r
    public int getWidthPixels() {
        return this.f84038a.widthPixels;
    }
}
