package mm;

import android.content.Context;
import android.util.AttributeSet;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.ViewAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h extends AdView {
    public h(Context context) {
        super(context);
    }

    @Override // io.bidmachine.AdView
    public final ViewAd createAd(Context context) {
        return new a(context, AdsType.Banner);
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
