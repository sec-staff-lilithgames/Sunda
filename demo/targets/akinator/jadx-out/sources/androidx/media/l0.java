package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f6841a;

    public l0(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f6841a = new p0(str, i10, i11);
            return;
        }
        o0 o0Var = new o0(str, i10, i11);
        n0.a(i10, i11, str);
        this.f6841a = o0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f6841a.equals(((l0) obj).f6841a);
    }

    public String getPackageName() {
        return this.f6841a.getPackageName();
    }

    public int getPid() {
        return this.f6841a.getPid();
    }

    public int getUid() {
        return this.f6841a.getUid();
    }

    public int hashCode() {
        return this.f6841a.hashCode();
    }

    public l0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strA = o0.a(remoteUserInfo);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                this.f6841a = new o0(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
