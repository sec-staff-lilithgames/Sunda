package u;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b.d f87471a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f87472b;

    /* renamed from: c, reason: collision with root package name */
    public final c f87473c;

    public d(b.d dVar, PendingIntent pendingIntent) {
        if (dVar == null && pendingIntent == null) {
            throw new IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.f87471a = dVar;
        this.f87472b = pendingIntent;
        this.f87473c = dVar == null ? null : new c(this);
    }

    public static d createSessionTokenFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder("android.support.customtabs.extra.SESSION");
        PendingIntent pendingIntent = (PendingIntent) m3.d.getParcelableExtra(intent, "android.support.customtabs.extra.SESSION_ID", PendingIntent.class);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new d(binder != null ? b.b.asInterface(binder) : null, pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            PendingIntent id2 = dVar.getId();
            PendingIntent pendingIntent = this.f87472b;
            if ((pendingIntent == null) == (id2 == null)) {
                if (pendingIntent != null) {
                    return pendingIntent.equals(id2);
                }
                b.d dVar2 = this.f87471a;
                if (dVar2 == null) {
                    throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = dVar2.asBinder();
                b.d dVar3 = dVar.f87471a;
                if (dVar3 != null) {
                    return iBinderAsBinder.equals(dVar3.asBinder());
                }
                throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public a getCallback() {
        return this.f87473c;
    }

    public IBinder getCallbackBinder() {
        b.d dVar = this.f87471a;
        if (dVar == null) {
            return null;
        }
        return dVar.asBinder();
    }

    public PendingIntent getId() {
        return this.f87472b;
    }

    public boolean hasId() {
        return this.f87472b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f87472b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        b.d dVar = this.f87471a;
        if (dVar != null) {
            return dVar.asBinder().hashCode();
        }
        throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }

    public boolean isAssociatedWith(b bVar) {
        return bVar.f87466a.asBinder().equals(this.f87471a);
    }
}
