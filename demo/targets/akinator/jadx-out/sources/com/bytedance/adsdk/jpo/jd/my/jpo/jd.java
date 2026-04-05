package com.bytedance.adsdk.jpo.jd.my.jpo;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static boolean jpo(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static boolean jpo(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j10 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j10 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static boolean jpo(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static boolean jpo(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    public static boolean jpo(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return jpo(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return jpo(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return jpo(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
        }
        return jpo(number.intValue(), number2);
    }
}
