package x3;

import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x3 extends w3 {
    @Override // x3.b4
    public boolean isAppearanceLightNavigationBars() {
        return (this.f91702a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // x3.b4
    public void setAppearanceLightNavigationBars(boolean z10) {
        if (!z10) {
            i(16);
            return;
        }
        Window window = this.f91702a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        h(16);
    }
}
