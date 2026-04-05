package hj;

import android.graphics.Point;
import android.view.View;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f58944b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f58945c;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("LEFT", 0);
        f fVar2 = new f("RIGHT", 1);
        f fVar3 = new f("TOP", 2);
        f58944b = fVar3;
        f58945c = new f[]{fVar, fVar2, fVar3, new f("BOTTOM", 3)};
    }

    public static Point a(f fVar, View view) {
        view.measure(-2, -2);
        int iOrdinal = fVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? new Point(0, view.getMeasuredHeight() * (-1)) : new Point(0, view.getMeasuredHeight()) : new Point(0, view.getMeasuredHeight() * (-1)) : new Point(view.getMeasuredWidth(), 0) : new Point(view.getMeasuredWidth() * (-1), 0);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f58945c.clone();
    }
}
