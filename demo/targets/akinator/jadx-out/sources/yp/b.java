package yp;

import android.view.View;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import vp.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f94753b;

    public b(k kVar) {
        this.f94753b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IllegalStateException {
        k kVar = this.f94753b;
        r rVar = kVar.f94763c;
        if (rVar == null || ((vp.l) rVar).getVideoUri() == null) {
            return;
        }
        nm.a.d("Video has been clicked");
        k.D = kVar;
        kVar.f94782w = true;
        int currentPosition = (kVar.d() && kVar.f94770k.isPlaying()) ? kVar.f94770k.getCurrentPosition() : 0;
        kVar.f();
        nm.j.startActivity(kVar.getContext(), VideoPlayerActivity.getIntent(kVar.getContext(), ((vp.l) kVar.f94763c).getVideoUri().getPath(), currentPosition));
    }
}
