package o9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.VoteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f78578a;

    public u(s sVar) {
        this.f78578a = sVar;
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onCloseConfirme() {
        s sVar = this.f78578a;
        Intent intent = new Intent(sVar.getActivity(), (Class<?>) VoteActivity.class);
        intent.putExtra("didac", true);
        sVar.requireActivity().startActivity(intent);
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
