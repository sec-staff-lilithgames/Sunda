package ej;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rj.b f54412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f54413c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f54414e;

    public c(j jVar, rj.b bVar, Activity activity) {
        this.f54414e = jVar;
        this.f54412b = bVar;
        this.f54413c = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            ej.j r8 = r7.f54414e
            bj.b1 r0 = r8.f54435n
            rj.b r1 = r7.f54412b
            if (r0 == 0) goto L14
            java.lang.String r0 = "Calling callback for click action"
            hj.t.logi(r0)
            bj.b1 r0 = r8.f54435n
            nj.q r0 = (nj.q) r0
            r0.messageClicked(r1)
        L14:
            java.lang.String r0 = r1.getActionUrl()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.app.Activity r1 = r7.f54413c
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r0 != 0) goto L26
            goto L6d
        L26:
            java.lang.String r5 = r0.getScheme()
            if (r5 == 0) goto L6d
            java.lang.String r6 = "http"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 != 0) goto L3c
            java.lang.String r6 = "https"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L6d
        L3c:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.support.customtabs.action.CustomTabsService"
            r5.<init>(r6)
            java.lang.String r6 = "com.android.chrome"
            r5.setPackage(r6)
            android.content.pm.PackageManager r6 = r1.getPackageManager()
            java.util.List r5 = r6.queryIntentServices(r5, r4)
            if (r5 == 0) goto L6d
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6d
            androidx.browser.customtabs.y r4 = new androidx.browser.customtabs.y
            r4.<init>()
            androidx.browser.customtabs.z r4 = r4.build()
            android.content.Intent r5 = r4.f5302a
            r5.addFlags(r3)
            r5.addFlags(r2)
            r4.launchUrl(r1, r0)
            goto L8d
        L6d:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6, r0)
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r5, r4)
            r5.addFlags(r3)
            r5.addFlags(r2)
            if (r0 == 0) goto L88
            r1.startActivity(r5)
            goto L8d
        L88:
            java.lang.String r0 = "Device cannot resolve intent for: android.intent.action.VIEW"
            hj.t.loge(r0)
        L8d:
            com.google.firebase.inappmessaging.display.FiamListener r0 = r8.f54433l
            if (r0 == 0) goto L94
            r0.onFiamClick()
        L94:
            r8.b(r1)
            r0 = 0
            r8.f54434m = r0
            r8.f54435n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.c.onClick(android.view.View):void");
    }
}
