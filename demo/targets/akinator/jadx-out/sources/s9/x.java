package s9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddPhotoDuelBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import lb.b1;
import mt.n0;
import o9.b3;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x extends p9.e {

    /* renamed from: j, reason: collision with root package name */
    public static final a f85568j = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public g f85569c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f85570e = AkApplication.f21719f.getTypeFace();

    /* renamed from: f, reason: collision with root package name */
    public int f85571f = -1;

    /* renamed from: g, reason: collision with root package name */
    public lb.b f85572g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f85573h;

    /* renamed from: i, reason: collision with root package name */
    public FragmentAddPhotoDuelBinding f85574i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final x newInstance(lb.b duel) {
            e0.checkNotNullParameter(duel, "duel");
            x xVar = new x();
            xVar.f85572g = duel;
            return xVar;
        }
    }

    public final void a() {
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding);
        fragmentAddPhotoDuelBinding.duelPhotoButtonValide1.setClickable(false);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding2 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding2);
        fragmentAddPhotoDuelBinding2.duelPhotoButtonValide2.setClickable(false);
    }

    public final int getSelection() {
        return this.f85571f;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBindingInflate = FragmentAddPhotoDuelBinding.inflate(inflater, viewGroup, false);
        this.f85574i = fragmentAddPhotoDuelBindingInflate;
        e0.checkNotNull(fragmentAddPhotoDuelBindingInflate);
        RelativeLayout root = fragmentAddPhotoDuelBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        pt.c cVar = this.f85573h;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f85574i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        pt.c cVar = this.f85573h;
        if (cVar != null) {
            e0.checkNotNull(cVar);
            if (!cVar.isDisposed()) {
                return;
            }
        }
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding);
        fragmentAddPhotoDuelBinding.loadingBarAward.setVisibility(0);
        n0 n0VarCreate = n0.create(new b3(this, 13));
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.f85573h = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(ou.j.newThread()).subscribe(new w(0, new v(this, 0)), new w(1, new v(this, 1)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String name;
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AkActivity akActivity = (AkActivity) getActivity();
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding);
        TextView textView = fragmentAddPhotoDuelBinding.textNomPersonnage;
        Typeface typeface = this.f85570e;
        textView.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding2 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding2);
        fragmentAddPhotoDuelBinding2.textQuelleMeilleurePhoto.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding3 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding3);
        fragmentAddPhotoDuelBinding3.duelPhotoTextProposePar1.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding4 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding4);
        fragmentAddPhotoDuelBinding4.duelPhotoTextNbVotes1.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding5 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding5);
        fragmentAddPhotoDuelBinding5.duelPhotoTextVotes1.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding6 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding6);
        fragmentAddPhotoDuelBinding6.duelPhotoTextProposePar2.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding7 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding7);
        fragmentAddPhotoDuelBinding7.duelPhotoTextNbVotes2.setTypeface(typeface);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding8 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding8);
        fragmentAddPhotoDuelBinding8.duelPhotoTextVotes2.setTypeface(typeface);
        try {
            name = ca.u.sharedInstance().getPersoPropose().getName();
        } catch (Exception unused) {
            name = "";
        }
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding9 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding9);
        fragmentAddPhotoDuelBinding9.textNomPersonnage.setText(name);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding10 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding10);
        TextView textView2 = fragmentAddPhotoDuelBinding10.textQuelleMeilleurePhoto;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "QUELLE_MEILLEURE_PHOTO", textView2);
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding11 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding11);
        TextView textView3 = fragmentAddPhotoDuelBinding11.duelPhotoTextProposePar1;
        String traductionFromToken = aVar.sharedInstance().getTraductionFromToken("PROPOSE_PAR");
        lb.b bVar = this.f85572g;
        e0.checkNotNull(bVar);
        textView3.setText(traductionFromToken + " " + bVar.getPseudo1());
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding12 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding12);
        TextView textView4 = fragmentAddPhotoDuelBinding12.duelPhotoTextNbVotes1;
        lb.b bVar2 = this.f85572g;
        e0.checkNotNull(bVar2);
        textView4.setText(String.valueOf(bVar2.getNbVotes1()));
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding13 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding13);
        fragmentAddPhotoDuelBinding13.duelPhotoTextVotes1.setText(k0.replace$default(aVar.sharedInstance().getTraductionFromToken("NB_VOTES"), "[NBVOTE]", "", false, 4, (Object) null));
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding14 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding14);
        TextView textView5 = fragmentAddPhotoDuelBinding14.duelPhotoTextProposePar2;
        String traductionFromToken2 = aVar.sharedInstance().getTraductionFromToken("PROPOSE_PAR");
        lb.b bVar3 = this.f85572g;
        e0.checkNotNull(bVar3);
        textView5.setText(traductionFromToken2 + " " + bVar3.getPseudo2());
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding15 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding15);
        TextView textView6 = fragmentAddPhotoDuelBinding15.duelPhotoTextNbVotes2;
        lb.b bVar4 = this.f85572g;
        e0.checkNotNull(bVar4);
        textView6.setText(String.valueOf(bVar4.getNbVotes2()));
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding16 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding16);
        fragmentAddPhotoDuelBinding16.duelPhotoTextVotes2.setText(k0.replace$default(aVar.sharedInstance().getTraductionFromToken("NB_VOTES"), "[NBVOTE]", "", false, 4, (Object) null));
        if (akActivity != null) {
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding17 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding17);
            TextView textNomPersonnage = fragmentAddPhotoDuelBinding17.textNomPersonnage;
            e0.checkNotNullExpressionValue(textNomPersonnage, "textNomPersonnage");
            akActivity.markTextviewForUpdate(textNomPersonnage);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding18 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding18);
            TextView textQuelleMeilleurePhoto = fragmentAddPhotoDuelBinding18.textQuelleMeilleurePhoto;
            e0.checkNotNullExpressionValue(textQuelleMeilleurePhoto, "textQuelleMeilleurePhoto");
            akActivity.markTextviewForUpdate(textQuelleMeilleurePhoto);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding19 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding19);
            TextView duelPhotoTextProposePar1 = fragmentAddPhotoDuelBinding19.duelPhotoTextProposePar1;
            e0.checkNotNullExpressionValue(duelPhotoTextProposePar1, "duelPhotoTextProposePar1");
            akActivity.markTextviewForUpdate(duelPhotoTextProposePar1);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding20 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding20);
            TextView duelPhotoTextNbVotes1 = fragmentAddPhotoDuelBinding20.duelPhotoTextNbVotes1;
            e0.checkNotNullExpressionValue(duelPhotoTextNbVotes1, "duelPhotoTextNbVotes1");
            akActivity.markTextviewForUpdate(duelPhotoTextNbVotes1);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding21 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding21);
            TextView duelPhotoTextVotes1 = fragmentAddPhotoDuelBinding21.duelPhotoTextVotes1;
            e0.checkNotNullExpressionValue(duelPhotoTextVotes1, "duelPhotoTextVotes1");
            akActivity.markTextviewForUpdate(duelPhotoTextVotes1);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding22 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding22);
            TextView duelPhotoTextProposePar2 = fragmentAddPhotoDuelBinding22.duelPhotoTextProposePar2;
            e0.checkNotNullExpressionValue(duelPhotoTextProposePar2, "duelPhotoTextProposePar2");
            akActivity.markTextviewForUpdate(duelPhotoTextProposePar2);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding23 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding23);
            TextView duelPhotoTextNbVotes2 = fragmentAddPhotoDuelBinding23.duelPhotoTextNbVotes2;
            e0.checkNotNullExpressionValue(duelPhotoTextNbVotes2, "duelPhotoTextNbVotes2");
            akActivity.markTextviewForUpdate(duelPhotoTextNbVotes2);
            FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding24 = this.f85574i;
            e0.checkNotNull(fragmentAddPhotoDuelBinding24);
            TextView duelPhotoTextVotes2 = fragmentAddPhotoDuelBinding24.duelPhotoTextVotes2;
            e0.checkNotNullExpressionValue(duelPhotoTextVotes2, "duelPhotoTextVotes2");
            akActivity.markTextviewForUpdate(duelPhotoTextVotes2);
            akActivity.updateTextViewsSize();
        }
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding25 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding25);
        final int i10 = 0;
        fragmentAddPhotoDuelBinding25.duelPhotoButtonValide1.setOnClickListener(new View.OnClickListener(this) { // from class: s9.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x f85563c;

            {
                this.f85563c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        x xVar = this.f85563c;
                        xVar.f85571f = 1;
                        g gVar = xVar.f85569c;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        x xVar2 = this.f85563c;
                        xVar2.f85571f = 2;
                        g gVar2 = xVar2.f85569c;
                        if (gVar2 != null) {
                            gVar2.manageNextFragment();
                            break;
                        }
                        break;
                }
            }
        });
        FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding26 = this.f85574i;
        e0.checkNotNull(fragmentAddPhotoDuelBinding26);
        final int i11 = 1;
        fragmentAddPhotoDuelBinding26.duelPhotoButtonValide2.setOnClickListener(new View.OnClickListener(this) { // from class: s9.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x f85563c;

            {
                this.f85563c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        x xVar = this.f85563c;
                        xVar.f85571f = 1;
                        g gVar = xVar.f85569c;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        x xVar2 = this.f85563c;
                        xVar2.f85571f = 2;
                        g gVar2 = xVar2.f85569c;
                        if (gVar2 != null) {
                            gVar2.manageNextFragment();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void setManager(g mManager) {
        e0.checkNotNullParameter(mManager, "mManager");
        this.f85569c = mManager;
    }
}
