package ek;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c2 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f54486a = new c2();

    @Override // ek.b2
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
