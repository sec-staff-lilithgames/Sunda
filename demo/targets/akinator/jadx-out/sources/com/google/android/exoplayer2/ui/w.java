package com.google.android.exoplayer2.ui;

import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.ui.u;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends y {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f28398k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar) {
        super(uVar);
        this.f28398k = uVar;
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void init(List<u.e> list) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            if (list.get(i10).isSelected()) {
                z10 = true;
                break;
            }
            i10++;
        }
        u uVar = this.f28398k;
        ImageView imageView = uVar.f28376y;
        if (imageView != null) {
            imageView.setImageDrawable(z10 ? uVar.f28332b0 : uVar.f28334c0);
            uVar.f28376y.setContentDescription(z10 ? uVar.f28335d0 : uVar.f28337e0);
        }
        this.f28405i = list;
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void onBindViewHolderAtZeroPosition(u.d dVar) {
        boolean z10;
        dVar.f28391c.setText(R.string.exo_track_selection_none);
        int i10 = 0;
        while (true) {
            if (i10 >= this.f28405i.size()) {
                z10 = true;
                break;
            } else {
                if (((u.e) this.f28405i.get(i10)).isSelected()) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        dVar.f28392d.setVisibility(z10 ? 0 : 4);
        dVar.itemView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 4));
    }

    @Override // com.google.android.exoplayer2.ui.y, androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(u.d dVar, int i10) {
        super.onBindViewHolder(dVar, i10);
        if (i10 > 0) {
            dVar.f28392d.setVisibility(((u.e) this.f28405i.get(i10 + (-1))).isSelected() ? 0 : 4);
        }
    }

    @Override // com.google.android.exoplayer2.ui.y
    public void onTrackSelection(String str) {
    }
}
