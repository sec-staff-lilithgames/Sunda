package ow;

import java.io.IOException;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {
    void onReadClose(int i10, String str);

    void onReadMessage(String str) throws IOException;

    void onReadMessage(l lVar) throws IOException;

    void onReadPing(l lVar);

    void onReadPong(l lVar);
}
