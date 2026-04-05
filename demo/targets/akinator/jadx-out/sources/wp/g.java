package wp;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.t;
import java.io.File;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final e f90783b = new e(this, Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f90784c;

    /* renamed from: e, reason: collision with root package name */
    public final f f90785e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90786f;

    /* renamed from: g, reason: collision with root package name */
    public final File f90787g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90788h;

    public g(Context context, f fVar, String str) {
        if (str == null || !nm.j.canUseExternalFilesDir()) {
            fVar.onVideoLoadingError(this);
            return;
        }
        this.f90784c = new WeakReference(context);
        this.f90785e = fVar;
        this.f90786f = str;
        if (!nm.j.canUseExternalFilesDir()) {
            fVar.onVideoLoadingError(this);
        } else {
            this.f90787g = nm.j.getCacheDir(context, "native_video");
            this.f90788h = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        boolean z10 = this.f90788h;
        e eVar = this.f90783b;
        if (!z10) {
            if (eVar != null) {
                eVar.sendEmptyMessage(0);
                return;
            }
            return;
        }
        Context context = (Context) this.f90784c.get();
        if (context == null) {
            if (eVar != null) {
                eVar.sendEmptyMessage(0);
                return;
            }
            return;
        }
        try {
            t tVarBuild = t.newBuilder().setCacheControl(qm.a.f83289c).build();
            tVarBuild.loadVideoWithDataSync(context, this.f90786f, null);
            VastAd vastAd = tVarBuild.getVastAd();
            if (vastAd != null && vastAd.getPickedMediaFileTag().getType().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)")) {
                File fileH = jh.i.h(this.f90787g, vastAd.getPickedMediaFileTag().getText());
                if (fileH != null) {
                    if (eVar != null) {
                        eVar.sendMessage(eVar.obtainMessage(1, new Pair(Uri.fromFile(fileH), tVarBuild)));
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e10) {
            nm.a.w(e10);
        }
        if (eVar != null) {
            eVar.sendEmptyMessage(0);
        }
    }
}
