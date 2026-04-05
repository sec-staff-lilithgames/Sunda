package o9;

import com.digidust.elokence.akinator.activities.AkActivity;
import com.sfbx.appconsentv3.AppConsent;
import com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener;
import com.sfbx.appconsentv3.ui.model.ACConsentableType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements OnPresentNoticeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AkActivity f78130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppConsent f78131b;

    public f(AkActivity akActivity, AppConsent appConsent) {
        this.f78130a = akActivity;
        this.f78131b = appConsent;
    }

    @Override // com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener
    public void presentConsentError(Throwable th2) {
        Timber.Forest.tag("RGPD").d("NoticeCallback error", new Object[0]);
        AkActivity akActivity = this.f78130a;
        akActivity.f21695r = true;
        jb.h.f69257d.sharedInstance().createOrUpdateMetricValeur("consentement_optin", "");
        akActivity.getMGeneralProcessing().onConsentInformedViaCMP(false, false);
        akActivity.n();
    }

    @Override // com.sfbx.appconsentv3.ui.listener.OnPresentNoticeListener
    public void presentConsentGiven() {
        Timber.Forest.tag("RGPD").d("NoticeCallback consent", new Object[0]);
        AkActivity akActivity = this.f78130a;
        akActivity.f21695r = true;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRANCE);
        jb.h hVarSharedInstance = jb.h.f69257d.sharedInstance();
        String str = simpleDateFormat.format(calendar.getTime());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(...)");
        hVarSharedInstance.createOrUpdateMetricValeur("consentement_optin", str);
        akActivity.getMGeneralProcessing().onConsentInformedViaCMP(true, this.f78131b.consentableAllowed(19, ACConsentableType.PURPOSE));
        akActivity.n();
    }
}
