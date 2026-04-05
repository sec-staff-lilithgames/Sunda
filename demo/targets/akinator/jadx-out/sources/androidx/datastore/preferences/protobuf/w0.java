package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public Field f6068a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f6069b;

    /* renamed from: c, reason: collision with root package name */
    public int f6070c;

    /* renamed from: d, reason: collision with root package name */
    public Field f6071d;

    /* renamed from: e, reason: collision with root package name */
    public int f6072e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6073f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6074g;

    /* renamed from: h, reason: collision with root package name */
    public z2 f6075h;

    /* renamed from: i, reason: collision with root package name */
    public Class f6076i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6077j;

    /* renamed from: k, reason: collision with root package name */
    public Field f6078k;

    public x0 build() {
        z2 z2Var = this.f6075h;
        if (z2Var != null) {
            return x0.forOneofMemberField(this.f6070c, this.f6069b, z2Var, this.f6076i, this.f6074g, null);
        }
        Object obj = this.f6077j;
        if (obj != null) {
            return x0.forMapField(this.f6068a, this.f6070c, obj, null);
        }
        Field field = this.f6071d;
        if (field != null) {
            return this.f6073f ? x0.forLegacyRequiredField(this.f6068a, this.f6070c, this.f6069b, field, this.f6072e, this.f6074g, null) : x0.forExplicitPresenceField(this.f6068a, this.f6070c, this.f6069b, field, this.f6072e, this.f6074g, null);
        }
        Field field2 = this.f6078k;
        return field2 == null ? x0.forField(this.f6068a, this.f6070c, this.f6069b, this.f6074g) : x0.forPackedField(this.f6068a, this.f6070c, this.f6069b, field2);
    }

    public w0 withCachedSizeField(Field field) {
        this.f6078k = field;
        return this;
    }

    public w0 withEnforceUtf8(boolean z10) {
        this.f6074g = z10;
        return this;
    }

    public w0 withField(Field field) {
        if (this.f6075h != null) {
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }
        this.f6068a = field;
        return this;
    }

    public w0 withFieldNumber(int i10) {
        this.f6070c = i10;
        return this;
    }

    public w0 withMapDefaultEntry(Object obj) {
        this.f6077j = obj;
        return this;
    }

    public w0 withOneof(z2 z2Var, Class<?> cls) {
        if (this.f6068a != null || this.f6071d != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.f6075h = z2Var;
        this.f6076i = cls;
        return this;
    }

    public w0 withPresence(Field field, int i10) {
        t1.a(field, "presenceField");
        this.f6071d = field;
        this.f6072e = i10;
        return this;
    }

    public w0 withRequired(boolean z10) {
        this.f6073f = z10;
        return this;
    }

    public w0 withType(b1 b1Var) {
        this.f6069b = b1Var;
        return this;
    }

    public w0 withEnumVerifier(o1 o1Var) {
        return this;
    }
}
