package yw;

import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f96687a = new StringBuilder();

    public void append(char c10) {
        this.f96687a.append(c10);
    }

    public void clear() {
        this.f96687a.setLength(0);
    }

    public void write(Writer writer) throws IOException {
        writer.append((CharSequence) this.f96687a);
    }

    public void append(String str) {
        this.f96687a.append(str);
    }

    public void append(char[] cArr) {
        this.f96687a.append(cArr, 0, cArr.length);
    }

    public void append(char[] cArr, int i10, int i11) {
        this.f96687a.append(cArr, i10, i11);
    }

    public void append(String str, int i10, int i11) {
        this.f96687a.append((CharSequence) str, i10, i11);
    }
}
