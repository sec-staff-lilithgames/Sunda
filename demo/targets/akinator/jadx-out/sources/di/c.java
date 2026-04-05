package di;

import android.os.Bundle;
import ei.f;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements yh.b {

    /* renamed from: a, reason: collision with root package name */
    public fi.b f52341a;

    /* renamed from: b, reason: collision with root package name */
    public fi.b f52342b;

    @Override // yh.b
    public void onMessageTriggered(int i10, Bundle bundle) {
        String string;
        f logger = f.getLogger();
        Locale locale = Locale.US;
        logger.v("Analytics listener received message. ID: " + i10 + ", Extras: " + bundle);
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        fi.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f52341a : this.f52342b;
        if (bVar == null) {
            return;
        }
        bVar.onEvent(string, bundle2);
    }

    public void setBreadcrumbEventReceiver(fi.b bVar) {
        this.f52342b = bVar;
    }

    public void setCrashlyticsOriginEventReceiver(fi.b bVar) {
        this.f52341a = bVar;
    }
}
