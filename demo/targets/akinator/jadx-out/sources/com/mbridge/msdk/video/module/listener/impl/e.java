package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e implements com.mbridge.msdk.foundation.same.image.c {

    /* renamed from: a, reason: collision with root package name */
    protected ImageView f44839a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f44840b;

    /* renamed from: c, reason: collision with root package name */
    private String f44841c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44842a;

        public a(String str) {
            this.f44842a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                if (e.this.f44840b == null) {
                    p0.a("ImageLoaderListener", "campaign is null");
                    return;
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("2000044");
                nVar.c(l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
                nVar.b(e.this.f44840b.getId());
                nVar.i(e.this.f44840b.getImageUrl());
                nVar.n(e.this.f44840b.getRequestId());
                nVar.o(e.this.f44840b.getRequestIdNotice());
                nVar.u(e.this.f44841c);
                nVar.m(this.f44842a);
                nVarA.a(nVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public e(ImageView imageView) {
        this.f44839a = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
        com.google.android.gms.internal.play_billing.a.v("desc:", str, "ImageLoaderListener");
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                p0.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.f44839a == null || bitmap.isRecycled()) {
                    return;
                }
                this.f44839a.setImageBitmap(bitmap);
                this.f44839a.setVisibility(0);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f44839a = imageView;
        this.f44840b = campaignEx;
        this.f44841c = str;
    }
}
