package z7;

import android.graphics.Paint;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f97669b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f97670c;

    static {
        w wVar = new w("MITER", 0);
        f97669b = wVar;
        f97670c = new w[]{wVar, new w("ROUND", 1), new w("BEVEL", 2)};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f97670c.clone();
    }

    public Paint.Join toPaintJoin() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Paint.Join.MITER;
        }
        if (iOrdinal == 1) {
            return Paint.Join.ROUND;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return Paint.Join.BEVEL;
    }
}
