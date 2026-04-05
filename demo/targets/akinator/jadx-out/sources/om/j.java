package om;

import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.TrackEventType;
import ir.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends a {

    /* renamed from: d, reason: collision with root package name */
    public final pm.a f79564d;

    /* renamed from: e, reason: collision with root package name */
    public final pm.d f79565e;

    public j(Ad ad2) {
        super(ad2);
        pm.a aVar = new pm.a(new pm.c());
        this.f79564d = aVar;
        this.f79565e = new pm.d(aVar);
        Ad.Display.Native r62 = ad2.getDisplay().getNative();
        Ad.Display.Native.LinkAsset link = r62.getLink();
        if (link != null && link != Ad.Display.Native.LinkAsset.getDefaultInstance()) {
            getData().put(Constants.CLICK_URL, link.getUrl());
            for (int i10 = 0; i10 < link.getTrkrCount(); i10++) {
                pr.i.addEvent(this.f88653b, TrackEventType.Click, link.getTrkr(i10));
            }
        }
        for (Ad.Display.Native.Asset asset : r62.getAssetList()) {
            int id2 = asset.getId();
            if (id2 == 4) {
                Ad.Display.Native.Asset.VideoAsset defaultInstance = Ad.Display.Native.Asset.VideoAsset.getDefaultInstance();
                if (!asset.getVideo().getCurl().equals(defaultInstance.getCurl())) {
                    getData().put("videoUrl", asset.getVideo().getCurl());
                }
                if (!asset.getVideo().getAdm().equals(defaultInstance.getAdm())) {
                    getData().put("videoAdm", asset.getVideo().getAdm());
                }
            } else if (id2 == 7) {
                try {
                    getData().put(CampaignEx.JSON_KEY_STAR, Float.valueOf(asset.getData().getValue()));
                } catch (NumberFormatException unused) {
                }
            } else if (id2 == 8) {
                getData().put(C3191e4.h.G0, asset.getData().getValue());
            } else if (id2 == 101) {
                final int i11 = 0;
                q.ifNotNull(this.f79564d.map(asset.getLabel()), new ir.d(this) { // from class: om.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ j f79563c;

                    {
                        this.f79563c = this;
                    }

                    @Override // ir.d
                    public final void execute(Object obj) {
                        switch (i11) {
                            case 0:
                                this.f79563c.getData().put("adLabel", (LabelData) obj);
                                break;
                            default:
                                this.f79563c.getData().put("privacySheet", (PrivacySheetData) obj);
                                break;
                        }
                    }
                });
            } else if (id2 == 102) {
                final int i12 = 1;
                q.ifNotNull(this.f79565e.map(asset), new ir.d(this) { // from class: om.i

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ j f79563c;

                    {
                        this.f79563c = this;
                    }

                    @Override // ir.d
                    public final void execute(Object obj) {
                        switch (i12) {
                            case 0:
                                this.f79563c.getData().put("adLabel", (LabelData) obj);
                                break;
                            default:
                                this.f79563c.getData().put("privacySheet", (PrivacySheetData) obj);
                                break;
                        }
                    }
                });
            } else if (id2 == 123) {
                getData().put("title", asset.getTitle().getText());
            } else if (id2 == 124) {
                getData().put("iconUrl", asset.getImage().getUrl());
            } else if (id2 == 127) {
                getData().put("description", asset.getData().getValue());
            } else if (id2 == 128) {
                getData().put("imageUrl", asset.getImage().getUrl());
            }
        }
    }

    @Override // om.h, up.b
    public boolean isValid() {
        return true;
    }
}
