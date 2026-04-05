package o9;

import com.digidust.elokence.akinator.activities.VoteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class da implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VoteActivity f78106a;

    public da(VoteActivity voteActivity) {
        this.f78106a = voteActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        new ga(this.f78106a).execute(new Void[0]);
    }

    @Override // da.g
    public void onClosedRefuse() {
        this.f78106a.onBackPressed();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }
}
