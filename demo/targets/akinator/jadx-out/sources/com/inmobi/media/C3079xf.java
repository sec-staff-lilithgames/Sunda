package com.inmobi.media;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3079xf extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f33588a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079xf(View view) {
        super(1);
        this.f33588a = view;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        Fc it = (Fc) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        it.getViewableAd().a(this.f33588a, FriendlyObstructionPurpose.OTHER);
        J exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(this.f33588a);
        }
        return tu.x0.f87415a;
    }
}
