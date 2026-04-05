package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFullscreenWebViewAdPlayer$adObject$2 extends f0 implements a {
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$adObject$2(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        super(0);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kv.a
    public final AdObject invoke() {
        Object objM7131constructorimpl;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        try {
            int i10 = z.f87419c;
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID uuidFromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            e0.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
            objM7131constructorimpl = z.m7131constructorimpl(adRepository.getAd(ProtobufExtensionsKt.toByteString(uuidFromString)));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        return (AdObject) objM7131constructorimpl;
    }
}
