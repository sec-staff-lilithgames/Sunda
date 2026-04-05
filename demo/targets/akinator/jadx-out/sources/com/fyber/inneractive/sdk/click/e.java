package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import j1.o2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f23169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f23170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f23171c;

    public e(g gVar, List list, Uri uri) {
        this.f23171c = gVar;
        this.f23169a = list;
        this.f23170b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f23171c.f23177f) {
            return;
        }
        if (exc != null || cVar == null) {
            String string = this.f23170b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.config.f0(string, null));
            Uri uri = this.f23170b;
            this.f23171c.getClass();
            b bVarA = r.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f23169a;
            if (list != null) {
                list.add(new j(this.f23170b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f23169a;
                bVarA.f23165f.clear();
                bVarA.f23165f.addAll(list2);
            }
            g gVar = this.f23171c;
            f fVar = gVar.f23174c;
            if (fVar != null) {
                fVar.a(bVarA, gVar.f23175d, gVar.f23176e);
                return;
            }
            return;
        }
        if (cVar.f23166a.size() > 0) {
            String str = (String) o2.e(1, cVar.f23166a);
            if (this.f23169a != null) {
                Iterator it = cVar.f23166a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!TextUtils.equals(str2, str)) {
                        this.f23169a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f23169a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.f23171c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.f23169a;
                bVar.f23165f.clear();
                bVar.f23165f.addAll(list4);
                g gVar2 = this.f23171c;
                f fVar2 = gVar2.f23174c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.f23175d, gVar2.f23176e);
                }
            }
            if (str.startsWith(ApsAdWebViewSupportClient.MARKET_SCHEME)) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.config.f0(strReplace, null));
            } else {
                String str3 = cVar.f23167b;
                IAConfigManager iAConfigManager3 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
