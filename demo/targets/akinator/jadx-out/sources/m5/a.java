package m5;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f74027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74028b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f74029c;

    public a(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        e0.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        e0.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        e0.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.f74027a = encryptedTopic;
        this.f74028b = keyIdentifier;
        this.f74029c = encapsulatedKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f74027a, aVar.f74027a) && this.f74028b.contentEquals(aVar.f74028b) && Arrays.equals(this.f74029c, aVar.f74029c);
    }

    public final byte[] getEncapsulatedKey() {
        return this.f74029c;
    }

    public final byte[] getEncryptedTopic() {
        return this.f74027a;
    }

    public final String getKeyIdentifier() {
        return this.f74028b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f74027a)), this.f74028b, Integer.valueOf(Arrays.hashCode(this.f74029c)));
    }

    public String toString() {
        return a.b.k("EncryptedTopic { ", "EncryptedTopic=" + k0.decodeToString(this.f74027a) + ", KeyIdentifier=" + this.f74028b + ", EncapsulatedKey=" + k0.decodeToString(this.f74029c) + " }");
    }
}
