package androidx.media;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.Token f6842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f6843c;

    public m(q qVar, MediaSessionCompat.Token token) {
        this.f6843c = qVar;
        this.f6842b = token;
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f6843c;
        ArrayList arrayList = qVar.f6855a;
        boolean zIsEmpty = arrayList.isEmpty();
        MediaSessionCompat.Token token = this.f6842b;
        if (!zIsEmpty) {
            android.support.v4.media.session.f extraBinder = token.getExtraBinder();
            if (extraBinder != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k3.p.putBinder((Bundle) it.next(), "extra_session_binder", extraBinder.asBinder());
                }
            }
            arrayList.clear();
        }
        qVar.f6856b.setSessionToken((MediaSession.Token) token.getToken());
    }
}
