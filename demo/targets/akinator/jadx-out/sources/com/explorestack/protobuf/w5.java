package com.explorestack.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public Field f22796a;

    /* renamed from: b, reason: collision with root package name */
    public c6 f22797b;

    /* renamed from: c, reason: collision with root package name */
    public int f22798c;

    /* renamed from: d, reason: collision with root package name */
    public Field f22799d;

    /* renamed from: e, reason: collision with root package name */
    public int f22800e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22802g;

    /* renamed from: h, reason: collision with root package name */
    public aa f22803h;

    /* renamed from: i, reason: collision with root package name */
    public Class f22804i;

    /* renamed from: j, reason: collision with root package name */
    public Object f22805j;

    /* renamed from: k, reason: collision with root package name */
    public q7 f22806k;

    /* renamed from: l, reason: collision with root package name */
    public Field f22807l;

    public x5 build() {
        aa aaVar = this.f22803h;
        if (aaVar != null) {
            return x5.forOneofMemberField(this.f22798c, this.f22797b, aaVar, this.f22804i, this.f22802g, this.f22806k);
        }
        Object obj = this.f22805j;
        if (obj != null) {
            return x5.forMapField(this.f22796a, this.f22798c, obj, this.f22806k);
        }
        Field field = this.f22799d;
        if (field != null) {
            return this.f22801f ? x5.forProto2RequiredField(this.f22796a, this.f22798c, this.f22797b, field, this.f22800e, this.f22802g, this.f22806k) : x5.forProto2OptionalField(this.f22796a, this.f22798c, this.f22797b, field, this.f22800e, this.f22802g, this.f22806k);
        }
        q7 q7Var = this.f22806k;
        if (q7Var != null) {
            Field field2 = this.f22807l;
            return field2 == null ? x5.forFieldWithEnumVerifier(this.f22796a, this.f22798c, this.f22797b, q7Var) : x5.forPackedFieldWithEnumVerifier(this.f22796a, this.f22798c, this.f22797b, q7Var, field2);
        }
        Field field3 = this.f22807l;
        return field3 == null ? x5.forField(this.f22796a, this.f22798c, this.f22797b, this.f22802g) : x5.forPackedField(this.f22796a, this.f22798c, this.f22797b, field3);
    }

    public w5 withCachedSizeField(Field field) {
        this.f22807l = field;
        return this;
    }

    public w5 withEnforceUtf8(boolean z10) {
        this.f22802g = z10;
        return this;
    }

    public w5 withEnumVerifier(q7 q7Var) {
        this.f22806k = q7Var;
        return this;
    }

    public w5 withField(Field field) {
        if (this.f22803h != null) {
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }
        this.f22796a = field;
        return this;
    }

    public w5 withFieldNumber(int i10) {
        this.f22798c = i10;
        return this;
    }

    public w5 withMapDefaultEntry(Object obj) {
        this.f22805j = obj;
        return this;
    }

    public w5 withOneof(aa aaVar, Class<?> cls) {
        if (this.f22796a != null || this.f22799d != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.f22803h = aaVar;
        this.f22804i = cls;
        return this;
    }

    public w5 withPresence(Field field, int i10) {
        x7.a(field, "presenceField");
        this.f22799d = field;
        this.f22800e = i10;
        return this;
    }

    public w5 withRequired(boolean z10) {
        this.f22801f = z10;
        return this;
    }

    public w5 withType(c6 c6Var) {
        this.f22797b = c6Var;
        return this;
    }
}
