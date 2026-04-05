package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 implements a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f86801b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f86802c;

    /* renamed from: e, reason: collision with root package name */
    public final String f86803e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f86804f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86805g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f86806h;

    public y0(w0 w0Var, v0 v0Var, String str, Class cls, boolean z10, Boolean bool) {
        this.f86804f = cls;
        this.f86801b = w0Var;
        this.f86802c = v0Var;
        this.f86803e = str;
        this.f86805g = z10;
        this.f86806h = bool;
    }

    public static y0 construct(w0 w0Var, v0 v0Var, String str, Class<?> cls, boolean z10, Boolean bool) {
        if (str == null || str.isEmpty()) {
            str = w0Var != null ? w0Var.getDefaultPropertyName() : "";
        }
        String str2 = str;
        if (cls == null || cls.isAnnotation()) {
            cls = null;
        }
        return new y0(w0Var, v0Var, str2, cls, z10, bool);
    }

    public static y0 from(z0 z0Var) {
        if (z0Var == null) {
            return null;
        }
        return construct(z0Var.use(), z0Var.include(), z0Var.property(), z0Var.defaultImpl(), z0Var.visible(), z0Var.requireTypeIdForSubtypes().asBoolean());
    }

    public static boolean isEnabled(y0 y0Var) {
        w0 w0Var;
        return (y0Var == null || (w0Var = y0Var.f86801b) == null || w0Var == w0.f86793c) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            goto L54
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            goto L55
        L8:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<tb.y0> r3 = tb.y0.class
            if (r2 != r3) goto L55
            tb.y0 r5 = (tb.y0) r5
            tb.w0 r2 = r4.f86801b
            tb.w0 r3 = r5.f86801b
            if (r2 != r3) goto L55
            tb.v0 r2 = r4.f86802c
            tb.v0 r3 = r5.f86802c
            if (r2 != r3) goto L55
            java.lang.Class r2 = r4.f86804f
            java.lang.Class r3 = r5.f86804f
            if (r2 != r3) goto L55
            boolean r2 = r4.f86805g
            boolean r3 = r5.f86805g
            if (r2 != r3) goto L55
            java.lang.String r2 = r5.f86803e
            java.lang.String r3 = r4.f86803e
            if (r3 != 0) goto L36
            if (r2 != 0) goto L34
            r2 = r0
            goto L3d
        L34:
            r2 = r1
            goto L3d
        L36:
            if (r2 != 0) goto L39
            goto L34
        L39:
            boolean r2 = r3.equals(r2)
        L3d:
            if (r2 == 0) goto L55
            java.lang.Boolean r5 = r5.f86806h
            java.lang.Boolean r2 = r4.f86806h
            if (r2 != 0) goto L4b
            if (r5 != 0) goto L49
            r5 = r0
            goto L52
        L49:
            r5 = r1
            goto L52
        L4b:
            if (r5 != 0) goto L4e
            goto L49
        L4e:
            boolean r5 = r2.equals(r5)
        L52:
            if (r5 == 0) goto L55
        L54:
            return r0
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y0.equals(java.lang.Object):boolean");
    }

    public Class<?> getDefaultImpl() {
        return this.f86804f;
    }

    public w0 getIdType() {
        return this.f86801b;
    }

    public boolean getIdVisible() {
        return this.f86805g;
    }

    public v0 getInclusionType() {
        return this.f86802c;
    }

    public String getPropertyName() {
        return this.f86803e;
    }

    public Boolean getRequireTypeIdForSubtypes() {
        return this.f86806h;
    }

    public int hashCode() {
        w0 w0Var = this.f86801b;
        int iHashCode = ((w0Var != null ? w0Var.hashCode() : 0) + 31) * 31;
        v0 v0Var = this.f86802c;
        int iHashCode2 = (iHashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        String str = this.f86803e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Class cls = this.f86804f;
        return ((((iHashCode3 + (cls != null ? cls.hashCode() : 0)) * 31) + (this.f86806h.booleanValue() ? 11 : -17)) * 31) + (this.f86805g ? 11 : -17);
    }

    public String toString() {
        Class cls = this.f86804f;
        String name = cls == null ? "NULL" : cls.getName();
        StringBuilder sb2 = new StringBuilder("JsonTypeInfo.Value(idType=");
        sb2.append(this.f86801b);
        sb2.append(",includeAs=");
        sb2.append(this.f86802c);
        sb2.append(",propertyName=");
        com.google.android.gms.internal.play_billing.a.B(sb2, this.f86803e, ",defaultImpl=", name, ",idVisible=");
        sb2.append(this.f86805g);
        sb2.append(",requireTypeIdForSubtypes=");
        sb2.append(this.f86806h);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // tb.a
    public Class<z0> valueFor() {
        return z0.class;
    }

    public y0 withDefaultImpl(Class<?> cls) {
        if (cls == this.f86804f) {
            return this;
        }
        return new y0(this.f86801b, this.f86802c, this.f86803e, cls, this.f86805g, this.f86806h);
    }

    public y0 withIdType(w0 w0Var) {
        if (w0Var == this.f86801b) {
            return this;
        }
        return new y0(w0Var, this.f86802c, this.f86803e, this.f86804f, this.f86805g, this.f86806h);
    }

    public y0 withIdVisible(boolean z10) {
        if (z10 == this.f86805g) {
            return this;
        }
        return new y0(this.f86801b, this.f86802c, this.f86803e, this.f86804f, z10, this.f86806h);
    }

    public y0 withInclusionType(v0 v0Var) {
        if (v0Var == this.f86802c) {
            return this;
        }
        return new y0(this.f86801b, v0Var, this.f86803e, this.f86804f, this.f86805g, this.f86806h);
    }

    public y0 withPropertyName(String str) {
        if (str == this.f86803e) {
            return this;
        }
        return new y0(this.f86801b, this.f86802c, str, this.f86804f, this.f86805g, this.f86806h);
    }

    public y0 withRequireTypeIdForSubtypes(Boolean bool) {
        if (this.f86806h == bool) {
            return this;
        }
        return new y0(this.f86801b, this.f86802c, this.f86803e, this.f86804f, this.f86805g, bool);
    }
}
