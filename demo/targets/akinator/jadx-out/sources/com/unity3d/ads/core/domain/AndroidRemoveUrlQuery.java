package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String url) {
        e0.checkNotNullParameter(url, "url");
        String string = Uri.parse(url).buildUpon().clearQuery().build().toString();
        e0.checkNotNullExpressionValue(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
