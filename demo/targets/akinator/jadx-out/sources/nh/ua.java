package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum ua extends wa {
    public ua() {
        super("KEY", 0);
    }

    @Override // nh.wa, mh.v0
    public Object apply(Map.Entry<?, ?> entry) {
        return entry.getKey();
    }
}
