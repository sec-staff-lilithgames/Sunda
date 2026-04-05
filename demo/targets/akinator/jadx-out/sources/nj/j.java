package nj;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f76944a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f76945b;

    public j(com.google.firebase.g gVar, i1 i1Var, yi.d dVar) {
        this.f76944a = i1Var;
        this.f76945b = new AtomicBoolean(gVar.isDataCollectionDefaultEnabled());
        ((bi.t) dVar).subscribe(com.google.firebase.b.class, new com.google.firebase.messaging.s(this, 1));
    }

    public boolean isAutomaticDataCollectionEnabled() {
        i1 i1Var = this.f76944a;
        return i1Var.isPreferenceSet("auto_init") ? i1Var.getBooleanPreference("auto_init", true) : i1Var.isManifestSet("firebase_inapp_messaging_auto_data_collection_enabled") ? i1Var.getBooleanManifestValue("firebase_inapp_messaging_auto_data_collection_enabled", true) : this.f76945b.get();
    }

    public void setAutomaticDataCollectionEnabled(boolean z10) {
        this.f76944a.setBooleanPreference("auto_init", z10);
    }

    public void setAutomaticDataCollectionEnabled(Boolean bool) {
        i1 i1Var = this.f76944a;
        if (bool == null) {
            i1Var.clearPreference("auto_init");
        } else {
            i1Var.setBooleanPreference("auto_init", Boolean.TRUE.equals(bool));
        }
    }
}
