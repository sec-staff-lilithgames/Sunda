package xl;

import android.content.Context;
import br.h0;
import br.p1;
import br.z;
import er.a;
import io.bidmachine.i2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements bq.f {

    /* renamed from: a, reason: collision with root package name */
    public final hr.i f92030a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f92031b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f92032c;

    public f(Context context, hr.i callback) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(callback, "callback");
        this.f92030a = callback;
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f92031b = applicationContext;
    }

    @Override // bq.f, aq.a
    public void onAdAppeared(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // bq.f, aq.a
    public void onAdDisappeared(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // bq.f, aq.a
    public void onAdClicked(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.f92030a.onAdClicked();
    }

    @Override // bq.f, aq.a
    public void onAdExpired(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.f92030a.onAdExpired();
    }

    @Override // bq.f, aq.a
    public void onAdFailToLoad(bq.e fullScreenAd, h0 error) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        e0.checkNotNullParameter(error, "error");
        pr.a NoFill = pr.a.f81798p;
        e0.checkNotNullExpressionValue(NoFill, "NoFill");
        this.f92030a.onAdLoadFailed(b.toBMError(error, NoFill));
    }

    @Override // bq.f, aq.a
    public void onAdFailToShow(bq.e fullScreenAd, h0 error) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        e0.checkNotNullParameter(error, "error");
        pr.a InternalUnknownError = pr.a.f81799q;
        e0.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        this.f92030a.onAdShowFailed(b.toBMError(error, InternalUnknownError));
    }

    @Override // bq.f, aq.a
    public void onAdFinished(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        if (this.f92032c) {
            ((i2) this.f92030a).onAdFinished();
        }
        ((i2) this.f92030a).onAdClosed();
    }

    @Override // bq.f, aq.a
    public void onAdLoaded(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        ((i2) this.f92030a).onAdLoaded();
    }

    @Override // bq.f, aq.a
    public void onAdShown(bq.e fullScreenAd) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.f92032c = true;
        this.f92030a.onAdShown();
    }

    @Override // bq.f, aq.a
    public void onBrokenCreativeEvent(bq.e fullScreenAd, z brokenCreativeEvent) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        e0.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.f92030a.onBrokenCreativeEvent(b.toEventParams(brokenCreativeEvent));
    }

    @Override // bq.f, aq.a
    public void onOpenPrivacySheet(bq.e fullScreenAd, p1 privacySheetParams) {
        e0.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        a.C0558a c0558a = er.a.f55004e;
        Context contextFindDialogContext = nm.j.findDialogContext(this.f92031b);
        e0.checkNotNullExpressionValue(contextFindDialogContext, "findDialogContext(applicationContext)");
        c0558a.show(contextFindDialogContext, privacySheetParams);
    }
}
