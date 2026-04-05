package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: c, reason: collision with root package name */
    private final Context f45410c;

    /* renamed from: d, reason: collision with root package name */
    private String f45411d;

    /* renamed from: e, reason: collision with root package name */
    private String f45412e;

    /* renamed from: f, reason: collision with root package name */
    private String f45413f;

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f45414g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f45415h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f45411d = "";
        this.f45412e = "";
        this.f45413f = "";
        this.f45410c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f45414g = campaignEx;
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        c(campaignEx, gVarF);
        a(campaignEx, gVarF);
        b(campaignEx, gVarF);
        boolean z10 = (TextUtils.isEmpty(this.f45411d) || TextUtils.isEmpty(this.f45412e) || TextUtils.isEmpty(this.f45413f)) ? false : true;
        setImageUrl(this.f45411d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f45414g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f45412e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f45412e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f45412e = adchoice.c();
            }
            if (TextUtils.isEmpty(this.f45412e) && gVar != null) {
                this.f45412e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f45412e)) {
                this.f45412e = d.h().f40849g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f45415h == null) {
            this.f45415h = new a();
        }
        u0.a(this.f45414g, this.f45415h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f45414g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f45414g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f45415h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f45414g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f45413f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f45413f = adchoice.d();
        }
        if (!TextUtils.isEmpty(this.f45413f) || gVar == null) {
            return;
        }
        this.f45413f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45411d = "";
        this.f45412e = "";
        this.f45413f = "";
        this.f45410c = context;
        b();
    }

    private void a() {
        if (this.f45410c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(c.m().d()).a(this.f45411d, new b());
        }
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45411d = "";
        this.f45412e = "";
        this.f45413f = "";
        this.f45410c = context;
        b();
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f45414g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f45411d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f45411d = adchoice.b();
        }
        if (!TextUtils.isEmpty(this.f45411d) || gVar == null) {
            return;
        }
        this.f45411d = gVar.b();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.foundation.same.image.c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
