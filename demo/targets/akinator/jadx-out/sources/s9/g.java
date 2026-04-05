package s9;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h2;
import androidx.lifecycle.c1;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.b1;
import lb.e;
import s9.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends p9.c implements p9.a {

    /* renamed from: m, reason: collision with root package name */
    public static final a f85525m = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public AkActivity f85527e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f85528f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f85529g;

    /* renamed from: h, reason: collision with root package name */
    public String f85530h;

    /* renamed from: i, reason: collision with root package name */
    public lb.b f85531i;

    /* renamed from: l, reason: collision with root package name */
    public FragmentAddMagicManagerBinding f85534l;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f85526c = AkApplication.f21719f.getTypeFace();

    /* renamed from: j, reason: collision with root package name */
    public int f85532j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f85533k = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final g newInstance(int i10) {
            g gVar = new g();
            gVar.f85533k = i10;
            gVar.setArguments(new Bundle());
            return gVar;
        }
    }

    public static final FragmentAddMagicManagerBinding access$getBinding(g gVar) {
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = gVar.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        return fragmentAddMagicManagerBinding;
    }

    public static final g newInstance(int i10) {
        return f85525m.newInstance(i10);
    }

    @Override // p9.a
    public void manageDefaultDisplay(View v10) {
        e0.checkNotNullParameter(v10, "v");
        int i10 = this.f85533k;
        if (i10 == 0) {
            c cVarNewInstance = c.f85509j.newInstance();
            cVarNewInstance.setManager(this);
            h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f85534l;
            e0.checkNotNull(fragmentAddMagicManagerBinding);
            h2VarBeginTransaction.add(fragmentAddMagicManagerBinding.containerFragmentAddMagic.getId(), cVarNewInstance).commit();
        } else if (i10 == 2) {
            e eVarNewInstance = e.f85518h.newInstance();
            eVarNewInstance.setManager(this);
            h2 h2VarBeginTransaction2 = getParentFragmentManager().beginTransaction();
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f85534l;
            e0.checkNotNull(fragmentAddMagicManagerBinding2);
            h2VarBeginTransaction2.add(fragmentAddMagicManagerBinding2.containerFragmentAddMagic.getId(), eVarNewInstance).commit();
        } else if (i10 == 4) {
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f85534l;
            e0.checkNotNull(fragmentAddMagicManagerBinding3);
            fragmentAddMagicManagerBinding3.titleCorrect.setHeight(0);
            e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
            if (persoPropose == null) {
                Toast.makeText(getActivity(), b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            }
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new l(this, persoPropose, null), 3, null);
        }
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding4);
        fragmentAddMagicManagerBinding4.precedant.setVisibility(4);
    }

    @Override // p9.a
    public void manageFinished() {
        e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
        if (persoPropose == null) {
            Toast.makeText(getActivity(), b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            return;
        }
        int i10 = this.f85533k;
        if (i10 == 0 || i10 == 2) {
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new p(this, persoPropose, null), 3, null);
        } else {
            if (i10 != 4) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this), null, null, new t(this, persoPropose, null), 3, null);
        }
    }

    @Override // p9.a
    public void manageNextFragment() {
        String photoId1;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        Fragment fragmentFindFragmentById = parentFragmentManager.findFragmentById(fragmentAddMagicManagerBinding.containerFragmentAddMagic.getId());
        if (fragmentFindFragmentById instanceof e) {
            this.f85532j = ((e) fragmentFindFragmentById).getReason();
            c cVarNewInstance = c.f85509j.newInstance();
            cVarNewInstance.setManager(this);
            h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f85534l;
            e0.checkNotNull(fragmentAddMagicManagerBinding2);
            h2VarBeginTransaction.replace(fragmentAddMagicManagerBinding2.containerFragmentAddMagic.getId(), cVarNewInstance).commit();
            return;
        }
        if (fragmentFindFragmentById instanceof c) {
            c cVar = (c) fragmentFindFragmentById;
            this.f85529g = cVar.mustAddPseudo();
            Bitmap rescaledBitmap = cVar.getRescaledBitmap();
            this.f85528f = rescaledBitmap;
            if (rescaledBitmap == null) {
                Toast.makeText(getActivity(), b1.f72741d.sharedInstance().getTraductionFromToken("SELECTIONNEZ_DABORD_PHOTO"), 0).show();
                return;
            } else {
                manageFinished();
                return;
            }
        }
        if (fragmentFindFragmentById instanceof x) {
            int selection = ((x) fragmentFindFragmentById).getSelection();
            if (selection == 1) {
                lb.b bVar = this.f85531i;
                e0.checkNotNull(bVar);
                photoId1 = bVar.getPhotoId1();
            } else if (selection != 2) {
                photoId1 = null;
            } else {
                lb.b bVar2 = this.f85531i;
                e0.checkNotNull(bVar2);
                photoId1 = bVar2.getPhotoId2();
            }
            this.f85530h = photoId1;
            manageFinished();
        }
    }

    @Override // p9.a
    public void managePreviousFragment() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        if (parentFragmentManager.findFragmentById(fragmentAddMagicManagerBinding.containerFragmentAddMagic.getId()) instanceof c) {
            e eVarNewInstance = e.f85518h.newInstance();
            eVarNewInstance.setManager(this);
            h2 h2VarBeginTransaction = getParentFragmentManager().beginTransaction();
            FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f85534l;
            e0.checkNotNull(fragmentAddMagicManagerBinding2);
            h2VarBeginTransaction.replace(fragmentAddMagicManagerBinding2.containerFragmentAddMagic.getId(), eVarNewInstance).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85527e = (AkActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBindingInflate = FragmentAddMagicManagerBinding.inflate(inflater, viewGroup, false);
        this.f85534l = fragmentAddMagicManagerBindingInflate;
        e0.checkNotNull(fragmentAddMagicManagerBindingInflate);
        RelativeLayout root = fragmentAddMagicManagerBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f85534l = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        fragmentAddMagicManagerBinding.buttonsPS.setVisibility(8);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding2);
        TextView textView = fragmentAddMagicManagerBinding2.titleCorrect;
        textView.setTypeface(this.f85526c);
        o2.A(b1.f72741d, "PROPOSER_UNE_PHOTO", textView);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding3);
        RelativeLayout root = fragmentAddMagicManagerBinding3.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        manageDefaultDisplay(root);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding4);
        final int i10 = 0;
        fragmentAddMagicManagerBinding4.precedant.setOnClickListener(new View.OnClickListener(this) { // from class: s9.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f85524c;

            {
                this.f85524c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                g gVar = this.f85524c;
                switch (i11) {
                    case 0:
                        g.a aVar = g.f85525m;
                        gVar.managePreviousFragment();
                        break;
                    case 1:
                        g.a aVar2 = g.f85525m;
                        gVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = gVar.f85527e;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding5 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding5);
        final int i11 = 1;
        fragmentAddMagicManagerBinding5.suivant.setOnClickListener(new View.OnClickListener(this) { // from class: s9.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f85524c;

            {
                this.f85524c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                g gVar = this.f85524c;
                switch (i112) {
                    case 0:
                        g.a aVar = g.f85525m;
                        gVar.managePreviousFragment();
                        break;
                    case 1:
                        g.a aVar2 = g.f85525m;
                        gVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = gVar.f85527e;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding6 = this.f85534l;
        e0.checkNotNull(fragmentAddMagicManagerBinding6);
        final int i12 = 2;
        fragmentAddMagicManagerBinding6.closeAddMagic.closeAddMagic.setOnClickListener(new View.OnClickListener(this) { // from class: s9.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f85524c;

            {
                this.f85524c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                g gVar = this.f85524c;
                switch (i112) {
                    case 0:
                        g.a aVar = g.f85525m;
                        gVar.managePreviousFragment();
                        break;
                    case 1:
                        g.a aVar2 = g.f85525m;
                        gVar.manageNextFragment();
                        break;
                    default:
                        AkActivity akActivity = gVar.f85527e;
                        e0.checkNotNull(akActivity);
                        akActivity.onBackPressed();
                        break;
                }
            }
        });
    }
}
