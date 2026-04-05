package i8;

import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ApsAsyncUtil.ApsReturnRunnable, ApsAsyncUtil.ApsExecutionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApsAd f59431b;

    public /* synthetic */ a(ApsAd apsAd) {
        this.f59431b = apsAd;
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsExecutionListener
    public void onExecutionCompleted(ApsResult apsResult, Object obj) {
        ApsUtils.Companion.fireAAXImpressionPixel$lambda$2(this.f59431b, apsResult, (Boolean) obj);
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
    public Object run() {
        return ApsUtils.Companion.fireAAXImpressionPixel$lambda$1(this.f59431b);
    }
}
