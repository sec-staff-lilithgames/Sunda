package cp;

import gn.z0;
import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c {
    void binaryElement(int i10, int i11, a0 a0Var) throws IOException;

    void endMasterElement(int i10) throws z0;

    void floatElement(int i10, double d10) throws z0;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws z0;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws z0;

    void stringElement(int i10, String str) throws z0;
}
