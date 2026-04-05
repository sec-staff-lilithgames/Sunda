package io.bidmachine.iab.vast.activity;

import android.view.View;
import java.util.Iterator;
import um.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f60477b;

    public e(VastView vastView) {
        this.f60477b = vastView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VastView vastView = this.f60477b;
        if (vastView.isPlaybackStarted() || vastView.f60453w.f60466l) {
            Iterator it = vastView.Q.iterator();
            while (it.hasNext()) {
                ((s) it.next()).toggleShow();
            }
        }
    }
}
