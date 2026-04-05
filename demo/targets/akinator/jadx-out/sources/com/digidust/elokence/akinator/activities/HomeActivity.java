package com.digidust.elokence.akinator.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.lifecycle.c1;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import ca.m;
import ca.o;
import com.applovin.impl.k9;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;
import da.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ji.t;
import kb.d;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.b1;
import lb.s0;
import o9.g2;
import o9.j2;
import o9.k2;
import o9.r1;
import o9.u1;
import o9.v1;
import o9.x1;
import o9.z1;
import timber.log.Timber;
import u9.f;
import y9.n;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class HomeActivity extends AkActivity {
    public static final /* synthetic */ int U = 0;
    public ActivityHomeBinding D;
    public Animation F;
    public Animation G;
    public n I;
    public Animation J;
    public boolean K;
    public k L;
    public Dialog M;
    public Dialog N;
    public final f C = new f(this);
    public CountDownTimer E = new v1(0, 0);
    public List H = new ArrayList();
    public final HomeActivity$commReceiver$1 O = new BroadcastReceiver() { // from class: com.digidust.elokence.akinator.activities.HomeActivity$commReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Timber.Forest.tag("Banerinou").d("onReceive commReceiver", new Object[0]);
            HomeActivity.access$updateHomeBannerGraphicConf(this.f21702a);
        }
    };
    public View.OnClickListener P = new j2(this);
    public View.OnClickListener Q = new r1(this, 1);
    public View.OnClickListener R = new r1(this, 2);
    public View.OnClickListener S = new r1(this, 3);
    public View.OnClickListener T = new r1(this, 4);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public static final void access$animateWelcomeText(HomeActivity homeActivity) {
        ActivityHomeBinding activityHomeBinding = homeActivity.D;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.textDescriptionGame.setVisibility(0);
        String traductionFromToken = b1.f72741d.sharedInstance().getTraductionFromToken("PENSEZ_A_UN_PERSONNAGE_REEL_OU_FICTIF");
        ActivityHomeBinding activityHomeBinding3 = homeActivity.D;
        if (activityHomeBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding3 = null;
        }
        activityHomeBinding3.textDescriptionGame.setText(traductionFromToken);
        AnimatorSet animatorSet = new AnimatorSet();
        ActivityHomeBinding activityHomeBinding4 = homeActivity.D;
        if (activityHomeBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding4 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(activityHomeBinding4.textDescriptionGame, (Property<TextView, Float>) TextView.ALPHA, 0.0f, 1.0f));
        ActivityHomeBinding activityHomeBinding5 = homeActivity.D;
        if (activityHomeBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding5 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(activityHomeBinding5.textDescriptionGame, (Property<TextView, Float>) TextView.SCALE_X, 0.3f, 1.05f, 0.9f, 1.0f));
        ActivityHomeBinding activityHomeBinding6 = homeActivity.D;
        if (activityHomeBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
        } else {
            activityHomeBinding2 = activityHomeBinding6;
        }
        builderWith.with(ObjectAnimator.ofFloat(activityHomeBinding2.textDescriptionGame, (Property<TextView, Float>) TextView.SCALE_Y, 0.3f, 1.05f, 0.9f, 1.0f));
        animatorSet.setDuration(1500L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new u1(homeActivity));
        animatorSet.start();
    }

    public static final void access$exitApp(HomeActivity homeActivity) {
        homeActivity.getClass();
        o.sharedInstance().setNbGamesInOneSession(0);
        homeActivity.j();
    }

    public static final /* synthetic */ int access$getInstancesForCurrentLanguage(HomeActivity homeActivity, Collection collection) {
        homeActivity.getClass();
        return t(collection);
    }

    public static final void access$openOrCloseBanner(HomeActivity homeActivity) {
        homeActivity.getClass();
        m.sharedInstance().setHomeBannerOpened(!m.sharedInstance().isHomeBannerOpened());
        homeActivity.runOnUiThread(new t(homeActivity, 26));
    }

    public static final void access$updateHomeBannerGraphicConf(HomeActivity homeActivity) {
        homeActivity.getClass();
        homeActivity.runOnUiThread(new t(homeActivity, 26));
    }

    public static int t(Collection collection) {
        s0 s0VarSharedInstance = s0.f72971j.sharedInstance();
        String currentLanguage = m.sharedInstance().getCurrentLanguage();
        e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        return s0VarSharedInstance.getInstancesForLanguage(currentLanguage, collection);
    }

    public final void callCMDB() {
        if (m.sharedInstance().getCurrentInstance() != null) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new x1(2, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new z1(2, null), 3, null);
        }
    }

    public final View.OnClickListener getMListenerOpenSlide() {
        return this.S;
    }

    public final View.OnClickListener getMListenerProfileButton() {
        return this.T;
    }

    public final View.OnClickListener getMOpenOrCloseBannerButtonClickListener() {
        return this.Q;
    }

    public final View.OnClickListener getMPlayButtonClickListener() {
        return this.P;
    }

    public final View.OnClickListener getMTextBannerClickListener() {
        return this.R;
    }

    public final n getMThemeAdapter() {
        return this.I;
    }

    public final List<d> getMThemesList() {
        return this.H;
    }

    public final void getStatusAccount() {
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new g2(this, null), 3, null);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void itemPurchased(String itemName) {
        e0.checkNotNullParameter(itemName, "itemName");
        if ((e0.areEqual(itemName, e.getInstance().getSkuInappUltime()) || e0.areEqual(itemName, e.getInstance().getSkuInappPopu())) && m.sharedInstance().canPlay() == 0 && m.sharedInstance().canCheckFull()) {
            new da.f(this).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("TROP_NOMBREUX_A_JOUER_FULL_ACHETE"));
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onAllPurchasesRestored() throws NumberFormatException {
        super.onAllPurchasesRestored();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        da.f fVar = new da.f(this);
        fVar.setTypeYesNo(b1.f72741d.sharedInstance().getTraductionFromToken("ETES_VOUS_SUR_DE_VOULOIR_QUITTER"));
        fVar.setConfirmeListener(new k2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x04db  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.HomeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onInitialization(boolean z10) {
        AkApplication.f21721h.execute(new k9(z10, this, 9));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x001c), top: B:38:0x000f }] */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r14 = this;
            super.onResume()
            boolean r0 = r14.f21681c
            if (r0 == 0) goto L9
            goto Lf4
        L9:
            u9.f r0 = r14.C
            r0.processOnResume()
            r0 = 0
            da.k r1 = r14.L     // Catch: java.lang.Exception -> L23
            if (r1 == 0) goto L1c
            kotlin.jvm.internal.e0.checkNotNull(r1)     // Catch: java.lang.Exception -> L23
            boolean r1 = r1.isShowing()     // Catch: java.lang.Exception -> L23
            if (r1 != 0) goto L25
        L1c:
            da.k r1 = da.k.show(r14)     // Catch: java.lang.Exception -> L23
            r14.L = r1     // Catch: java.lang.Exception -> L23
            goto L25
        L23:
            r14.L = r0
        L25:
            androidx.lifecycle.q0 r2 = androidx.lifecycle.c1.getLifecycleScope(r14)
            o9.v2 r5 = new o9.v2
            r5.<init>(r14, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            androidx.lifecycle.q0 r8 = androidx.lifecycle.c1.getLifecycleScope(r14)
            o9.x2 r11 = new o9.x2
            r11.<init>(r14, r0)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
            com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding r1 = r14.D     // Catch: java.lang.Exception -> L7f
            if (r1 != 0) goto L4f
            java.lang.String r1 = "mBinding"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Exception -> L7f
            goto L50
        L4f:
            r0 = r1
        L50:
            android.widget.ImageView r0 = r0.themeImageChoosen     // Catch: java.lang.Exception -> L7f
            ca.t r1 = ca.t.sharedInstance()     // Catch: java.lang.Exception -> L7f
            ca.m r2 = ca.m.sharedInstance()     // Catch: java.lang.Exception -> L7f
            lb.c r2 = r2.getCurrentInstance()     // Catch: java.lang.Exception -> L7f
            kotlin.jvm.internal.e0.checkNotNull(r2)     // Catch: java.lang.Exception -> L7f
            int r2 = r2.getSubjectId()     // Catch: java.lang.Exception -> L7f
            android.graphics.Bitmap r1 = r1.getSubjectIconSelected(r2)     // Catch: java.lang.Exception -> L7f
            java.lang.String r2 = "getSubjectIconSelected(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Exception -> L7f
            android.content.res.Resources r2 = r14.getResources()     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = "getResources(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Exception -> L7f
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L7f
            r3.<init>(r2, r1)     // Catch: java.lang.Exception -> L7f
            r0.setImageDrawable(r3)     // Catch: java.lang.Exception -> L7f
        L7f:
            r0 = 0
            r14.K = r0
            ca.m r0 = ca.m.sharedInstance()
            int r0 = r0.canPlay()
            r1 = 1
            if (r0 != 0) goto Lac
            ca.m r0 = ca.m.sharedInstance()
            boolean r0 = r0.isPrio()
            if (r0 != 0) goto Lac
            z9.e r0 = z9.e.getInstance()
            nh.n1 r2 = new nh.n1
            r3 = 14
            r2.<init>(r3)
            r0.requestAllPurchases(r2)
            ca.m r0 = ca.m.sharedInstance()
            r0.setCanCheckFull(r1)
        Lac:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.o r2 = ca.o.sharedInstance()
            int r2 = r2.getNbTimeAppIsOpen()
            r3 = 2
            if (r2 != r3) goto Lcf
            ca.o r2 = ca.o.sharedInstance()
            boolean r2 = r2.getSelectionThemeStatus()
            if (r2 == 0) goto Lcf
            int r0 = t(r0)
            if (r0 <= r1) goto Lcf
            r14.v()
        Lcf:
            ca.o r0 = ca.o.sharedInstance()
            boolean r0 = r0.mustAlertUserIsConnected()
            if (r0 == 0) goto Lf4
            da.f r0 = new da.f
            r0.<init>(r14)
            lb.b1$a r1 = lb.b1.f72741d
            lb.b1 r1 = r1.sharedInstance()
            java.lang.String r2 = "COMPTE_CONNECTE"
            java.lang.String r1 = r1.getTraductionFromToken(r2)
            r0.setTypeOk(r1)
            ca.o r0 = ca.o.sharedInstance()
            r0.resetUserMustBeAlertConnected()
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.HomeActivity.onResume():void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        runOnUiThread(new t(this, 26));
        LocalBroadcastManager.getInstance(this).registerReceiver(this.O, new IntentFilter("com.example.NEW_COMMUNICATION"));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.O);
    }

    public final void setMListenerOpenSlide(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.S = onClickListener;
    }

    public final void setMListenerProfileButton(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.T = onClickListener;
    }

    public final void setMOpenOrCloseBannerButtonClickListener(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.Q = onClickListener;
    }

    public final void setMPlayButtonClickListener(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.P = onClickListener;
    }

    public final void setMTextBannerClickListener(View.OnClickListener onClickListener) {
        e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.R = onClickListener;
    }

    public final void setMThemeAdapter(n nVar) {
        this.I = nVar;
    }

    public final void setMThemesList(List<d> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.H = list;
    }

    public final void startSlideDownAnimation() {
        ActivityHomeBinding activityHomeBinding = this.D;
        if (activityHomeBinding == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.overlayThemeSelection.startAnimation(this.G);
    }

    public final void startSlideUpAnimation() {
        ActivityHomeBinding activityHomeBinding = this.D;
        if (activityHomeBinding == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.overlayThemeSelection.startAnimation(this.F);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000f), top: B:11:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L15
            android.app.Dialog r0 = r7.M     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto Lf
            kotlin.jvm.internal.e0.checkNotNull(r0)     // Catch: java.lang.Exception -> L15
            boolean r0 = r0.isShowing()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L15
        Lf:
            da.k r0 = da.k.show(r7)     // Catch: java.lang.Exception -> L15
            r7.M = r0     // Catch: java.lang.Exception -> L15
        L15:
            androidx.lifecycle.q0 r1 = androidx.lifecycle.c1.getLifecycleScope(r7)
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            o9.i2 r4 = new o9.i2
            r0 = 0
            r4.<init>(r7, r0, r8)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.HomeActivity.u(boolean):void");
    }

    public final void v() {
        o.sharedInstance().setSelectionThemeStatus(false);
        startSlideDownAnimation();
        ActivityHomeBinding activityHomeBinding = this.D;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.overlayThemeSelection.setVisibility(0);
        ActivityHomeBinding activityHomeBinding3 = this.D;
        if (activityHomeBinding3 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding3 = null;
        }
        activityHomeBinding3.buttonProfile.setClickable(false);
        ActivityHomeBinding activityHomeBinding4 = this.D;
        if (activityHomeBinding4 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding4 = null;
        }
        activityHomeBinding4.playButton.setClickable(false);
        ActivityHomeBinding activityHomeBinding5 = this.D;
        if (activityHomeBinding5 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding5 = null;
        }
        activityHomeBinding5.buttonOpenMenu.setClickable(false);
        ActivityHomeBinding activityHomeBinding6 = this.D;
        if (activityHomeBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding6 = null;
        }
        activityHomeBinding6.themeImageChoosen.setClickable(false);
        ActivityHomeBinding activityHomeBinding7 = this.D;
        if (activityHomeBinding7 == null) {
            e0.throwUninitializedPropertyAccessException("mBinding");
        } else {
            activityHomeBinding2 = activityHomeBinding7;
        }
        activityHomeBinding2.themeSelectionLayout.setClickable(false);
    }
}
