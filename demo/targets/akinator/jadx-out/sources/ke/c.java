package ke;

import com.google.android.exoplayer2.h2;
import ee.q;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c {
    void binaryElement(int i10, int i11, q qVar) throws IOException;

    void endMasterElement(int i10) throws h2;

    void floatElement(int i10, double d10) throws h2;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws h2;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws h2;

    void stringElement(int i10, String str) throws h2;
}
