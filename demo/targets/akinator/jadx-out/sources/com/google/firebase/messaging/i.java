package com.google.firebase.messaging;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class i {
    public static z.f extractDeveloperDefinedPayload(Bundle bundle) {
        z.f fVar = new z.f();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    fVar.put(str, str2);
                }
            }
        }
        return fVar;
    }
}
