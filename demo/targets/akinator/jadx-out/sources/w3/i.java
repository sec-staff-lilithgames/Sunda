package w3;

import android.text.TextUtils;
import j1.o2;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(o2.l(str, " must not be NaN"));
        }
        if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(o2.l(str, " must not be infinite"));
        }
        return f10;
    }

    public static int checkArgumentInRange(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too low)");
        }
        if (i10 <= i12) {
            return i10;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too high)");
    }

    public static int checkArgumentNonnegative(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static void checkState(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t10) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException();
        }
        return t10;
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkArgumentNonnegative(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z10) {
        checkState(z10, null);
    }

    public static void checkArgument(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t10, Object obj) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t10;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t10, String str, Object... objArr) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }

    public static long checkArgumentInRange(long j10, long j11, long j12, String str) {
        if (j10 < j11) {
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" is out of range of [");
            sb2.append(j11);
            sb2.append(", ");
            throw new IllegalArgumentException(a.b.g(j12, "] (too low)", sb2));
        }
        if (j10 <= j12) {
            return j10;
        }
        Locale locale2 = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" is out of range of [");
        sb3.append(j11);
        sb3.append(", ");
        throw new IllegalArgumentException(a.b.g(j12, "] (too high)", sb3));
    }

    public static float checkArgumentInRange(float f10, float f11, float f12, String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static double checkArgumentInRange(double d10, double d11, double d12, String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
        if (d10 <= d12) {
            return d10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
    }
}
