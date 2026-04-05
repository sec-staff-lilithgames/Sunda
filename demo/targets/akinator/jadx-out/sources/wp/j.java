package wp;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final i f90790b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90791c;

    /* renamed from: e, reason: collision with root package name */
    public final File f90792e;

    /* renamed from: f, reason: collision with root package name */
    public final h f90793f = new h(this, Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public final boolean f90794g;

    public j(Context context, i iVar, String str) {
        if (str == null || !nm.j.canUseExternalFilesDir()) {
            iVar.onVideoLoadingError(this);
            return;
        }
        this.f90790b = iVar;
        this.f90791c = str;
        if (!nm.j.canUseExternalFilesDir()) {
            iVar.onVideoLoadingError(this);
        } else {
            this.f90792e = nm.j.getCacheDir(context, "native_video");
            this.f90794g = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        boolean z10 = this.f90794g;
        h hVar = this.f90793f;
        if (!z10) {
            if (hVar != null) {
                hVar.sendEmptyMessage(0);
                return;
            }
            return;
        }
        File fileH = jh.i.h(this.f90792e, this.f90791c);
        if (fileH != null) {
            if (hVar != null) {
                hVar.sendMessage(hVar.obtainMessage(1, Uri.fromFile(fileH)));
            }
        } else if (hVar != null) {
            hVar.sendEmptyMessage(0);
        }
    }
}
