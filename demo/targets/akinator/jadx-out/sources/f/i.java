package f;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.b1;
import androidx.lifecycle.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f55228b;

    public i(ComponentActivity componentActivity) {
        this.f55228b = componentActivity;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, androidx.lifecycle.i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        ComponentActivity componentActivity = this.f55228b;
        ComponentActivity.access$ensureViewModelStore(componentActivity);
        componentActivity.getLifecycle().removeObserver(this);
    }
}
