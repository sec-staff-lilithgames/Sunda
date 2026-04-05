package mh;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n1 implements m1 {
    @Override // mh.m1
    public j0 compile(String str) {
        return new y0(Pattern.compile(str));
    }

    @Override // mh.m1
    public boolean isPcreLike() {
        return true;
    }
}
