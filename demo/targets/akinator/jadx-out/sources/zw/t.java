package zw;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements h0 {
    @Override // zw.h0
    public File read(String str) {
        return new File(str);
    }

    @Override // zw.h0
    public String write(File file) {
        return file.getPath();
    }
}
