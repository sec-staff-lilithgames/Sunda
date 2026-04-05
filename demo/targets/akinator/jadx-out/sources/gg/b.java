package gg;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends ug.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f57652a;

    public b(Chip chip) {
        this.f57652a = chip;
    }

    @Override // ug.i
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        Chip chip = this.f57652a;
        f fVar = chip.f29105g;
        chip.setText(fVar.P0 ? fVar.getText() : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // ug.i
    public void onFontRetrievalFailed(int i10) {
    }
}
