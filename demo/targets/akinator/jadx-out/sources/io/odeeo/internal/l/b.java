package io.odeeo.internal.l;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.i;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface b {
    void binaryElement(int i10, int i11, i iVar) throws IOException;

    void endMasterElement(int i10) throws g0;

    void floatElement(int i10, double d10) throws g0;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws g0;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws g0;

    void stringElement(int i10, String str) throws g0;
}
