package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import com.ironsource.C3271ic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f15223g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public s5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f15223g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f14003a.B().E().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Looking up developer URI for package name: ".concat(strValueOf));
        }
        this.f14003a.r0().a(new a(com.applovin.impl.sdk.network.a.a(this.f14003a).c(C3271ic.f36943a).b("https://play.google.com/store/apps/details?id=".concat(strValueOf)).a((Object) "").a(false).a(), this.f14003a));
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
                    this.f14005c.b(this.f14004b, "No developer URI found - response from the Play Store is empty");
                }
                s5.this.f15223g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                s5.this.f15223g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Developer URI (" + strGroup + ") is not valid");
                }
                s5.this.f15223g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Found developer URI: ", strGroup, this.f14005c, this.f14004b);
            }
            s5.this.f15223g.a(strGroup);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            s5.this.f15223g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
