package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class BidderTokenProvider {
    public static String getBidderToken(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        return DynamicLoaderFactory.makeLoader(context).createBidderTokenProviderApi().getBidderToken(context);
    }
}
