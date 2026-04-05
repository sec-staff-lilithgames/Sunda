package k3;

import android.content.Intent;
import androidx.core.app.JobIntentService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f70251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JobIntentService f70253c;

    public s(JobIntentService jobIntentService, Intent intent, int i10) {
        this.f70253c = jobIntentService;
        this.f70251a = intent;
        this.f70252b = i10;
    }

    @Override // k3.t
    public void complete() {
        this.f70253c.stopSelf(this.f70252b);
    }

    @Override // k3.t
    public Intent getIntent() {
        return this.f70251a;
    }
}
