package bg;

import com.google.android.material.button.MaterialButton;
import r4.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends a0 {
    @Override // r4.a0
    public float getValue(MaterialButton materialButton) {
        return materialButton.getDisplayedWidthIncrease();
    }

    @Override // r4.a0
    public void setValue(MaterialButton materialButton, float f10) {
        materialButton.setDisplayedWidthIncrease(f10);
    }
}
