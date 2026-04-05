package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f29825d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f29826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29827b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29828c;

    public k0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f29825d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(a.b.l("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f29826a = strSubstring;
        this.f29827b = str;
        this.f29828c = w0.i.d(str, "!", str2);
    }

    public static k0 subscribe(String str) {
        return new k0("S", str);
    }

    public static k0 unsubscribe(String str) {
        return new k0("U", str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f29826a.equals(k0Var.f29826a) && this.f29827b.equals(k0Var.f29827b);
    }

    public String getOperation() {
        return this.f29827b;
    }

    public String getTopic() {
        return this.f29826a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f29827b, this.f29826a);
    }

    public String serialize() {
        return this.f29828c;
    }
}
