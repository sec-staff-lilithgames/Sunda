package z7;

import android.graphics.Paint;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f97667b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f97668c;

    static {
        v vVar = new v("BUTT", 0);
        f97667b = vVar;
        f97668c = new v[]{vVar, new v("ROUND", 1), new v("UNKNOWN", 2)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f97668c.clone();
    }

    public Paint.Cap toPaintCap() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }
}
