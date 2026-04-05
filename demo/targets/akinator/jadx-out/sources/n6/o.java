package n6;

import android.app.Notification;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f75773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75774b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f75775c;

    public o(int i10, Notification notification) {
        this(i10, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f75773a == oVar.f75773a && this.f75774b == oVar.f75774b) {
            return this.f75775c.equals(oVar.f75775c);
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.f75774b;
    }

    public Notification getNotification() {
        return this.f75775c;
    }

    public int getNotificationId() {
        return this.f75773a;
    }

    public int hashCode() {
        return this.f75775c.hashCode() + (((this.f75773a * 31) + this.f75774b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f75773a + ", mForegroundServiceType=" + this.f75774b + ", mNotification=" + this.f75775c + AbstractJsonLexerKt.END_OBJ;
    }

    public o(int i10, Notification notification, int i11) {
        this.f75773a = i10;
        this.f75775c = notification;
        this.f75774b = i11;
    }
}
