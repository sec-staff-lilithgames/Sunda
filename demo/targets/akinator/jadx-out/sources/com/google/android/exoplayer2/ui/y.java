package com.google.android.exoplayer2.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bf.m1;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.ui.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y extends RecyclerView.a {

    /* renamed from: i, reason: collision with root package name */
    public List f28405i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f28406j;

    public y(u uVar) {
        this.f28406j = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.f28405i.isEmpty()) {
            return 0;
        }
        return this.f28405i.size() + 1;
    }

    public abstract void init(List<u.e> list);

    public abstract void onBindViewHolderAtZeroPosition(u.d dVar);

    public abstract void onTrackSelection(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(u.d dVar, int i10) {
        r2 r2Var = this.f28406j.f28347j0;
        if (r2Var == null) {
            return;
        }
        if (i10 == 0) {
            onBindViewHolderAtZeroPosition(dVar);
            return;
        }
        u.e eVar = (u.e) this.f28405i.get(i10 - 1);
        m1 mediaTrackGroup = eVar.f28393a.getMediaTrackGroup();
        boolean z10 = r2Var.getTrackSelectionParameters().A.get(mediaTrackGroup) != null && eVar.isSelected();
        dVar.f28391c.setText(eVar.f28395c);
        dVar.f28392d.setVisibility(z10 ? 0 : 4);
        dVar.itemView.setOnClickListener(new x(0, this, r2Var, mediaTrackGroup, eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public u.d onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new u.d(LayoutInflater.from(this.f28406j.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
