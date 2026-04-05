package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6828f = resultReceiver;
    }

    @Override // androidx.media.w
    public final void b(Bundle bundle) {
        this.f6828f.send(-1, bundle);
    }

    @Override // androidx.media.w
    public final void c(Bundle bundle) {
        this.f6828f.send(1, bundle);
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        this.f6828f.send(0, (Bundle) obj);
    }
}
