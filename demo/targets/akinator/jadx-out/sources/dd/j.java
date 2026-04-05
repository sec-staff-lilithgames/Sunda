package dd;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f52026e = new j();

    /* renamed from: a, reason: collision with root package name */
    public final Field f52027a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f52028b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52029c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52030d;

    public j() throws SecurityException {
        String string;
        Field fieldA;
        String string2;
        Field fieldA2 = null;
        try {
            fieldA = a(EnumSet.class, "elementType");
            string = null;
        } catch (Exception e10) {
            string = e10.toString();
            fieldA = null;
        }
        this.f52027a = fieldA;
        this.f52029c = string;
        try {
            string2 = null;
            fieldA2 = a(EnumMap.class, "keyType");
        } catch (Exception e11) {
            string2 = e11.toString();
        }
        this.f52028b = fieldA2;
        this.f52030d = string2;
    }

    public static Field a(Class cls, String str) throws SecurityException {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException(e3.g.l("No field named '", str, "' in class '", cls.getName(), "'"));
    }

    public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
        Field field = this.f52027a;
        if (field != null) {
            try {
                return (Class) field.get(enumSet);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.f52029c);
    }

    public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
        Field field = this.f52028b;
        if (field != null) {
            try {
                return (Class) field.get(enumMap);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.f52030d);
    }
}
