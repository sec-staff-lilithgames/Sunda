package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final b.h f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f5258b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f5259c;

    public n0(b.h hVar, PendingIntent pendingIntent) {
        if (hVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f5257a = hVar;
        this.f5258b = pendingIntent;
        this.f5259c = hVar == null ? null : new l0(this);
    }

    public static n0 createMockSessionTokenForTesting() {
        return new n0(new m0(), null);
    }

    public static n0 getSessionTokenFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder("android.support.customtabs.extra.SESSION");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new n0(binder != null ? b.f.asInterface(binder) : null, pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            PendingIntent pendingIntent = n0Var.f5258b;
            PendingIntent pendingIntent2 = this.f5258b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                b.h hVar = this.f5257a;
                if (hVar == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = hVar.asBinder();
                b.h hVar2 = n0Var.f5257a;
                if (hVar2 != null) {
                    return iBinderAsBinder.equals(hVar2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public e getCallback() {
        return this.f5259c;
    }

    public boolean hasCallback() {
        return this.f5257a != null;
    }

    public boolean hasId() {
        return this.f5258b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f5258b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        b.h hVar = this.f5257a;
        if (hVar != null) {
            return hVar.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public boolean isAssociatedWith(k0 k0Var) {
        return k0Var.f5245c.asBinder().equals(this.f5257a);
    }
}
