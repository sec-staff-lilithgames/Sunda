package o9;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s3 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public r3 f78516c;

    /* renamed from: e, reason: collision with root package name */
    public AkActivity f78517e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f78518f = AkApplication.getTypeFace();

    /* renamed from: g, reason: collision with root package name */
    public final Typeface f78519g = AkApplication.getTypeFaceGab();

    /* renamed from: h, reason: collision with root package name */
    public ImageView f78520h = null;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f78521i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f78522j = true;

    /* renamed from: k, reason: collision with root package name */
    public RelativeLayout f78523k;

    /* renamed from: l, reason: collision with root package name */
    public View f78524l;

    /* renamed from: m, reason: collision with root package name */
    public View f78525m;

    /* renamed from: n, reason: collision with root package name */
    public View f78526n;

    /* renamed from: o, reason: collision with root package name */
    public View f78527o;

    public static s3 newInstance(boolean z10) {
        s3 s3Var = new s3();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFound", z10);
        s3Var.setArguments(bundle);
        return s3Var;
    }

    public final void a() {
        try {
            if (ca.u.sharedInstance().getStats().getStatusFiltre() == 0) {
                this.f78523k.setVisibility(8);
                return;
            }
            if (ca.u.sharedInstance().hasAlreadyProposedCom()) {
                View view = this.f78524l;
                view.setClickable(false);
                view.setAlpha(0.5f);
            } else {
                View view2 = this.f78524l;
                view2.setClickable(true);
                view2.setAlpha(1.0f);
            }
            if (ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                View view3 = this.f78527o;
                view3.setClickable(false);
                view3.setAlpha(0.5f);
            } else {
                View view4 = this.f78527o;
                view4.setClickable(true);
                view4.setAlpha(1.0f);
            }
            if (ca.u.sharedInstance().getStats().getStatusFiltre() == 1) {
                this.f78525m.setVisibility(8);
            } else if (ca.m.sharedInstance().isAddQuestionEnabledForCurrentInstance()) {
                if (ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                    View view5 = this.f78525m;
                    view5.setClickable(false);
                    view5.setAlpha(0.5f);
                } else {
                    View view6 = this.f78525m;
                    view6.setClickable(true);
                    view6.setAlpha(1.0f);
                }
            }
            if (!ca.m.sharedInstance().isAddPhotoEnabledForCurrentInstance()) {
                View view7 = this.f78526n;
                view7.setClickable(false);
                view7.setAlpha(0.5f);
            } else if (ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                View view8 = this.f78526n;
                view8.setClickable(false);
                view8.setAlpha(0.5f);
            } else {
                View view9 = this.f78526n;
                view9.setClickable(true);
                view9.setAlpha(1.0f);
            }
        } catch (Exception unused) {
            this.f78523k.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof r3) {
            this.f78516c = (r3) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78517e = (AkActivity) getActivity();
        this.f78522j = getArguments().getBoolean("isFound", true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_options, viewGroup, false);
        this.f78523k = (RelativeLayout) viewInflate.findViewById(R.id.globalAddMagicLayout);
        this.f78520h = (ImageView) viewInflate.findViewById(R.id.akinator);
        ((TextView) viewInflate.findViewById(R.id.titre_text)).setTypeface(this.f78519g);
        TextView textView = (TextView) viewInflate.findViewById(R.id.bulleText1);
        Typeface typeface = this.f78518f;
        textView.setTypeface(typeface);
        int flagPhoto = -1;
        if (this.f78522j) {
            e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
            if (persoPropose != null) {
                String strReplace = lb.b1.sharedInstance().getTraductionFromToken("ENCORE_TROUVE") + " ! \n" + lb.b1.sharedInstance().getTraductionFromToken("PERSONNAGE_DEJA_JOUE_NB_FOIS");
                if (persoPropose.getElementMinibaseId() == -1) {
                    strReplace = strReplace.replace("[NB]", NumberFormat.getInstance().format(ca.u.sharedInstance().getStats().getNbPlayed()));
                } else if (persoPropose.getElementMinibaseId() > 0) {
                    strReplace = strReplace.replace("[NB]", NumberFormat.getInstance().format(persoPropose.getNbPlayed()));
                }
                textView.setText(strReplace);
                this.f78521i = (ImageView) viewInflate.findViewById(R.id.imagePersoTrouve);
                Bitmap[] bitmapArr = {ca.u.sharedInstance().getImagePerso()};
                if (bitmapArr[0] != null) {
                    this.f78521i.getViewTreeObserver().addOnGlobalLayoutListener(new q3(this, bitmapArr));
                } else {
                    this.f78521i.setBackgroundColor(0);
                }
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.nomPersoTrouve);
                textView2.setText(persoPropose.getName());
                textView2.setTypeface(typeface);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.descPersoTrouve);
                textView3.setTypeface(typeface);
                textView3.setText(persoPropose.getDescription());
            } else {
                textView.setText(lb.b1.sharedInstance().getTraductionFromToken("ENCORE_TROUVE") + " !");
            }
        } else {
            textView.setText(lb.b1.sharedInstance().getTraductionFromToken("BRAVO") + "\n" + lb.b1.sharedInstance().getTraductionFromToken("VOUS_M_AVEZ_POSE_UNE_COLLE") + ".");
            na.b.playClap();
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.report);
        if (!ca.m.sharedInstance().isGameReportEnabledForCurrentInstance() || ca.o.sharedInstance().getCurrentSession() == null || ca.o.sharedInstance().getCurrentSession().isActive()) {
            imageView.setVisibility(8);
        } else {
            final int i10 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: o9.o3

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s3 f78413c;

                {
                    this.f78413c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            s3 s3Var = this.f78413c;
                            mt.b0.fromCallable(new g0(1, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(s3Var, da.k.show(s3Var.f78517e), arrayList, 0));
                            break;
                        case 1:
                            s3 s3Var2 = this.f78413c;
                            s3Var2.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedCom()) {
                                s3Var2.f78517e.disableAdOneTime();
                                r3 r3Var = s3Var2.f78516c;
                                if (r3Var != null) {
                                    r3Var.onDisplayAddMagic(1);
                                    break;
                                }
                            } else {
                                s3Var2.a();
                                break;
                            }
                            break;
                        case 2:
                            s3 s3Var3 = this.f78413c;
                            s3Var3.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                                s3Var3.f78517e.disableAdOneTime();
                                r3 r3Var2 = s3Var3.f78516c;
                                if (r3Var2 != null) {
                                    r3Var2.onDisplayAddMagic(3);
                                    break;
                                }
                            } else {
                                s3Var3.a();
                                break;
                            }
                            break;
                        case 3:
                            s3 s3Var4 = this.f78413c;
                            s3Var4.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                                s3Var4.f78517e.disableAdOneTime();
                                r3 r3Var3 = s3Var4.f78516c;
                                if (r3Var3 != null) {
                                    r3Var3.onDisplayAddMagic(2);
                                    break;
                                }
                            } else {
                                s3Var4.a();
                                break;
                            }
                            break;
                        default:
                            s3 s3Var5 = this.f78413c;
                            s3Var5.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                                s3Var5.f78517e.disableAdOneTime();
                                r3 r3Var4 = s3Var5.f78516c;
                                if (r3Var4 != null) {
                                    r3Var4.onDisplayAddMagic(0);
                                    break;
                                }
                            } else {
                                s3Var5.a();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        this.f78524l = viewInflate.findViewById(R.id.correctName);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.textCorrectName);
        textView4.setTypeface(typeface);
        textView4.setText(lb.b1.sharedInstance().getTraductionFromToken("CORRIGER_NOM_DESCRIPTION"));
        if (ca.m.sharedInstance().isNameCorrectionEnabledForCurrentInstance()) {
            final int i11 = 1;
            this.f78524l.setOnClickListener(new View.OnClickListener(this) { // from class: o9.o3

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s3 f78413c;

                {
                    this.f78413c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            s3 s3Var = this.f78413c;
                            mt.b0.fromCallable(new g0(1, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(s3Var, da.k.show(s3Var.f78517e), arrayList, 0));
                            break;
                        case 1:
                            s3 s3Var2 = this.f78413c;
                            s3Var2.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedCom()) {
                                s3Var2.f78517e.disableAdOneTime();
                                r3 r3Var = s3Var2.f78516c;
                                if (r3Var != null) {
                                    r3Var.onDisplayAddMagic(1);
                                    break;
                                }
                            } else {
                                s3Var2.a();
                                break;
                            }
                            break;
                        case 2:
                            s3 s3Var3 = this.f78413c;
                            s3Var3.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                                s3Var3.f78517e.disableAdOneTime();
                                r3 r3Var2 = s3Var3.f78516c;
                                if (r3Var2 != null) {
                                    r3Var2.onDisplayAddMagic(3);
                                    break;
                                }
                            } else {
                                s3Var3.a();
                                break;
                            }
                            break;
                        case 3:
                            s3 s3Var4 = this.f78413c;
                            s3Var4.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                                s3Var4.f78517e.disableAdOneTime();
                                r3 r3Var3 = s3Var4.f78516c;
                                if (r3Var3 != null) {
                                    r3Var3.onDisplayAddMagic(2);
                                    break;
                                }
                            } else {
                                s3Var4.a();
                                break;
                            }
                            break;
                        default:
                            s3 s3Var5 = this.f78413c;
                            s3Var5.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                                s3Var5.f78517e.disableAdOneTime();
                                r3 r3Var4 = s3Var5.f78516c;
                                if (r3Var4 != null) {
                                    r3Var4.onDisplayAddMagic(0);
                                    break;
                                }
                            } else {
                                s3Var5.a();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            this.f78524l.setVisibility(8);
        }
        this.f78527o = viewInflate.findViewById(R.id.moreQuestions);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.textMoreQuestions);
        textView5.setTypeface(typeface);
        textView5.setText(lb.b1.sharedInstance().getTraductionFromToken("REPONDRE_QUESTION_COMPLEMENTAIRE"));
        if (ca.m.sharedInstance().isComplementaryQuestionEnabledForCurrentInstance()) {
            final int i12 = 2;
            this.f78527o.setOnClickListener(new View.OnClickListener(this) { // from class: o9.o3

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s3 f78413c;

                {
                    this.f78413c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            s3 s3Var = this.f78413c;
                            mt.b0.fromCallable(new g0(1, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(s3Var, da.k.show(s3Var.f78517e), arrayList, 0));
                            break;
                        case 1:
                            s3 s3Var2 = this.f78413c;
                            s3Var2.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedCom()) {
                                s3Var2.f78517e.disableAdOneTime();
                                r3 r3Var = s3Var2.f78516c;
                                if (r3Var != null) {
                                    r3Var.onDisplayAddMagic(1);
                                    break;
                                }
                            } else {
                                s3Var2.a();
                                break;
                            }
                            break;
                        case 2:
                            s3 s3Var3 = this.f78413c;
                            s3Var3.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                                s3Var3.f78517e.disableAdOneTime();
                                r3 r3Var2 = s3Var3.f78516c;
                                if (r3Var2 != null) {
                                    r3Var2.onDisplayAddMagic(3);
                                    break;
                                }
                            } else {
                                s3Var3.a();
                                break;
                            }
                            break;
                        case 3:
                            s3 s3Var4 = this.f78413c;
                            s3Var4.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                                s3Var4.f78517e.disableAdOneTime();
                                r3 r3Var3 = s3Var4.f78516c;
                                if (r3Var3 != null) {
                                    r3Var3.onDisplayAddMagic(2);
                                    break;
                                }
                            } else {
                                s3Var4.a();
                                break;
                            }
                            break;
                        default:
                            s3 s3Var5 = this.f78413c;
                            s3Var5.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                                s3Var5.f78517e.disableAdOneTime();
                                r3 r3Var4 = s3Var5.f78516c;
                                if (r3Var4 != null) {
                                    r3Var4.onDisplayAddMagic(0);
                                    break;
                                }
                            } else {
                                s3Var5.a();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            this.f78527o.setVisibility(8);
        }
        this.f78526n = viewInflate.findViewById(R.id.addPicture);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.textAddPicture);
        textView6.setTypeface(typeface);
        try {
            flagPhoto = ca.u.sharedInstance().getStats().getFlagPhoto();
        } catch (Exception unused) {
        }
        if (flagPhoto == 0) {
            j1.o2.x(textView6, "AJOUTER_UNE_PHOTO");
        } else if (flagPhoto == 2) {
            j1.o2.x(textView6, "PROPOSER_UNE_PHOTO");
        } else if (flagPhoto == 4) {
            j1.o2.x(textView6, "VOTER_POUR_MEILLEURE_PHOTO");
        }
        boolean z10 = flagPhoto == 0 || flagPhoto == 2 || flagPhoto == 4;
        if (ca.m.sharedInstance().isAddPhotoEnabledForCurrentInstance() && z10 && !ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
            final int i13 = 3;
            this.f78526n.setOnClickListener(new View.OnClickListener(this) { // from class: o9.o3

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s3 f78413c;

                {
                    this.f78413c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            s3 s3Var = this.f78413c;
                            mt.b0.fromCallable(new g0(1, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(s3Var, da.k.show(s3Var.f78517e), arrayList, 0));
                            break;
                        case 1:
                            s3 s3Var2 = this.f78413c;
                            s3Var2.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedCom()) {
                                s3Var2.f78517e.disableAdOneTime();
                                r3 r3Var = s3Var2.f78516c;
                                if (r3Var != null) {
                                    r3Var.onDisplayAddMagic(1);
                                    break;
                                }
                            } else {
                                s3Var2.a();
                                break;
                            }
                            break;
                        case 2:
                            s3 s3Var3 = this.f78413c;
                            s3Var3.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                                s3Var3.f78517e.disableAdOneTime();
                                r3 r3Var2 = s3Var3.f78516c;
                                if (r3Var2 != null) {
                                    r3Var2.onDisplayAddMagic(3);
                                    break;
                                }
                            } else {
                                s3Var3.a();
                                break;
                            }
                            break;
                        case 3:
                            s3 s3Var4 = this.f78413c;
                            s3Var4.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                                s3Var4.f78517e.disableAdOneTime();
                                r3 r3Var3 = s3Var4.f78516c;
                                if (r3Var3 != null) {
                                    r3Var3.onDisplayAddMagic(2);
                                    break;
                                }
                            } else {
                                s3Var4.a();
                                break;
                            }
                            break;
                        default:
                            s3 s3Var5 = this.f78413c;
                            s3Var5.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                                s3Var5.f78517e.disableAdOneTime();
                                r3 r3Var4 = s3Var5.f78516c;
                                if (r3Var4 != null) {
                                    r3Var4.onDisplayAddMagic(0);
                                    break;
                                }
                            } else {
                                s3Var5.a();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            this.f78526n.setVisibility(8);
        }
        this.f78525m = viewInflate.findViewById(R.id.addQuestion);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.textAddQuestion);
        textView7.setTypeface(typeface);
        textView7.setText(lb.b1.sharedInstance().getTraductionFromToken("AJOUTER_UNE_QUESTION"));
        if (ca.m.sharedInstance().isAddQuestionEnabledForCurrentInstance()) {
            final int i14 = 4;
            this.f78525m.setOnClickListener(new View.OnClickListener(this) { // from class: o9.o3

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s3 f78413c;

                {
                    this.f78413c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            s3 s3Var = this.f78413c;
                            mt.b0.fromCallable(new g0(1, arrayList)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new p3(s3Var, da.k.show(s3Var.f78517e), arrayList, 0));
                            break;
                        case 1:
                            s3 s3Var2 = this.f78413c;
                            s3Var2.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedCom()) {
                                s3Var2.f78517e.disableAdOneTime();
                                r3 r3Var = s3Var2.f78516c;
                                if (r3Var != null) {
                                    r3Var.onDisplayAddMagic(1);
                                    break;
                                }
                            } else {
                                s3Var2.a();
                                break;
                            }
                            break;
                        case 2:
                            s3 s3Var3 = this.f78413c;
                            s3Var3.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyAnsweredComplementaryQuestions()) {
                                s3Var3.f78517e.disableAdOneTime();
                                r3 r3Var2 = s3Var3.f78516c;
                                if (r3Var2 != null) {
                                    r3Var2.onDisplayAddMagic(3);
                                    break;
                                }
                            } else {
                                s3Var3.a();
                                break;
                            }
                            break;
                        case 3:
                            s3 s3Var4 = this.f78413c;
                            s3Var4.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedPhoto()) {
                                s3Var4.f78517e.disableAdOneTime();
                                r3 r3Var3 = s3Var4.f78516c;
                                if (r3Var3 != null) {
                                    r3Var3.onDisplayAddMagic(2);
                                    break;
                                }
                            } else {
                                s3Var4.a();
                                break;
                            }
                            break;
                        default:
                            s3 s3Var5 = this.f78413c;
                            s3Var5.getClass();
                            if (!ca.u.sharedInstance().hasAlreadyProposedQuestion()) {
                                s3Var5.f78517e.disableAdOneTime();
                                r3 r3Var4 = s3Var5.f78516c;
                                if (r3Var4 != null) {
                                    r3Var4.onDisplayAddMagic(0);
                                    break;
                                }
                            } else {
                                s3Var5.a();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            this.f78525m.setVisibility(8);
            textView7.setVisibility(8);
        }
        a();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a();
        if (this.f78522j) {
            this.f78520h.setImageResource(R.drawable.akitude_fixe_triomphe);
        } else {
            this.f78520h.setImageResource(R.drawable.akitude_fixe_deception);
        }
    }

    @Override // o9.c1
    public final boolean removeCreatedView() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h.sharedInstance().incMetricCompteur("character_displayed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
}
