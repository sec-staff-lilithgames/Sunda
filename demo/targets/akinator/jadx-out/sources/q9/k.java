package q9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h2;
import bj.v0;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import lb.e;
import mt.n0;
import o9.b3;
import q9.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends p9.c implements p9.a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f82639l = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public pt.c f82640c;

    /* renamed from: f, reason: collision with root package name */
    public AkActivity f82642f;

    /* renamed from: g, reason: collision with root package name */
    public FragmentAddMagicManagerBinding f82643g;

    /* renamed from: i, reason: collision with root package name */
    public String f82645i;

    /* renamed from: j, reason: collision with root package name */
    public String f82646j;

    /* renamed from: k, reason: collision with root package name */
    public String f82647k;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f82641e = AkApplication.f21719f.getTypeFace();

    /* renamed from: h, reason: collision with root package name */
    public int f82644h = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final k newInstance() {
            return new k();
        }
    }

    @Override // p9.a
    public void manageDefaultDisplay(View v10) {
        e0.checkNotNullParameter(v10, "v");
        getParentFragmentManager().beginTransaction().add(R.id.containerFragmentAddMagic, h.f82630g.newInstance(this.f82644h)).commit();
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f82643g;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        fragmentAddMagicManagerBinding.precedant.setVisibility(4);
    }

    @Override // p9.a
    public void manageFinished() {
        n0 n0VarCreate = n0.create(new b3(this, 9));
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.f82640c = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(ou.j.newThread()).subscribe(new v0(new j(this, 0), 23), new v0(new j(this, 1), 24));
    }

    @Override // p9.a
    public void manageNextFragment() {
        Fragment fragmentNewInstance;
        h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
        e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
        Fragment fragmentFindFragmentById = getParentFragmentManager().findFragmentById(R.id.containerFragmentAddMagic);
        if (fragmentFindFragmentById instanceof h) {
            int index = ((h) fragmentFindFragmentById).getIndex();
            this.f82644h = index;
            if (index == -1) {
                return;
            }
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f82643g;
            e0.checkNotNull(fragmentAddMagicManagerBinding);
            fragmentAddMagicManagerBinding.precedant.setVisibility(0);
            fragmentNewInstance = e.f82622g.newInstance(this.f82645i);
        } else if (fragmentFindFragmentById instanceof e) {
            String nameDisplayed = ((e) fragmentFindFragmentById).getNameDisplayed();
            this.f82645i = nameDisplayed;
            e0.checkNotNull(nameDisplayed);
            int length = nameDisplayed.length();
            if (2 > length || length >= 101) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                new da.f(fragmentActivityRequireActivity).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("LA_LONGUEUR_DU_NOM_DOIT_ETRE_COMPRISE_ENTRE_2_ET_100_CARACTERES"));
                return;
            }
            fragmentNewInstance = b.f82612g.newInstance(this.f82646j);
        } else if (fragmentFindFragmentById instanceof b) {
            String descDisplayed = ((b) fragmentFindFragmentById).getDescDisplayed();
            this.f82646j = descDisplayed;
            e0.checkNotNull(descDisplayed);
            int length2 = descDisplayed.length();
            if (2 > length2 || length2 >= 51) {
                FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                e0.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                new da.f(fragmentActivityRequireActivity2).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("LA_LONGUEUR_DE_LA_DESCRIPTION_DOIT_ETRE_COMPRISE_ENTRE_2_ET_50_CARACTERES"));
                return;
            }
            fragmentNewInstance = d.f82618g.newInstance(this.f82647k);
        } else {
            if (fragmentFindFragmentById instanceof d) {
                this.f82647k = ((d) fragmentFindFragmentById).getLink();
                manageFinished();
            }
            fragmentNewInstance = null;
        }
        if (fragmentNewInstance != null) {
            h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
            h2VarBeginTransaction.replace(R.id.containerFragmentAddMagic, fragmentNewInstance);
            h2VarBeginTransaction.commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    @Override // p9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void managePreviousFragment() {
        /*
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getParentFragmentManager()
            androidx.fragment.app.h2 r0 = r0.beginTransaction()
            java.lang.String r1 = "beginTransaction(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            androidx.fragment.app.FragmentManager r1 = r5.getParentFragmentManager()
            r2 = 2131427715(0x7f0b0183, float:1.8477054E38)
            androidx.fragment.app.Fragment r1 = r1.findFragmentById(r2)
            boolean r3 = r1 instanceof q9.h
            if (r3 != 0) goto L59
            boolean r3 = r1 instanceof q9.e
            if (r3 == 0) goto L3f
            q9.h$a r1 = q9.h.f82630g
            int r3 = r5.f82644h
            q9.h r1 = r1.newInstance(r3)
            com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding r3 = r5.f82643g
            kotlin.jvm.internal.e0.checkNotNull(r3)
            com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton r3 = r3.precedant
            r4 = 4
            r3.setVisibility(r4)
            com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding r3 = r5.f82643g
            kotlin.jvm.internal.e0.checkNotNull(r3)
            com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton r3 = r3.suivant
            r4 = 0
            r3.setVisibility(r4)
            goto L5a
        L3f:
            boolean r3 = r1 instanceof q9.b
            if (r3 == 0) goto L4c
            q9.e$a r1 = q9.e.f82622g
            java.lang.String r3 = r5.f82645i
            q9.e r1 = r1.newInstance(r3)
            goto L5a
        L4c:
            boolean r1 = r1 instanceof q9.d
            if (r1 == 0) goto L59
            q9.b$a r1 = q9.b.f82612g
            java.lang.String r3 = r5.f82646j
            q9.b r1 = r1.newInstance(r3)
            goto L5a
        L59:
            r1 = 0
        L5a:
            if (r1 == 0) goto L6b
            r3 = 2130837513(0x7f020009, float:1.7279982E38)
            r4 = 2130837516(0x7f02000c, float:1.7279988E38)
            r0.setCustomAnimations(r3, r4)
            r0.replace(r2, r1)
            r0.commit()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.k.managePreviousFragment():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        e0.checkNotNull(activity, "null cannot be cast to non-null type com.digidust.elokence.akinator.activities.AkActivity");
        this.f82642f = (AkActivity) activity;
        e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
        if (persoPropose != null) {
            this.f82645i = persoPropose.getName();
            this.f82646j = persoPropose.getDescription();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBindingInflate = FragmentAddMagicManagerBinding.inflate(inflater, viewGroup, false);
        this.f82643g = fragmentAddMagicManagerBindingInflate;
        e0.checkNotNull(fragmentAddMagicManagerBindingInflate);
        RelativeLayout root = fragmentAddMagicManagerBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pt.c cVar = this.f82640c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f82643g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f82643g;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        TextView textView = fragmentAddMagicManagerBinding.titleCorrect;
        textView.setTypeface(this.f82641e);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "CORRIGER_NOM_DESCRIPTION", textView);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f82643g;
        e0.checkNotNull(fragmentAddMagicManagerBinding2);
        AkinatorAddMagicButton akinatorAddMagicButton = fragmentAddMagicManagerBinding2.precedant;
        akinatorAddMagicButton.setText(aVar.sharedInstance().getTraductionFromToken("PRECEDENT"));
        final int i10 = 0;
        akinatorAddMagicButton.setOnClickListener(new View.OnClickListener(this) { // from class: q9.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f82636c;

            {
                this.f82636c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                k kVar = this.f82636c;
                switch (i11) {
                    case 0:
                        k.a aVar2 = k.f82639l;
                        kVar.managePreviousFragment();
                        break;
                    case 1:
                        k.a aVar3 = k.f82639l;
                        kVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = kVar.f82642f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f82643g;
        e0.checkNotNull(fragmentAddMagicManagerBinding3);
        AkinatorAddMagicButton akinatorAddMagicButton2 = fragmentAddMagicManagerBinding3.suivant;
        akinatorAddMagicButton2.setText(aVar.sharedInstance().getTraductionFromToken("SUIVANT"));
        final int i11 = 1;
        akinatorAddMagicButton2.setOnClickListener(new View.OnClickListener(this) { // from class: q9.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f82636c;

            {
                this.f82636c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                k kVar = this.f82636c;
                switch (i112) {
                    case 0:
                        k.a aVar2 = k.f82639l;
                        kVar.managePreviousFragment();
                        break;
                    case 1:
                        k.a aVar3 = k.f82639l;
                        kVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = kVar.f82642f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f82643g;
        e0.checkNotNull(fragmentAddMagicManagerBinding4);
        final int i12 = 2;
        fragmentAddMagicManagerBinding4.closeAddMagic.closeAddMagic.setOnClickListener(new View.OnClickListener(this) { // from class: q9.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f82636c;

            {
                this.f82636c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                k kVar = this.f82636c;
                switch (i112) {
                    case 0:
                        k.a aVar2 = k.f82639l;
                        kVar.managePreviousFragment();
                        break;
                    case 1:
                        k.a aVar3 = k.f82639l;
                        kVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = kVar.f82642f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        manageDefaultDisplay(view);
    }
}
