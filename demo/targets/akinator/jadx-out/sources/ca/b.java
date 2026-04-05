package ca;

import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.io.IOException;
import java.lang.Thread;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import nj.j0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11941b;

    public /* synthetic */ b(int i10) {
        this.f11941b = i10;
    }

    @Override // st.g
    public final void accept(Object obj) {
        switch (this.f11941b) {
            case 0:
                Throwable cause = (Throwable) obj;
                AkApplication.a aVar = AkApplication.f21719f;
                if (cause instanceof qt.h) {
                    cause = ((qt.h) cause).getCause();
                }
                if (!(cause instanceof IOException) && !(cause instanceof InterruptedException)) {
                    if (!(cause instanceof NullPointerException) && !(cause instanceof IllegalArgumentException)) {
                        if (!(cause instanceof IllegalStateException)) {
                            Timber.Forest.tag("AkApplication").e(cause, "Undeliverable exception received, not sure what to do", new Object[0]);
                            break;
                        } else {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
                            e0.checkNotNull(uncaughtExceptionHandler);
                            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), cause);
                            break;
                        }
                    } else {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = Thread.currentThread().getUncaughtExceptionHandler();
                        e0.checkNotNull(uncaughtExceptionHandler2);
                        uncaughtExceptionHandler2.uncaughtException(Thread.currentThread(), cause);
                        break;
                    }
                }
                break;
            case 1:
                j0.loge("Impression store write failure");
                break;
            case 2:
                j0.loge("Rate limiter client write failure");
                break;
            case 3:
                j0.logd("Event Triggered: " + ((String) obj));
                break;
            case 4:
                j0.logi("App foreground rate limited ? : " + ((Boolean) obj));
                break;
            case 5:
                Locale locale = Locale.US;
                j0.logi("Successfully fetched " + ((FetchEligibleCampaignsResponse) obj).getMessagesList().size() + " messages from backend");
                break;
            case 6:
                j0.logw("Service fetch error: " + ((Throwable) obj).getMessage());
                break;
            case 7:
                j0.logw("Cache write error: " + ((Throwable) obj).getMessage());
                break;
            case 8:
                j0.logw("Impression store read fail: " + ((Throwable) obj).getMessage());
                break;
            case 9:
                j0.logd("Fetched from cache");
                break;
            case 10:
                j0.logw("Cache read error: " + ((Throwable) obj).getMessage());
                break;
            case 11:
                j0.logw("Impressions store read fail: " + ((Throwable) obj).getMessage());
                break;
            case 12:
                int[] iArr = DefiDuJourActivity.P;
                ((Integer) obj).intValue();
                break;
            case 13:
                ((Integer) obj).intValue();
                break;
            default:
                String[] strArr = StoreItemsActivity.U;
                ((Integer) obj).intValue();
                break;
        }
    }
}
