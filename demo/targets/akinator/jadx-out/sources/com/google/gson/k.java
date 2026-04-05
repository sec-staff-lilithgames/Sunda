package com.google.gson;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f30059d = new k("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final k f30060e = new k("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    public final String f30061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30062b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30063c;

    public k(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f30061a = str;
        this.f30062b = str2;
        this.f30063c = z10;
    }

    public String getIndent() {
        return this.f30062b;
    }

    public String getNewline() {
        return this.f30061a;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.f30063c;
    }

    public k withIndent(String str) {
        return new k(this.f30061a, str, this.f30063c);
    }

    public k withNewline(String str) {
        return new k(str, this.f30062b, this.f30063c);
    }

    public k withSpaceAfterSeparators(boolean z10) {
        return new k(this.f30061a, this.f30062b, z10);
    }
}
