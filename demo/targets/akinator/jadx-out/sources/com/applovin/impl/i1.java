package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14126a;

    public i1(com.applovin.impl.sdk.k kVar) {
        this.f14126a = kVar;
    }

    public void a(Uri uri) {
        com.applovin.impl.sdk.o.g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f14126a.x0().b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f14126a.x0().c(queryParameter2);
            }
        }
    }
}
