package io.bidmachine.media3.ui;

import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import io.bidmachine.media3.ui.k;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f61864k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(kVar);
        this.f61864k = kVar;
    }

    @Override // io.bidmachine.media3.ui.n
    public void init(List<k.e> list) {
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
        k kVar = this.f61864k;
        ImageView imageView = kVar.f61816y;
        if (imageView != null) {
            imageView.setImageDrawable(z10 ? kVar.f61775d0 : kVar.f61777e0);
            kVar.f61816y.setContentDescription(z10 ? kVar.f61779f0 : kVar.f61781g0);
        }
        this.f61865i = list;
    }

    @Override // io.bidmachine.media3.ui.n
    public void onBindViewHolderAtZeroPosition(k.d dVar) {
        boolean z10;
        dVar.f61832c.setText(R.string.exo_track_selection_none);
        int i10 = 0;
        while (true) {
            if (i10 >= this.f61865i.size()) {
                z10 = true;
                break;
            } else {
                if (((k.e) this.f61865i.get(i10)).isSelected()) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        dVar.f61833d.setVisibility(z10 ? 0 : 4);
        dVar.itemView.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 24));
    }

    @Override // io.bidmachine.media3.ui.n, androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(k.d dVar, int i10) {
        super.onBindViewHolder(dVar, i10);
        if (i10 > 0) {
            dVar.f61833d.setVisibility(((k.e) this.f61865i.get(i10 + (-1))).isSelected() ? 0 : 4);
        }
    }

    @Override // io.bidmachine.media3.ui.n
    public void onTrackSelection(String str) {
    }
}
