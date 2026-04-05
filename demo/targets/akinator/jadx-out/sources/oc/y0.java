package oc;

import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class y0 extends jc.x implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f78963b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f78964c;

    /* renamed from: e, reason: collision with root package name */
    public final t f78965e;

    public y0(int i10, Class cls, t tVar) {
        this.f78963b = i10;
        this.f78964c = cls;
        this.f78965e = tVar;
    }

    public static y0 forType(Class<?> cls) {
        int i10;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return x0.forType(cls);
        }
        if (cls == UUID.class) {
            i10 = 12;
        } else if (cls == Integer.class) {
            i10 = 5;
        } else if (cls == Long.class) {
            i10 = 6;
        } else if (cls == Date.class) {
            i10 = 10;
        } else if (cls == Calendar.class) {
            i10 = 11;
        } else if (cls == Boolean.class) {
            i10 = 1;
        } else if (cls == Byte.class) {
            i10 = 2;
        } else if (cls == Character.class) {
            i10 = 4;
        } else if (cls == Short.class) {
            i10 = 3;
        } else if (cls == Float.class) {
            i10 = 7;
        } else if (cls == Double.class) {
            i10 = 8;
        } else if (cls == URI.class) {
            i10 = 13;
        } else if (cls == URL.class) {
            i10 = 14;
        } else if (cls == Class.class) {
            i10 = 15;
        } else {
            if (cls == Locale.class) {
                return new y0(9, cls, t.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new y0(16, cls, t.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i10 = 17;
        }
        return new y0(i10, cls, null);
    }

    public Object _parse(String str, jc.k kVar) {
        int i10 = this.f78963b;
        Class<?> cls = this.f78964c;
        switch (i10) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : kVar.handleWeirdKey(cls, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i11 = cc.m.parseInt(str);
                return (i11 < -128 || i11 > 255) ? kVar.handleWeirdKey(cls, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i11);
            case 3:
                int i12 = cc.m.parseInt(str);
                return (i12 < -32768 || i12 > 32767) ? kVar.handleWeirdKey(cls, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i12);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : kVar.handleWeirdKey(cls, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(cc.m.parseInt(str));
            case 6:
                return Long.valueOf(cc.m.parseLong(str));
            case 7:
                return Float.valueOf((float) cc.m.parseDouble(str, false));
            case 8:
                return Double.valueOf(cc.m.parseDouble(str, false));
            case 9:
            case 16:
                try {
                    return this.f78965e.V(str, kVar);
                } catch (IllegalArgumentException e10) {
                    return a(kVar, str, e10);
                }
            case 10:
                return kVar.parseDate(str);
            case 11:
                return kVar.constructCalendar(kVar.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e11) {
                    return a(kVar, str, e11);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e12) {
                    return a(kVar, str, e12);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e13) {
                    return a(kVar, str, e13);
                }
            case 15:
                try {
                    return kVar.findClass(str);
                } catch (Exception unused) {
                    return kVar.handleWeirdKey(cls, str, "unable to parse key as Class", new Object[0]);
                }
            case 17:
                try {
                    return kVar.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e14) {
                    return a(kVar, str, e14);
                }
            default:
                throw new IllegalStateException(a.b.i(cls, "Internal error: unknown key type "));
        }
    }

    public final Object a(jc.k kVar, String str, Exception exc) {
        return kVar.handleWeirdKey(this.f78964c, str, "problem: %s", dd.i.exceptionMessage(exc));
    }

    @Override // jc.x
    public Object deserializeKey(String str, jc.k kVar) throws IOException {
        Class<?> cls = this.f78964c;
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, kVar);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (dd.i.isEnumType(cls) && kVar.getConfig().isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return kVar.handleWeirdKey(cls, str, "not a valid representation", new Object[0]);
        } catch (Exception e10) {
            return kVar.handleWeirdKey(cls, str, "not a valid representation, problem: (%s) %s", e10.getClass().getName(), dd.i.exceptionMessage(e10));
        }
    }

    public Class<?> getKeyClass() {
        return this.f78964c;
    }
}
