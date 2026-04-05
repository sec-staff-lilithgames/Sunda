package com.explorestack.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x5 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Field f22860b;

    /* renamed from: c, reason: collision with root package name */
    public final c6 f22861c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f22862e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22863f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f22864g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22865h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22866i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f22867j;

    /* renamed from: k, reason: collision with root package name */
    public final aa f22868k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f22869l;

    /* renamed from: m, reason: collision with root package name */
    public final Class f22870m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f22871n;

    /* renamed from: o, reason: collision with root package name */
    public final q7 f22872o;

    public x5(Field field, int i10, c6 c6Var, Class cls, Field field2, int i11, boolean z10, boolean z11, aa aaVar, Class cls2, Object obj, q7 q7Var, Field field3) {
        this.f22860b = field;
        this.f22861c = c6Var;
        this.f22862e = cls;
        this.f22863f = i10;
        this.f22864g = field2;
        this.f22865h = i11;
        this.f22866i = z10;
        this.f22867j = z11;
        this.f22868k = aaVar;
        this.f22870m = cls2;
        this.f22871n = obj;
        this.f22872o = q7Var;
        this.f22869l = field3;
    }

    public static void a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(a.b.e(i10, "fieldNumber must be positive: "));
        }
    }

    public static x5 forField(Field field, int i10, c6 c6Var, boolean z10) {
        a(i10);
        x7.a(field, "field");
        x7.a(c6Var, "fieldType");
        if (c6Var == c6.I || c6Var == c6.f21991e0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x5(field, i10, c6Var, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static x5 forFieldWithEnumVerifier(Field field, int i10, c6 c6Var, q7 q7Var) {
        a(i10);
        x7.a(field, "field");
        return new x5(field, i10, c6Var, null, null, 0, false, false, null, null, null, q7Var, null);
    }

    public static x5 forMapField(Field field, int i10, Object obj, q7 q7Var) {
        x7.a(obj, "mapDefaultEntry");
        a(i10);
        x7.a(field, "field");
        return new x5(field, i10, c6.f21992f0, null, null, 0, false, true, null, null, obj, q7Var, null);
    }

    public static x5 forOneofMemberField(int i10, c6 c6Var, aa aaVar, Class<?> cls, boolean z10, q7 q7Var) {
        a(i10);
        x7.a(c6Var, "fieldType");
        x7.a(aaVar, "oneof");
        x7.a(cls, "oneofStoredType");
        if (c6Var.isScalar()) {
            return new x5(null, i10, c6Var, null, null, 0, false, z10, aaVar, cls, null, q7Var, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + c6Var);
    }

    public static x5 forPackedField(Field field, int i10, c6 c6Var, Field field2) {
        a(i10);
        x7.a(field, "field");
        x7.a(c6Var, "fieldType");
        if (c6Var == c6.I || c6Var == c6.f21991e0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x5(field, i10, c6Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static x5 forPackedFieldWithEnumVerifier(Field field, int i10, c6 c6Var, q7 q7Var, Field field2) {
        a(i10);
        x7.a(field, "field");
        return new x5(field, i10, c6Var, null, null, 0, false, false, null, null, null, q7Var, field2);
    }

    public static x5 forProto2OptionalField(Field field, int i10, c6 c6Var, Field field2, int i11, boolean z10, q7 q7Var) {
        a(i10);
        x7.a(field, "field");
        x7.a(c6Var, "fieldType");
        x7.a(field2, "presenceField");
        if (i11 == 0 || (i11 & (i11 - 1)) != 0) {
            throw new IllegalArgumentException(a.b.e(i11, "presenceMask must have exactly one bit set: "));
        }
        return new x5(field, i10, c6Var, null, field2, i11, false, z10, null, null, null, q7Var, null);
    }

    public static x5 forProto2RequiredField(Field field, int i10, c6 c6Var, Field field2, int i11, boolean z10, q7 q7Var) {
        a(i10);
        x7.a(field, "field");
        x7.a(c6Var, "fieldType");
        x7.a(field2, "presenceField");
        if (i11 == 0 || (i11 & (i11 - 1)) != 0) {
            throw new IllegalArgumentException(a.b.e(i11, "presenceMask must have exactly one bit set: "));
        }
        return new x5(field, i10, c6Var, null, field2, i11, true, z10, null, null, null, q7Var, null);
    }

    public static x5 forRepeatedMessageField(Field field, int i10, c6 c6Var, Class<?> cls) {
        a(i10);
        x7.a(field, "field");
        x7.a(c6Var, "fieldType");
        x7.a(cls, "messageClass");
        return new x5(field, i10, c6Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    public static w5 newBuilder() {
        return new w5();
    }

    public Field getCachedSizeField() {
        return this.f22869l;
    }

    public q7 getEnumVerifier() {
        return this.f22872o;
    }

    public Field getField() {
        return this.f22860b;
    }

    public int getFieldNumber() {
        return this.f22863f;
    }

    public Class<?> getListElementType() {
        return this.f22862e;
    }

    public Object getMapDefaultEntry() {
        return this.f22871n;
    }

    public Class<?> getMessageFieldClass() {
        int iOrdinal = this.f22861c.ordinal();
        if (iOrdinal == 9 || iOrdinal == 17) {
            Field field = this.f22860b;
            return field != null ? field.getType() : this.f22870m;
        }
        if (iOrdinal == 27 || iOrdinal == 49) {
            return this.f22862e;
        }
        return null;
    }

    public aa getOneof() {
        return this.f22868k;
    }

    public Class<?> getOneofStoredType() {
        return this.f22870m;
    }

    public Field getPresenceField() {
        return this.f22864g;
    }

    public int getPresenceMask() {
        return this.f22865h;
    }

    public c6 getType() {
        return this.f22861c;
    }

    public boolean isEnforceUtf8() {
        return this.f22867j;
    }

    public boolean isRequired() {
        return this.f22866i;
    }

    @Override // java.lang.Comparable
    public int compareTo(x5 x5Var) {
        return this.f22863f - x5Var.f22863f;
    }
}
