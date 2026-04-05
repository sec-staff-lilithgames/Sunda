package s4;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import s4.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f85392c;

    public /* synthetic */ g0(i0 i0Var, int i10) {
        this.f85391b = i10;
        this.f85392c = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f85391b) {
            case 0:
                i0 i0Var = this.f85392c;
                synchronized (i0Var.f85400d) {
                    try {
                        if (i0Var.f85405i == null) {
                            return;
                        }
                        try {
                            u3.o oVarC = i0Var.c();
                            int resultCode = oVarC.getResultCode();
                            if (resultCode == 2) {
                                synchronized (i0Var.f85400d) {
                                    try {
                                        f0.b bVar = i0Var.f85404h;
                                        if (bVar != null) {
                                            long retryDelay = bVar.getRetryDelay();
                                            if (retryDelay >= 0) {
                                                i0Var.d(oVarC.getUri(), retryDelay);
                                                return;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            if (resultCode != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                            }
                            try {
                                t3.u.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Typeface typefaceBuildTypeface = i0Var.f85399c.buildTypeface(i0Var.f85397a, oVarC);
                                ByteBuffer byteBufferMmap = o3.u.mmap(i0Var.f85397a, null, oVarC.getUri());
                                if (byteBufferMmap == null || typefaceBuildTypeface == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                o0 o0VarCreate = o0.create(typefaceBuildTypeface, byteBufferMmap);
                                t3.u.endSection();
                                synchronized (i0Var.f85400d) {
                                    try {
                                        q qVar = i0Var.f85405i;
                                        if (qVar != null) {
                                            qVar.onLoaded(o0VarCreate);
                                        }
                                    } finally {
                                    }
                                }
                                i0Var.a();
                                return;
                            } catch (Throwable th2) {
                                t3.u.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (i0Var.f85400d) {
                                try {
                                    q qVar2 = i0Var.f85405i;
                                    if (qVar2 != null) {
                                        qVar2.onFailed(th3);
                                    }
                                    i0Var.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            default:
                this.f85392c.b();
                return;
        }
    }
}
