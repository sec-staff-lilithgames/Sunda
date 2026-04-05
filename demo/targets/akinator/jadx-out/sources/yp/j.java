package yp;

import android.graphics.Rect;
import com.google.android.exoplayer2.j0;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f94761b;

    public j(k kVar) {
        this.f94761b = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (this.f94761b.f94781v) {
                this.f94761b.b();
                return;
            }
            k kVar = this.f94761b;
            if (!(kVar.getGlobalVisibleRect(new Rect()) && kVar.isShown() && kVar.hasWindowFocus())) {
                nm.j.onUiThread(new h(this));
                return;
            }
            try {
                if (this.f94761b.d() && !this.f94761b.f94781v && this.f94761b.f94770k.isPlaying()) {
                    k kVar2 = this.f94761b;
                    if (kVar2.f94783x == 0) {
                        kVar2.f94783x = kVar2.f94770k.getDuration();
                    }
                    k kVar3 = this.f94761b;
                    if (kVar3.f94783x != 0) {
                        int currentPosition = kVar3.f94770k.getCurrentPosition() * 100;
                        k kVar4 = this.f94761b;
                        int i10 = currentPosition / kVar4.f94783x;
                        int i11 = kVar4.f94784y;
                        if (i10 >= i11 * 25) {
                            if (i11 == 0) {
                                nm.a.d(new j0(i10, 7));
                                this.f94761b.h(io.bidmachine.iab.vast.a.f60391c);
                            } else if (i11 == 1) {
                                nm.a.d(new j0(i10, 8));
                                this.f94761b.h(io.bidmachine.iab.vast.a.f60392e);
                            } else if (i11 == 2) {
                                nm.a.d(new j0(i10, 9));
                                this.f94761b.h(io.bidmachine.iab.vast.a.f60393f);
                            } else if (i11 == 3) {
                                nm.a.d(new j0(i10, 10));
                                this.f94761b.h(io.bidmachine.iab.vast.a.f60394g);
                            }
                            this.f94761b.f94784y++;
                        }
                    }
                }
                nm.a.d("MediaView is on screen");
                nm.j.onUiThread(new i(this));
            } catch (IllegalStateException unused) {
                this.f94761b.b();
            }
        } catch (Throwable unused2) {
            k kVar5 = this.f94761b;
            k kVar6 = k.D;
            kVar5.b();
        }
    }
}
