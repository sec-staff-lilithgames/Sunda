package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import bj.v0;
import ca.m;
import ca.o;
import ca.t;
import com.digidust.elokence.akinator.activities.SeveralCharactersProposalActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import da.k;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import jb.h;
import lb.b1;
import lb.e;
import mt.b0;
import o9.m7;
import ot.c;
import ou.j;
import y9.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class SeveralCharactersProposalActivity extends AkActivity {
    public static final /* synthetic */ int N = 0;
    public ListView C;
    public TextView D;
    public Button E;
    public Button F;
    public ArrayList H;
    public final m7 K;
    public final m7 M;
    public a G = null;
    public k I = null;
    public e.g J = null;
    public final ia.a L = new ia.a(this, 2);

    /* JADX WARN: Type inference failed for: r0v1, types: [o9.m7] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o9.m7] */
    public SeveralCharactersProposalActivity() {
        final int i10 = 0;
        this.K = new View.OnClickListener(this) { // from class: o9.m7

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SeveralCharactersProposalActivity f78367c;

            {
                this.f78367c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                final SeveralCharactersProposalActivity severalCharactersProposalActivity = this.f78367c;
                switch (i11) {
                    case 0:
                        if (severalCharactersProposalActivity.G.getSelectedItemsIndex().size() >= 1) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<Integer> it = severalCharactersProposalActivity.G.getSelectedItemsIndex().iterator();
                            while (it.hasNext()) {
                                arrayList.add(((e.b) severalCharactersProposalActivity.G.getItem(it.next().intValue())).getIdBase());
                            }
                            if (severalCharactersProposalActivity.G.getSelectedItemsIndex().size() > 1) {
                                AkApplication.f21721h.execute(new n7(0, arrayList));
                            }
                            final int iIntValue = severalCharactersProposalActivity.G.getSelectedItemsIndex().iterator().next().intValue();
                            severalCharactersProposalActivity.I = da.k.show(severalCharactersProposalActivity);
                            final e.c cVar = new e.c();
                            severalCharactersProposalActivity.J = null;
                            severalCharactersProposalActivity.disposeAtDestruction(mt.b0.fromCallable(new Callable() { // from class: o9.o7
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SeveralCharactersProposalActivity severalCharactersProposalActivity2 = severalCharactersProposalActivity;
                                    e.g gVar = (e.g) severalCharactersProposalActivity2.G.getItem(iIntValue);
                                    severalCharactersProposalActivity2.J = gVar;
                                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().validateObjectWithId(gVar.getIdSession(), cVar));
                                }
                            }).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(4, severalCharactersProposalActivity, cVar)));
                            break;
                        }
                        break;
                    default:
                        int i12 = SeveralCharactersProposalActivity.N;
                        severalCharactersProposalActivity.getClass();
                        severalCharactersProposalActivity.startActivity(new Intent(severalCharactersProposalActivity, (Class<?>) SoundlikeActivity.class));
                        severalCharactersProposalActivity.finish();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.M = new View.OnClickListener(this) { // from class: o9.m7

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SeveralCharactersProposalActivity f78367c;

            {
                this.f78367c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                final SeveralCharactersProposalActivity severalCharactersProposalActivity = this.f78367c;
                switch (i112) {
                    case 0:
                        if (severalCharactersProposalActivity.G.getSelectedItemsIndex().size() >= 1) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<Integer> it = severalCharactersProposalActivity.G.getSelectedItemsIndex().iterator();
                            while (it.hasNext()) {
                                arrayList.add(((e.b) severalCharactersProposalActivity.G.getItem(it.next().intValue())).getIdBase());
                            }
                            if (severalCharactersProposalActivity.G.getSelectedItemsIndex().size() > 1) {
                                AkApplication.f21721h.execute(new n7(0, arrayList));
                            }
                            final int iIntValue = severalCharactersProposalActivity.G.getSelectedItemsIndex().iterator().next().intValue();
                            severalCharactersProposalActivity.I = da.k.show(severalCharactersProposalActivity);
                            final e.c cVar = new e.c();
                            severalCharactersProposalActivity.J = null;
                            severalCharactersProposalActivity.disposeAtDestruction(mt.b0.fromCallable(new Callable() { // from class: o9.o7
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SeveralCharactersProposalActivity severalCharactersProposalActivity2 = severalCharactersProposalActivity;
                                    e.g gVar = (e.g) severalCharactersProposalActivity2.G.getItem(iIntValue);
                                    severalCharactersProposalActivity2.J = gVar;
                                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().validateObjectWithId(gVar.getIdSession(), cVar));
                                }
                            }).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(4, severalCharactersProposalActivity, cVar)));
                            break;
                        }
                        break;
                    default:
                        int i12 = SeveralCharactersProposalActivity.N;
                        severalCharactersProposalActivity.getClass();
                        severalCharactersProposalActivity.startActivity(new Intent(severalCharactersProposalActivity, (Class<?>) SoundlikeActivity.class));
                        severalCharactersProposalActivity.finish();
                        break;
                }
            }
        };
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == 0) {
            goToHome(true);
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        goToHome(true);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f21681c) {
            return;
        }
        setContentView(R.layout.activity_several_characters_proposal);
        try {
            ((ImageView) findViewById(R.id.imageBackground)).setImageDrawable(new BitmapDrawable(getResources(), t.sharedInstance().getSubjectBackground(m.sharedInstance().getCurrentInstance().getSubjectId())));
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("MANQUE_DE_MEMOIRE"), 1).show();
        }
        if (m.sharedInstance().isUserConnected()) {
            if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
                h.sharedInstance().incMetricCompteur("total_games_account");
                h.sharedInstance().incMetricCompteur("total_games");
                o.sharedInstance().unlockTotalGameForThisGame(false);
            }
        } else if (o.sharedInstance().canIncTotalGameIncForThisGame()) {
            h.sharedInstance().incMetricCompteur("total_games");
            o.sharedInstance().unlockTotalGameForThisGame(false);
        }
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("several");
        this.H = new ArrayList();
        if (arrayList == null || arrayList.size() <= 0) {
            Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            goToHome(false);
            return;
        }
        this.C = (ListView) findViewById(R.id.charactersList);
        this.D = (TextView) findViewById(R.id.listCharactersTitle);
        this.F = (Button) findViewById(R.id.characterNotInListButton);
        this.E = (Button) findViewById(R.id.validateButton);
        this.D.setTypeface(this.f21686i);
        markTextviewForUpdate(this.F);
        markTextviewForUpdate(this.E);
        markTextviewForUpdate(this.D);
        updateTextViewsSize();
        o2.w(this.F, "MON_PERSONNAGE_NEST_PAS_DANS_LA_LISTE");
        o2.w(this.E, "VALIDER");
        this.D.setText(b1.sharedInstance().getTraductionFromToken("SI_VOUS_VOYEZ_LE_PERSONNAGE_AUQUEL_VOUS_PENSIEZ_DANS_LA_LISTE_SUIVANTE_CLIQUEZ_SUR_SON_NOM"));
        a aVar = new a(this, arrayList, this.H);
        this.G = aVar;
        this.C.setAdapter((ListAdapter) aVar);
        this.G.notifyDataSetChanged();
        this.C.setDivider(null);
        this.C.setDividerHeight(0);
        this.E.setOnClickListener(this.K);
        this.F.setOnClickListener(this.M);
        this.C.setOnItemClickListener(this.L);
        if (m.sharedInstance().canDownloadPicture()) {
            disposeAtDestruction(b0.fromCallable(new com.google.firebase.messaging.m(6, this, arrayList)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new v0(this, 19)));
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
