package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public URL f24021a;

    /* renamed from: b, reason: collision with root package name */
    public String f24022b;

    /* renamed from: d, reason: collision with root package name */
    public String f24024d;

    /* renamed from: e, reason: collision with root package name */
    public String f24025e;

    /* renamed from: f, reason: collision with root package name */
    public String f24026f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24023c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f24027g = false;

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f24023c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24023c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        if (!this.f24027g || this.f24021a == null) {
            return false;
        }
        String str = this.f24022b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.f24022b.equalsIgnoreCase(CampaignEx.KEY_OMID);
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Verification{mJavaScriptResource=");
        sb2.append(this.f24021a);
        sb2.append(", mTrackingEvents=");
        sb2.append(this.f24023c);
        sb2.append(", mVerificationParameters='");
        sb2.append(this.f24024d);
        sb2.append("', mVendor='");
        return o2.o(sb2, this.f24025e, "'}");
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f24023c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final String a() {
        if (!this.f24027g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f24022b)) {
            return "apiFramework = ";
        }
        if (!this.f24022b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return a.b.k("apiFramework = ", this.f24022b);
        }
        return a.b.k("JavaScriptResource_url = ", TextUtils.isEmpty(this.f24026f) ? "" : this.f24026f);
    }
}
