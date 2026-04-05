package com.google.android.exoplayer2.ui;

import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.ui.u;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends y {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f28324k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar) {
        super(uVar);
        this.f28324k = uVar;
    }

    public final boolean a(pf.s sVar) {
        for (int i10 = 0; i10 < this.f28405i.size(); i10++) {
            if (sVar.A.containsKey(((u.e) this.f28405i.get(i10)).f28393a.getMediaTrackGroup())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void init(List<u.e> list) {
        this.f28405i = list;
        u uVar = this.f28324k;
        pf.s trackSelectionParameters = ((r2) com.google.android.exoplayer2.util.a.checkNotNull(uVar.f28347j0)).getTrackSelectionParameters();
        if (list.isEmpty()) {
            uVar.f28342h.setSubTextAtPosition(1, uVar.getResources().getString(R.string.exo_track_selection_none));
            return;
        }
        if (!a(trackSelectionParameters)) {
            uVar.f28342h.setSubTextAtPosition(1, uVar.getResources().getString(R.string.exo_track_selection_auto));
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            u.e eVar = list.get(i10);
            if (eVar.isSelected()) {
                uVar.f28342h.setSubTextAtPosition(1, eVar.f28395c);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void onBindViewHolderAtZeroPosition(u.d dVar) {
        dVar.f28391c.setText(R.string.exo_track_selection_auto);
        dVar.f28392d.setVisibility(a(((r2) com.google.android.exoplayer2.util.a.checkNotNull(this.f28324k.f28347j0)).getTrackSelectionParameters()) ? 4 : 0);
        dVar.itemView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 2));
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void onTrackSelection(String str) {
        this.f28324k.f28342h.setSubTextAtPosition(1, str);
    }
}
