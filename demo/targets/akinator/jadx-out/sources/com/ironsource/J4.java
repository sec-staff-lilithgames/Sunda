package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J4 implements Le<String> {

    /* renamed from: a, reason: collision with root package name */
    private final String f34685a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34686b;

    public J4(String encryptedResponse, String descriptionKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f34685a = encryptedResponse;
        this.f34686b = descriptionKey;
    }

    @Override // com.ironsource.Le
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = L9.b(this.f34686b, this.f34685a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
