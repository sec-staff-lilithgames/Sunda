package io.bidmachine.media3.ui;

import com.digidust.elokence.akinator.freemium.R;
import gn.a2;
import gn.i1;
import io.bidmachine.media3.ui.k;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f61758k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(kVar);
        this.f61758k = kVar;
    }

    public final boolean a(a2 a2Var) {
        for (int i10 = 0; i10 < this.f61865i.size(); i10++) {
            if (a2Var.D.containsKey(((k.e) this.f61865i.get(i10)).f61834a.getMediaTrackGroup())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.ui.n
    public void init(List<k.e> list) {
        this.f61865i = list;
        k kVar = this.f61758k;
        a2 trackSelectionParameters = ((i1) io.bidmachine.media3.common.util.a.checkNotNull(kVar.f61791l0)).getTrackSelectionParameters();
        if (list.isEmpty()) {
            kVar.f61782h.setSubTextAtPosition(1, kVar.getResources().getString(R.string.exo_track_selection_none));
            return;
        }
        if (!a(trackSelectionParameters)) {
            kVar.f61782h.setSubTextAtPosition(1, kVar.getResources().getString(R.string.exo_track_selection_auto));
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            k.e eVar = list.get(i10);
            if (eVar.isSelected()) {
                kVar.f61782h.setSubTextAtPosition(1, eVar.f61836c);
                return;
            }
        }
    }

    @Override // io.bidmachine.media3.ui.n
    public void onBindViewHolderAtZeroPosition(k.d dVar) {
        dVar.f61832c.setText(R.string.exo_track_selection_auto);
        dVar.f61833d.setVisibility(a(((i1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61758k.f61791l0)).getTrackSelectionParameters()) ? 4 : 0);
        dVar.itemView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 22));
    }

    @Override // io.bidmachine.media3.ui.n
    public void onTrackSelection(String str) {
        this.f61758k.f61782h.setSubTextAtPosition(1, str);
    }
}
