package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.lifecycle.c1;
import av.e;
import ca.m;
import ca.o;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import f0.tv.vYwYqhhvBxO;
import ha.WYS.xBfdMhmcFlTfnl;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import lb.b1;
import o9.a9;
import o9.c9;
import o9.f9;
import o9.g9;
import o9.i9;
import o9.j9;
import o9.k9;
import o9.l9;
import o9.n9;
import o9.p9;
import o9.s9;
import o9.t9;
import o9.u8;
import sv.k0;
import timber.log.Timber;
import tu.x0;
import u9.l;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class SplashscreenActivity extends AkActivity {
    public static final Object P;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ProgressBar I;
    public int K;
    public boolean N;
    public boolean G = true;
    public final String J = "1";
    public int L = -1;
    public int M = -1;
    public final l O = new l(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }

        public final Object getSGotohomeMutex() {
            return SplashscreenActivity.P;
        }
    }

    static {
        new a(null);
        P = new Object();
    }

    public static final Object access$callAnalyticsBoot(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new u8(2, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final Object access$earlyInits(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a9(splashscreenActivity, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final boolean access$handleMarketingDeeplink(SplashscreenActivity splashscreenActivity) {
        Uri data = splashscreenActivity.getIntent().getData();
        if (data != null && k0.equals("redirect", data.getHost(), true)) {
            String queryParameter = data.getQueryParameter("screen");
            String queryParameter2 = data.getQueryParameter("theme");
            String queryParameter3 = data.getQueryParameter("slide");
            if (e0.areEqual("PH", queryParameter)) {
                if (queryParameter2 != null) {
                    m.sharedInstance().setCurrentSubject(Integer.parseInt(queryParameter2));
                }
                Intent intent = new Intent(splashscreenActivity, (Class<?>) PostHomeSliderActivity.class);
                if (queryParameter3 != null) {
                    switch (queryParameter3.hashCode()) {
                        case -982907812:
                            if (queryParameter3.equals("podium")) {
                                intent.putExtra("firstSlide", "podium");
                                break;
                            }
                            break;
                        case 3199:
                            if (queryParameter3.equals("dc")) {
                                intent.putExtra("firstSlide", "dc");
                                break;
                            }
                            break;
                        case 103487:
                            if (queryParameter3.equals("hof")) {
                                intent.putExtra("firstSlide", "classement");
                                break;
                            }
                            break;
                        case 107450:
                            if (queryParameter3.equals("lsa")) {
                                intent.putExtra("firstSlide", "lsa");
                                break;
                            }
                            break;
                        case 1239881226:
                            if (queryParameter3.equals("morefun")) {
                                intent.putExtra("firstSlide", "morefun");
                                break;
                            }
                            break;
                    }
                }
                splashscreenActivity.startActivity(intent);
                return true;
            }
            if (e0.areEqual(RequestConfiguration.MAX_AD_CONTENT_RATING_G, queryParameter)) {
                if (queryParameter2 != null) {
                    m.sharedInstance().setCurrentSubject(Integer.parseInt(queryParameter2));
                }
                BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(splashscreenActivity), null, null, new f9(splashscreenActivity, null), 3, null);
            }
        }
        return false;
    }

    public static final Object access$initLangues(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new g9(splashscreenActivity, null), dVar);
    }

    public static final Object access$initPlayerBelongings(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new i9(2, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final Object access$initScenery(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new j9(splashscreenActivity, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final Object access$initSessionFactory(SplashscreenActivity splashscreenActivity, boolean z10, d dVar) {
        splashscreenActivity.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new k9(splashscreenActivity, z10, null), dVar);
    }

    public static final Object access$initTraductions(SplashscreenActivity splashscreenActivity, boolean z10, List list, d dVar) {
        splashscreenActivity.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new l9(splashscreenActivity, z10, list, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0269, code lost:
    
        if (r14 == r1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[PHI: r13
      0x00ca: PHI (r13v3 com.digidust.elokence.akinator.activities.SplashscreenActivity) = 
      (r13v1 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v4 com.digidust.elokence.akinator.activities.SplashscreenActivity)
     binds: [B:31:0x00c6, B:22:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea A[PHI: r13
      0x00ea: PHI (r13v5 com.digidust.elokence.akinator.activities.SplashscreenActivity) = 
      (r13v3 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v6 com.digidust.elokence.akinator.activities.SplashscreenActivity)
     binds: [B:37:0x00e6, B:21:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[PHI: r13
      0x010a: PHI (r13v7 com.digidust.elokence.akinator.activities.SplashscreenActivity) = 
      (r13v5 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v8 com.digidust.elokence.akinator.activities.SplashscreenActivity)
     binds: [B:43:0x0106, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[PHI: r13
      0x0138: PHI (r13v9 com.digidust.elokence.akinator.activities.SplashscreenActivity) = 
      (r13v7 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v7 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v10 com.digidust.elokence.akinator.activities.SplashscreenActivity)
     binds: [B:52:0x0134, B:50:0x012a, B:19:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151 A[PHI: r13 r14
      0x0151: PHI (r13v11 com.digidust.elokence.akinator.activities.SplashscreenActivity) = 
      (r13v9 com.digidust.elokence.akinator.activities.SplashscreenActivity)
      (r13v12 com.digidust.elokence.akinator.activities.SplashscreenActivity)
     binds: [B:55:0x014d, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r14v24 java.lang.Object) = (r14v23 java.lang.Object), (r14v1 java.lang.Object) binds: [B:55:0x014d, B:18:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$initializeAll(com.digidust.elokence.akinator.activities.SplashscreenActivity r13, zu.d r14) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SplashscreenActivity.access$initializeAll(com.digidust.elokence.akinator.activities.SplashscreenActivity, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$postInitSessionFactory(com.digidust.elokence.akinator.activities.SplashscreenActivity r5, int r6, zu.d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof o9.q9
            if (r0 == 0) goto L16
            r0 = r7
            o9.q9 r0 = (o9.q9) r0
            int r1 = r0.f78470k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f78470k = r1
            goto L1b
        L16:
            o9.q9 r0 = new o9.q9
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f78468i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78470k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            tu.a0.throwOnFailure(r7)
            if (r6 == 0) goto L61
            r7 = -4
            if (r6 != r7) goto L3d
            goto L61
        L3d:
            r7 = 0
            r2 = 500(0x1f4, float:7.0E-43)
            if (r6 == r2) goto L4c
            r4 = 510(0x1fe, float:7.15E-43)
            if (r6 != r4) goto L47
            goto L4c
        L47:
            java.lang.Boolean r5 = bv.b.boxBoolean(r7)
            return r5
        L4c:
            if (r6 != r2) goto L57
            ca.m r6 = ca.m.sharedInstance()
            r7 = -1
            r6.setCanPlay(r7)
            goto L5e
        L57:
            ca.m r6 = ca.m.sharedInstance()
            r6.setCanPlay(r7)
        L5e:
            r5.C = r3
            goto L64
        L61:
            r5.majSeuilDePopu()
        L64:
            r5.D = r3
            r0.f78470k = r3
            java.lang.Object r5 = r5.w(r0)
            if (r5 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SplashscreenActivity.access$postInitSessionFactory(com.digidust.elokence.akinator.activities.SplashscreenActivity, int, zu.d):java.lang.Object");
    }

    public static final Object access$restorePurchases(SplashscreenActivity splashscreenActivity, boolean z10, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new s9(splashscreenActivity, z10, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final Object access$updateAppOpenCounter(SplashscreenActivity splashscreenActivity, d dVar) {
        splashscreenActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new t9(2, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final boolean access$verifyResetPasswor(SplashscreenActivity splashscreenActivity) {
        splashscreenActivity.getClass();
        try {
            Uri data = splashscreenActivity.getIntent().getData();
            if (k0.startsWith$default(String.valueOf(data), "ak://akinator/reset", false, 2, null)) {
                Intent intent = new Intent(splashscreenActivity, (Class<?>) ModifyPasswordAfterResetActivity.class);
                intent.putExtra("url", String.valueOf(data));
                splashscreenActivity.startActivity(intent);
                splashscreenActivity.finish();
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object checkIfUserIsStillLoggedCustom(zu.d<? super tu.x0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o9.v8
            if (r0 == 0) goto L13
            r0 = r8
            o9.v8 r0 = (o9.v8) r0
            int r1 = r0.f78640m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78640m = r1
            goto L18
        L13:
            o9.v8 r0 = new o9.v8
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f78638k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78640m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r8)
            goto L72
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.jvm.internal.z0 r2 = r0.f78637j
            com.digidust.elokence.akinator.activities.SplashscreenActivity r4 = r0.f78636i
            tu.a0.throwOnFailure(r8)
            goto L5c
        L3d:
            tu.a0.throwOnFailure(r8)
            kotlin.jvm.internal.z0 r2 = new kotlin.jvm.internal.z0
            r2.<init>()
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            o9.w8 r6 = new o9.w8
            r6.<init>(r2, r5)
            r0.f78636i = r7
            r0.f78637j = r2
            r0.f78640m = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r6, r0)
            if (r8 != r1) goto L5b
            goto L71
        L5b:
            r4 = r7
        L5c:
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            o9.x8 r6 = new o9.x8
            r6.<init>(r2, r4, r5)
            r0.f78636i = r5
            r0.f78637j = r5
            r0.f78640m = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r6, r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SplashscreenActivity.checkIfUserIsStillLoggedCustom(zu.d):java.lang.Object");
    }

    public final int getLargeurPhoto() {
        if (getScreenWidth() < 481) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (getScreenWidth() < 721) {
            return 360;
        }
        return getScreenWidth() < 1081 ? 540 : 768;
    }

    public final void goToHomeScreen() {
        synchronized (P) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("goToHomeScreen").d("goToHomeScreen called", new Object[0]);
            forest.tag("goToHomeScreen").d("mTraductionsLoaded: %s", Boolean.valueOf(this.C));
            forest.tag("goToHomeScreen").d("centralWs: %s", Boolean.valueOf(this.D));
            forest.tag("goToHomeScreen").d("mMinimalDelayDone : %s", Boolean.valueOf(this.E));
            forest.tag("goToHomeScreen").d("mPurchasesRestored : %s", Boolean.valueOf(this.F));
            forest.tag("goToHomeScreen").d("rgpd displayed  : %s", Boolean.valueOf(this.f21695r));
            if (this.G) {
                return;
            }
            if (this.L == 0 && this.M == -1) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            o.sharedInstance().setDateLastGame(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRANCE).format(calendar.getTime()));
            o.sharedInstance().setNbGamesInOneSessionWithoutClosingApp(0);
            if (this.f21695r && ((this.C || this.H) && this.E && this.F && this.D)) {
                BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), Dispatchers.getMain(), null, new c9(this, null), 2, null);
            }
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity
    public final void n() {
        this.O.onRGPDManaged();
        goToHomeScreen();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onAllPurchasesRestored() throws NumberFormatException {
        super.onAllPurchasesRestored();
        this.F = true;
        goToHomeScreen();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vYwYqhhvBxO.WoefSreiruwMMnv.invoke(null, this, bundle);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onInitialization(boolean z10) {
        if (this.F) {
            goToHomeScreen();
        } else {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new p9(this, z10, null), 3, null);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xBfdMhmcFlTfnl.nYLCfQN.invoke(null, this);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xBfdMhmcFlTfnl.CvbkgLWHavbbMUS.invoke(null, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(zu.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o9.y8
            if (r0 == 0) goto L13
            r0 = r6
            o9.y8 r0 = (o9.y8) r0
            int r1 = r0.f78700l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78700l = r1
            goto L18
        L13:
            o9.y8 r0 = new o9.y8
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f78698j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78700l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.digidust.elokence.akinator.activities.SplashscreenActivity r2 = r0.f78697i
            tu.a0.throwOnFailure(r6)
            goto L37
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            tu.a0.throwOnFailure(r6)
            r2 = r5
        L37:
            boolean r6 = r2.l()
            if (r6 == 0) goto L4b
            da.o r6 = da.q.f51970b
            r0.f78697i = r2
            r0.f78700l = r3
            r4 = 0
            java.lang.Object r6 = r6.await(r2, r4, r0)
            if (r6 != r1) goto L37
            return r1
        L4b:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SplashscreenActivity.t(zu.d):java.lang.Object");
    }

    public final void u() {
        Timber.Forest.tag("SplashscreenActivity").e(new Exception("init error"), "Erreur lors de l'initialisation de l'application", new Object[0]);
        if (l()) {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_RESEAU"), 0).show();
        } else {
            Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(zu.d r6) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r5 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r2 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            int r2 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            r5.K = r2     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            goto L22
        L13:
            r2 = move-exception
            goto L17
        L15:
            r2 = move-exception
            r1 = r0
        L17:
            timber.log.Timber$Forest r3 = timber.log.Timber.Forest
            java.lang.String r4 = "SplashscreenActivity"
            timber.log.Timber$Tree r3 = r3.tag(r4)
            r3.e(r2)
        L22:
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            o9.h9 r3 = new o9.h9
            r3.<init>(r1, r0)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r6)
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L36
            return r6
        L36:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SplashscreenActivity.v(zu.d):java.lang.Object");
    }

    public final Object w(d dVar) {
        Object objWithContext;
        return (this.L == 0 && m.sharedInstance().getCurrentInstance() != null && (objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new n9(this, null), dVar)) == e.getCOROUTINE_SUSPENDED()) ? objWithContext : x0.f87415a;
    }

    public final boolean x() {
        Bundle extras = getIntent().getExtras();
        e0.checkNotNull(extras);
        String string = extras.getString(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP);
        Bundle extras2 = getIntent().getExtras();
        e0.checkNotNull(extras2);
        String string2 = extras2.getString(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION);
        if (string == null || !k0.startsWith$default(string, "redirect_", false, 2, null) || string2 == null || !k0.startsWith$default(string2, "http", false, 2, null)) {
            return false;
        }
        if (e0.areEqual(string, "redirect_externe")) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string2)));
            finish();
            return true;
        }
        Intent intent = new Intent(this, (Class<?>) WebviewCGV.class);
        intent.putExtra("url", string2);
        intent.putExtra("lng", "");
        startActivity(intent);
        finish();
        return true;
    }
}
