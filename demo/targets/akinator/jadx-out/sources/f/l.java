package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import j.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends i.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f55236i;

    public l(ComponentActivity componentActivity) {
        this.f55236i = componentActivity;
    }

    @Override // i.g
    public <I, O> void onLaunch(int i10, j.a contract, I i11, k3.h hVar) {
        Bundle bundle;
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(contract, "contract");
        ComponentActivity componentActivity = this.f55236i;
        a.C0708a synchronousResult = contract.getSynchronousResult(componentActivity, i11);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new androidx.browser.customtabs.h(this, i10, synchronousResult, 6));
            return;
        }
        Intent intentCreateIntent = contract.createIntent(componentActivity, i11);
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            kotlin.jvm.internal.e0.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = hVar != null ? hVar.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if (kotlin.jvm.internal.e0.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            k3.f.requestPermissions(componentActivity, stringArrayExtra, i10);
            return;
        }
        if (!kotlin.jvm.internal.e0.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
            k3.f.startActivityForResult(componentActivity, intentCreateIntent, i10, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.e0.checkNotNull(intentSenderRequest);
            i12 = i10;
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i12 = i10;
        }
        try {
            k3.f.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i12, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            new Handler(Looper.getMainLooper()).post(new androidx.browser.customtabs.h(this, i12, e, 7));
        }
    }
}
