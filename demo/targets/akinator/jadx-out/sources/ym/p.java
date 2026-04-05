package ym;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p extends u {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f94685e = {"creativeType"};

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94685e;
    }

    @Override // ym.u
    public boolean isTextSupported() {
        return true;
    }

    @Override // ym.u
    public boolean isValidTag() {
        String strA = a("creativeType");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return strA.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}
