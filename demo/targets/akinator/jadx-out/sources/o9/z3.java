package o9;

import android.graphics.Bitmap;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements da.p, mt.r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78712c;

    public /* synthetic */ z3(OneCharacterProposalActivity oneCharacterProposalActivity, int i10) {
        this.f78711b = i10;
        this.f78712c = oneCharacterProposalActivity;
    }

    @Override // da.p
    public void onClose() {
        int i10 = this.f78711b;
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78712c;
        switch (i10) {
            case 0:
                int i11 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.t();
                break;
            case 1:
                int i12 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.x();
                break;
            case 2:
                int i13 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.u();
                break;
            default:
                int i14 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.w();
                break;
        }
    }

    @Override // mt.r0
    public void subscribe(mt.p0 p0Var) throws IOException {
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78712c;
        Bitmap bitmapDownloadPicture = kb.e.downloadPicture(oneCharacterProposalActivity.E.getPicturePath(), ca.m.sharedInstance().canDownloadPicture());
        pt.c cVar = oneCharacterProposalActivity.H;
        if (cVar == null || cVar.isDisposed()) {
            return;
        }
        if (bitmapDownloadPicture != null) {
            ((du.g) p0Var).onSuccess(bitmapDownloadPicture);
        } else {
            ((du.g) p0Var).onError(new NullPointerException());
        }
    }
}
