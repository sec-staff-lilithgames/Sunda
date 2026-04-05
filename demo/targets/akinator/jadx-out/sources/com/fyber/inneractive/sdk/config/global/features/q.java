package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends h {
    public q() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        q qVar = new q();
        a(qVar);
        return qVar;
    }

    public final p c() {
        String strA = a("presentation_mode", null);
        if (strA != null) {
            for (p pVar : p.values()) {
                Locale locale = Locale.US;
                if (strA.toLowerCase(locale).equals(pVar.value.toLowerCase(locale))) {
                    return pVar;
                }
            }
        }
        return p.FullScreen;
    }
}
