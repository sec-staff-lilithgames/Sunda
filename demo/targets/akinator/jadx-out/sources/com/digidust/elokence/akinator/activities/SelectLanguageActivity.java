package com.digidust.elokence.akinator.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.lifecycle.c1;
import av.e;
import ca.m;
import com.digidust.elokence.akinator.paid.databinding.ActivityLanguageSelectBinding;
import da.k;
import j1.o2;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import lb.b1;
import lb.c;
import lb.s0;
import o9.a7;
import o9.b3;
import o9.b7;
import o9.d7;
import o9.f7;
import o9.w6;
import tu.x0;
import y9.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class SelectLanguageActivity extends AkActivity implements AdapterView.OnItemClickListener {
    public static final /* synthetic */ int I = 0;
    public f C;
    public ActivityLanguageSelectBinding D;
    public String E;
    public boolean F;
    public int G = 1;
    public View.OnClickListener H = new w6(this, 1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:46)|(1:(1:(4:12|13|40|41)(2:17|18))(2:19|20))(4:22|23|(0)|28)|21|44|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r11, r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r12 = r0;
        r11 = r6;
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r11 = (android.app.Dialog) r14.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r11 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        r11.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r14.set(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        timber.log.Timber.Forest.e(r12, "Erreur technique lors du changement de langue", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$asyncCheckLanguage(com.digidust.elokence.akinator.activities.SelectLanguageActivity r11, java.lang.String r12, int r13, java.util.concurrent.atomic.AtomicReference r14, zu.d r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof o9.x6
            if (r0 == 0) goto L16
            r0 = r15
            o9.x6 r0 = (o9.x6) r0
            int r1 = r0.f78675n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f78675n = r1
            goto L1b
        L16:
            o9.x6 r0 = new o9.x6
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r15 = r0.f78673l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78675n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.util.concurrent.atomic.AtomicReference r14 = r0.f78671j
            com.digidust.elokence.akinator.activities.SelectLanguageActivity r11 = r0.f78670i
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Exception -> L35
            goto Lab
        L35:
            r0 = move-exception
            r12 = r0
            goto L89
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            int r13 = r0.f78672k
            java.util.concurrent.atomic.AtomicReference r14 = r0.f78671j
            com.digidust.elokence.akinator.activities.SelectLanguageActivity r11 = r0.f78670i
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Exception -> L35
        L49:
            r6 = r11
            r9 = r13
            r7 = r14
            goto L68
        L4d:
            tu.a0.throwOnFailure(r15)
            kotlinx.coroutines.CoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L35
            o9.z6 r2 = new o9.z6     // Catch: java.lang.Exception -> L35
            r2.<init>(r11, r12, r3)     // Catch: java.lang.Exception -> L35
            r0.f78670i = r11     // Catch: java.lang.Exception -> L35
            r0.f78671j = r14     // Catch: java.lang.Exception -> L35
            r0.f78672k = r13     // Catch: java.lang.Exception -> L35
            r0.f78675n = r5     // Catch: java.lang.Exception -> L35
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r2, r0)     // Catch: java.lang.Exception -> L35
            if (r15 != r1) goto L49
            goto L84
        L68:
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Exception -> L85
            int r8 = r15.intValue()     // Catch: java.lang.Exception -> L85
            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L85
            o9.y6 r5 = new o9.y6     // Catch: java.lang.Exception -> L85
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L85
            r0.f78670i = r6     // Catch: java.lang.Exception -> L85
            r0.f78671j = r7     // Catch: java.lang.Exception -> L85
            r0.f78675n = r4     // Catch: java.lang.Exception -> L85
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r5, r0)     // Catch: java.lang.Exception -> L85
            if (r11 != r1) goto Lab
        L84:
            return r1
        L85:
            r0 = move-exception
            r12 = r0
            r11 = r6
            r14 = r7
        L89:
            r11.getClass()
            java.lang.Object r11 = r14.get()     // Catch: java.lang.IllegalArgumentException -> L9e
            android.app.Dialog r11 = (android.app.Dialog) r11     // Catch: java.lang.IllegalArgumentException -> L9e
            if (r11 == 0) goto La1
            boolean r13 = r11.isShowing()     // Catch: java.lang.IllegalArgumentException -> L9e
            if (r13 == 0) goto La1
            r11.dismiss()     // Catch: java.lang.IllegalArgumentException -> L9e
            goto La1
        L9e:
            r14.set(r3)
        La1:
            timber.log.Timber$Forest r11 = timber.log.Timber.Forest
            r13 = 0
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r14 = "Erreur technique lors du changement de langue"
            r11.e(r12, r14, r13)
        Lab:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$asyncCheckLanguage(com.digidust.elokence.akinator.activities.SelectLanguageActivity, java.lang.String, int, java.util.concurrent.atomic.AtomicReference, zu.d):java.lang.Object");
    }

    public static final void access$dismissLoadingDialog(SelectLanguageActivity selectLanguageActivity, AtomicReference atomicReference) {
        selectLanguageActivity.getClass();
        try {
            Dialog dialog = (Dialog) atomicReference.get();
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            dialog.dismiss();
        } catch (IllegalArgumentException unused) {
            atomicReference.set(null);
        }
    }

    public static final Object access$fetchBanner(SelectLanguageActivity selectLanguageActivity, d dVar) {
        selectLanguageActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a7(selectLanguageActivity, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public static final Object access$fetchDailyChallenge(SelectLanguageActivity selectLanguageActivity, d dVar) {
        selectLanguageActivity.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new b7(2, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[Catch: Exception -> 0x0100, TRY_LEAVE, TryCatch #0 {Exception -> 0x0100, blocks: (B:53:0x00ee, B:55:0x00f9), top: B:66:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$handleCheckLanguageResult(com.digidust.elokence.akinator.activities.SelectLanguageActivity r7, int r8, int r9, zu.d r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$handleCheckLanguageResult(com.digidust.elokence.akinator.activities.SelectLanguageActivity, int, int, zu.d):java.lang.Object");
    }

    public static final int access$handleLanguageSelection(SelectLanguageActivity selectLanguageActivity, String str) throws IOException, ParseException {
        selectLanguageActivity.getClass();
        m.sharedInstance().setCurrentLanguage(str);
        m.sharedInstance().setCurrentSubject(1);
        s0.f72971j.sharedInstance().saveSettings();
        c currentInstance = m.sharedInstance().getCurrentInstance();
        if (currentInstance == null) {
            return -3;
        }
        int applicationLanguage = b1.f72741d.sharedInstance().setApplicationLanguage(str, currentInstance.getTradsAppId());
        if (applicationLanguage != 0) {
            return applicationLanguage;
        }
        String state = currentInstance.getState();
        if (e0.areEqual(state, "OK")) {
            return 0;
        }
        if (e0.areEqual(state, "KO")) {
            return currentInstance.getPrioAvailable() == 1 ? 510 : 500;
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$refreshUserInfos(com.digidust.elokence.akinator.activities.SelectLanguageActivity r6, zu.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof o9.g7
            if (r0 == 0) goto L16
            r0 = r7
            o9.g7 r0 = (o9.g7) r0
            int r1 = r0.f78168l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f78168l = r1
            goto L1b
        L16:
            o9.g7 r0 = new o9.g7
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f78166j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78168l
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.digidust.elokence.akinator.activities.SelectLanguageActivity r6 = r0.f78165i
            tu.a0.throwOnFailure(r7)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            o9.h7 r2 = new o9.h7
            r4 = 0
            r5 = 2
            r2.<init>(r5, r4)
            r0.f78165i = r6
            r0.f78168l = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0 = 400(0x190, float:5.6E-43)
            if (r7 != r0) goto L6a
            ca.m r7 = ca.m.sharedInstance()
            r0 = 0
            r7.setUserConnectionStatus(r0)
            java.lang.String r7 = "Erreur technique, merci de réessayer plus tard."
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r0)
            r6.show()
        L6a:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$refreshUserInfos(com.digidust.elokence.akinator.activities.SelectLanguageActivity, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$setupAnalyticsIfNeeded(com.digidust.elokence.akinator.activities.SelectLanguageActivity r10, zu.d r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof o9.i7
            if (r0 == 0) goto L17
            r0 = r11
            o9.i7 r0 = (o9.i7) r0
            int r1 = r0.f78228k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f78228k = r1
        L15:
            r9 = r0
            goto L1d
        L17:
            o9.i7 r0 = new o9.i7
            r0.<init>(r10, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r9.f78226i
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f78228k
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            tu.a0.throwOnFailure(r11)
            goto Lc0
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            tu.a0.throwOnFailure(r11)
            ca.m r11 = ca.m.sharedInstance()
            boolean r11 = r11.isPaid()
            if (r11 == 0) goto L47
            r11 = 2
        L45:
            r7 = r11
            goto L55
        L47:
            ca.o r11 = ca.o.sharedInstance()
            boolean r11 = r11.isUnlocked()
            if (r11 == 0) goto L53
            r7 = r2
            goto L55
        L53:
            r11 = 0
            goto L45
        L55:
            ca.m r11 = ca.m.sharedInstance()
            r11.changeLanguageManually(r2)
            jb.c$a r11 = jb.c.f69226m
            jb.c r1 = r11.sharedInstance()
            java.lang.String r3 = ca.a.getAbtestUrlSondageKey()
            java.lang.String r4 = "getAbtestUrlSondageKey(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = ""
            r1.addCampaign(r3, r4)
            jb.c r1 = r11.sharedInstance()
            java.lang.String r3 = ca.a.getAbtestIdSondageKey()
            java.lang.String r5 = "getAbtestIdSondageKey(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r5)
            r1.addCampaign(r3, r4)
            jb.c r1 = r11.sharedInstance()
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.String r11 = "getApplicationContext(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r10, r11)
            ca.m r11 = ca.m.sharedInstance()
            java.lang.String r3 = r11.getDeviceId()
            java.lang.String r11 = "getDeviceId(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r11)
            ca.m r11 = ca.m.sharedInstance()
            java.lang.String r4 = r11.getApplicationIdForAnalytics()
            lb.b1$a r11 = lb.b1.f72741d
            lb.b1 r11 = r11.sharedInstance()
            java.lang.String r5 = r11.getApplicationLanguage()
            ca.m r11 = ca.m.sharedInstance()
            java.lang.String r6 = r11.getFcmToken()
            r9.f78228k = r2
            java.lang.String r8 = "akinator"
            r2 = r10
            java.lang.Object r11 = r1.bootSuspend(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto Lc0
            return r0
        Lc0:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 == 0) goto Le5
            ca.m r10 = ca.m.sharedInstance()
            boolean r10 = r10.isFreemium()
            if (r10 == 0) goto Le5
            ca.o r10 = ca.o.sharedInstance()
            boolean r10 = r10.isUnlocked()
            if (r10 != 0) goto Le5
            lb.s0$b r10 = lb.s0.f72971j
            lb.s0 r10 = r10.sharedInstance()
            r10.saveSettings()
        Le5:
            ca.m r10 = ca.m.sharedInstance()
            jb.c$a r11 = jb.c.f69226m
            jb.c r11 = r11.sharedInstance()
            java.lang.String r11 = r11.getCreatedDeviceRecord()
            r10.setCreatedDeviceRecord(r11)
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$setupAnalyticsIfNeeded(com.digidust.elokence.akinator.activities.SelectLanguageActivity, zu.d):java.lang.Object");
    }

    public static final AtomicReference access$showLoadingDialog(SelectLanguageActivity selectLanguageActivity) {
        selectLanguageActivity.getClass();
        return new AtomicReference(k.show(selectLanguageActivity));
    }

    public final View.OnClickListener getMListenerBack() {
        return this.H;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void itemPurchased(String itemName) {
        e0.checkNotNullParameter(itemName, "itemName");
        super.itemPurchased(itemName);
        if ((e0.areEqual(itemName, z9.e.getInstance().getSkuInappUltime()) || e0.areEqual(itemName, z9.e.getInstance().getSkuInappPopu())) && m.sharedInstance().canPlay() == 0 && m.sharedInstance().canCheckFull()) {
            da.f fVar = new da.f(this);
            fVar.setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_FULL_ACHETE"));
            fVar.setOkListener(new b3(this, 2));
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m.sharedInstance().isFirstLaunch() || this.F) {
            return;
        }
        super.onBackPressed();
        Intent intent = new Intent(this, (Class<?>) MenuActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("ShowAdOnGameOver", false);
        intent.putExtra("openDrawer", getIntent().getBooleanExtra("openDrawer", false));
        intent.putExtra("frgfx", true);
        startActivity(intent);
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityLanguageSelectBinding activityLanguageSelectBindingInflate = ActivityLanguageSelectBinding.inflate(getLayoutInflater());
        this.D = activityLanguageSelectBindingInflate;
        ActivityLanguageSelectBinding activityLanguageSelectBinding = null;
        if (activityLanguageSelectBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBindingInflate = null;
        }
        setContentView(activityLanguageSelectBindingInflate.getRoot());
        this.f21697t = ma.c.f74126e;
        ActivityLanguageSelectBinding activityLanguageSelectBinding2 = this.D;
        if (activityLanguageSelectBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding2 = null;
        }
        activityLanguageSelectBinding2.relativeBackButton.setOnClickListener(this.H);
        ActivityLanguageSelectBinding activityLanguageSelectBinding3 = this.D;
        if (activityLanguageSelectBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding3 = null;
        }
        activityLanguageSelectBinding3.textTitleLanguage.setTypeface(this.f21687j);
        ActivityLanguageSelectBinding activityLanguageSelectBinding4 = this.D;
        if (activityLanguageSelectBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding4 = null;
        }
        TextView textView = activityLanguageSelectBinding4.textTitleLanguage;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "MENU_LANGUE", textView);
        ActivityLanguageSelectBinding activityLanguageSelectBinding5 = this.D;
        if (activityLanguageSelectBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding5 = null;
        }
        activityLanguageSelectBinding5.scrollLanguageListText.setTypeface(this.f21686i);
        updateTextViewsSize();
        this.C = new f(this, aVar.sharedInstance().getListOfLanguages());
        ActivityLanguageSelectBinding activityLanguageSelectBinding6 = this.D;
        if (activityLanguageSelectBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding6 = null;
        }
        activityLanguageSelectBinding6.languageList.setAdapter((ListAdapter) this.C);
        f fVar = this.C;
        e0.checkNotNull(fVar);
        fVar.notifyDataSetChanged();
        ActivityLanguageSelectBinding activityLanguageSelectBinding7 = this.D;
        if (activityLanguageSelectBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding7 = null;
        }
        activityLanguageSelectBinding7.languageList.setOnItemClickListener(this);
        this.E = aVar.sharedInstance().getApplicationLanguage();
        ActivityLanguageSelectBinding activityLanguageSelectBinding8 = this.D;
        if (activityLanguageSelectBinding8 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityLanguageSelectBinding8 = null;
        }
        activityLanguageSelectBinding8.scrollLanguageListText.setText("Scroll to select your language");
        if (m.sharedInstance().isFirstLaunch()) {
            ActivityLanguageSelectBinding activityLanguageSelectBinding9 = this.D;
            if (activityLanguageSelectBinding9 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityLanguageSelectBinding9 = null;
            }
            activityLanguageSelectBinding9.relativeBackButton.setVisibility(8);
        } else {
            ActivityLanguageSelectBinding activityLanguageSelectBinding10 = this.D;
            if (activityLanguageSelectBinding10 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityLanguageSelectBinding10 = null;
            }
            activityLanguageSelectBinding10.relativeBackButton.setOnClickListener(new w6(this, 0));
        }
        ActivityLanguageSelectBinding activityLanguageSelectBinding11 = this.D;
        if (activityLanguageSelectBinding11 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLanguageSelectBinding = activityLanguageSelectBinding11;
        }
        activityLanguageSelectBinding.mainLayout.setOnApplyWindowInsetsListener(new d7());
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        f fVar = this.C;
        e0.checkNotNull(fVar);
        fVar.clear();
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new f7(this, i10, null), 3, null);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.G != 0 || m.sharedInstance().isPrio()) {
            return;
        }
        z9.e.getInstance().requestAllPurchases(null);
        m.sharedInstance().setCanCheckFull(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final void setMListenerBack(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.H = onClickListener;
    }
}
