package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H9 extends B9 {
    public H9(N9 n9) {
        super(n9);
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new C2874ld(applicationContext);
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        HashMap map = N9.f32067c;
        C3073x9.a(view, asset.f33139d);
    }
}
