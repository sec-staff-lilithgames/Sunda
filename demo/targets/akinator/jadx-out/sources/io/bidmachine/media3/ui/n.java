package io.bidmachine.media3.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import gn.i1;
import gn.v1;
import io.bidmachine.media3.ui.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n extends RecyclerView.a {

    /* renamed from: i, reason: collision with root package name */
    public List f61865i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f61866j;

    public n(k kVar) {
        this.f61866j = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.f61865i.isEmpty()) {
            return 0;
        }
        return this.f61865i.size() + 1;
    }

    public abstract void init(List<k.e> list);

    public abstract void onBindViewHolderAtZeroPosition(k.d dVar);

    public abstract void onTrackSelection(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(k.d dVar, int i10) {
        i1 i1Var = this.f61866j.f61791l0;
        if (i1Var == null) {
            return;
        }
        if (i10 == 0) {
            onBindViewHolderAtZeroPosition(dVar);
            return;
        }
        k.e eVar = (k.e) this.f61865i.get(i10 - 1);
        v1 mediaTrackGroup = eVar.f61834a.getMediaTrackGroup();
        boolean z10 = i1Var.getTrackSelectionParameters().D.get(mediaTrackGroup) != null && eVar.isSelected();
        dVar.f61832c.setText(eVar.f61836c);
        dVar.f61833d.setVisibility(z10 ? 0 : 4);
        dVar.itemView.setOnClickListener(new com.google.android.exoplayer2.ui.x(2, this, i1Var, mediaTrackGroup, eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public k.d onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new k.d(LayoutInflater.from(this.f61866j.getContext()).inflate(R.layout.bm_exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
