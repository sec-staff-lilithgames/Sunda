package vp;

import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface o extends u {
    LabelData getAdLabelData();

    @Override // vp.u
    /* synthetic */ String getCallToAction();

    String getClickUrl();

    @Override // vp.u
    /* synthetic */ String getDescription();

    @Override // vp.u
    /* synthetic */ ImageData getIcon();

    @Override // vp.u
    /* synthetic */ ImageData getMainImage();

    PrivacySheetData getPrivacySheetData();

    @Override // vp.u
    /* synthetic */ float getRating();

    @Override // vp.u
    /* synthetic */ String getTitle();

    String getVideoAdm();

    String getVideoUrl();

    @Override // vp.u
    /* synthetic */ boolean hasVideo();
}
