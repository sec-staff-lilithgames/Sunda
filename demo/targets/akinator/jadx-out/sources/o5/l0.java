package o5;

import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f77645a;

    public l0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f77645a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(s callback, Object cookie) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(cookie, "cookie");
        this.f77645a.getClientNames$room_runtime_release().remove((Integer) cookie);
    }
}
