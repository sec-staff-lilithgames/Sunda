package kotlinx.coroutines.android;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.app.q;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import kotlinx.coroutines.CancellableContinuation;
import n5.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71871c;

    public /* synthetic */ a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f71870b = 1;
        this.f71871c = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.f71870b) {
            case 0:
                HandlerDispatcherKt.postFrameCallback$lambda$5((CancellableContinuation) this.f71871c, j10);
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? h.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q((Context) this.f71871c, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.f71871c).run();
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.f71870b = i10;
        this.f71871c = obj;
    }
}
