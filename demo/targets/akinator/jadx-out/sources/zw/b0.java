package zw;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b0 implements a0 {
    @Override // zw.a0
    public h0 match(Class cls) throws Exception {
        String name = cls.getName();
        if (name.startsWith("java.lang")) {
            if (cls == Boolean.class) {
                return new g();
            }
            if (cls == Integer.class) {
                return new w();
            }
            if (cls == Long.class) {
                return new z();
            }
            if (cls == Double.class) {
                return new r();
            }
            if (cls == Float.class) {
                return new u();
            }
            if (cls == Short.class) {
                return new d0();
            }
            if (cls == Byte.class) {
                return new h();
            }
            if (cls == Character.class) {
                return new j();
            }
            if (cls == String.class) {
                return new f0();
            }
            if (cls == Class.class) {
                return new k();
            }
            return null;
        }
        if (name.startsWith("java.util")) {
            if (cls == Date.class) {
                return new n(cls);
            }
            if (cls == Locale.class) {
                return new y();
            }
            if (cls == Currency.class) {
                return new l();
            }
            if (cls == GregorianCalendar.class) {
                return new v();
            }
            if (cls == TimeZone.class) {
                return new g0();
            }
            if (cls == AtomicInteger.class) {
                return new c();
            }
            if (cls == AtomicLong.class) {
                return new d();
            }
            return null;
        }
        if (name.startsWith("java.net")) {
            if (cls == URL.class) {
                return new k0();
            }
            return null;
        }
        if (name.startsWith("java.io")) {
            if (cls == File.class) {
                return new t();
            }
            return null;
        }
        if (name.startsWith("java.sql")) {
            if (cls == Time.class) {
                return new n(cls);
            }
            if (cls == java.sql.Date.class) {
                return new n(cls);
            }
            if (cls == Timestamp.class) {
                return new n(cls);
            }
            return null;
        }
        if (name.startsWith("java.math")) {
            if (cls == BigDecimal.class) {
                return new e();
            }
            if (cls == BigInteger.class) {
                return new f();
            }
            return null;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            if (superclass.isEnum()) {
                return new s(cls);
            }
            if (cls.isEnum()) {
                return new s(cls);
            }
        }
        return null;
    }
}
