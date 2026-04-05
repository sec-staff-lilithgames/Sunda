package com.digidust.elokence.akinator.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.VoteActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;
import com.digidust.elokence.akinator.webservices.cheatmanagement.CheatManagement$AwardsToVote;
import com.unity3d.services.core.request.NJc.yFkbx;
import da.f;
import j1.o2;
import java.util.ArrayList;
import lb.b1;
import o9.ba;
import o9.ca;
import o9.da;
import o9.fa;
import o9.ga;
import o9.t2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class VoteActivity extends AkActivity {
    public static final /* synthetic */ int O = 0;
    public ArrayList C;
    public TextView G;
    public View H;
    public Button I;
    public Button J;
    public fa L;
    public SwipeDeck M;
    public TextView N;
    public int D = 0;
    public boolean E = false;
    public boolean F = false;
    public boolean K = true;

    public static void t(VoteActivity voteActivity, int i10, int i11) {
        if (voteActivity.E || i11 == -1) {
            return;
        }
        if (i10 == 1 || i10 == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            TextView textView = voteActivity.G;
            Property property = TextView.SCALE_X;
            AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
            TextView textView2 = voteActivity.G;
            Property property2 = TextView.SCALE_Y;
            builderPlay.with(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            animatorSet.setDuration(500L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(voteActivity.G, (Property<TextView, Float>) property, 1.0f, 0.0f)).with(ObjectAnimator.ofFloat(voteActivity.G, (Property<TextView, Float>) property2, 1.0f, 0.0f));
            animatorSet2.setDuration(500L);
            animatorSet2.addListener(new ca(voteActivity));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(animatorSet).after(animatorSet2);
            animatorSet3.start();
        }
        AkApplication.f21721h.execute(new t2(voteActivity, i11, i10));
        if (i11 == voteActivity.L.getCount() - 1) {
            voteActivity.N.animate().alpha(1.0f).setDuration(500L);
            o2.x(voteActivity.N, "PAS_DE_VOTE_DISPONIBLE");
            if (voteActivity.F) {
                voteActivity.F = false;
                f fVar = new f(voteActivity);
                fVar.setTypeYesNo(b1.sharedInstance().getTraductionFromToken("VALIDER_PLUS_DE_AKIAWARDS"));
                fVar.setConfirmeListener(new da(voteActivity));
            }
        }
    }

    public static ArrayList v() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 <= 8; i10++) {
            arrayList.add(new CheatManagement$AwardsToVote(0, b1.sharedInstance().getTraductionFromToken("ANDROID_PERSO_" + i10), b1.sharedInstance().getTraductionFromToken("DESCRIPTION_" + i10), 0));
        }
        return arrayList;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vote);
        this.D = getIntent().getIntExtra("score", 0);
        this.E = getIntent().getBooleanExtra("didac", true);
        final int i10 = 0;
        ((ImageView) findViewById(R.id.retourButton)).setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                VoteActivity voteActivity = this.f78721c;
                switch (i11) {
                    case 0:
                        int i12 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i13 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.scoreVoteText);
        this.G = (TextView) findViewById(R.id.scoreVoteInt);
        View viewFindViewById = findViewById(R.id.viewDidacAnswer);
        this.H = viewFindViewById;
        z1.setElevation(viewFindViewById, 1.0f);
        Button button = (Button) findViewById(R.id.vote);
        this.J = button;
        Typeface typeface = this.f21686i;
        button.setTypeface(typeface);
        this.J.setVisibility(8);
        o2.w(this.J, "COMMENCER");
        final int i11 = 1;
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                VoteActivity voteActivity = this.f78721c;
                switch (i112) {
                    case 0:
                        int i12 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i13 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        Button button2 = (Button) findViewById(R.id.refaireTuto);
        this.I = button2;
        button2.setTypeface(typeface);
        final int i12 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                VoteActivity voteActivity = this.f78721c;
                switch (i112) {
                    case 0:
                        int i122 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i13 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        textView.setText(b1.sharedInstance().getTraductionFromToken("SCORE"));
        textView.setTypeface(typeface);
        this.G.setTypeface(typeface);
        this.G.setText("" + this.D);
        boolean z10 = this.E;
        this.K = z10 ^ true;
        if (z10) {
            this.C = v();
            this.I.setVisibility(8);
        } else {
            this.C = (ArrayList) getIntent().getSerializableExtra("vote");
            this.I.setVisibility(0);
            this.F = getIntent().getBooleanExtra("moreVotes", false);
        }
        TextView textView2 = (TextView) findViewById(R.id.textExplicatifVote);
        textView2.setTypeface(typeface);
        textView2.setText(b1.sharedInstance().getTraductionFromToken("AIDE_MOI_VALIDER_AWARD"));
        this.M = (SwipeDeck) findViewById(R.id.swipe_deck);
        fa faVar = new fa(this, this.C);
        this.L = faVar;
        this.M.setAdapter(faVar);
        this.M.setEventCallback(new ba(this));
        this.M.setLeftImage(R.id.left_image);
        this.M.setRightImage(R.id.right_image);
        this.L.notifyDataSetChanged();
        final int i13 = 3;
        findViewById(R.id.voteNon).setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                VoteActivity voteActivity = this.f78721c;
                switch (i112) {
                    case 0:
                        int i122 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i132 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        final int i14 = 4;
        findViewById(R.id.voteOui).setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                VoteActivity voteActivity = this.f78721c;
                switch (i112) {
                    case 0:
                        int i122 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i132 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        final int i15 = 5;
        findViewById(R.id.voteNsp).setOnClickListener(new View.OnClickListener(this) { // from class: o9.z9

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VoteActivity f78721c;

            {
                this.f78721c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i15;
                VoteActivity voteActivity = this.f78721c;
                switch (i112) {
                    case 0:
                        int i122 = VoteActivity.O;
                        voteActivity.getClass();
                        ca.o.sharedInstance().setCanShowAd(false);
                        voteActivity.finish();
                        break;
                    case 1:
                        voteActivity.J.setVisibility(8);
                        voteActivity.u(false);
                        break;
                    case 2:
                        int i132 = VoteActivity.O;
                        voteActivity.u(true);
                        break;
                    case 3:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardLeft(500);
                            break;
                        } else {
                            voteActivity.w(0, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    case 4:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardRight(500);
                            break;
                        } else {
                            voteActivity.w(1, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                    default:
                        if (!voteActivity.E) {
                            voteActivity.M.swipeTopCardBottom(500);
                            break;
                        } else {
                            voteActivity.w(2, voteActivity.M.getTopCardItemPos());
                            break;
                        }
                }
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.fakeLastVote);
        this.N = textView3;
        textView3.setTypeface(typeface);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }

    public final void u(boolean z10) {
        this.E = z10;
        this.K = !z10;
        this.I.setVisibility(z10 ? 8 : 0);
        this.N.setAlpha(0.0f);
        if (!z10) {
            new ga(this).execute(new Void[0]);
            return;
        }
        this.C = v();
        fa faVar = new fa(this, this.C);
        this.L = faVar;
        this.M.setAdapter(faVar);
        this.L.notifyDataSetChanged();
    }

    public final void w(final int i10, final int i11) {
        if (!this.E || i11 == -1) {
            return;
        }
        int i12 = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 7) ? 0 : 1;
        String traductionFromToken = b1.sharedInstance().getTraductionFromToken("EXPLICATION_MAUVAISE_REPONSE_" + (i11 + 1));
        ImageView imageView = (ImageView) this.H.findViewById(R.id.iconeReponse);
        TextView textView = (TextView) this.H.findViewById(R.id.didacVote1);
        Typeface typeface = this.f21686i;
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) this.H.findViewById(R.id.didacVote2);
        textView2.setTypeface(typeface);
        this.H.findViewById(R.id.imageFlecheDroite).setOnClickListener(new View.OnClickListener() { // from class: o9.aa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoteActivity voteActivity = this.f78035b;
                int i13 = i10;
                if (i13 == 0) {
                    voteActivity.M.swipeTopCardLeft(500);
                } else if (i13 == 1) {
                    voteActivity.M.swipeTopCardRight(500);
                } else if (i13 == 2) {
                    voteActivity.M.swipeTopCardBottom(500);
                }
                voteActivity.H.setVisibility(8);
                if (i11 == voteActivity.L.getCount() - 1) {
                    voteActivity.N.animate().alpha(1.0f).setDuration(500L);
                    voteActivity.N.setText(lb.b1.sharedInstance().getTraductionFromToken("BRAVO_DIDACTICIEL_TERMINE"));
                    ca.m.sharedInstance().doNotDisplayedDidac();
                    voteActivity.J.setVisibility(0);
                }
            }
        });
        if (i12 == i10) {
            imageView.setImageResource(R.drawable.ak_defi_ok);
            textView.setText(b1.sharedInstance().getTraductionFromToken("BONNE_REPONSE"));
        } else {
            imageView.setImageResource(R.drawable.ak_defi_nok);
            textView.setText(b1.sharedInstance().getTraductionFromToken(yFkbx.IxIhFx));
        }
        textView2.setText(traductionFromToken);
        this.H.setVisibility(0);
    }
}
