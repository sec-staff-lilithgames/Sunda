package com.bytedance.adsdk.jpo.jd.my.jpo;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm {
    private static Object jpo(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static Object jpo(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j10 < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j10 < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j10) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static Object jpo(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(o2.i(number, "This type of addition operation is not supported"));
    }

    private static Object jpo(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d10 < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d10 < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d10 < number.doubleValue());
        }
        throw new UnsupportedOperationException(o2.i(number, LJjmO.pFbO));
    }

    public static Object jpo(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return jpo(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return jpo(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return jpo(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return jpo(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return jpo(((Number) obj).intValue(), number);
    }
}
