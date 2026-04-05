package hj;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import bj.b1;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        t.logd("Created activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        t.logd("Destroyed activity: ".concat(activity.getClass().getName()));
    }

    public void onActivityPaused(Activity activity) {
        t.logd("Pausing activity: ".concat(activity.getClass().getName()));
    }

    public void onActivityResumed(Activity activity) {
        t.logd("Resumed activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        t.logd("SavedInstance activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        t.logd("Started activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t.logd("Stopped activity: ".concat(activity.getClass().getName()));
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(rj.o oVar, b1 b1Var) {
    }
}
