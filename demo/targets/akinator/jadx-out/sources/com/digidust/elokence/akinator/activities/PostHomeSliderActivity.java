package com.digidust.elokence.akinator.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import androidx.lifecycle.c1;
import ca.m;
import ca.o;
import ca.t;
import ca.u;
import ca.v;
import com.applovin.sdk.AppLovinEventTypes;
import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityPostHomeSliderBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.k;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.b1;
import lb.c;
import o9.a1;
import o9.p4;
import o9.q4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PostHomeSliderActivity extends AkActivity {
    public static final /* synthetic */ int H = 0;
    public ActivityPostHomeSliderBinding C;
    public String D;
    public boolean E;
    public Dialog F;
    public FirebaseAnalytics G;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.layoutSliderFragment);
        if (fragmentFindFragmentById == null || !fragmentFindFragmentById.isAdded() || ((a1) fragmentFindFragmentById).fragmentHasClosedAView()) {
            return;
        }
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPostHomeSliderBinding activityPostHomeSliderBindingInflate = ActivityPostHomeSliderBinding.inflate(getLayoutInflater());
        this.C = activityPostHomeSliderBindingInflate;
        ActivityPostHomeSliderBinding activityPostHomeSliderBinding = null;
        if (activityPostHomeSliderBindingInflate == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityPostHomeSliderBindingInflate = null;
        }
        setContentView(activityPostHomeSliderBindingInflate.getRoot());
        ActivityPostHomeSliderBinding activityPostHomeSliderBinding2 = this.C;
        if (activityPostHomeSliderBinding2 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityPostHomeSliderBinding2 = null;
        }
        activityPostHomeSliderBinding2.mainLayout.setOnApplyWindowInsetsListener(new q4());
        this.G = FirebaseAnalytics.getInstance(this);
        try {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding3 = this.C;
            if (activityPostHomeSliderBinding3 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding3 = null;
            }
            ImageView imageView = activityPostHomeSliderBinding3.imageFond;
            t tVarSharedInstance = t.sharedInstance();
            c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            Bitmap subjectBackgroundEndgame = tVarSharedInstance.getSubjectBackgroundEndgame(currentInstance.getSubjectId());
            e0.checkNotNullExpressionValue(subjectBackgroundEndgame, "getSubjectBackgroundEndgame(...)");
            Resources resources = getResources();
            e0.checkNotNullExpressionValue(resources, "getResources(...)");
            imageView.setImageDrawable(new BitmapDrawable(resources, subjectBackgroundEndgame));
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding4 = this.C;
            if (activityPostHomeSliderBinding4 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding4 = null;
            }
            ImageView imageView2 = activityPostHomeSliderBinding4.layoutSubjectIconTop.imageSubjectIconTop;
            t tVarSharedInstance2 = t.sharedInstance();
            c currentInstance2 = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance2);
            Bitmap subjectIcon = tVarSharedInstance2.getSubjectIcon(currentInstance2.getSubjectId());
            e0.checkNotNullExpressionValue(subjectIcon, "getSubjectIcon(...)");
            Resources resources2 = getResources();
            e0.checkNotNullExpressionValue(resources2, "getResources(...)");
            imageView2.setImageDrawable(new BitmapDrawable(resources2, subjectIcon));
        } catch (Exception unused) {
        }
        this.f21697t = ma.c.f74124b;
        u.sharedInstance().setSubmit(false);
        ArrayList arrayList = new ArrayList();
        this.E = true;
        if (m.sharedInstance().isAkiAwardsEnabledForCurrentInstance()) {
            this.E = false;
            arrayList.add("lsa");
        }
        if (m.sharedInstance().isHallOfFameEnabledForCurrentInstance()) {
            this.E = false;
            arrayList.add("classement");
        }
        if (m.sharedInstance().isDailyChallengeEnabledForCurrentInstance()) {
            this.E = false;
            arrayList.add("dc");
        }
        if (m.sharedInstance().isCustomizeAkinatorEnabledForCurrentInstance() && m.sharedInstance().getDisponibiliteAccessoires()) {
            arrayList.add("morefun");
        }
        if (m.sharedInstance().isAkiAwardsEnabledForCurrentInstance()) {
            this.E = false;
            arrayList.add("podium");
        }
        if (this.E) {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding5 = this.C;
            if (activityPostHomeSliderBinding5 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding5 = null;
            }
            activityPostHomeSliderBinding5.overlayCachePostHome.setVisibility(0);
        }
        if (bundle != null) {
            String string = bundle.getString("firstSlide");
            this.D = string;
            a1 a1VarNewInstance = a1.newInstance(arrayList, string);
            e0.checkNotNullExpressionValue(a1VarNewInstance, "newInstance(...)");
            h2 h2VarBeginTransaction = getSupportFragmentManager().beginTransaction();
            e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
            h2VarBeginTransaction.add(R.id.layoutSliderFragment, a1VarNewInstance);
            h2VarBeginTransaction.commit();
        } else {
            try {
                Bundle extras = getIntent().getExtras();
                e0.checkNotNull(extras);
                String string2 = extras.getString("firstSlide");
                this.D = string2;
                a1 a1VarNewInstance2 = a1.newInstance(arrayList, string2);
                e0.checkNotNullExpressionValue(a1VarNewInstance2, "newInstance(...)");
                h2 h2VarBeginTransaction2 = getSupportFragmentManager().beginTransaction();
                e0.checkNotNullExpressionValue(h2VarBeginTransaction2, "beginTransaction(...)");
                h2VarBeginTransaction2.add(R.id.layoutSliderFragment, a1VarNewInstance2);
                h2VarBeginTransaction2.commit();
            } catch (Exception unused2) {
                String campaign = jb.c.f69226m.sharedInstance().getCampaign("SlidePrimary");
                this.D = campaign;
                if (campaign == null) {
                    this.D = (String) arrayList.get(0);
                }
                if (m.sharedInstance().getSliderDefault() != null) {
                    this.D = m.sharedInstance().getSliderDefault();
                }
                if (e0.areEqual(this.D, AppLovinEventTypes.USER_SHARED_LINK)) {
                    this.D = "lsa";
                } else if (e0.areEqual(this.D, "character")) {
                    this.D = "dc";
                }
                if (getIntent().getIntExtra("intentShorcutName", -1) == 1) {
                    this.D = "lsa";
                } else if (getIntent().getIntExtra("intentShorcutName", -1) == 2) {
                    this.D = "podium";
                }
                a1 a1VarNewInstance3 = a1.newInstance(arrayList, this.D);
                e0.checkNotNullExpressionValue(a1VarNewInstance3, "newInstance(...)");
                h2 h2VarBeginTransaction3 = getSupportFragmentManager().beginTransaction();
                e0.checkNotNullExpressionValue(h2VarBeginTransaction3, "beginTransaction(...)");
                h2VarBeginTransaction3.add(R.id.layoutSliderFragment, a1VarNewInstance3);
                h2VarBeginTransaction3.commit();
            }
        }
        ActivityPostHomeSliderBinding activityPostHomeSliderBinding6 = this.C;
        if (activityPostHomeSliderBinding6 == null) {
            e0.throwUninitializedPropertyAccessException("binding");
            activityPostHomeSliderBinding6 = null;
        }
        final int i10 = 0;
        activityPostHomeSliderBinding6.retourButton.setOnClickListener(new View.OnClickListener(this) { // from class: o9.m4

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PostHomeSliderActivity f78360c;

            {
                this.f78360c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                PostHomeSliderActivity postHomeSliderActivity = this.f78360c;
                switch (i11) {
                    case 0:
                        int i12 = PostHomeSliderActivity.H;
                        ca.o.sharedInstance().setCanShowAd(false);
                        postHomeSliderActivity.finish();
                        break;
                    case 1:
                        int i13 = PostHomeSliderActivity.H;
                        ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                        ActivityPostHomeSliderBinding activityPostHomeSliderBinding7 = null;
                        if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                            ActivityPostHomeSliderBinding activityPostHomeSliderBinding8 = postHomeSliderActivity.C;
                            if (activityPostHomeSliderBinding8 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityPostHomeSliderBinding7 = activityPostHomeSliderBinding8;
                            }
                            activityPostHomeSliderBinding7.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
                            new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_DESACTIVE"));
                            break;
                        } else {
                            ActivityPostHomeSliderBinding activityPostHomeSliderBinding9 = postHomeSliderActivity.C;
                            if (activityPostHomeSliderBinding9 == null) {
                                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityPostHomeSliderBinding7 = activityPostHomeSliderBinding9;
                            }
                            activityPostHomeSliderBinding7.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
                            new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_ACTIVE"));
                            break;
                        }
                    case 2:
                        int i14 = PostHomeSliderActivity.H;
                        if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                            if (ca.m.sharedInstance().isChildFilterEnabledForCurrentInstance() && !ca.m.sharedInstance().hasDisplayedAlerteChild()) {
                                ca.m.sharedInstance().setDisplayedAlertChild();
                                da.f fVar = new da.f(postHomeSliderActivity);
                                b1.a aVar = lb.b1.f72741d;
                                fVar.setTypeDoubleButtonsCustom(aVar.sharedInstance().getTraductionFromToken("NON_MERCI"), aVar.sharedInstance().getTraductionFromToken("OK"), aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_PEDAGOGIQUE_2"));
                                fVar.setConfirmeListener(new r4(postHomeSliderActivity));
                                break;
                            } else {
                                na.b.playStartPlaying();
                                postHomeSliderActivity.t();
                                break;
                            }
                        } else {
                            na.b.playStartPlaying();
                            postHomeSliderActivity.t();
                            break;
                        }
                        break;
                    default:
                        int i15 = PostHomeSliderActivity.H;
                        postHomeSliderActivity.goToHome(false);
                        break;
                }
            }
        });
        if (m.sharedInstance().isChildFilterEnabledForCurrentInstance()) {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding7 = this.C;
            if (activityPostHomeSliderBinding7 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding7 = null;
            }
            final int i11 = 1;
            activityPostHomeSliderBinding7.imageFiltreEnfant.setOnClickListener(new View.OnClickListener(this) { // from class: o9.m4

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PostHomeSliderActivity f78360c;

                {
                    this.f78360c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i11;
                    PostHomeSliderActivity postHomeSliderActivity = this.f78360c;
                    switch (i112) {
                        case 0:
                            int i12 = PostHomeSliderActivity.H;
                            ca.o.sharedInstance().setCanShowAd(false);
                            postHomeSliderActivity.finish();
                            break;
                        case 1:
                            int i13 = PostHomeSliderActivity.H;
                            ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                            ActivityPostHomeSliderBinding activityPostHomeSliderBinding72 = null;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding8 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding8 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding8;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_DESACTIVE"));
                                break;
                            } else {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding9 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding9 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding9;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_ACTIVE"));
                                break;
                            }
                        case 2:
                            int i14 = PostHomeSliderActivity.H;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                if (ca.m.sharedInstance().isChildFilterEnabledForCurrentInstance() && !ca.m.sharedInstance().hasDisplayedAlerteChild()) {
                                    ca.m.sharedInstance().setDisplayedAlertChild();
                                    da.f fVar = new da.f(postHomeSliderActivity);
                                    b1.a aVar = lb.b1.f72741d;
                                    fVar.setTypeDoubleButtonsCustom(aVar.sharedInstance().getTraductionFromToken("NON_MERCI"), aVar.sharedInstance().getTraductionFromToken("OK"), aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_PEDAGOGIQUE_2"));
                                    fVar.setConfirmeListener(new r4(postHomeSliderActivity));
                                    break;
                                } else {
                                    na.b.playStartPlaying();
                                    postHomeSliderActivity.t();
                                    break;
                                }
                            } else {
                                na.b.playStartPlaying();
                                postHomeSliderActivity.t();
                                break;
                            }
                            break;
                        default:
                            int i15 = PostHomeSliderActivity.H;
                            postHomeSliderActivity.goToHome(false);
                            break;
                    }
                }
            });
            if (m.sharedInstance().isChildProtectEnabled()) {
                ActivityPostHomeSliderBinding activityPostHomeSliderBinding8 = this.C;
                if (activityPostHomeSliderBinding8 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityPostHomeSliderBinding = activityPostHomeSliderBinding8;
                }
                activityPostHomeSliderBinding.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
            } else {
                ActivityPostHomeSliderBinding activityPostHomeSliderBinding9 = this.C;
                if (activityPostHomeSliderBinding9 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityPostHomeSliderBinding = activityPostHomeSliderBinding9;
                }
                activityPostHomeSliderBinding.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
            }
        } else {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding10 = this.C;
            if (activityPostHomeSliderBinding10 == null) {
                e0.throwUninitializedPropertyAccessException("binding");
            } else {
                activityPostHomeSliderBinding = activityPostHomeSliderBinding10;
            }
            activityPostHomeSliderBinding.imageFiltreEnfant.setVisibility(8);
        }
        Button button = (Button) findViewById(R.id.goButton);
        button.setText(b1.f72741d.sharedInstance().getTraductionFromToken("BTN_JOUER"));
        if (m.sharedInstance().canPlay() == 1 || (m.sharedInstance().canPlay() == 0 && m.sharedInstance().isPrio())) {
            final int i12 = 2;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: o9.m4

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PostHomeSliderActivity f78360c;

                {
                    this.f78360c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i12;
                    PostHomeSliderActivity postHomeSliderActivity = this.f78360c;
                    switch (i112) {
                        case 0:
                            int i122 = PostHomeSliderActivity.H;
                            ca.o.sharedInstance().setCanShowAd(false);
                            postHomeSliderActivity.finish();
                            break;
                        case 1:
                            int i13 = PostHomeSliderActivity.H;
                            ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                            ActivityPostHomeSliderBinding activityPostHomeSliderBinding72 = null;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding82 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding82 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding82;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_DESACTIVE"));
                                break;
                            } else {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding92 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding92 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding92;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_ACTIVE"));
                                break;
                            }
                        case 2:
                            int i14 = PostHomeSliderActivity.H;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                if (ca.m.sharedInstance().isChildFilterEnabledForCurrentInstance() && !ca.m.sharedInstance().hasDisplayedAlerteChild()) {
                                    ca.m.sharedInstance().setDisplayedAlertChild();
                                    da.f fVar = new da.f(postHomeSliderActivity);
                                    b1.a aVar = lb.b1.f72741d;
                                    fVar.setTypeDoubleButtonsCustom(aVar.sharedInstance().getTraductionFromToken("NON_MERCI"), aVar.sharedInstance().getTraductionFromToken("OK"), aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_PEDAGOGIQUE_2"));
                                    fVar.setConfirmeListener(new r4(postHomeSliderActivity));
                                    break;
                                } else {
                                    na.b.playStartPlaying();
                                    postHomeSliderActivity.t();
                                    break;
                                }
                            } else {
                                na.b.playStartPlaying();
                                postHomeSliderActivity.t();
                                break;
                            }
                            break;
                        default:
                            int i15 = PostHomeSliderActivity.H;
                            postHomeSliderActivity.goToHome(false);
                            break;
                    }
                }
            });
        } else if (m.sharedInstance().canPlay() == -1 || (m.sharedInstance().canPlay() == 0 && !m.sharedInstance().isPrio())) {
            final int i13 = 3;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: o9.m4

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PostHomeSliderActivity f78360c;

                {
                    this.f78360c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i13;
                    PostHomeSliderActivity postHomeSliderActivity = this.f78360c;
                    switch (i112) {
                        case 0:
                            int i122 = PostHomeSliderActivity.H;
                            ca.o.sharedInstance().setCanShowAd(false);
                            postHomeSliderActivity.finish();
                            break;
                        case 1:
                            int i132 = PostHomeSliderActivity.H;
                            ca.m.sharedInstance().setChildProtectEnabled(!ca.m.sharedInstance().isChildProtectEnabled());
                            ActivityPostHomeSliderBinding activityPostHomeSliderBinding72 = null;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding82 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding82 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding82;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_DESACTIVE"));
                                break;
                            } else {
                                ActivityPostHomeSliderBinding activityPostHomeSliderBinding92 = postHomeSliderActivity.C;
                                if (activityPostHomeSliderBinding92 == null) {
                                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityPostHomeSliderBinding72 = activityPostHomeSliderBinding92;
                                }
                                activityPostHomeSliderBinding72.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
                                new da.f(postHomeSliderActivity).setTypeOk(lb.b1.f72741d.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_ACTIVE"));
                                break;
                            }
                        case 2:
                            int i14 = PostHomeSliderActivity.H;
                            if (!ca.m.sharedInstance().isChildProtectEnabled()) {
                                if (ca.m.sharedInstance().isChildFilterEnabledForCurrentInstance() && !ca.m.sharedInstance().hasDisplayedAlerteChild()) {
                                    ca.m.sharedInstance().setDisplayedAlertChild();
                                    da.f fVar = new da.f(postHomeSliderActivity);
                                    b1.a aVar = lb.b1.f72741d;
                                    fVar.setTypeDoubleButtonsCustom(aVar.sharedInstance().getTraductionFromToken("NON_MERCI"), aVar.sharedInstance().getTraductionFromToken("OK"), aVar.sharedInstance().getTraductionFromToken("FILTRE_ENFANT_PEDAGOGIQUE_2"));
                                    fVar.setConfirmeListener(new r4(postHomeSliderActivity));
                                    break;
                                } else {
                                    na.b.playStartPlaying();
                                    postHomeSliderActivity.t();
                                    break;
                                }
                            } else {
                                na.b.playStartPlaying();
                                postHomeSliderActivity.t();
                                break;
                            }
                            break;
                        default:
                            int i15 = PostHomeSliderActivity.H;
                            postHomeSliderActivity.goToHome(false);
                            break;
                    }
                }
            });
        }
        if (o.sharedInstance().isAppRated() || o.sharedInstance().getNbWonGames() < 2) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) RateAppActivity.class));
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.E) {
            t();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        e0.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("firstSlide", this.D);
    }

    public final void t() {
        v vVarSharedInstance = v.sharedInstance();
        FirebaseAnalytics firebaseAnalytics = this.G;
        e0.checkNotNull(firebaseAnalytics);
        vVarSharedInstance.startGameEvents(firebaseAnalytics);
        try {
            this.F = k.show(this);
        } catch (Exception unused) {
        }
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new p4(this, null), 3, null);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
