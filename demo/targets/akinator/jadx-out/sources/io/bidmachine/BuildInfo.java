package io.bidmachine;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class BuildInfo {
    private static volatile BuildInfo instance;
    private final rr.a isDebuggable;
    private volatile String sha1Signature = null;
    private volatile String sha256Signature = null;

    private BuildInfo(Context context) {
        this.isDebuggable = new rr.a(new j1(context, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$new$0(Context context) {
        return Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
    }

    public static BuildInfo obtain(Context context) {
        BuildInfo buildInfo;
        BuildInfo buildInfo2 = instance;
        if (buildInfo2 != null) {
            return buildInfo2;
        }
        synchronized (BuildInfo.class) {
            try {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return buildInfo;
    }

    public String getSha1Signature(Context context) {
        String str = this.sha1Signature;
        if (str != null) {
            return str;
        }
        String sha1Signature = pr.d.getSha1Signature(context);
        this.sha1Signature = sha1Signature;
        return sha1Signature;
    }

    public String getSha256Signature(Context context) {
        String str = this.sha256Signature;
        if (str != null) {
            return str;
        }
        String sha256Signature = pr.d.getSha256Signature(context);
        this.sha256Signature = sha256Signature;
        return sha256Signature;
    }

    public boolean isDebuggable() {
        return ((Boolean) this.isDebuggable.get()).booleanValue();
    }
}
