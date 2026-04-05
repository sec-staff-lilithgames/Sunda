package ub;

import androidx.core.app.NotificationCompat;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static e f88206e = new e(NotificationCompat.FLAG_LOCAL_ONLY, 500);

    /* renamed from: b, reason: collision with root package name */
    public final int f88207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88208c;

    public e(int i10, int i11) {
        this.f88207b = i10;
        this.f88208c = i11;
    }

    public static d builder() {
        d dVar = new d();
        dVar.f88200a = NotificationCompat.FLAG_LOCAL_ONLY;
        dVar.f88201b = 500;
        return dVar;
    }

    public static e defaults() {
        return f88206e;
    }

    public static void overrideDefaultErrorReportConfiguration(e eVar) {
        if (eVar == null) {
            f88206e = new e(NotificationCompat.FLAG_LOCAL_ONLY, 500);
        } else {
            f88206e = eVar;
        }
    }

    public int getMaxErrorTokenLength() {
        return this.f88207b;
    }

    public int getMaxRawContentLength() {
        return this.f88208c;
    }

    public d rebuild() {
        d dVar = new d();
        dVar.f88200a = this.f88207b;
        dVar.f88201b = this.f88208c;
        return dVar;
    }
}
