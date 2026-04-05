package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f41532c = "a";

    /* renamed from: a, reason: collision with root package name */
    private final Handler f41533a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private boolean f41534b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    public class RunnableC0287a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f41535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f41537c;

        public RunnableC0287a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f41535a = bVar;
            this.f41536b = str;
            this.f41537c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f41535a;
            if (bVar != null) {
                bVar.a(this.f41536b, this.f41537c, a.this.f41534b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f41539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f41540b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f41539a = bVar;
            this.f41540b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41539a != null) {
                this.f41540b.a(a.this.f41534b);
                this.f41539a.a(this.f41540b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f41542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41544c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f41542a = bVar;
            this.f41543b = str;
            this.f41544c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f41542a;
            if (bVar != null) {
                bVar.a(this.f41543b, this.f41544c, a.this.f41534b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f41546a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f41547b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f41546a = bVar;
            this.f41547b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41546a != null) {
                this.f41547b.a(a.this.f41534b);
                this.f41546a.b(this.f41547b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        p0.b(f41532c, "postResourceFail unitId=" + bVar2);
        this.f41533a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f41534b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        com.google.android.gms.internal.play_billing.a.v("postCampaignSuccess unitId=", str, f41532c);
        this.f41533a.post(new RunnableC0287a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f41533a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        com.google.android.gms.internal.play_billing.a.v("postResourceSuccess unitId=", str, f41532c);
        this.f41533a.post(new c(bVar, str, i10));
    }
}
