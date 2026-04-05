package hp;

import java.util.Objects;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface s {
    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i10, int i11, r rVar, io.bidmachine.media3.common.util.k kVar);

    default void parse(byte[] bArr, r rVar, io.bidmachine.media3.common.util.k kVar) {
        parse(bArr, 0, bArr.length, rVar, kVar);
    }

    default i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        x4 x4VarBuilder = b5.builder();
        Objects.requireNonNull(x4VarBuilder);
        parse(bArr, i10, i11, r.f59125c, new ha.a(x4VarBuilder, 5));
        return new d(x4VarBuilder.build());
    }

    default void reset() {
    }
}
