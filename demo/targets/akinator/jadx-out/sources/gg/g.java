package gg;

import com.google.android.material.chip.ChipGroup;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements qg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f57681a;

    public g(ChipGroup chipGroup) {
        this.f57681a = chipGroup;
    }

    @Override // qg.b
    public void onCheckedStateChanged(Set<Integer> set) {
        ChipGroup chipGroup = this.f57681a;
        j jVar = chipGroup.f29126i;
        if (jVar != null) {
            ((h) jVar).onCheckedChanged(chipGroup, chipGroup.f29127j.getCheckedIdsSortedByChildOrder(chipGroup));
        }
    }
}
