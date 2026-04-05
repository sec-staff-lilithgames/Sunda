package xl;

import android.content.Context;
import br.h0;
import br.p1;
import br.z;
import er.a;
import io.bidmachine.i4;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements cq.f {

    /* renamed from: a, reason: collision with root package name */
    public final hr.f f92028a;

    public d(hr.f callback) {
        e0.checkNotNullParameter(callback, "callback");
        this.f92028a = callback;
    }

    @Override // cq.f, aq.a
    public void onAdAppeared(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
    }

    @Override // cq.f, aq.a
    public void onAdDisappeared(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
    }

    @Override // cq.f, aq.a
    public void onAdFinished(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
    }

    @Override // cq.f, aq.a
    public void onAdClicked(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
        this.f92028a.onAdClicked();
    }

    @Override // cq.f, aq.a
    public void onAdExpired(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
        this.f92028a.onAdExpired();
    }

    @Override // cq.f, aq.a
    public void onAdFailToLoad(cq.e adView, h0 error) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(error, "error");
        pr.a NoFill = pr.a.f81798p;
        e0.checkNotNullExpressionValue(NoFill, "NoFill");
        this.f92028a.onAdLoadFailed(b.toBMError(error, NoFill));
    }

    @Override // cq.f, aq.a
    public void onAdFailToShow(cq.e adView, h0 error) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(error, "error");
        pr.a InternalUnknownError = pr.a.f81799q;
        e0.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        this.f92028a.onAdShowFailed(b.toBMError(error, InternalUnknownError));
    }

    @Override // cq.f, aq.a
    public void onAdLoaded(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
        ((i4) this.f92028a).onAdLoaded(adView);
    }

    @Override // cq.f, aq.a
    public void onAdShown(cq.e adView) {
        e0.checkNotNullParameter(adView, "adView");
        this.f92028a.onAdShown();
    }

    @Override // cq.f, aq.a
    public void onBrokenCreativeEvent(cq.e adView, z brokenCreativeEvent) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.f92028a.onBrokenCreativeEvent(b.toEventParams(brokenCreativeEvent));
    }

    @Override // cq.f, aq.a
    public void onOpenPrivacySheet(cq.e adView, p1 privacySheetParams) {
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        a.C0558a c0558a = er.a.f55004e;
        Context contextFindDialogContext = nm.j.findDialogContext(adView.getContext(), adView);
        e0.checkNotNullExpressionValue(contextFindDialogContext, "findDialogContext(adView.context, adView)");
        c0558a.show(contextFindDialogContext, privacySheetParams);
    }
}
