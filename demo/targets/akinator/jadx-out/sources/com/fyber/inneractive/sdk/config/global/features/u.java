package com.fyber.inneractive.sdk.config.global.features;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final t f23294e = t.NONE;

    public u() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        u uVar = new u();
        a(uVar);
        return uVar;
    }

    public final t c() {
        String strA = a("click_action", f23294e.mKey);
        for (t tVar : t.values()) {
            if (strA.equalsIgnoreCase(tVar.mKey)) {
                return tVar;
            }
        }
        return t.NONE;
    }
}
