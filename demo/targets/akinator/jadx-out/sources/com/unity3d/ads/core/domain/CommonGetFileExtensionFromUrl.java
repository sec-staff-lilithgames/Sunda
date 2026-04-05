package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        e0.checkNotNullParameter(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String url) {
        e0.checkNotNullParameter(url, "url");
        String strInvoke = this.removeUrlQuery.invoke(url);
        if (strInvoke == null) {
            return null;
        }
        String strSubstringAfterLast$default = n0.substringAfterLast$default(strInvoke, '/', (String) null, 2, (Object) null);
        if (!n0.contains$default((CharSequence) strSubstringAfterLast$default, '.', false, 2, (Object) null)) {
            return null;
        }
        String strSubstringAfterLast$default2 = n0.substringAfterLast$default(strSubstringAfterLast$default, '.', (String) null, 2, (Object) null);
        if (strSubstringAfterLast$default2.length() == 0) {
            return null;
        }
        return strSubstringAfterLast$default2;
    }
}
