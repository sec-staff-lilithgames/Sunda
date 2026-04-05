package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 {
    public static Context.App.Release a(android.content.Context context) {
        BuildInfo buildInfoObtain = BuildInfo.obtain(context);
        Context.App.Release.Builder builderNewBuilder = Context.App.Release.newBuilder();
        builderNewBuilder.setType(buildInfoObtain.isDebuggable() ? "debug" : "release");
        String sha1Signature = buildInfoObtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            builderNewBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = buildInfoObtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            builderNewBuilder.setSignatureSHA256(sha256Signature);
        }
        return builderNewBuilder.build();
    }
}
