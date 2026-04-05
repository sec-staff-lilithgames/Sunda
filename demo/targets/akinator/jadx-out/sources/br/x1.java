package br;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f10014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10015b;

    public x1(z1 targetSideType, String targetName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetSideType, "targetSideType");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetName, "targetName");
        this.f10014a = targetSideType;
        Locale locale = Locale.ENGLISH;
        this.f10015b = b0.e2.p(locale, "ENGLISH", targetName, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public final String getTargetName() {
        return this.f10015b;
    }

    public final z1 getTargetSideType() {
        return this.f10014a;
    }
}
