package u1;

import android.view.PointerIcon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f87515a = new b(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final b f87516b = new b(1007);

    /* renamed from: c, reason: collision with root package name */
    public static final b f87517c = new b(1008);

    /* renamed from: d, reason: collision with root package name */
    public static final b f87518d = new b(1002);

    public static final t PointerIcon(PointerIcon pointerIcon) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerIcon, "pointerIcon");
        return new a(pointerIcon);
    }

    public static final t getPointerIconCrosshair() {
        return f87516b;
    }

    public static final t getPointerIconDefault() {
        return f87515a;
    }

    public static final t getPointerIconHand() {
        return f87518d;
    }

    public static final t getPointerIconText() {
        return f87517c;
    }

    public static final t PointerIcon(int i10) {
        return new b(i10);
    }
}
