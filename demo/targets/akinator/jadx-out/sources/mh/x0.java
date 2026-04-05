package mh;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f74713a;

    public x0(Matcher matcher) {
        this.f74713a = (Matcher) p1.checkNotNull(matcher);
    }

    @Override // mh.i0
    public int end() {
        return this.f74713a.end();
    }

    @Override // mh.i0
    public boolean find() {
        return this.f74713a.find();
    }

    @Override // mh.i0
    public boolean matches() {
        return this.f74713a.matches();
    }

    @Override // mh.i0
    public String replaceAll(String str) {
        return this.f74713a.replaceAll(str);
    }

    @Override // mh.i0
    public int start() {
        return this.f74713a.start();
    }

    @Override // mh.i0
    public boolean find(int i10) {
        return this.f74713a.find(i10);
    }
}
