package ik;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f59668a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public b(Context appContext) {
        e0.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f59668a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ik.c0
    public Double getSamplingRate() {
        Bundle bundle = this.f59668a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // ik.c0
    public Boolean getSessionEnabled() {
        Bundle bundle = this.f59668a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ik.c0
    /* renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public tv.f mo4271getSessionRestartTimeoutFghU774() {
        Bundle bundle = this.f59668a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return tv.f.m7182boximpl(tv.h.toDuration(bundle.getInt("firebase_sessions_sessions_restart_timeout"), tv.i.f87442g));
        }
        return null;
    }

    @Override // ik.c0
    public boolean isSettingsStale() {
        return b0.isSettingsStale(this);
    }

    @Override // ik.c0
    public Object updateSettings(zu.d<? super x0> dVar) {
        return b0.updateSettings(this, dVar);
    }
}
