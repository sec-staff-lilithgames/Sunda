package o9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.VoteActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.webservices.cheatmanagement.CheatManagement$AwardsToVote;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class fa extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f78150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VoteActivity f78151c;

    public fa(VoteActivity voteActivity, ArrayList arrayList) {
        this.f78151c = voteActivity;
        this.f78150b = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f78150b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        ea eaVar;
        if (view == null) {
            eaVar = new ea();
            VoteActivity voteActivity = this.f78151c;
            viewInflate = voteActivity.getLayoutInflater().inflate(R.layout.layout_vote, viewGroup, false);
            eaVar.f78127d = (TextView) viewInflate.findViewById(R.id.persoTitreVote);
            eaVar.f78128e = (TextView) viewInflate.findViewById(R.id.persoNomVote);
            eaVar.f78129f = (TextView) viewInflate.findViewById(R.id.persoDescriptionVote);
            eaVar.f78124a = (TextView) viewInflate.findViewById(R.id.currentVote);
            eaVar.f78126c = (TextView) viewInflate.findViewById(R.id.totalVote);
            eaVar.f78125b = (TextView) viewInflate.findViewById(R.id.slashVote);
            eaVar.f78127d.setTypeface(voteActivity.f21686i);
            eaVar.f78128e.setTypeface(voteActivity.f21686i);
            eaVar.f78129f.setTypeface(voteActivity.f21686i);
            eaVar.f78124a.setTypeface(voteActivity.f21686i);
            eaVar.f78126c.setTypeface(voteActivity.f21686i);
            eaVar.f78125b.setTypeface(voteActivity.f21686i);
            viewInflate.setTag(eaVar);
        } else {
            viewInflate = view;
            eaVar = (ea) view.getTag();
        }
        j1.o2.x(eaVar.f78127d, "EST_CE_PERSONNAGE");
        eaVar.f78124a.setText(String.valueOf(i10 + 1));
        eaVar.f78126c.setText(String.valueOf(getCount()));
        eaVar.f78128e.setText(getItem(i10).getNom());
        eaVar.f78129f.setText(getItem(i10).getDescription());
        return viewInflate;
    }

    @Override // android.widget.Adapter
    public CheatManagement$AwardsToVote getItem(int i10) {
        return (CheatManagement$AwardsToVote) this.f78150b.get(i10);
    }
}
