package g9;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f57459g = new Handler(Looper.getMainLooper(), new k());

    /* renamed from: f, reason: collision with root package name */
    public final u f57460f;

    public l(u uVar, int i10, int i11) {
        super(i10, i11);
        this.f57460f = uVar;
    }

    public static <Z> l obtain(u uVar, int i10, int i11) {
        return new l(uVar, i10, i11);
    }

    @Override // g9.c, g9.n
    public void onResourceReady(Object obj, h9.c cVar) {
        f9.e request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f57459g.obtainMessage(1, this).sendToTarget();
    }

    @Override // g9.c, g9.n
    public void onLoadCleared(Drawable drawable) {
    }
}
