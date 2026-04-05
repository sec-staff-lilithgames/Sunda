package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import com.ironsource.C3271ic;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class q5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f15137g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15138h;

    /* renamed from: i, reason: collision with root package name */
    private String f15139i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public q5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f15138h = str;
        this.f15137g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f15138h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f14003a).c(C3271ic.f36943a).b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f15139i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.B(new StringBuilder("Looking up app-ads.txt at "), this.f15139i, this.f14005c, this.f14004b);
        }
        this.f14003a.r0().a(new a(aVarA, this.f14003a));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "No app-ads.txt found");
                }
                q5.this.f15137g.a(b0.b.APPADSTXT_NOT_FOUND, q5.this.f15139i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "Found app-ads.txt");
                }
                q5.this.f15137g.a(str2, q5.this.f15139i);
            }
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            q5.this.f15137g.a(b0.b.APPADSTXT_NOT_FOUND, q5.this.f15139i);
        }
    }
}
