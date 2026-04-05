package r8;

import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface o {
    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    v0 put(n8.q qVar, v0 v0Var);

    v0 remove(n8.q qVar);

    void setResourceRemovedListener(n nVar);

    void setSizeMultiplier(float f10);

    void trimMemory(int i10);
}
