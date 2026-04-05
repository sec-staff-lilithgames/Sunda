package com.applovin.impl;

import com.applovin.mediation.MaxError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    private final b5 f13408a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13409b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13410c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13411d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f13412e;

    /* renamed from: f, reason: collision with root package name */
    private final long f13413f;

    /* renamed from: g, reason: collision with root package name */
    private final long f13414g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13415h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(a5 a5Var);
    }

    private a5(b5 b5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(b5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static a5 a(b5 b5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (b5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new a5(b5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f13414g;
    }

    public MaxError c() {
        return this.f13412e;
    }

    public String d() {
        return this.f13409b;
    }

    public String e() {
        return this.f13411d;
    }

    public b5 f() {
        return this.f13408a;
    }

    public boolean g() {
        return this.f13415h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f13408a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f13409b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f13410c);
        sb2.append("', mSignalDataLength='");
        String str = this.f13411d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append("', mErrorMessage=");
        MaxError maxError = this.f13412e;
        return p0.o2.q(sb2, maxError != null ? maxError.getMessage() : "", AbstractJsonLexerKt.END_OBJ);
    }

    private a5(b5 b5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f13408a = b5Var;
        this.f13411d = str;
        this.f13412e = maxError;
        this.f13413f = j10;
        this.f13414g = j11;
        this.f13409b = str2;
        this.f13410c = str3;
        this.f13415h = z10;
    }

    public static a5 a(b5 b5Var, MaxError maxError) {
        return a(b5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static a5 a(b5 b5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (b5Var != null) {
            return new a5(b5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static a5 a(a5 a5Var) {
        return new a5(a5Var.f(), a5Var.e(), a5Var.c(), a5Var.f13413f, a5Var.f13414g, a5Var.d(), a5Var.a(), true);
    }

    public String a() {
        return this.f13410c;
    }
}
