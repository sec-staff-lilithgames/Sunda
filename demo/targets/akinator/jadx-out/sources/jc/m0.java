package jc;

import java.io.Serializable;
import tb.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f69371j = new m0(Boolean.TRUE, null, null, null, null, null, null);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f69372k = new m0(Boolean.FALSE, null, null, null, null, null, null);

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f69373l = new m0(null, null, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f69374b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69375c;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f69376e;

    /* renamed from: f, reason: collision with root package name */
    public final String f69377f;

    /* renamed from: g, reason: collision with root package name */
    public final transient l0 f69378g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f69379h;

    /* renamed from: i, reason: collision with root package name */
    public final e1 f69380i;

    public m0(Boolean bool, String str, Integer num, String str2, l0 l0Var, e1 e1Var, e1 e1Var2) {
        this.f69374b = bool;
        this.f69375c = str;
        this.f69376e = num;
        this.f69377f = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f69378g = l0Var;
        this.f69379h = e1Var;
        this.f69380i = e1Var2;
    }

    public static m0 construct(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? f69373l : bool.booleanValue() ? f69371j : f69372k : new m0(bool, str, num, str2, null, null, null);
    }

    public e1 getContentNulls() {
        return this.f69380i;
    }

    public String getDefaultValue() {
        return this.f69377f;
    }

    public String getDescription() {
        return this.f69375c;
    }

    public Integer getIndex() {
        return this.f69376e;
    }

    public l0 getMergeInfo() {
        return this.f69378g;
    }

    public Boolean getRequired() {
        return this.f69374b;
    }

    public e1 getValueNulls() {
        return this.f69379h;
    }

    public boolean hasDefaultValue() {
        return this.f69377f != null;
    }

    public boolean hasIndex() {
        return this.f69376e != null;
    }

    public boolean isRequired() {
        Boolean bool = this.f69374b;
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r9.equals(r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.m0 withDefaultValue(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f69377f
            if (r9 == 0) goto L14
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto Lb
            goto L14
        Lb:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L12
            goto L16
        L12:
            r4 = r9
            goto L19
        L14:
            if (r0 != 0) goto L17
        L16:
            return r8
        L17:
            r9 = 0
            goto L12
        L19:
            jc.m0 r0 = new jc.m0
            tb.e1 r6 = r8.f69379h
            tb.e1 r7 = r8.f69380i
            java.lang.Boolean r1 = r8.f69374b
            java.lang.String r2 = r8.f69375c
            java.lang.Integer r3 = r8.f69376e
            jc.l0 r5 = r8.f69378g
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.m0.withDefaultValue(java.lang.String):jc.m0");
    }

    public m0 withDescription(String str) {
        return new m0(this.f69374b, str, this.f69376e, this.f69377f, this.f69378g, this.f69379h, this.f69380i);
    }

    public m0 withIndex(Integer num) {
        return new m0(this.f69374b, this.f69375c, num, this.f69377f, this.f69378g, this.f69379h, this.f69380i);
    }

    public m0 withMergeInfo(l0 l0Var) {
        return new m0(this.f69374b, this.f69375c, this.f69376e, this.f69377f, l0Var, this.f69379h, this.f69380i);
    }

    public m0 withNulls(e1 e1Var, e1 e1Var2) {
        return new m0(this.f69374b, this.f69375c, this.f69376e, this.f69377f, this.f69378g, e1Var, e1Var2);
    }

    public m0 withRequired(Boolean bool) {
        Boolean bool2 = this.f69374b;
        if (bool != null ? bool.equals(bool2) : bool2 == null) {
            return this;
        }
        return new m0(bool, this.f69375c, this.f69376e, this.f69377f, this.f69378g, this.f69379h, this.f69380i);
    }

    @Deprecated
    public static m0 construct(boolean z10, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z10 ? f69371j : f69372k;
        }
        return new m0(Boolean.valueOf(z10), str, num, str2, null, null, null);
    }
}
