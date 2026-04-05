package bd;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f9149a = new v0();

    /* renamed from: b, reason: collision with root package name */
    public static final c f9150b = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends z0 {

        /* renamed from: e, reason: collision with root package name */
        public final int f9151e;

        public a(int i10, Class<?> cls) {
            super(cls, 0);
            this.f9151e = i10;
        }

        @Override // bd.z0, jc.w
        public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
            String strValueOf;
            switch (this.f9151e) {
                case 1:
                    u0Var.defaultSerializeDateKey((Date) obj, oVar);
                    break;
                case 2:
                    u0Var.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), oVar);
                    break;
                case 3:
                    oVar.writeFieldName(((Class) obj).getName());
                    break;
                case 4:
                    if (u0Var.isEnabled(jc.t0.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r32 = (Enum) obj;
                        strValueOf = u0Var.isEnabled(jc.t0.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r32.ordinal()) : r32.name();
                    }
                    oVar.writeFieldName(strValueOf);
                    break;
                case 5:
                case 6:
                    oVar.writeFieldId(((Number) obj).longValue());
                    break;
                case 7:
                    oVar.writeFieldName(u0Var.getConfig().getBase64Variant().encode((byte[]) obj));
                    break;
                default:
                    oVar.writeFieldName(obj.toString());
                    break;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends z0 {

        /* renamed from: e, reason: collision with root package name */
        public transient ad.t f9152e;

        public b() {
            super(String.class, 0);
            this.f9152e = ad.t.emptyForProperties();
        }

        @Override // bd.z0, jc.w, uc.e
        public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
            hVar.expectStringFormat(oVar);
        }

        @Override // bd.z0, jc.w
        public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
            Class<?> cls = obj.getClass();
            ad.t tVar = this.f9152e;
            jc.w wVarSerializerFor = tVar.serializerFor(cls);
            if (wVarSerializerFor == null) {
                if (cls == Object.class) {
                    wVarSerializerFor = new a(8, cls);
                    this.f9152e = tVar.newWith(cls, wVarSerializerFor);
                } else {
                    ad.q qVarFindAndAddKeySerializer = tVar.findAndAddKeySerializer(cls, u0Var, null);
                    ad.t tVar2 = qVarFindAndAddKeySerializer.f4292b;
                    if (tVar != tVar2) {
                        this.f9152e = tVar2;
                    }
                    wVarSerializerFor = qVarFindAndAddKeySerializer.f4291a;
                }
            }
            wVarSerializerFor.serialize(obj, oVar, u0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends z0 {
        public c() {
            super(String.class, 0);
        }

        @Override // bd.z0, jc.w
        public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
            oVar.writeFieldName((String) obj);
        }
    }

    @Deprecated
    public static jc.w getDefault() {
        return f9149a;
    }

    public static jc.w getFallbackKeySerializer(jc.s0 s0Var, Class<?> cls, rc.e eVar) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new b();
            }
            if (dd.i.isEnumType(cls)) {
                dd.o oVarConstructFromName = dd.o.constructFromName(s0Var, eVar);
                Object objFindEnumNamingStrategy = s0Var.getAnnotationIntrospector().findEnumNamingStrategy(s0Var, eVar);
                boolean zCanOverrideAccessModifiers = s0Var.canOverrideAccessModifiers();
                s0Var.getEnumNamingStrategy();
                rc.n0.createEnumNamingStrategyInstance(objFindEnumNamingStrategy, zCanOverrideAccessModifiers, null);
                return x0.construct(cls, oVarConstructFromName, null);
            }
        }
        return new a(8, cls);
    }

    public static jc.w getStdKeySerializer(jc.s0 s0Var, Class<?> cls, boolean z10) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return f9150b;
        }
        if (cls.isPrimitive()) {
            cls = dd.i.wrapperType(cls);
        }
        if (cls == Integer.class) {
            return new a(5, cls);
        }
        if (cls == Long.class) {
            return new a(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(8, cls);
        }
        if (cls == Class.class) {
            return new a(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(2, cls);
        }
        if (cls == UUID.class) {
            return new a(8, cls);
        }
        if (cls == byte[].class) {
            return new a(7, cls);
        }
        if (z10) {
            return new a(8, cls);
        }
        return null;
    }
}
