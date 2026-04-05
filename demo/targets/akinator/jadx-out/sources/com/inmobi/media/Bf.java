package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Bf extends AbstractC3062wf {

    /* renamed from: e, reason: collision with root package name */
    public final C2853k9 f31691e;

    /* renamed from: f, reason: collision with root package name */
    public final F5 f31692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(C2853k9 mNativeVideoAdContainer, F5 f52) {
        super(mNativeVideoAdContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeVideoAdContainer, "mNativeVideoAdContainer");
        this.f31691e = mNativeVideoAdContainer;
        this.f31692f = f52;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        Context contextJ;
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        if (this.f31693g || (contextJ = this.f31691e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.f33554d;
        C2853k9 c2853k9 = this.f31691e;
        C3106z8 c3106z8 = c2853k9.f32741b;
        kotlin.jvm.internal.e0.checkNotNull(c3106z8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        H8 h82 = new H8(contextJ, adConfig, c2853k9, c3106z8, this.f31692f);
        this.f33552b = h82;
        this.f33553c = new WeakReference(h82.a(view, parent, false, null));
        C2853k9 c2853k92 = this.f31691e;
        c2853k92.getClass();
        J4.a(new T7(c2853k92, c2853k92), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        if (this.f31693g) {
            return;
        }
        this.f31693g = true;
        H8 h82 = this.f33552b;
        if (h82 != null) {
            N8 n82 = h82.f31846e;
            n82.f32064n = true;
            n82.f32059i.clear();
            n82.f32066p = null;
            V8 v82 = n82.f32060j;
            if (v82 != null) {
                v82.destroy();
            }
            n82.f32060j = null;
            if (!h82.f31842a) {
                h82.f31842a = true;
            }
        }
        this.f33552b = null;
        super.a();
    }
}
