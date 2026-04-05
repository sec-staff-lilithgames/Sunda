package t9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h2;
import ca.o;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import j1.o2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import lb.e;
import mt.n0;
import mt.p0;
import mt.r0;
import ou.j;
import s9.w;
import t9.f;
import timber.log.Timber;
import y9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends p9.c implements p9.a {

    /* renamed from: m, reason: collision with root package name */
    public static final a f86599m = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public FragmentAddMagicManagerBinding f86601e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f86602f;

    /* renamed from: g, reason: collision with root package name */
    public AkActivity f86603g;

    /* renamed from: h, reason: collision with root package name */
    public String f86604h;

    /* renamed from: k, reason: collision with root package name */
    public String f86607k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f86608l;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f86600c = AkApplication.f21719f.getTypeFace();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f86605i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f86606j = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final f newInstance() {
            f fVar = new f();
            fVar.setArguments(new Bundle());
            return fVar;
        }
    }

    public static final f newInstance() {
        return f86599m.newInstance();
    }

    public final void a() {
        Timber.Forest.tag("MQF").d("Manage soundlike question", new Object[0]);
        n0 n0VarCreate = n0.create(new d(this, 1));
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.f86602f = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new w(6, new c(this, 3)), new w(7, new c(this, 4)));
    }

    @Override // p9.a
    public void manageDefaultDisplay(View v10) {
        e0.checkNotNullParameter(v10, "v");
        g gVarNewInstance = g.f86609g.newInstance("");
        h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        h2VarBeginTransaction.add(R.id.containerFragmentAddMagic, gVarNewInstance);
        h2VarBeginTransaction.commit();
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        fragmentAddMagicManagerBinding.precedant.setVisibility(4);
    }

    @Override // p9.a
    public void manageFinished() {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f86608l;
        e0.checkNotNull(arrayList2);
        if (arrayList2.size() == 1) {
            ArrayList arrayList3 = this.f86608l;
            e0.checkNotNull(arrayList3);
            Object obj = arrayList3.get(0);
            e0.checkNotNullExpressionValue(obj, "get(...)");
            int answer = ((b.a) obj).getAnswer();
            arrayList.add(new e.d(answer != -2 ? answer : -1, ""));
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = this.f86608l;
            e0.checkNotNull(arrayList4);
            Iterator it = arrayList4.iterator();
            e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                e0.checkNotNullExpressionValue(next, "next(...)");
                int answer2 = ((b.a) next).getAnswer();
                hashSet.add(Integer.valueOf(answer2));
                if (answer2 == -2) {
                    answer2 = -1;
                }
                arrayList.add(new e.d(answer2, ""));
            }
            hashSet.remove(-2);
            if (hashSet.size() <= 1) {
                if (arrayList.size() >= 2) {
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    new da.f(fragmentActivityRequireActivity).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("IL_FAUT_OBLIGATOIREMENT_AU_MOINS_DEUX_REPONSES_DIFFERENTES"));
                    return;
                }
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding);
                fragmentAddMagicManagerBinding.precedant.setVisibility(4);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding2);
                fragmentAddMagicManagerBinding2.suivant.setVisibility(4);
                displayFinalFragment();
                return;
            }
        }
        if (this.f86606j >= 0) {
            final int i10 = 0;
            n0 n0VarCreate = n0.create(new r0(this) { // from class: t9.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f86597c;

                {
                    this.f86597c = this;
                }

                @Override // mt.r0
                public final void subscribe(p0 e10) {
                    int i11 = i10;
                    int iModifyQuestionWithId = -1;
                    ArrayList<e.d> arrayList5 = arrayList;
                    f fVar = this.f86597c;
                    switch (i11) {
                        case 0:
                            f.a aVar = f.f86599m;
                            e0.checkNotNullParameter(e10, "e");
                            AkActivity akActivity = fVar.f86603g;
                            e0.checkNotNull(akActivity);
                            akActivity.displayLoader();
                            Object obj2 = fVar.f86605i.get(fVar.f86606j);
                            e0.checkNotNullExpressionValue(obj2, "get(...)");
                            e.h hVar = (e.h) obj2;
                            if (o.sharedInstance().getCurrentSession() != null) {
                                lb.e currentSession = o.sharedInstance().getCurrentSession();
                                e0.checkNotNull(currentSession);
                                iModifyQuestionWithId = currentSession.modifyQuestionWithId(hVar.getId(), hVar.getQuestion(), arrayList5);
                            }
                            AkActivity akActivity2 = fVar.f86603g;
                            e0.checkNotNull(akActivity2);
                            akActivity2.hideLoader();
                            pt.c cVar = fVar.f86602f;
                            if (cVar != null) {
                                e0.checkNotNull(cVar);
                                if (!cVar.isDisposed()) {
                                    if (iModifyQuestionWithId != 0) {
                                        ((du.g) e10).onError(new UnknownError(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                                        break;
                                    } else {
                                        ((du.g) e10).onSuccess(Integer.valueOf(iModifyQuestionWithId));
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            f.a aVar2 = f.f86599m;
                            e0.checkNotNullParameter(e10, "e");
                            AkActivity akActivity3 = fVar.f86603g;
                            e0.checkNotNull(akActivity3);
                            akActivity3.displayLoader();
                            if (o.sharedInstance().getCurrentSession() != null) {
                                lb.e currentSession2 = o.sharedInstance().getCurrentSession();
                                e0.checkNotNull(currentSession2);
                                iModifyQuestionWithId = currentSession2.addNewQuestionWithLabelAndAnswers(fVar.f86607k, arrayList5);
                            }
                            AkActivity akActivity4 = fVar.f86603g;
                            e0.checkNotNull(akActivity4);
                            akActivity4.hideLoader();
                            pt.c cVar2 = fVar.f86602f;
                            if (cVar2 != null) {
                                e0.checkNotNull(cVar2);
                                if (!cVar2.isDisposed()) {
                                    if (iModifyQuestionWithId != 0) {
                                        ((du.g) e10).onError(new UnknownError(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                                        break;
                                    } else {
                                        ((du.g) e10).onSuccess(Integer.valueOf(iModifyQuestionWithId));
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
            this.f86602f = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new w(8, new c(this, 5)), new w(9, new c(this, 6)));
            return;
        }
        String str = this.f86607k;
        e0.checkNotNull(str);
        if (str.length() < 10) {
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            e0.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            new da.f(fragmentActivityRequireActivity2).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("VOTRE_QUESTION_EST_TROP_COURTE_MINIMUM_10_CARACTERES"));
            return;
        }
        String str2 = this.f86607k;
        e0.checkNotNull(str2);
        if (str2.length() > 150) {
            FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
            e0.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
            new da.f(fragmentActivityRequireActivity3).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("VOTRE_QUESTION_EST_TROP_LONGUE_MAXIMUM_150_CARACTERES"));
        } else {
            final int i11 = 1;
            n0 n0VarCreate2 = n0.create(new r0(this) { // from class: t9.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f86597c;

                {
                    this.f86597c = this;
                }

                @Override // mt.r0
                public final void subscribe(p0 e10) {
                    int i112 = i11;
                    int iModifyQuestionWithId = -1;
                    ArrayList<e.d> arrayList5 = arrayList;
                    f fVar = this.f86597c;
                    switch (i112) {
                        case 0:
                            f.a aVar = f.f86599m;
                            e0.checkNotNullParameter(e10, "e");
                            AkActivity akActivity = fVar.f86603g;
                            e0.checkNotNull(akActivity);
                            akActivity.displayLoader();
                            Object obj2 = fVar.f86605i.get(fVar.f86606j);
                            e0.checkNotNullExpressionValue(obj2, "get(...)");
                            e.h hVar = (e.h) obj2;
                            if (o.sharedInstance().getCurrentSession() != null) {
                                lb.e currentSession = o.sharedInstance().getCurrentSession();
                                e0.checkNotNull(currentSession);
                                iModifyQuestionWithId = currentSession.modifyQuestionWithId(hVar.getId(), hVar.getQuestion(), arrayList5);
                            }
                            AkActivity akActivity2 = fVar.f86603g;
                            e0.checkNotNull(akActivity2);
                            akActivity2.hideLoader();
                            pt.c cVar = fVar.f86602f;
                            if (cVar != null) {
                                e0.checkNotNull(cVar);
                                if (!cVar.isDisposed()) {
                                    if (iModifyQuestionWithId != 0) {
                                        ((du.g) e10).onError(new UnknownError(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                                        break;
                                    } else {
                                        ((du.g) e10).onSuccess(Integer.valueOf(iModifyQuestionWithId));
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            f.a aVar2 = f.f86599m;
                            e0.checkNotNullParameter(e10, "e");
                            AkActivity akActivity3 = fVar.f86603g;
                            e0.checkNotNull(akActivity3);
                            akActivity3.displayLoader();
                            if (o.sharedInstance().getCurrentSession() != null) {
                                lb.e currentSession2 = o.sharedInstance().getCurrentSession();
                                e0.checkNotNull(currentSession2);
                                iModifyQuestionWithId = currentSession2.addNewQuestionWithLabelAndAnswers(fVar.f86607k, arrayList5);
                            }
                            AkActivity akActivity4 = fVar.f86603g;
                            e0.checkNotNull(akActivity4);
                            akActivity4.hideLoader();
                            pt.c cVar2 = fVar.f86602f;
                            if (cVar2 != null) {
                                e0.checkNotNull(cVar2);
                                if (!cVar2.isDisposed()) {
                                    if (iModifyQuestionWithId != 0) {
                                        ((du.g) e10).onError(new UnknownError(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                                        break;
                                    } else {
                                        ((du.g) e10).onSuccess(Integer.valueOf(iModifyQuestionWithId));
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            e0.checkNotNullExpressionValue(n0VarCreate2, "create(...)");
            this.f86602f = n0VarCreate2.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new w(2, new c(this, 7)), new w(3, new c(this, 0)));
        }
    }

    @Override // p9.a
    public void manageNextFragment() {
        Timber.Forest.tag("MQF").d("ManageNextFragment", new Object[0]);
        Fragment fragmentFindFragmentById = getParentFragmentManager().findFragmentById(R.id.containerFragmentAddMagic);
        if (!(fragmentFindFragmentById instanceof g)) {
            if (fragmentFindFragmentById instanceof i) {
                this.f86606j = ((i) fragmentFindFragmentById).getSelectedIndex();
                a();
                return;
            } else {
                if (fragmentFindFragmentById instanceof t9.a) {
                    t9.a aVar = (t9.a) fragmentFindFragmentById;
                    this.f86607k = aVar.getCustomQuestion();
                    this.f86608l = aVar.getMLimuleObjectsAnswer();
                    manageFinished();
                    return;
                }
                return;
            }
        }
        String question = ((g) fragmentFindFragmentById).getQuestion();
        this.f86604h = question;
        if (question != null) {
            e0.checkNotNull(question);
            if (question.length() == 0) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                new da.f(fragmentActivityRequireActivity).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("LES_CHAMPS_NE_PEUVENT_ETRE_VIDES"));
                return;
            }
            String str = this.f86604h;
            e0.checkNotNull(str);
            if (str.length() >= 3) {
                String str2 = this.f86604h;
                e0.checkNotNull(str2);
                if (str2.length() <= 100) {
                    String str3 = this.f86604h;
                    e0.checkNotNull(str3);
                    if (sv.n0.contains$default((CharSequence) str3, (CharSequence) " ", false, 2, (Object) null)) {
                        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                        e0.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        new da.f(fragmentActivityRequireActivity2).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("ESPACES_NON_AUTORISE_TAPE_MOT_PRINCIPAL_QUESTION"));
                        return;
                    }
                }
            }
            FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
            e0.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
            new da.f(fragmentActivityRequireActivity3).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("RECHERCHE_DOIT_ETRE_COMPRISE_3_100_CHARACTERES"));
            return;
        }
        manageSearchQuestion();
    }

    @Override // p9.a
    public void managePreviousFragment() {
        Fragment fragmentFindFragmentById = getParentFragmentManager().findFragmentById(R.id.containerFragmentAddMagic);
        boolean z10 = fragmentFindFragmentById instanceof i;
        ArrayList<e.h> arrayList = this.f86605i;
        if (z10) {
            arrayList.clear();
            this.f86606j = -1;
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f86601e;
            e0.checkNotNull(fragmentAddMagicManagerBinding);
            fragmentAddMagicManagerBinding.precedant.setVisibility(4);
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f86601e;
            e0.checkNotNull(fragmentAddMagicManagerBinding2);
            fragmentAddMagicManagerBinding2.suivant.setVisibility(0);
            g gVarNewInstance = g.f86609g.newInstance(this.f86604h);
            h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
            e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
            h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
            h2VarBeginTransaction.replace(R.id.containerFragmentAddMagic, gVarNewInstance);
            h2VarBeginTransaction.commit();
            return;
        }
        if (fragmentFindFragmentById instanceof t9.a) {
            if (arrayList.isEmpty()) {
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding3);
                fragmentAddMagicManagerBinding3.precedant.setVisibility(4);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding4);
                fragmentAddMagicManagerBinding4.suivant.setVisibility(0);
                g gVarNewInstance2 = g.f86609g.newInstance(this.f86604h);
                h2 h2VarBeginTransaction2 = getParentFragmentManager().beginTransaction();
                e0.checkNotNullExpressionValue(h2VarBeginTransaction2, "beginTransaction(...)");
                h2VarBeginTransaction2.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
                h2VarBeginTransaction2.replace(R.id.containerFragmentAddMagic, gVarNewInstance2);
                h2VarBeginTransaction2.commit();
                return;
            }
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding5 = this.f86601e;
            e0.checkNotNull(fragmentAddMagicManagerBinding5);
            fragmentAddMagicManagerBinding5.precedant.setVisibility(0);
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding6 = this.f86601e;
            e0.checkNotNull(fragmentAddMagicManagerBinding6);
            fragmentAddMagicManagerBinding6.suivant.setVisibility(4);
            i iVarNewInstance = i.f86614i.newInstance(arrayList, this.f86606j);
            h2 h2VarBeginTransaction3 = getParentFragmentManager().beginTransaction();
            e0.checkNotNullExpressionValue(h2VarBeginTransaction3, "beginTransaction(...)");
            h2VarBeginTransaction3.setCustomAnimations(R.animator.enter_from_left, R.animator.exit_to_right);
            h2VarBeginTransaction3.replace(R.id.containerFragmentAddMagic, iVarNewInstance);
            h2VarBeginTransaction3.commit();
        }
    }

    public final void manageSearchQuestion() {
        n0 n0VarCreate = n0.create(new d(this, 0));
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.f86602f = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new w(4, new c(this, 1)), new w(5, new c(this, 2)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        e0.checkNotNull(activity, "null cannot be cast to non-null type com.digidust.elokence.akinator.activities.AkActivity");
        this.f86603g = (AkActivity) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBindingInflate = FragmentAddMagicManagerBinding.inflate(inflater, viewGroup, false);
        this.f86601e = fragmentAddMagicManagerBindingInflate;
        e0.checkNotNull(fragmentAddMagicManagerBindingInflate);
        AkinatorAddMagicButton akinatorAddMagicButton = fragmentAddMagicManagerBindingInflate.precedant;
        b1.a aVar = b1.f72741d;
        akinatorAddMagicButton.setText(aVar.sharedInstance().getTraductionFromToken("PRECEDENT"));
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        fragmentAddMagicManagerBinding.suivant.setText(aVar.sharedInstance().getTraductionFromToken("SUIVANT"));
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding2);
        fragmentAddMagicManagerBinding2.titleCorrect.setTypeface(this.f86600c);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding3);
        o2.A(aVar, "AJOUTER_UNE_QUESTION", fragmentAddMagicManagerBinding3.titleCorrect);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding4);
        RelativeLayout root = fragmentAddMagicManagerBinding4.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        manageDefaultDisplay(root);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding5 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding5);
        final int i10 = 0;
        fragmentAddMagicManagerBinding5.closeAddMagic.closeAddMagic.setOnClickListener(new View.OnClickListener(this) { // from class: t9.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f86591c;

            {
                this.f86591c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                f fVar = this.f86591c;
                switch (i11) {
                    case 0:
                        AkActivity akActivity = fVar.f86603g;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                    case 1:
                        f.a aVar2 = f.f86599m;
                        fVar.managePreviousFragment();
                        break;
                    default:
                        f.a aVar3 = f.f86599m;
                        fVar.manageNextFragment();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding6 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding6);
        final int i11 = 1;
        fragmentAddMagicManagerBinding6.precedant.setOnClickListener(new View.OnClickListener(this) { // from class: t9.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f86591c;

            {
                this.f86591c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                f fVar = this.f86591c;
                switch (i112) {
                    case 0:
                        AkActivity akActivity = fVar.f86603g;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                    case 1:
                        f.a aVar2 = f.f86599m;
                        fVar.managePreviousFragment();
                        break;
                    default:
                        f.a aVar3 = f.f86599m;
                        fVar.manageNextFragment();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding7 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding7);
        final int i12 = 2;
        fragmentAddMagicManagerBinding7.suivant.setOnClickListener(new View.OnClickListener(this) { // from class: t9.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f86591c;

            {
                this.f86591c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                f fVar = this.f86591c;
                switch (i112) {
                    case 0:
                        AkActivity akActivity = fVar.f86603g;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                    case 1:
                        f.a aVar2 = f.f86599m;
                        fVar.managePreviousFragment();
                        break;
                    default:
                        f.a aVar3 = f.f86599m;
                        fVar.manageNextFragment();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding8 = this.f86601e;
        e0.checkNotNull(fragmentAddMagicManagerBinding8);
        RelativeLayout root2 = fragmentAddMagicManagerBinding8.getRoot();
        e0.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pt.c cVar = this.f86602f;
        if (cVar != null) {
            e0.checkNotNull(cVar);
            if (cVar.isDisposed()) {
                return;
            }
            pt.c cVar2 = this.f86602f;
            e0.checkNotNull(cVar2);
            cVar2.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f86601e = null;
    }
}
