package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K9 extends B9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N9 f31951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9(N9 n9) {
        super(n9);
        this.f31951e = n9;
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new C3056w9(applicationContext);
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof C3056w9) {
            C3056w9 c3056w9 = (C3056w9) view;
            this.f31951e.getClass();
            HashMap map = N9.f32067c;
            C3073x9.a(c3056w9, asset.f33139d);
            Object obj = asset.f33156u;
            if (obj instanceof Bitmap) {
                c3056w9.setPosterImage((Bitmap) obj);
            }
            c3056w9.getProgressBar().setVisibility(0);
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof C3056w9) {
            C3056w9 c3056w9 = (C3056w9) view;
            c3056w9.getProgressBar().setVisibility(8);
            c3056w9.setPosterImage((Bitmap) null);
            c3056w9.getVideoView().f();
            super.a(view);
        }
    }
}
