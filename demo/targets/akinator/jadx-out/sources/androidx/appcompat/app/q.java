package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.inmobi.media.C2724cf;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4822c;

    public /* synthetic */ q(Context context, int i10) {
        this.f4821b = i10;
        this.f4822c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4821b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = this.f4822c;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (v.getApplicationLocales().isEmpty()) {
                            String locales = k3.n.readLocales(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                s.b(systemService, r.a(locales));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                v.f4879h = true;
                break;
            case 1:
                v.e(this.f4822c);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new q(this.f4822c, 3));
                break;
            case 3:
                n5.g.writeProfile(this.f4822c);
                break;
            case 4:
                C2724cf.b(this.f4822c);
                break;
            default:
                C2724cf.d(this.f4822c);
                break;
        }
    }
}
