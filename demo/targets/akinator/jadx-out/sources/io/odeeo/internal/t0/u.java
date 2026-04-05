package io.odeeo.internal.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return a0.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return a0.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a.b.e(i11, "negative size: "));
    }

    public static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return a0.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return a0.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a.b.e(i11, "negative size: "));
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i10, int i11) {
        return checkElementIndex(i10, i11, "index");
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static int checkPositionIndex(int i10, int i11) {
        return checkPositionIndex(i10, i11, "index");
    }

    public static void checkPositionIndexes(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(a(i10, i11, i12));
        }
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static <T> T checkNotNull(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj));
    }

    public static void checkState(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, char c11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
    }

    public static void checkState(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static String a(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        if (i11 >= 0 && i11 <= i12) {
            return a0.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return b(i11, i12, "end index");
    }

    public static void checkArgument(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Character.valueOf(c10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Character.valueOf(c10), obj));
    }

    public static void checkState(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Character.valueOf(c10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, int i11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static void checkState(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Integer.valueOf(i10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Integer.valueOf(i10), obj));
    }

    public static void checkState(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Integer.valueOf(i10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Long.valueOf(j10), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Long.valueOf(j10), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, long j11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    public static void checkState(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, Long.valueOf(j10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, Long.valueOf(j10), obj));
    }

    public static void checkState(boolean z10, String str, long j10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, Long.valueOf(j10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, Object obj, char c10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, Object obj, int i10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, Object obj, long j10) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, obj2));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2, Object obj3) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z10) {
            throw new IllegalArgumentException(a0.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(a0.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z10) {
            throw new IllegalStateException(a0.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
