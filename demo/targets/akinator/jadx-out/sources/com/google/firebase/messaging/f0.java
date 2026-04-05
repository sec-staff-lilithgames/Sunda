package com.google.firebase.messaging;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f0 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f29801b;

    public f0(String str) {
        super(str);
        int i10 = 0;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "service_not_available":
                    i10 = 3;
                    break;
                case "toomanymessages":
                    i10 = 4;
                    break;
                case "invalid_parameters":
                case "missing_to":
                    i10 = 1;
                    break;
                case "messagetoobig":
                    i10 = 2;
                    break;
            }
        }
        this.f29801b = i10;
    }

    public int getErrorCode() {
        return this.f29801b;
    }
}
