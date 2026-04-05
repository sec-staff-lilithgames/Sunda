package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j5 extends g5 implements s3.a {

    /* renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f14185g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f14186h;

    /* renamed from: i, reason: collision with root package name */
    protected final String f14187i;

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f14188j;

    /* renamed from: k, reason: collision with root package name */
    private final Collection f14189k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14190l;

    /* renamed from: m, reason: collision with root package name */
    protected ExecutorService f14191m;

    /* renamed from: n, reason: collision with root package name */
    protected ExecutorService f14192n;

    /* renamed from: o, reason: collision with root package name */
    protected List f14193o;

    /* renamed from: p, reason: collision with root package name */
    private d0 f14194p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            j5.this.f14185g.b(uri);
            com.applovin.impl.sdk.o oVar = j5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                j5 j5Var = j5.this;
                j5Var.f14005c.a(j5Var.f14004b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements e0.a {
        public b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            j5.this.f14185g.c(uri);
            com.applovin.impl.sdk.o oVar = j5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                j5 j5Var = j5.this;
                j5Var.f14005c.a(j5Var.f14004b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f14197a;

        public c(e0.a aVar) {
            this.f14197a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = j5.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    j5 j5Var = j5.this;
                    j5Var.f14005c.b(j5Var.f14004b, "Failed to cache video");
                }
                j5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", j5.this.f14185g.getAdIdNumber());
                j5.this.f14003a.u().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = j5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                j5 j5Var2 = j5.this;
                j5Var2.f14005c.a(j5Var2.f14004b, "Finish caching video for ad #" + j5.this.f14185g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f14197a.a(uri);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements d0.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f14199a;

        public d(e eVar) {
            this.f14199a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z10) {
            if (z10) {
                j5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f14199a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void a(String str);
    }

    public j5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f14187i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f14185g = bVar;
        this.f14186h = appLovinAdLoadListener;
        this.f14188j = kVar.H();
        this.f14189k = h();
        if (((Boolean) kVar.a(v4.I0)).booleanValue()) {
            if (kVar.r0().f()) {
                this.f14191m = kVar.r0().a();
                this.f14192n = kVar.r0().e();
            } else {
                String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
                this.f14191m = kVar.r0().a(a.b.k("com.applovin.sdk.caching.", mediationServeId), ((Integer) kVar.a(v4.K0)).intValue());
                this.f14192n = kVar.r0().a(a.b.k("com.applovin.sdk.caching.html.", mediationServeId), ((Integer) kVar.a(v4.L0)).intValue());
            }
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f14003a.a(v4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add(Character.valueOf(AbstractJsonLexerKt.STRING));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f14186h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f14185g);
            this.f14186h = null;
        }
    }

    @Override // com.applovin.impl.s3.a
    public void a(v2 v2Var) {
        if (v2Var.P().equalsIgnoreCase(this.f14185g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Updating flag for timeout...");
            }
            g();
        }
        this.f14003a.Z().b(this);
    }

    public e0 b(String str, e0.a aVar) {
        return a(str, this.f14185g.c0(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.f14185g.c0(), true);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Rendered new ad:" + this.f14185g);
        }
        AppLovinSdkUtils.runOnUiThread(new m9(this, 9));
    }

    public void g() {
        this.f14190l = true;
        List list = this.f14193o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f14193o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f14003a.r0().f()) {
            d0 d0Var = this.f14194p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f14191m;
        if (executorService != null) {
            executorService.shutdown();
            this.f14191m = null;
        }
        ExecutorService executorService2 = this.f14192n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f14192n = null;
        }
    }

    public void j() {
        if (o0.e()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching mute images...");
        }
        Uri uriA = a(this.f14185g.Q(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (uriA != null) {
            this.f14185g.b(uriA);
        }
        Uri uriA2 = a(this.f14185g.i0(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (uriA2 != null) {
            this.f14185g.c(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Ad updated with muteImageFilename = " + this.f14185g.Q() + ", unmuteImageFilename = " + this.f14185g.i0());
        }
    }

    public void k() {
        this.f14003a.Z().b(this);
        if (!this.f14003a.r0().f()) {
            ExecutorService executorService = this.f14191m;
            if (executorService != null) {
                executorService.shutdown();
                this.f14191m = null;
            }
            ExecutorService executorService2 = this.f14192n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f14192n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f14185g.getAdZone().d();
        if (((Boolean) this.f14003a.a(v4.W0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f14003a.h().b(this.f14185g);
        }
        this.f14003a.d0().a(this.f14187i);
    }

    public boolean l() {
        return this.f14190l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f14185g.o1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Subscribing to timeout events...");
            }
            this.f14003a.Z().a(this);
        }
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        int iA = this.f14003a.H().a(str, this.f14185g);
        Map mapA = e2.a((AppLovinAdImpl) this.f14185g);
        String strA = this.f14188j.a(a(), str, this.f14185g.getCachePrefix(), list, z10, iA, this.f14187i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f14188j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finish caching video for ad #" + this.f14185g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f14188j.a(str, list, z10, e2.a((AppLovinAdImpl) this.f14185g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f14188j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Unknown failure to read input stream.", th2);
            }
            this.f14005c.a(this.f14004b, th2);
            this.f14003a.E().a(this.f14004b, "readInputStreamAsString", th2);
            return null;
        }
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f14185g.Q() != null) {
            arrayList.add(a(this.f14185g.Q().toString(), new a()));
        }
        if (this.f14185g.i0() != null) {
            arrayList.add(a(this.f14185g.i0().toString(), new b()));
        }
        return arrayList;
    }

    public List a(List list) {
        this.f14193o = list;
        return this.f14003a.r0().a(list, this.f14191m);
    }

    public e0 a(String str, e0.a aVar) {
        return new e0(str, this.f14185g, this.f14187i, this.f14003a, aVar);
    }

    public e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f14005c.a(this.f14004b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return new e0(str, this.f14185g, list, z10, this.f14187i, this.f14003a, new c(aVar));
    }

    public d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f14185g, list, this.f14192n, this.f14187i, this.f14003a, new d(eVar));
        this.f14194p = d0Var;
        return d0Var;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri b(String str) {
        return a(str, this.f14185g.c0(), true);
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            int iA = this.f14003a.H().a(str, this.f14185g);
            Map mapA = e2.a((AppLovinAdImpl) this.f14185g);
            String strA = this.f14188j.a(a(), str, this.f14185g.getCachePrefix(), list, z10, iA, this.f14187i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f14188j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14005c.b(this.f14004b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Failed to cache image at url = " + str, th2);
            }
            Map mapA2 = e2.a((AppLovinAdImpl) this.f14185g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f14003a.E().a(this.f14004b, "cacheImageResource", th2, mapA2);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strK0 = bVar.k0();
        if (bVar.V0() && StringUtils.isValidString(strK0)) {
            String strA = a(strK0, bVar.c0(), bVar);
            bVar.c(strA);
            this.f14005c.f(this.f14004b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L8
            goto Lf9
        L8:
            com.applovin.impl.sdk.k r0 = r11.f14003a
            com.applovin.impl.v4 r1 = com.applovin.impl.v4.E0
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L28
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lf9
            com.applovin.impl.sdk.o r13 = r11.f14005c
            java.lang.String r14 = r11.f14004b
            java.lang.String r0 = "Resource caching is disabled, skipping cache..."
            r13.a(r14, r0)
            return r12
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.util.List r1 = r14.a0()
            java.util.List r2 = r14.R()
            java.util.Iterator r13 = r13.iterator()
        L39:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lfa
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r4
        L47:
            int r6 = r0.length()
            if (r4 >= r6) goto L39
            boolean r4 = r11.l()
            if (r4 == 0) goto L55
            goto Lf9
        L55:
            int r4 = r0.indexOf(r3, r5)
            r5 = -1
            if (r4 != r5) goto L5d
            goto L39
        L5d:
            int r5 = r0.length()
            r6 = r4
        L62:
            java.util.Collection r7 = r11.f14189k
            char r8 = r0.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L77
            if (r6 >= r5) goto L77
            int r6 = r6 + 1
            goto L62
        L77:
            if (r6 <= r4) goto Lea
            if (r6 == r5) goto Lea
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.String r5 = r0.substring(r5, r6)
            java.lang.String r7 = j1.o2.l(r3, r5)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto Ld8
            boolean r8 = r2.contains(r7)
            if (r8 != 0) goto Ld8
            android.net.Uri r5 = r11.a(r3, r5)
            if (r5 == 0) goto La5
            java.lang.String r7 = r5.toString()
            r0.replace(r4, r6, r7)
            r14.a(r5)
            goto Le7
        La5:
            boolean r5 = r1.contains(r7)
            if (r5 == 0) goto Lb3
            r5 = -203(0xffffffffffffff35, float:NaN)
            r11.a(r5)
            r5 = 1
            r11.f14190l = r5
        Lb3:
            boolean r5 = com.applovin.impl.sdk.o.a()
            if (r5 == 0) goto Lce
            com.applovin.impl.sdk.o r5 = r11.f14005c
            java.lang.String r8 = r11.f14004b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to cache HTML Resource: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r5.b(r8, r9)
        Lce:
            java.util.Map r5 = com.applovin.impl.e2.a(r14)
            java.lang.String r8 = "cacheHtmlResource"
            r11.a(r7, r8, r5)
            goto Le7
        Ld8:
            boolean r7 = com.applovin.impl.sdk.o.a()
            if (r7 == 0) goto Le7
            com.applovin.impl.sdk.o r7 = r11.f14005c
            java.lang.String r8 = r11.f14004b
            java.lang.String r9 = "Skip caching of optional or non-resource: "
            b0.e2.y(r9, r5, r7, r8)
        Le7:
            r5 = r6
            goto L47
        Lea:
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lf9
            com.applovin.impl.sdk.o r13 = r11.f14005c
            java.lang.String r14 = r11.f14004b
            java.lang.String r0 = "Unable to cache resource; ad HTML is invalid."
            r13.b(r14, r0)
        Lf9:
            return r12
        Lfa:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.f14188j.a(k7.a(Uri.parse(str2), this.f14185g.getCachePrefix(), this.f14003a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f14003a.a(v4.E6)).booleanValue() && this.f14188j.a(fileA)) {
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String strL = j1.o2.l(str, str2);
        if (!this.f14188j.a(fileA, strL, Arrays.asList(str), this.f14003a.H().a(strL, this.f14185g), this.f14187i, e2.a((AppLovinAdImpl) this.f14185g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    public void a(int i10) {
        if (this.f14186h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Calling back ad load failed with error code: " + i10);
            }
            this.f14186h.failedToReceiveAd(i10);
            this.f14186h = null;
        }
        g();
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f14003a.E().a(c2.f13750z0, str2, map2);
    }
}
