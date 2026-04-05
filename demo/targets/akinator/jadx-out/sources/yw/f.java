package yw;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f extends ArrayList implements g {
    @Override // yw.g
    public int getLine() {
        return -1;
    }

    public abstract /* synthetic */ String getName();

    public abstract /* synthetic */ String getPrefix();

    public abstract /* synthetic */ String getReference();

    public abstract /* synthetic */ Object getSource();

    @Override // yw.g
    public String getValue() {
        return null;
    }

    @Override // yw.g
    public boolean isEnd() {
        return false;
    }

    @Override // yw.g
    public boolean isStart() {
        return true;
    }

    @Override // yw.g
    public boolean isText() {
        return false;
    }
}
