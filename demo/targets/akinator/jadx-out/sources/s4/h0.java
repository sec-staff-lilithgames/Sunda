package s4;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f85394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Handler handler) {
        super(handler);
        this.f85394a = i0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        this.f85394a.b();
    }
}
