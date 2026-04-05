package hk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class d {
    public static <T> void checkBuilderRequirement(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T checkNotNullFromComponent(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNullFromProvides(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T> T checkNotNull(T t10, String str, Object obj) {
        String strValueOf;
        if (t10 != null) {
            return t10;
        }
        if (str.contains("%s")) {
            if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                if (obj instanceof Class) {
                    strValueOf = ((Class) obj).getCanonicalName();
                } else {
                    strValueOf = String.valueOf(obj);
                }
                throw new NullPointerException(str.replace("%s", strValueOf));
            }
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }
}
