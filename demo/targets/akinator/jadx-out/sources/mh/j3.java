package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j3 {
    public static void verify(boolean z10) {
        if (!z10) {
            throw new k3();
        }
    }

    public static <T> T verifyNotNull(T t10) {
        return (T) verifyNotNull(t10, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, objArr));
        }
    }

    public static <T> T verifyNotNull(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new k3(u2.lenientFormat(str, objArr));
    }

    public static void verify(boolean z10, String str, char c10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z10, String str, int i10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Integer.valueOf(i10)));
        }
    }

    public static void verify(boolean z10, String str, long j10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Long.valueOf(j10)));
        }
    }

    public static void verify(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj));
        }
    }

    public static void verify(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void verify(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z10, String str, Object obj, char c10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void verify(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void verify(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void verify(boolean z10, String str, Object obj, int i10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void verify(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void verify(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void verify(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void verify(boolean z10, String str, Object obj, long j10) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, Long.valueOf(j10)));
        }
    }

    public static void verify(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Character.valueOf(c10), obj));
        }
    }

    public static void verify(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Integer.valueOf(i10), obj));
        }
    }

    public static void verify(boolean z10, String str, long j10, Object obj) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, Long.valueOf(j10), obj));
        }
    }

    public static void verify(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, obj2));
        }
    }

    public static void verify(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void verify(boolean z10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z10) {
            throw new k3(u2.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
