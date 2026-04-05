package gg;

import com.google.android.material.chip.ChipGroup;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f57682a;

    public h(ChipGroup chipGroup) {
        this.f57682a = chipGroup;
    }

    @Override // gg.j
    public void onCheckedChanged(ChipGroup chipGroup, List<Integer> list) {
        ChipGroup chipGroup2 = this.f57682a;
        if (chipGroup2.f29127j.isSingleSelection()) {
            chipGroup2.getCheckedChipId();
            throw null;
        }
    }
}
