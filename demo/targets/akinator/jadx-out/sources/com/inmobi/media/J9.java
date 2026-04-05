package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J9 extends B9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N9 f31912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(N9 n9) {
        super(n9);
        this.f31912e = n9;
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return new C2735d9(context.getApplicationContext());
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof C2735d9) {
            this.f31912e.getClass();
            N9.a((C2735d9) view, asset);
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof C2735d9) {
            super.a(view);
        }
    }
}
