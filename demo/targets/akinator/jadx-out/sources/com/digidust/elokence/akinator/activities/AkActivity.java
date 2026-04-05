package com.digidust.elokence.akinator.activities;

import aa.d;
import android.animation.ValueAnimator;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.c1;
import ca.m;
import ca.o;
import ca.q;
import ca.r;
import ca.t;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.ui.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.sfbx.appconsentv3.AppConsent;
import com.sfbx.appconsentv3.model.XChangeData;
import com.sfbx.appconsentv3.ui.AppConsentSDK;
import com.sfbx.appconsentv3.ui.model.ACConsentableType;
import da.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import jb.b;
import jb.h;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kv.l;
import lb.b1;
import lb.s0;
import lb.t0;
import ma.c;
import o9.f;
import sv.n0;
import timber.log.Timber;
import tu.x0;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class AkActivity extends FragmentActivity implements b, q, z9.a, d, t0 {
    public static boolean A;
    public static AkActivity B;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f21679y;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f21680z;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21681c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21682e = true;

    /* renamed from: f, reason: collision with root package name */
    public u9.a f21683f = new u9.a(this);

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAnalytics f21684g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21685h;

    /* renamed from: i, reason: collision with root package name */
    public final Typeface f21686i;

    /* renamed from: j, reason: collision with root package name */
    public final Typeface f21687j;

    /* renamed from: k, reason: collision with root package name */
    public final Typeface f21688k;

    /* renamed from: l, reason: collision with root package name */
    public final Typeface f21689l;

    /* renamed from: m, reason: collision with root package name */
    public final Typeface f21690m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f21691n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f21692o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f21693p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f21694q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21695r;

    /* renamed from: s, reason: collision with root package name */
    public AudioManager f21696s;

    /* renamed from: t, reason: collision with root package name */
    public c f21697t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21698u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f21699v;

    /* renamed from: w, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.a f21700w;

    /* renamed from: x, reason: collision with root package name */
    public k f21701x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class MyBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e0.checkNotNullParameter(intent, "intent");
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                e0.checkNotNull(extras);
                for (String str : extras.keySet()) {
                    Bundle extras2 = intent.getExtras();
                    e0.checkNotNull(extras2);
                    String str2 = str + " " + extras2.get(str);
                    if (e0.areEqual(str, "android.intent.extra.CHOSEN_COMPONENT")) {
                        if (n0.contains$default((CharSequence) str2, (CharSequence) "facebook", false, 2, (Object) null)) {
                            h.f69257d.sharedInstance().incMetricCompteur("sharing_fb");
                        } else if (n0.contains$default((CharSequence) str2, (CharSequence) "twitter", false, 2, (Object) null)) {
                            h.f69257d.sharedInstance().incMetricCompteur("sharing_twitter");
                        }
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }

        public final boolean getInitialized() {
            return AkActivity.f21679y;
        }

        public final boolean getMIsInBackgroundMode() {
            return AkActivity.A;
        }

        public final boolean getMIsInForegroundMode() {
            return AkActivity.f21680z;
        }

        public final void setInitialized(boolean z10) {
            AkActivity.f21679y = z10;
        }

        public final void setMIsInBackgroundMode(boolean z10) {
            AkActivity.A = z10;
        }

        public final void setMIsInForegroundMode(boolean z10) {
            AkActivity.f21680z = z10;
        }
    }

    static {
        new a(null);
    }

    public AkActivity() {
        AkApplication.a aVar = AkApplication.f21719f;
        this.f21686i = aVar.getTypeFace();
        this.f21687j = aVar.getTypeFaceRaleReg();
        this.f21688k = aVar.getTypeFaceRaleBold();
        this.f21689l = aVar.getTypeFaceCrickxDroite();
        this.f21690m = aVar.getTypeFaceSatisfyReg();
        this.f21697t = c.f74125c;
        this.f21698u = true;
        this.f21699v = new ArrayList();
        this.f21700w = new com.applovin.mediation.nativeAds.a(this, 27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object i(com.digidust.elokence.akinator.activities.AkActivity r7, zu.d r8) {
        /*
            boolean r0 = r8 instanceof o9.c
            if (r0 == 0) goto L13
            r0 = r8
            o9.c r0 = (o9.c) r0
            int r1 = r0.f78057m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78057m = r1
            goto L18
        L13:
            o9.c r0 = new o9.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f78055k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78057m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r8)
            goto L73
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.jvm.internal.z0 r7 = r0.f78054j
            com.digidust.elokence.akinator.activities.AkActivity r2 = r0.f78053i
            tu.a0.throwOnFailure(r8)
            goto L5d
        L3d:
            tu.a0.throwOnFailure(r8)
            kotlin.jvm.internal.z0 r8 = new kotlin.jvm.internal.z0
            r8.<init>()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            o9.d r6 = new o9.d
            r6.<init>(r8, r5)
            r0.f78053i = r7
            r0.f78054j = r8
            r0.f78057m = r4
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)
            if (r2 != r1) goto L5b
            goto L72
        L5b:
            r2 = r7
            r7 = r8
        L5d:
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            o9.e r4 = new o9.e
            r4.<init>(r7, r2, r5)
            r0.f78053i = r5
            r0.f78054j = r5
            r0.f78057m = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r8, r4, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.AkActivity.i(com.digidust.elokence.akinator.activities.AkActivity, zu.d):java.lang.Object");
    }

    public static Bitmap k(View view) {
        if (view == null || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        if (view.getMeasuredHeight() <= 1024) {
            return bitmapCreateBitmap;
        }
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, (int) (view.getMeasuredWidth() * (1024.0d / view.getMeasuredHeight())), 1024, false);
    }

    public static /* synthetic */ void manageRgpd$default(AkActivity akActivity, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: manageRgpd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        akActivity.m(z10);
    }

    public static Intent o() {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (m.sharedInstance().isPaid()) {
            intent.setData(Uri.parse("market://details?id=com.digidust.elokence.akinator.paid"));
            return intent;
        }
        if (m.sharedInstance().isFreemium()) {
            intent.setData(Uri.parse("market://details?id=com.digidust.elokence.akinator.freemium"));
        }
        return intent;
    }

    public static void s(View view) {
        if (view != null) {
            if (view.getBackground() != null) {
                view.getBackground().setCallback(null);
                view.setBackground(null);
            }
            if (e0.areEqual(view.getClass(), ImageView.class)) {
                ((ImageView) view).setImageBitmap(null);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    s(viewGroup.getChildAt(i10));
                }
                try {
                    ((ViewGroup) view).removeAllViews();
                } catch (Exception unused) {
                }
            }
        }
    }

    public Object checkIfUserIsStillLoggedCustom(zu.d<? super x0> dVar) {
        return i(this, dVar);
    }

    public final void disableAdOneTime() {
        this.f21683f.disableAdOneTime();
    }

    public final void disableHomeButton() {
        this.f21698u = false;
    }

    public final void displayFragmentPartageScreenShot(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        disableAdOneTime();
        startActivity(Intent.createChooser(intent, b1.f72741d.sharedInstance().getTraductionFromToken("PARTAGER"), PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) MyBroadcastReceiver.class), 201326592).getIntentSender()));
    }

    public final void displayLoader() {
        runOnUiThread(new o9.a(this, 1));
    }

    public final void disposeAtDestruction(pt.c cVar) {
        if (cVar != null) {
            this.f21699v.add(cVar);
        }
    }

    public final void enableHomeButton() {
        this.f21698u = true;
    }

    public final u9.a getMGeneralProcessing() {
        return this.f21683f;
    }

    public final boolean getMHomeButtonEnabled() {
        return this.f21698u;
    }

    public final int getScreenHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int getScreenWidth() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final void goToHome(boolean z10) {
        na.b.playBip();
        Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
        intent.setFlags(67108864);
        if (!z10) {
            intent.putExtra("ShowAdOnGameOver", false);
        }
        o.sharedInstance().cancelSession(this.f21684g);
        startActivity(intent);
        finish();
    }

    public final void goToMenu() {
        na.b.playBip();
        if (m.sharedInstance().isFirstLaunch()) {
            m.sharedInstance().setFirstLaunch(false);
        }
        Intent intent = new Intent(this, (Class<?>) MenuActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("ShowAdOnGameOver", false);
        intent.putExtra("openDrawer", getIntent().getBooleanExtra("openDrawer", false));
        intent.putExtra("frgfx", true);
        startActivity(intent);
        finish();
    }

    public final void goToStoreItems(boolean z10) {
        disableAdOneTime();
        Intent intent = new Intent(this, (Class<?>) StoreItemsActivity.class);
        if (z10) {
            startActivityForResult(intent, 5000);
        } else {
            startActivity(intent);
        }
    }

    public final void h(int i10, int i11) {
        TextView textView = this.f21691n;
        if (textView != null) {
            if (i11 - i10 == 1) {
                e0.checkNotNull(textView);
                textView.setText(NumberFormat.getInstance().format(i11));
            } else {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
                valueAnimatorOfInt.setDuration(500);
                valueAnimatorOfInt.addUpdateListener(new g(this, 5));
                valueAnimatorOfInt.start();
            }
        }
    }

    public final void hideLoader() {
        runOnUiThread(new o9.a(this, 0));
    }

    public final boolean isAkiResumed() {
        return this.f21685h;
    }

    public final boolean isTablet() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return ((int) (((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi)) * 160.0d)) >= 728;
    }

    @Override // z9.a
    public void itemPurchased(String itemName) {
        e0.checkNotNullParameter(itemName, "itemName");
    }

    public final void j() {
        Application application = getApplication();
        e0.checkNotNull(application, "null cannot be cast to non-null type com.digidust.elokence.akinator.factories.AkApplication");
        ((AkApplication) application).deleteCache();
        na.b.stopSoundService();
        Intent intent = new Intent(this, (Class<?>) SplashscreenActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("closeApp", true);
        startActivity(intent);
        finish();
    }

    public final boolean l() {
        NetworkCapabilities networkCapabilities;
        Object systemService = getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return true;
        }
        return (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2)) ? false : true;
    }

    public final void m(final boolean z10) {
        Timber.Forest.tag("RGPD").d("initChandagoIfNecessary " + z10 + " true", new Object[0]);
        String sfbxAppKey = this.f21683f.getSfbxAppKey();
        e0.checkNotNullExpressionValue(sfbxAppKey, "getSfbxAppKey(...)");
        AppConsentSDK.Companion.initialize$default(AppConsentSDK.Companion, sfbxAppKey, null, new l() { // from class: o9.b
            @Override // kv.l
            public final Object invoke(Object obj) {
                AppConsent appConsent = (AppConsent) obj;
                boolean z11 = AkActivity.f21679y;
                kotlin.jvm.internal.e0.checkNotNull(appConsent);
                this.f78038b.onChandagoInitialised(appConsent, z10, true);
                if (ca.m.sharedInstance().getMailUser() != null) {
                    XChangeData.Builder builder = new XChangeData.Builder(null, null, null, null, null, null, 63, null);
                    String mailUser = ca.m.sharedInstance().getMailUser();
                    kotlin.jvm.internal.e0.checkNotNull(mailUser);
                    appConsent.setXchangeUserData(builder.email(mailUser).build());
                }
                return tu.x0.f87415a;
            }
        }, 2, null);
    }

    public final void majSeuilDePopu() {
        int rankingLimit;
        try {
            lb.c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            rankingLimit = currentInstance.getRankingLimit();
        } catch (Exception unused) {
            rankingLimit = -1;
        }
        if (rankingLimit == -1) {
            m.sharedInstance().setOriginalMaxRanking(-1);
        } else {
            m.sharedInstance().setOriginalMaxRanking(rankingLimit * 10);
        }
    }

    public final void markBitmapForRecycle(Bitmap bmp) {
        e0.checkNotNullParameter(bmp, "bmp");
        ArrayList arrayList = this.f21694q;
        e0.checkNotNull(arrayList);
        arrayList.add(bmp);
    }

    public final void markTextviewForUpdate(TextView tv2) {
        e0.checkNotNullParameter(tv2, "tv");
        ArrayList arrayList = this.f21693p;
        e0.checkNotNull(arrayList);
        arrayList.add(tv2);
    }

    public void n() {
    }

    @Override // z9.a
    public void onAllPurchasesRestored() throws NumberFormatException {
        if (m.sharedInstance().canDisplayRestoreOk()) {
            m.sharedInstance().displayRestoreOk(false);
            runOnUiThread(new o9.a(this, 3));
        }
        m.sharedInstance().isPrio();
        s0.b bVar = s0.f72971j;
        s0 s0VarSharedInstance = bVar.sharedInstance();
        String mediaId = m.sharedInstance().getMediaId();
        e0.checkNotNullExpressionValue(mediaId, "getMediaId(...)");
        int i10 = Integer.parseInt(mediaId);
        String mediaFootprint = m.sharedInstance().getMediaFootprint();
        e0.checkNotNullExpressionValue(mediaFootprint, "getMediaFootprint(...)");
        s0VarSharedInstance.setMedia(i10, mediaFootprint);
        s0 s0VarSharedInstance2 = bVar.sharedInstance();
        int partnerId = m.sharedInstance().getPartnerId(isTablet());
        String partnerAuthKey = m.sharedInstance().getPartnerAuthKey(isTablet());
        e0.checkNotNullExpressionValue(partnerAuthKey, "getPartnerAuthKey(...)");
        s0VarSharedInstance2.setPartner(partnerId, partnerAuthKey);
        bVar.sharedInstance().saveSettings();
    }

    @Override // jb.b
    public void onAnalyticsPushError() {
    }

    @Override // jb.b
    public void onAnalyticsPushResponse() {
        h.a aVar = h.f69257d;
        aVar.sharedInstance().deleteValue("cs_cmp_show");
        aVar.sharedInstance().deleteValue("cs_cmp_click");
    }

    @Override // ca.q
    public void onAwardAwarded(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        o.sharedInstance().setCanShowAd(false);
    }

    public final void onChandagoInitialised(AppConsent instance, boolean z10, boolean z11) {
        e0.checkNotNullParameter(instance, "instance");
        Timber.Forest forest = Timber.Forest;
        forest.tag("RGPD").d("Chandago initialized " + z10 + " " + z11, new Object[0]);
        instance.setOnPresentNoticeListener(new f(this, instance));
        if (z11) {
            if (!m.sharedInstance().isRGPDCountry()) {
                forest.tag("RGPD").d("Manage after init : Hors RGPD", new Object[0]);
                this.f21695r = true;
                if (m.sharedInstance().isFreemium()) {
                    this.f21683f.onConsentInformedViaCMP(true, true);
                }
                n();
            }
            if (!z10 && instance.consentGiven()) {
                boolean zConsentableAllowed = instance.consentableAllowed(19, ACConsentableType.PURPOSE);
                forest.tag("RGPD").d("nonIAB  : %s", Boolean.valueOf(zConsentableAllowed));
                this.f21683f.onConsentInformedViaCMP(true, zConsentableAllowed);
                this.f21695r = true;
                n();
                return;
            }
            forest.tag("RGPD").d("PresentNoticeActivity", new Object[0]);
            if (instance.tryToDisplayNotice(z10)) {
                return;
            }
            forest.tag("AkActivity").e("Chandago notice not shown for unknown reason. Desactivating targetng", new Object[0]);
            this.f21683f.onConsentInformedViaCMP(false, false);
            this.f21695r = true;
            n();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(this instanceof SplashscreenActivity) && !f21679y) {
            f21679y = true;
            this.f21681c = true;
            Intent intent = new Intent(this, (Class<?>) SplashscreenActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
            finish();
            Runtime.getRuntime().exit(0);
        }
        f21679y = true;
        this.f21694q = new ArrayList();
        this.f21693p = new ArrayList();
        this.f21696s = (AudioManager) getSystemService("audio");
        this.f21683f.processOnCreate();
        this.f21684g = FirebaseAnalytics.getInstance(this);
    }

    @Override // aa.d
    public void onDefiDuJourModified() {
        if (aa.f.sharedInstance().isAtLeastOnePersoFound(false)) {
            m.sharedInstance().setDisplayUpdateIcon(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (B == this) {
            B = null;
        }
        super.onDestroy();
        Iterator it = this.f21699v.iterator();
        while (it.hasNext()) {
            pt.c cVar = (pt.c) it.next();
            if (!cVar.isDisposed()) {
                cVar.dispose();
            }
        }
        if (this.f21681c) {
            return;
        }
        try {
            ArrayList arrayList = this.f21694q;
            e0.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ArrayList arrayList2 = this.f21694q;
                e0.checkNotNull(arrayList2);
                Bitmap bitmap = (Bitmap) arrayList2.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            ArrayList arrayList3 = this.f21694q;
            e0.checkNotNull(arrayList3);
            arrayList3.clear();
            s(getWindow().getDecorView().getRootView());
            System.gc();
        } catch (Exception unused) {
        }
    }

    @Override // ca.q
    public void onGenizAwarded(int i10) {
        if (m.sharedInstance().isUserConnected()) {
            int genizBalanceAccount = r.sharedInstance().getGenizBalanceAccount();
            h(genizBalanceAccount - i10, genizBalanceAccount);
        } else {
            int genizBalance = r.sharedInstance().getGenizBalance();
            h(genizBalance - i10, genizBalance);
        }
    }

    @Override // z9.a
    public void onInitialization(boolean z10) {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        try {
            if (i10 == 24) {
                AudioManager audioManager = this.f21696s;
                e0.checkNotNull(audioManager);
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            }
            if (i10 != 25) {
                return super.onKeyDown(i10, keyEvent);
            }
            AudioManager audioManager2 = this.f21696s;
            e0.checkNotNull(audioManager2);
            audioManager2.adjustStreamVolume(3, -1, 1);
            return true;
        } catch (Exception unused) {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.f21685h = false;
        f21680z = false;
        A = true;
        if (!this.f21681c) {
            s0.f72971j.sharedInstance().onActivityPause();
            aa.f.sharedInstance().removeListener(this);
            r.sharedInstance().removeListener(this);
            e.getInstance().removeListener(this);
            this.f21683f.processOnPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        e0.checkNotNullParameter(menu, "menu");
        menu.clear();
        return true;
    }

    @Override // ca.q
    public abstract /* synthetic */ void onPseudoChange(String str);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        e0.checkNotNullParameter(permissions, "permissions");
        e0.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        c cVar;
        super.onResume();
        this.f21685h = true;
        f21680z = true;
        B = this;
        if (this.f21681c || (this instanceof SplashscreenActivity)) {
            return;
        }
        s0.f72971j.sharedInstance().onActivityResume();
        m.sharedInstance().setCanSendAnalytics(true);
        aa.f.sharedInstance().addListener(this);
        r.sharedInstance().addListener(this);
        e.getInstance().addListener(this);
        c cVar2 = this.f21697t;
        c cVar3 = c.f74126e;
        if (cVar2 != cVar3) {
            na.a.startMusic(cVar2);
        }
        if (A && (cVar = this.f21697t) != cVar3) {
            na.a.startMusic(cVar);
        }
        A = false;
        if (this.f21682e) {
            this.f21682e = false;
            ImageView imageView = (ImageView) findViewById(R.id.homeButtonImage);
            this.f21692o = imageView;
            if (imageView != null) {
                e0.checkNotNull(imageView);
                imageView.setOnClickListener(this.f21700w);
            }
            TextView textView = (TextView) findViewById(R.id.textScoreGz);
            this.f21691n = textView;
            Typeface typeface = this.f21686i;
            if (textView != null) {
                e0.checkNotNull(textView);
                textView.setTypeface(typeface);
            }
            TextView textView2 = (TextView) findViewById(R.id.storeFacesCreditText);
            if (textView2 != null) {
                e0.checkNotNull(textView2);
                textView2.setTypeface(typeface);
            }
        }
        if (m.sharedInstance().isUserConnected()) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new o9.g(this, null), 3, null);
        }
        if (this.f21691n != null) {
            if (m.sharedInstance().isUserConnected()) {
                TextView textView3 = this.f21691n;
                e0.checkNotNull(textView3);
                textView3.setText(NumberFormat.getInstance().format(r.sharedInstance().getGenizBalanceAccount()));
            } else {
                TextView textView4 = this.f21691n;
                e0.checkNotNull(textView4);
                textView4.setText(NumberFormat.getInstance().format(r.sharedInstance().getGenizBalance()));
            }
        }
        this.f21683f.processOnResume();
    }

    @Override // lb.t0
    public void onWebServiceReload(int i10) {
        if (i10 == 500) {
            m.sharedInstance().setCanPlay(-1);
        } else if (i10 != 510) {
            m.sharedInstance().setCanPlay(1);
        } else {
            m.sharedInstance().setCanPlay(0);
        }
    }

    @Override // ca.q
    public void onXpAwarded(int i10) {
    }

    public final void p(Bitmap bitmap) throws IOException {
        if (bitmap != null) {
            File file = new File(getFilesDir().getAbsolutePath(), "flag.png");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    }

    public final boolean q(int i10, Bitmap pBitmap) {
        Bitmap bitmap;
        e0.checkNotNullParameter(pBitmap, "pBitmap");
        ImageView imageView = (ImageView) findViewById(i10);
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                ArrayList arrayList = this.f21694q;
                e0.checkNotNull(arrayList);
                arrayList.remove(bitmap);
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            try {
                markBitmapForRecycle(pBitmap);
                imageView.setImageBitmap(pBitmap);
                return true;
            } catch (OutOfMemoryError unused) {
                Toast.makeText(this, b1.f72741d.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
            }
        }
        return false;
    }

    public final void setAkinatorImage(ImageView image, String akitude) {
        Bitmap hatBitmap;
        Bitmap clothBitmap;
        Bitmap bitmap;
        e0.checkNotNullParameter(image, "image");
        e0.checkNotNullParameter(akitude, "akitude");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) image.getDrawable();
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            ArrayList arrayList = this.f21694q;
            e0.checkNotNull(arrayList);
            arrayList.remove(bitmap);
        }
        Bitmap akiBitmap = t.sharedInstance().getAkiBitmap(akitude);
        if (akiBitmap == null || (hatBitmap = t.sharedInstance().getHatBitmap(m.sharedInstance().getHat(), akitude)) == null || (clothBitmap = t.sharedInstance().getClothBitmap(m.sharedInstance().getCloth(), akitude)) == null) {
            return;
        }
        try {
            int width = akiBitmap.getWidth();
            int height = akiBitmap.getHeight();
            Bitmap.Config config = akiBitmap.getConfig();
            e0.checkNotNull(config);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
            Rect rect = new Rect();
            rect.set(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(akiBitmap, (Rect) null, rect, (Paint) null);
            canvas.drawBitmap(clothBitmap, (Rect) null, rect, (Paint) null);
            canvas.drawBitmap(hatBitmap, (Rect) null, rect, (Paint) null);
            image.setImageBitmap(bitmapCreateBitmap);
            markBitmapForRecycle(bitmapCreateBitmap);
            if (!akiBitmap.isRecycled()) {
                akiBitmap.recycle();
            }
            if (!hatBitmap.isRecycled()) {
                hatBitmap.recycle();
            }
            if (clothBitmap.isRecycled()) {
                return;
            }
            clothBitmap.recycle();
        } catch (OutOfMemoryError unused) {
        }
    }

    public final void setMGeneralProcessing(u9.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f21683f = aVar;
    }

    public final void setMHomeButtonEnabled(boolean z10) {
        this.f21698u = z10;
    }

    @Override // z9.a
    public void skuDetailsUpdated() {
    }

    public final void updateTextViewsSize() {
        ArrayList arrayList = this.f21693p;
        e0.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            e0.checkNotNullExpressionValue(next, "next(...)");
            TextView textView = (TextView) next;
            textView.setTextSize(0, AkApplication.f21719f.getCoeffFont() * textView.getTextSize());
        }
        ArrayList arrayList2 = this.f21693p;
        e0.checkNotNull(arrayList2);
        arrayList2.clear();
    }

    public final void r() {
        Timber.Forest.tag(wHkgq.XKqSCOBa).e(new Exception("Erreur de connexion Google Play"));
        runOnUiThread(new o9.a(this, 2));
    }
}
