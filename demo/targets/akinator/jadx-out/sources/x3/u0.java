package x3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f91684a;

    public u0(PointerIcon pointerIcon) {
        this.f91684a = pointerIcon;
    }

    public static u0 create(Bitmap bitmap, float f10, float f11) {
        return new u0(PointerIcon.create(bitmap, f10, f11));
    }

    public static u0 getSystemIcon(Context context, int i10) {
        return new u0(PointerIcon.getSystemIcon(context, i10));
    }

    public static u0 load(Resources resources, int i10) {
        return new u0(PointerIcon.load(resources, i10));
    }

    public Object getPointerIcon() {
        return this.f91684a;
    }
}
