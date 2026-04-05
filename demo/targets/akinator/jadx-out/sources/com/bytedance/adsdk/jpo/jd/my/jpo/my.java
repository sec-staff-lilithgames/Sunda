package com.bytedance.adsdk.jpo.jd.my.jpo;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static Object jpo(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i10 - number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i10 - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i10 - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i10 - number.doubleValue());
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static Object jpo(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j10 - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j10 - number.intValue());
    }

    private static Object jpo(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 - number.intValue());
    }

    private static Object jpo(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 - number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d10 - number.intValue());
    }

    public static Object jpo(Number number, Number number2) {
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
