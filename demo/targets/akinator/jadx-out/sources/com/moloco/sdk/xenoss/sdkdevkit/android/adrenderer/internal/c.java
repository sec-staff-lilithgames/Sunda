package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {
    public static final String a(String str) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = str.getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return x.a(bArrDigest);
    }

    public static final String b(String str) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        URI uri = new URI(str);
        String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "run(...)");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = string.getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return x.a(bArrDigest);
    }
}
