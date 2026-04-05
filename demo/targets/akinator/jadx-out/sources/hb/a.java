package hb;

import android.security.keystore.KeyGenParameterSpec;
import cb.b;
import com.google.android.gms.stats.CodePackage;
import java.security.spec.AlgorithmParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {
    public final AlgorithmParameterSpec a() {
        b.a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}
