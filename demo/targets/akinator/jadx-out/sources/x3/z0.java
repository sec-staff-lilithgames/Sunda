package x3;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f91712a;

    public z0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f91712a = new w0(view);
        } else {
            this.f91712a = new x0();
        }
    }

    public static z0 createProvider(View view) {
        return new z0(view);
    }

    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f91712a.onScrollLimit(i10, i11, i12, z10);
    }

    public void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f91712a.onScrollProgress(i10, i11, i12, i13);
    }

    public void onSnapToItem(int i10, int i11, int i12) {
        this.f91712a.onSnapToItem(i10, i11, i12);
    }
}
