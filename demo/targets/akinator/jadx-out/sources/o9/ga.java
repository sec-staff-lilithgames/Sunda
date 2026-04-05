package o9;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.WindowManager;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.VoteActivity;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ga extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f78178a;

    /* renamed from: b, reason: collision with root package name */
    public da.k f78179b;

    public ga(VoteActivity voteActivity) {
        this.f78178a = new WeakReference(voteActivity);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (((Activity) this.f78178a.get()) == null) {
            return null;
        }
        return sa.c.f85581a.getListAwardsToVote();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        sa.a aVar = (sa.a) obj;
        VoteActivity voteActivity = (VoteActivity) this.f78178a.get();
        if (voteActivity == null) {
            return;
        }
        try {
            da.k kVar = this.f78179b;
            if (kVar != null && kVar.isShowing()) {
                this.f78179b.dismiss();
            }
        } catch (WindowManager.BadTokenException | IllegalArgumentException unused) {
            this.f78179b = null;
        }
        if (aVar == null || aVar.getListAwardsToVote() == null) {
            Toast.makeText(voteActivity, lb.b1.sharedInstance().getTraductionFromToken("PAS_DE_VOTE_DISPONIBLE"), 1).show();
            return;
        }
        if (aVar.getListAwardsToVote().size() == 0) {
            voteActivity.N.animate().alpha(1.0f).setDuration(500L);
            j1.o2.x(voteActivity.N, "PAS_DE_VOTE_DISPONIBLE");
            voteActivity.I.setVisibility(0);
            return;
        }
        voteActivity.F = aVar.moreVotes();
        if (aVar.getScore() > 0) {
            voteActivity.G.setText(String.valueOf(aVar.getScore()));
        }
        voteActivity.C = aVar.getListAwardsToVote();
        fa faVar = new fa(voteActivity, voteActivity.C);
        voteActivity.L = faVar;
        voteActivity.M.setAdapter(faVar);
        voteActivity.L.notifyDataSetChanged();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Activity activity = (Activity) this.f78178a.get();
        if (activity == null) {
            return;
        }
        try {
            this.f78179b = da.k.show(activity);
        } catch (WindowManager.BadTokenException | IllegalArgumentException unused) {
        }
    }
}
