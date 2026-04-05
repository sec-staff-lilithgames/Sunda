package mh;

import com.moloco.sdk.BKC.JzVV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g1 {
    public static f1 toStringHelper(Object obj) {
        return new f1(obj.getClass().getSimpleName());
    }

    public static <T> T firstNonNull(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(JzVV.bhIUXMdPfLshoA);
    }

    public static f1 toStringHelper(Class<?> cls) {
        return new f1(cls.getSimpleName());
    }

    public static f1 toStringHelper(String str) {
        return new f1(str);
    }
}
