package ag;

import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.e f4410d;

    public j(com.google.android.material.bottomsheet.e eVar) {
        this.f4410d = eVar;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        if (!this.f4410d.f29031m) {
            cVar.setDismissable(false);
        } else {
            cVar.addAction(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            cVar.setDismissable(true);
        }
    }

    @Override // x3.b
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            com.google.android.material.bottomsheet.e eVar = this.f4410d;
            if (eVar.f29031m) {
                eVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
