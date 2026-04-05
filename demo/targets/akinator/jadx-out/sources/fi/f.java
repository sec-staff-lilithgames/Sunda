package fi;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f implements a {
    @Override // fi.a
    public void logEvent(String str, Bundle bundle) {
        ei.f.getLogger().d("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
