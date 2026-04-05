package com.google.android.play.core.splitinstall.internal;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class i {
    public static h zza() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new q();
            case 25:
                return new s();
            case 26:
                return new v();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new w();
                }
                break;
        }
        return new y();
    }
}
