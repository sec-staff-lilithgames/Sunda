package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3200ed {

    /* renamed from: a, reason: collision with root package name */
    private final String f36613a;

    public C3200ed(String baseControllerUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f36613a = baseControllerUrl;
    }

    public final String a() {
        String str = this.f36613a;
        String strSubstring = str.substring(0, sv.n0.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
