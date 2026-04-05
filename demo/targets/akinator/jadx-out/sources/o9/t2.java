package o9;

import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.VoteActivity;
import com.digidust.elokence.akinator.webservices.cheatmanagement.CheatManagement$AwardsToVote;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78557b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78558c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78560f;

    public /* synthetic */ t2(int i10, int i11, HomeActivity homeActivity) {
        this.f78558c = i10;
        this.f78559e = i11;
        this.f78560f = homeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheatManagement$AwardsToVote cheatManagement$AwardsToVote;
        int sessionId;
        switch (this.f78557b) {
            case 0:
                double d10 = (this.f78558c / this.f78559e) * 100.0f;
                try {
                    da.k kVar = ((HomeActivity) this.f78560f).L;
                    kotlin.jvm.internal.e0.checkNotNull(kVar);
                    kVar.setText(((int) d10) + "%");
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                VoteActivity voteActivity = (VoteActivity) this.f78560f;
                if (voteActivity.L != null && (cheatManagement$AwardsToVote = (CheatManagement$AwardsToVote) voteActivity.C.get(this.f78558c)) != null && (sessionId = cheatManagement$AwardsToVote.getSessionId()) != -1) {
                    sa.c.f85581a.sendVote(this.f78559e, sessionId);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t2(VoteActivity voteActivity, int i10, int i11) {
        this.f78560f = voteActivity;
        this.f78558c = i10;
        this.f78559e = i11;
    }
}
