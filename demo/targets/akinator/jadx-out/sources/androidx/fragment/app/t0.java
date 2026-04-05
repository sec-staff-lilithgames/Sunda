package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f6460b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6461c;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f6462e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6463f;

    /* renamed from: g, reason: collision with root package name */
    public final t1 f6464g;

    public t0(Context context, Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
    }

    public Handler getHandler() {
        return this.f6462e;
    }

    @Override // androidx.fragment.app.p0
    public View onFindViewById(int i10) {
        return null;
    }

    public abstract Object onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        return LayoutInflater.from(this.f6461c);
    }

    public int onGetWindowAnimations() {
        return this.f6463f;
    }

    @Override // androidx.fragment.app.p0
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String str) {
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        onStartActivityFromFragment(fragment, intent, i10, null);
    }

    @Deprecated
    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        k3.f.startIntentSenderForResult(this.f6460b, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public t0(Activity activity, Context context, Handler handler, int i10) {
        this.f6464g = new t1();
        this.f6460b = activity;
        this.f6461c = (Context) w3.i.checkNotNull(context, "context == null");
        this.f6462e = (Handler) w3.i.checkNotNull(handler, "handler == null");
        this.f6463f = i10;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        m3.a.startActivity(this.f6461c, intent, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    @Deprecated
    public void onRequestPermissionsFromFragment(Fragment fragment, String[] strArr, int i10) {
    }

    public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
