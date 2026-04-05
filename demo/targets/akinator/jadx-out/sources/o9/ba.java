package o9;

import com.digidust.elokence.akinator.activities.VoteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ba implements ja.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VoteActivity f78052a;

    public ba(VoteActivity voteActivity) {
        this.f78052a = voteActivity;
    }

    @Override // ja.e
    public void cardSwipedBottom(int i10) {
        VoteActivity voteActivity = this.f78052a;
        if (voteActivity.E) {
            return;
        }
        VoteActivity.t(voteActivity, 2, i10);
    }

    @Override // ja.e
    public void cardSwipedLeft(int i10) {
        VoteActivity voteActivity = this.f78052a;
        if (voteActivity.E) {
            return;
        }
        VoteActivity.t(voteActivity, 0, i10);
    }

    @Override // ja.e
    public void cardSwipedRight(int i10) {
        VoteActivity voteActivity = this.f78052a;
        if (voteActivity.E) {
            return;
        }
        VoteActivity.t(voteActivity, 1, i10);
    }

    @Override // ja.e
    public boolean isDragEnabled() {
        return this.f78052a.K;
    }

    @Override // ja.e
    public void cardActionDown() {
    }

    @Override // ja.e
    public void cardActionUp() {
    }

    @Override // ja.e
    public void cardsDepleted() {
    }
}
