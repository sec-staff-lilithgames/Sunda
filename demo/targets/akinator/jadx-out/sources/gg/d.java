package gg;

import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.Button;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d extends i4.d {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f57654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f57654q = chip;
    }

    @Override // i4.d
    public final int c(float f10, float f11) {
        Rect rect = Chip.f29104z;
        Chip chip = this.f57654q;
        return (chip.c() && chip.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
    }

    @Override // i4.d
    public final void d(ArrayList arrayList) {
        arrayList.add(0);
        Rect rect = Chip.f29104z;
        Chip chip = this.f57654q;
        if (chip.c() && chip.isCloseIconVisible() && chip.f29108j != null) {
            arrayList.add(1);
        }
    }

    @Override // i4.d
    public final boolean g(int i10, int i11) {
        if (i11 != 16) {
            return false;
        }
        Chip chip = this.f57654q;
        if (i10 == 0) {
            return chip.performClick();
        }
        if (i10 == 1) {
            return chip.performCloseIconClick();
        }
        return false;
    }

    @Override // i4.d
    public final void h(y3.c cVar) {
        Chip chip = this.f57654q;
        cVar.setCheckable(chip.isCheckable());
        cVar.setClickable(chip.isClickable());
        cVar.setClassName(chip.getAccessibilityClassName());
        cVar.setText(chip.getText());
    }

    @Override // i4.d
    public final void i(int i10, y3.c cVar) {
        if (i10 != 1) {
            cVar.setContentDescription("");
            cVar.setBoundsInParent(Chip.f29104z);
            return;
        }
        Chip chip = this.f57654q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            cVar.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            cVar.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        cVar.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        cVar.addAction(c.a.f94039g);
        cVar.setEnabled(chip.isEnabled());
        cVar.setClassName(Button.class.getName());
    }

    @Override // i4.d
    public final void j(int i10, boolean z10) {
        Chip chip = this.f57654q;
        if (i10 == 1) {
            chip.f29114p = z10;
        }
        f fVar = chip.f29105g;
        boolean z11 = chip.f29114p;
        boolean closeIconState = false;
        if (fVar.X != null) {
            closeIconState = fVar.setCloseIconState(z11 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.S0);
        }
        if (closeIconState) {
            chip.refreshDrawableState();
        }
    }
}
