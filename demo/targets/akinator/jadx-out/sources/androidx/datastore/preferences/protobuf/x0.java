package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Field f6103b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f6104c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f6105e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6106f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f6107g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6108h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6109i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6110j;

    /* renamed from: k, reason: collision with root package name */
    public final z2 f6111k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f6112l;

    /* renamed from: m, reason: collision with root package name */
    public final Class f6113m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f6114n;

    public x0(Field field, int i10, b1 b1Var, Class cls, Field field2, int i11, boolean z10, boolean z11, z2 z2Var, Class cls2, Object obj, Field field3) {
        this.f6103b = field;
        this.f6104c = b1Var;
        this.f6105e = cls;
        this.f6106f = i10;
        this.f6107g = field2;
        this.f6108h = i11;
        this.f6109i = z10;
        this.f6110j = z11;
        this.f6111k = z2Var;
        this.f6113m = cls2;
        this.f6114n = obj;
        this.f6112l = field3;
    }

    public static void a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(a.b.e(i10, "fieldNumber must be positive: "));
        }
    }

    public static x0 forExplicitPresenceField(Field field, int i10, b1 b1Var, Field field2, int i11, boolean z10, o1 o1Var) {
        a(i10);
        t1.a(field, "field");
        t1.a(b1Var, "fieldType");
        t1.a(field2, "presenceField");
        if (i11 == 0 || (i11 & (i11 - 1)) != 0) {
            throw new IllegalArgumentException(a.b.e(i11, "presenceMask must have exactly one bit set: "));
        }
        return new x0(field, i10, b1Var, null, field2, i11, false, z10, null, null, null, null);
    }

    public static x0 forField(Field field, int i10, b1 b1Var, boolean z10) {
        a(i10);
        t1.a(field, "field");
        t1.a(b1Var, "fieldType");
        if (b1Var == b1.f5811h || b1Var == b1.f5814k) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i10, b1Var, null, null, 0, false, z10, null, null, null, null);
    }

    public static x0 forFieldWithEnumVerifier(Field field, int i10, b1 b1Var, o1 o1Var) {
        a(i10);
        t1.a(field, "field");
        return new x0(field, i10, b1Var, null, null, 0, false, false, null, null, null, null);
    }

    public static x0 forLegacyRequiredField(Field field, int i10, b1 b1Var, Field field2, int i11, boolean z10, o1 o1Var) {
        a(i10);
        t1.a(field, "field");
        t1.a(b1Var, "fieldType");
        t1.a(field2, "presenceField");
        if (i11 == 0 || (i11 & (i11 - 1)) != 0) {
            throw new IllegalArgumentException(a.b.e(i11, "presenceMask must have exactly one bit set: "));
        }
        return new x0(field, i10, b1Var, null, field2, i11, true, z10, null, null, null, null);
    }

    public static x0 forMapField(Field field, int i10, Object obj, o1 o1Var) {
        t1.a(obj, "mapDefaultEntry");
        a(i10);
        t1.a(field, "field");
        return new x0(field, i10, b1.f5815l, null, null, 0, false, true, null, null, obj, null);
    }

    public static x0 forOneofMemberField(int i10, b1 b1Var, z2 z2Var, Class<?> cls, boolean z10, o1 o1Var) {
        a(i10);
        t1.a(b1Var, "fieldType");
        t1.a(z2Var, "oneof");
        t1.a(cls, "oneofStoredType");
        if (b1Var.isScalar()) {
            return new x0(null, i10, b1Var, null, null, 0, false, z10, z2Var, cls, null, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + b1Var);
    }

    public static x0 forPackedField(Field field, int i10, b1 b1Var, Field field2) {
        a(i10);
        t1.a(field, "field");
        t1.a(b1Var, "fieldType");
        if (b1Var == b1.f5811h || b1Var == b1.f5814k) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i10, b1Var, null, null, 0, false, false, null, null, null, field2);
    }

    public static x0 forPackedFieldWithEnumVerifier(Field field, int i10, b1 b1Var, o1 o1Var, Field field2) {
        a(i10);
        t1.a(field, "field");
        return new x0(field, i10, b1Var, null, null, 0, false, false, null, null, null, field2);
    }

    public static x0 forRepeatedMessageField(Field field, int i10, b1 b1Var, Class<?> cls) {
        a(i10);
        t1.a(field, "field");
        t1.a(b1Var, "fieldType");
        t1.a(cls, "messageClass");
        return new x0(field, i10, b1Var, cls, null, 0, false, false, null, null, null, null);
    }

    public static w0 newBuilder() {
        return new w0();
    }

    public Field getCachedSizeField() {
        return this.f6112l;
    }

    public o1 getEnumVerifier() {
        return null;
    }

    public Field getField() {
        return this.f6103b;
    }

    public int getFieldNumber() {
        return this.f6106f;
    }

    public Class<?> getListElementType() {
        return this.f6105e;
    }

    public Object getMapDefaultEntry() {
        return this.f6114n;
    }

    public Class<?> getMessageFieldClass() {
        int iOrdinal = this.f6104c.ordinal();
        if (iOrdinal == 9 || iOrdinal == 17) {
            Field field = this.f6103b;
            return field != null ? field.getType() : this.f6113m;
        }
        if (iOrdinal == 27 || iOrdinal == 49) {
            return this.f6105e;
        }
        return null;
    }

    public z2 getOneof() {
        return this.f6111k;
    }

    public Class<?> getOneofStoredType() {
        return this.f6113m;
    }

    public Field getPresenceField() {
        return this.f6107g;
    }

    public int getPresenceMask() {
        return this.f6108h;
    }

    public b1 getType() {
        return this.f6104c;
    }

    public boolean isEnforceUtf8() {
        return this.f6110j;
    }

    public boolean isRequired() {
        return this.f6109i;
    }

    @Override // java.lang.Comparable
    public int compareTo(x0 x0Var) {
        return this.f6106f - x0Var.f6106f;
    }
}
